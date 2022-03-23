/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class TestDireccion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Direccion d1 = new Direccion("Calle Calleja", 14, "Almería", "Almería", "04001", "España", 36.84, -2.47);
		Direccion d2 = new Direccion("Calle Calle", 18, "Huelva", "Huelva", "21001", "España", 37.25, -6.95);

		System.out.println(d1.toString());
		System.out.println(d2.toString());

		System.out.println("La distancia entre " + d1.getPoblacion() + " y " + d2.getPoblacion() + " es de "
				+ Math.round(d1.distanciaKM(d2) * 100.0) / 100.0 + " kilómetros");

	}

}
