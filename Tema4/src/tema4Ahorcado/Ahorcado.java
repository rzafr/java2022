/**
 * 
 */
package tema4Ahorcado;

import java.util.Arrays;

/**
 * @author ruben
 *
 */
public class Ahorcado {

	// Propiedades
	private static String[] diccionario = { "tuerca", "tornillo", "arandela", "clavo", "perno" }; // Común a todos los juegos
																									
	private String palabraAAdivinar;
	private char[] palabraIntentada;
	private char[] letrasProbadas;
	private int fallos;

	/**
	 * Constructor de la clase Ahorcado
	 */
	public Ahorcado() {
		// Elegir una palabra aleatoria del diccionario
		int posicion = (int) (Math.random() * Ahorcado.diccionario.length);
		this.palabraAAdivinar = Ahorcado.diccionario[posicion];

		// Reservo tantos caracteres para la palabra intentada como la longitud de
		// palabraAAdivinar
		this.palabraIntentada = new char[this.palabraAAdivinar.length()];

		// Rellenar de guiones la palabra intentada tantos como longitud de
		// palabraAAdivinar
		for (int i = 0; i < this.palabraAAdivinar.length(); i++) {
			this.palabraIntentada[i] = '-';
		}

		// Inicializar el array de letras probadas
		this.letrasProbadas = new char[27];

		// Rellenamos letrasProbadas de guiones
		for (int i = 0; i < this.letrasProbadas.length; i++) {
			this.letrasProbadas[i] = '-';
		}

		this.fallos = 0;
	}

	/**
	 * @return the diccionario
	 */
	public static String[] getDiccionario() {
		return diccionario;
	}

	/**
	 * @return the palabraAAdivinar
	 */
	public String getPalabraAAdivinar() {
		return palabraAAdivinar;
	}

	/**
	 * @return the palabraIntentada
	 */
	public char[] getPalabraIntentada() {
		return palabraIntentada;
	}

	/**
	 * @return the letrasProbadas
	 */
	public char[] getLetrasProbadas() {
		return letrasProbadas;
	}

	/**
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ahorcado [palabraAAdivinar=");
		builder.append(palabraAAdivinar);
		builder.append(", palabraIntentada=");
		builder.append(Arrays.toString(palabraIntentada));
		builder.append(", letrasProbadas=");
		builder.append(Arrays.toString(letrasProbadas));
		builder.append(", fallos=");
		builder.append(fallos);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Comprueba si la letra introducida se ha probado anteriormente
	 * 
	 * @param letra
	 * @return
	 */
	public boolean comprobarRepetida(char letra) {
		boolean repetida = false;
		for (int i = 0; i < this.letrasProbadas.length; i++) {
			if (this.letrasProbadas[i] == letra) {
				repetida = true;
				this.fallos++;
			}
		}
		return repetida;
	}

	/**
	 * Busca en palabraAAdivinar la letra introducida, si la encuentra muestra
	 * resultado; si no, suma un fallo
	 * 
	 * @param letra
	 * @return
	 */
	public boolean intentar(char letra) {
		boolean encontrado = false;

		// Metemos la letra en letrasProbadas
		for (int i = 0; i < this.letrasProbadas.length; i++) {
			if (this.letrasProbadas[i] != letra) {
				if (this.letrasProbadas[i] == '-') {
					this.letrasProbadas[i] = letra;
					break;
				}
			}

		}

		// Buscar la letra tantas veces como salga
		for (int i = 0; i < this.palabraAAdivinar.length(); i++) {
			// Si coincide la letra en alguna posición la pongo en palabraIntentada
			if (this.palabraAAdivinar.charAt(i) == letra) {
				this.palabraIntentada[i] = letra;
				encontrado = true;
			}

		}
		if (encontrado == false)
			this.fallos++;

		return encontrado;
	}

	/**
	 * Comprueba si palabraAAdivinar y palabraIntentada son iguales
	 * 
	 * @return
	 */
	public boolean solucion() {
		boolean solucionado = true;

		for (int i = 0; i < this.palabraAAdivinar.length(); i++) {

			if (this.palabraAAdivinar.charAt(i) != this.palabraIntentada[i]) {

				solucionado = false;
			}

		}
		return solucionado;
	}

	/**
	 * Comprueba si el intento de resolución y palabraAAdivinar son iguales
	 * 
	 * @param palabra
	 * @return
	 */
	public boolean resolver(String palabra) {
		boolean resuelto = false;
		palabra = palabra.toLowerCase();
		if (palabra.equals(palabraAAdivinar)) {
			resuelto = true;
		} else {
			this.fallos++;
		}
		return resuelto;
	}

}
