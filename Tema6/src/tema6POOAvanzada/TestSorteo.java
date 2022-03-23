/**
 * 
 */
package tema6POOAvanzada;

/**
 * @author Ruben
 *
 */
public class TestSorteo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dado d1 = new Dado();

		System.out.println(d1.lanzar());

		Moneda m1 = new Moneda();

		if (m1.lanzar() == 2) {
			System.out.println("Cara");
		} else {
			System.out.println("Cruz");
		}

	}

}
