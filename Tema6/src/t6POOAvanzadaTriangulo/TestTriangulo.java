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

		// Creamos triángulos de todos los tipos y probamos los métodos
		TrianguloRectangulo tr = null;
		try {
			tr = new TrianguloRectangulo(2, 4, 5);
			System.out.println("Triángulo rectángulo creado");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		TrianguloIsosceles ti = null;
		try {
			ti = new TrianguloIsosceles(2, 4, 4);
			System.out.println("Triángulo isósceles creado");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		TrianguloEscaleno tes = null;
		try {
			tes = new TrianguloEscaleno(2, 4, 4);
			System.out.println("Triángulo escaleno creado");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		TrianguloEquilatero te = null;
		try {
			te = new TrianguloEquilatero(4, 4, 4);
			System.out.println("Triángulo equilátero creado");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		// Calculamos el área y el perímetro de los triángulos creados
		if (tr != null)
			System.out.println("\nTriángulo rectángulo -> área " + tr.area() + " y perímetro " + tr.perimetro());
		else
			System.out.println("\nNo se ha creado el triángulo rectángulo");

		if (ti != null)
			System.out.println("\nTriángulo isósceles -> área " + ti.area() + " y perímetro " + ti.perimetro());
		else
			System.out.println("\nNo se ha creado el triángulo isósceles");

		if (tes != null)
			System.out.println("\nTriángulo escaleno -> área " + tes.area() + " y perímetro " + tes.perimetro());
		else
			System.out.println("\nNo se ha creado el triángulo escaleno");

		if (te != null)
			System.out.println("\nTriángulo equilátero -> área " + te.area() + " y perímetro " + te.perimetro());
		else
			System.out.println("\nNo se ha creado el triángulo equilátero");

		// Comparamos las áreas
		if (ti.compareTo(te) < 0)
			System.out.println("\nEl área del triángulo equilátero es mayor que la del isósceles");
		else if (ti.compareTo(te) > 0)
			System.out.println("\nEl área del triángulo isósceles es mayor que la del equilátero");
		else
			System.out.println("\nSon igual de grandes");
	}

}
