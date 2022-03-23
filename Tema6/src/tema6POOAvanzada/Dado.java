/**
 * 
 */
package tema6POOAvanzada;

/**
 * @author Ruben
 *
 */
public class Dado extends Sorteo {

	/**
	 * Simula el lanzamiento de un dado y devuelve valores entre 1 y 6
	 */
	@Override
	public int lanzar() {

		return (int) (Math.random() * 6) + 1;
	}

}
