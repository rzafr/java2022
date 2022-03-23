/**
 * 
 */
package dadosPoker;

import java.util.Arrays;

/**
 * @author Ruben
 *
 */
public class Jugador {

	// Propiedades
	private String nombre;
	private int[] tirada = { 0, 0, 0, 0, 0 };
	private boolean haGanado;

	/**
	 * Constructor con el nombre del jugador
	 * 
	 * @param nombre
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.haGanado = false;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tirada
	 */
	public int[] getTirada() {
		return tirada;
	}

	/**
	 * @return the haGanado
	 */
	public boolean isHaGanado() {
		return haGanado;
	}

	/**
	 * @param haGanado the haGanado to set
	 */
	public void setHaGanado(boolean haGanado) {
		this.haGanado = haGanado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador [nombre=");
		builder.append(nombre);
		builder.append(", tirada=");
		for (int i = 0; i < tirada.length; i++) {
			switch (tirada[i]) {
				case 1:
					builder.append("9, ");
					break;
				case 2:
					builder.append("10, ");
					break;
				case 3:
					builder.append("Jota, ");
					break;
				case 4:
					builder.append("Reina, ");
					break;
				case 5:
					builder.append("Rey, ");
					break;
				case 6:
					builder.append("As, ");
					break;
				default:
					System.out.println("Error inesperado");
			}
		}
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Hace una tirada aleatoria y graba los valores en la tirada del jugador
	 */
	public void tirada() {
		for (int i = 0; i < tirada.length; i++) {
			this.tirada[i] = (int) (Math.random() * 6) + 1;
		}
		Arrays.sort(this.tirada); // Ordenamos la tirada para poder comprobar las jugadas
	}

	/**
	 * Devuelve un Resultado donde el primer número sea lo que ha sacado y el
	 * segundo número será el número de la carta que representa la tirada
	 * 
	 * @return
	 */
	public Resultado valorTirada() {

		// Poker real
		if ((tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3])
				&& (tirada[0] == tirada[4])) {
			Resultado r = new Resultado(8, tirada[0]);
			return r;
		}

		// Poker
		if (((tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]))) {
			Resultado r = new Resultado(7, tirada[0]);
			return r;
		}
		if ((tirada[1] == tirada[2]) && (tirada[1] == tirada[3]) && (tirada[1] == tirada[4])) {
			Resultado r = new Resultado(7, tirada[1]);
			return r;
		}

		// Full
		if (tirada[0] == tirada[1] && tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
			Resultado r = new Resultado(6, tirada[0]);
			return r;
		}
		if (tirada[2] == tirada[3] && tirada[3] == tirada[4] && tirada[0] == tirada[1]) {
			Resultado r = new Resultado(6, tirada[2]);
			return r;
		}

		// Escalera Mayor
		if (tirada[0] == 2 && tirada[1] == 3 && tirada[2] == 4 && tirada[3] == 5 && tirada[4] == 6) {
			Resultado r = new Resultado(5, 0);
			return r;
		}

		// Escalera Menor
		if (tirada[0] == 1 && tirada[1] == 2 && tirada[2] == 3 && tirada[3] == 4 && tirada[4] == 5) {
			Resultado r = new Resultado(4, 0);
			return r;
		}

		// Piernas o Trío
		if (tirada[0] == tirada[1] && tirada[1] == tirada[2]) {
			Resultado r = new Resultado(3, tirada[2]);
			return r;
		}
		if (tirada[1] == tirada[2] && tirada[2] == tirada[3]) {
			Resultado r = new Resultado(3, tirada[2]);
			return r;
		}
		if (tirada[2] == tirada[3] && tirada[3] == tirada[4]) {
			Resultado r = new Resultado(3, tirada[2]);
			return r;
		}

		// Dobles parejas
		if (tirada[0] == tirada[1] && tirada[2] == tirada[3]) {
			if (tirada[0] > tirada[2]) {
				Resultado r = new Resultado(2, tirada[0]);
				return r;
			} else {
				Resultado r = new Resultado(2, tirada[2]);
				return r;
			}
		}

		if (tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
			if (tirada[1] > tirada[3]) {
				Resultado r = new Resultado(2, tirada[1]);
				return r;
			} else {
				Resultado r = new Resultado(2, tirada[3]);
				return r;
			}
		}

		if (tirada[0] == tirada[1] && tirada[3] == tirada[4]) {
			if (tirada[0] > tirada[3]) {
				Resultado r = new Resultado(2, tirada[0]);
				return r;
			} else {
				Resultado r = new Resultado(2, tirada[3]);
				return r;
			}
		}

		// Parejas
		if (tirada[0] == tirada[1]) {
			return new Resultado(1, tirada[0]);
		}
		if (tirada[1] == tirada[2]) {
			return new Resultado(1, tirada[1]);
		}
		if (tirada[2] == tirada[3]) {
			return new Resultado(1, tirada[2]);
		}
		if (tirada[3] == tirada[4]) {
			return new Resultado(1, tirada[3]);
		}

		return new Resultado(-1, -1);
	}

}
