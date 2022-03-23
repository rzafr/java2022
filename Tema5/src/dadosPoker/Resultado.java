/**
 * 
 */
package dadosPoker;

/**
 * @author Ruben
 *
 */
public class Resultado {

	// Propiedades
	private int jugada; // La jugada que ha salido (1-par, 2-pares dobles, 3-piernas, 4-escalera menor,
						// 5-escalera mayor, 6- full, 7-poker, 8-poker real)
	private int valor; // El número de carta de la tirada: 1,2,3,4,5,6

	/**
	 * Constructor con los dos parámetros
	 * 
	 * @param jugada
	 * @param valor
	 */
	public Resultado(int jugada, int valor) {
		super();
		this.jugada = jugada;
		this.valor = valor;
	}

	/**
	 * @return the jugada
	 */
	public int getJugada() {
		return jugada;
	}

	/**
	 * @param jugada the jugada to set
	 */
	public void setJugada(int jugada) {
		this.jugada = jugada;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * Comprueba los resultados del primer jugador con respecto al segundo. Empieza
	 * por el primer valor (jugada) de cada resultado, si es mayor el primero
	 * devuelve 0, si es menor devuelve 1, si son iguales se compara el segundo
	 * valor (valor). Si es mayor el primero devuelve 0, si es menor 1, si son
	 * iguales 2 (empate)
	 * 
	 * @param otro
	 * @return
	 */
	public int ganador(Resultado otro) {
		if (this.jugada > otro.jugada) {
			return 0; // Gana el primer jugador por jugada
		} else if (this.jugada < otro.jugada) {
			return 1; // Gana el segundo jugador por jugada
		} else { // La misma jugada, se comprueba el valor de ésta
			if (this.valor > otro.valor)
				return 0; // Gana el primer jugador por valor
			else if (this.valor < otro.valor)
				return 1; // Gana el segundo jugador por valor
			else
				return 2; // Empate
		}
	}
}
