/**
 * 
 */
package tema6POOAvanzada;

/**
 * @author Ruben
 *
 */
public class Moneda extends Sorteo {

	/**
	 * Simula el lanzamiento de una moneda y devuelve 1 ó 2
	 */
	@Override
	public int lanzar() {
		int lanzamiento = (int) (Math.random() * 2) + 1;

		if (lanzamiento == 2)
			return 2;
		else
			return 1;
	}

}
