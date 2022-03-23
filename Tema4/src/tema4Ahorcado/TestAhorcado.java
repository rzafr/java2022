/**
 * 
 */
package tema4Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ruben
 *
 */
public class TestAhorcado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ahorcado juego = new Ahorcado();

		System.out.println("JUEGO DEL AHORCADO");
		System.out.println("-------------------\n");
		System.out.println("Debes adivinar una palabra de " + juego.getPalabraAAdivinar().length() + " letras.");
		System.out.println(Arrays.toString(juego.getPalabraIntentada()));

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		boolean resuelto = false;
		do {
			System.out.println("\nOpciones:");
			System.out.println("1. Intentar letra");
			System.out.println("2. Resolver");

			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Opción incorrecta");
			}

			switch (opcion) {
			case 1: {
				System.out.println("Dime una letra");
				// Leer una letra
				String letra = "";
				try {
					letra = sc.nextLine();
				} catch (Exception e) {
					System.out.println("Opción incorrecta");
				}

				if (!juego.comprobarRepetida(letra.charAt(0))) {
					juego.intentar(letra.charAt(0));

					System.out.println("\nTu palabra " + Arrays.toString(juego.getPalabraIntentada()));
					System.out.println("Letras probadas: " + Arrays.toString(juego.getLetrasProbadas()));
					System.out.println("Fallos " + juego.getFallos());
				} else {
					System.out.println("\nLetra repetida");
					System.out.println("Tu palabra " + Arrays.toString(juego.getPalabraIntentada()));
					System.out.println("Letras probadas: " + Arrays.toString(juego.getLetrasProbadas()));
					System.out.println("Fallos " + juego.getFallos());

				}

				switch (juego.getFallos()) {
				case 0: {
					System.out.println("Por ahí vas bien");
					break;
				}
				case 1: {
					System.out.println("________");
					System.out.println("|       |");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					break;
				}
				case 2: {
					System.out.println("________");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					break;
				}
				case 3: {
					System.out.println("________");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|       |");
					System.out.println("|       |");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					break;
				}
				case 4: {
					System.out.println("________");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|      /|");
					System.out.println("|       |");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					break;
				}
				case 5: {
					System.out.println("________");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|      /|/");
					System.out.println("|       |");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("|        ");
					break;
				}
				case 6: {
					System.out.println("________");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|      /|/");
					System.out.println("|       |");
					System.out.println("|      / ");
					System.out.println("|        ");
					System.out.println("|        ");
					break;
				}
				case 7: {
					System.out.println("________");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|      /|/");
					System.out.println("|       |");
					System.out.println("|      / /");
					System.out.println("|        ");
					System.out.println("|        ");
					System.out.println("Has perdido el juego");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + juego.getFallos());

				}

				// Comprobar si se ha resuelto la palabra
				if (juego.solucion()) {
					System.out.println("¡Has ganado, enhorabuena!");
					resuelto = true;
				}
				break;
			}
			case 2: {
				System.out.println("Introduce la palabra: ");
				// Leer la palabra
				String palabra = sc.nextLine();

				// Comprobamos la palabra
				if (juego.resolver(palabra)) {
					System.out.println("\n¡Has ganado, enhorabuena!");
					resuelto = true;
				} else {
					System.out.println("\nHas fallado");
					System.out.println("Fallos " + juego.getFallos());

					switch (juego.getFallos()) {
					case 0: {
						System.out.println("Por ahí vas bien");
						break;
					}
					case 1: {
						System.out.println("________");
						System.out.println("|       |");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						break;
					}
					case 2: {
						System.out.println("________");
						System.out.println("|       |");
						System.out.println("|       O");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						break;
					}
					case 3: {
						System.out.println("________");
						System.out.println("|       |");
						System.out.println("|       O");
						System.out.println("|       |");
						System.out.println("|       |");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						break;
					}
					case 4: {
						System.out.println("________");
						System.out.println("|       |");
						System.out.println("|       O");
						System.out.println("|      /|");
						System.out.println("|       |");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						break;
					}
					case 5: {
						System.out.println("________");
						System.out.println("|       |");
						System.out.println("|       O");
						System.out.println("|      /|/");
						System.out.println("|       |");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("|        ");
						break;
					}
					case 6: {
						System.out.println("________");
						System.out.println("|       |");
						System.out.println("|       O");
						System.out.println("|      /|/");
						System.out.println("|       |");
						System.out.println("|      / ");
						System.out.println("|        ");
						System.out.println("|        ");
						break;
					}
					case 7: {
						System.out.println("________");
						System.out.println("|       |");
						System.out.println("|       O");
						System.out.println("|      /|/");
						System.out.println("|       |");
						System.out.println("|      / /");
						System.out.println("|        ");
						System.out.println("|        ");
						System.out.println("Has perdido el juego");
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + juego.getFallos());

					}
				}
				break;
			}
			default:
				System.out.println("Opción incorrecta, prueba otra vez");
			}

		} while (juego.getFallos() < 7 && !resuelto);

		sc.close();
	}
}
