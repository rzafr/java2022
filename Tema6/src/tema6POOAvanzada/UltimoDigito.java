/**
 * 
 */
package tema6POOAvanzada;

import java.util.Scanner;

/**
 * @author Ruben
 *
 */
public class UltimoDigito {

	/**
	 * Devuelve el último dígito de un Integer pasado por parámetro
	 * 
	 * @param i
	 * @return
	 */
	public static String averiguaUltimoDigito(Integer i) {
		return i.toString().substring(i.toString().length() - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número");

		Integer num = 0;
		try {
			num = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Error. " + e.getMessage());
		}

		sc.close();

		System.out.println("El último dígito es " + averiguaUltimoDigito(num));

	}

}
