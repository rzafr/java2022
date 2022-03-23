/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class TestPez {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Vamos contando los objetos creados
		System.out.println("Peces creados: " + Pez.getNumPeces());
		Pez p1 = new Pez();
		System.out.println("Peces creados: " + Pez.getNumPeces());
		Pez p2 = new Pez("Atún"); // Constructor con parámetro
		System.out.println("Peces creados: " + Pez.getNumPeces());
		Pez p3 = new Pez(p2); // Constructor copia
		System.out.println("Peces creados: " + Pez.getNumPeces());
		Pez p4 = (Pez) p2.clone();
		System.out.println("Peces creados: " + Pez.getNumPeces());
		Pez p5 = p1; // Copia de objeto
		System.out.println("Peces creados: " + Pez.getNumPeces());

		// Comparamos los objetos creados
		if (p2.equals(p1)) {
			System.out.println("p2 y p1 son los mismos peces");
		} else {
			System.out.println("p2 y p1 son peces distintos");
		}

		if (p2.equals(p3)) {
			System.out.println("p2 y p3 son los mismos peces");
		} else {
			System.out.println("p2 y p3 son peces distintos");
		}

		if (p2.equals(p4)) {
			System.out.println("p2 y p4 son los mismos peces");
		} else {
			System.out.println("p2 y p4 son peces distintos");
		}

		if (p1.equals(p5)) {
			System.out.println("p1 y p5 son los mismos peces");
		} else {
			System.out.println("p1 y p5 son peces distintos");
		}

	}

}
