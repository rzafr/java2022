/**
 * 
 */
package examenWordle;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Ruben
 *
 */
public class TestWordle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Wordle w = new Wordle("SILLA");
		
		String palabra="";
		int cont=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WORDLE\n");
		
		System.out.println(LocalDate.now());
		
		
		do {
			
			System.out.println("Introduce palabra: ");
			try {
				palabra = sc.nextLine();
			} catch (Exception e) {
				System.out.println("Error. " + e.getMessage());
			}
			
			w.comprobar(palabra.toUpperCase());
			
			cont++;
			
		} while (cont < 6);
		
		sc.close();
	}

}
