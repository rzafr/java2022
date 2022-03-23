/**
 * 
 */
package t6POOAvanzadaTriangulo;

/**
 * @author Ruben
 *
 */
public class TestTriangulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos tri�ngulos de todos los tipos y probamos los m�todos
		TrianguloRectangulo tr = null;
		try {
			tr = new TrianguloRectangulo(2, 4, 5);
			System.out.println("Tri�ngulo rect�ngulo creado");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		TrianguloIsosceles ti = null;
		try {
			ti = new TrianguloIsosceles(2, 4, 4);
			System.out.println("Tri�ngulo is�sceles creado");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		TrianguloEscaleno tes = null;
		try {
			tes = new TrianguloEscaleno(2, 4, 4);
			System.out.println("Tri�ngulo escaleno creado");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		TrianguloEquilatero te = null;
		try {
			te = new TrianguloEquilatero(4, 4, 4);
			System.out.println("Tri�ngulo equil�tero creado");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		// Calculamos el �rea y el per�metro de los tri�ngulos creados
		if (tr != null)
			System.out.println("\nTri�ngulo rect�ngulo -> �rea " + tr.area() + " y per�metro " + tr.perimetro());
		else
			System.out.println("\nNo se ha creado el tri�ngulo rect�ngulo");

		if (ti != null)
			System.out.println("\nTri�ngulo is�sceles -> �rea " + ti.area() + " y per�metro " + ti.perimetro());
		else
			System.out.println("\nNo se ha creado el tri�ngulo is�sceles");

		if (tes != null)
			System.out.println("\nTri�ngulo escaleno -> �rea " + tes.area() + " y per�metro " + tes.perimetro());
		else
			System.out.println("\nNo se ha creado el tri�ngulo escaleno");

		if (te != null)
			System.out.println("\nTri�ngulo equil�tero -> �rea " + te.area() + " y per�metro " + te.perimetro());
		else
			System.out.println("\nNo se ha creado el tri�ngulo equil�tero");

		// Comparamos las �reas
		if (ti.compareTo(te) < 0)
			System.out.println("\nEl �rea del tri�ngulo equil�tero es mayor que la del is�sceles");
		else if (ti.compareTo(te) > 0)
			System.out.println("\nEl �rea del tri�ngulo is�sceles es mayor que la del equil�tero");
		else
			System.out.println("\nSon igual de grandes");
	}

}
