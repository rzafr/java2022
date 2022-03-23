/**
 * 
 */
package dadosPoker;

import java.util.Scanner;

/**
 * @author Ruben
 *
 */
public class TestJuego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String nombre1 = "", nombre2 = "";
		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\n@-----@");
			System.out.println(" PÓKER");
			System.out.println("@-----@");
			System.out.println("\nElige una opción:");
			System.out.println("\n1. Jugar partida");
			System.out.println("2. Salir");

			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Error. " + e.getMessage());
			}

			switch (opcion) {
				case 1:
					System.out.println("\nIntroduce el nombre del jugador 1: ");
					try {
						nombre1 = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
					System.out.println("\nIntroduce el nombre del jugador 2: ");
					try {
						nombre2 = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
	
					Juego miJuego = new Juego(nombre1, nombre2);
	
					miJuego.mostrarResultado();
	
					break;
	
				case 2:
					System.out.println("Hasta pronto");
					System.out.println("Partidas jugadas: " + Juego.getNumPartidas());
					break;
	
				default:
					System.out.println("Hay que introducir números entre 1 y 2");
	
			}

		} while (!(opcion == 2));

		sc.close();
	}

}
