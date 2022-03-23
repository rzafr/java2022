/**
 * 
 */
package dadosPoker;

/**
 * @author Ruben
 *
 */
public class Juego {

	// Propiedades
	private Jugador jugador1;
	private Jugador jugador2;

	private static int numPartidas = 0;

	/**
	 * Crea dos jugadores cada uno con su nombre
	 * 
	 * @param nombre1
	 * @param nombre2
	 */
	public Juego(String nombre1, String nombre2) {
		this.jugador1 = new Jugador(nombre1);
		this.jugador2 = new Jugador(nombre2);

		// Incrementamos en 1 el número de partidas
		Juego.numPartidas++;

		// Se llama al método que devuelve al ganador
		jugar();
	}

	/**
	 * @return the numPartidas
	 */
	public static int getNumPartidas() {
		return numPartidas;
	}

	/**
	 * Llama al método tirada() de cada jugador. Después comprueba quién es el
	 * ganador, devolviendo un entero: 0 gana jugador 1, 1 gana jugador 2, 2 empate
	 */
	public int jugar() {

		// Cada jugador realiza una tirada
		this.jugador1.tirada();
		this.jugador2.tirada();

		// Se almacenan los valores de la tirada
		Resultado r1 = this.jugador1.valorTirada();
		Resultado r2 = this.jugador2.valorTirada();

		// Llamamos al método ganador para comprobar quién ha ganado
		int ganador = r1.ganador(r2);

		// Se cambia haGanado a true para el jugador que ha ganado
		if (ganador == 0)
			this.jugador1.setHaGanado(true);
		else if (ganador == 1)
			this.jugador2.setHaGanado(true);

		return ganador;
	}

	public void mostrarResultado() {

		System.out.println(this.jugador1.toString());
		System.out.println(this.jugador2.toString());

		// Según el valor del boolean haGanado se anuncia al vencedor
		if ((this.jugador1.isHaGanado() == false) && (this.jugador2.isHaGanado() == false))
			System.out.println("\nHa habido un empate");
		else if (this.jugador1.isHaGanado())
			System.out.println("\nHa ganado " + this.jugador1.getNombre());
		else
			System.out.println("\nHa ganado " + this.jugador2.getNombre());

	}
}
