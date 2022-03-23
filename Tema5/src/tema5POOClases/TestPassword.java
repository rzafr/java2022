/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class TestPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Password ps1 = new Password();
		Password ps2 = new Password(20);

		System.out.println(ps1);
		System.out.println(ps2);

		if (ps1.esFuerte())
			System.out.println("La primera contraseña es fuerte");
		else
			System.out.println("La primera contraseña no es fuerte");

		if (ps2.esFuerte())
			System.out.println("La segunda contraseña es fuerte");
		else
			System.out.println("La segunda contraseña no es fuerte");

	}

}
