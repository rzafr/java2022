/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class TestLibreria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Libreria lb = new Libreria();

		Libro l1 = new Libro("32-65343-56-9", "La máquina del tiempo", "Herbert George Wells", 500);

		// Adquirimos libros
		lb.adquirir(l1, 30);
		lb.adquirir(new Libro("32-65453-56-9", "En las montañas de la locura", "H.P. Lovecraft", 800), 50);
		lb.adquirir(new Libro("34-65453-89-9", "1984", "George Orwell", 200), 40);
		lb.adquirir(new Libro("34-65488-89-9", "Fahrenheit 451", "Ray Bradbury", 500), 40);
		lb.adquirir(new Libro("34-77488-89-9", "Soy leyenda", "Richard Matheson", 600), 40);
		lb.adquirir(new Libro("34-33338-89-9", "El fin de la eternidad", "Isaac Asimov", 600), 20);
		lb.adquirir(new Libro("34-33338-00-9", "Las estrellas, mi destino", "Alfred Bester", 400), 40);
		lb.adquirir(new Libro("77-33338-89-9", "Solaris", "Stanislaw Lem", 350), 30);
		lb.adquirir(new Libro("77-55555-89-9", "Dune", "Frank Herbert", 760), 50);
		lb.adquirir(new Libro("77-33338-99-9", "Guía del autoestopista galáctico", "Douglas Adams", 460), 30);
		lb.adquirir(new Libro("88-33338-99-9", "El problema de los tres cuerpos", "Liu Cixin", 460), 30);

		// Vendemos libros
		lb.vender(l1, 40);
		lb.vender(new Libro("32-65453-56-9", "En las montañas de la locura", "H.P. Lovecraft", 800), 70);
		lb.vender(new Libro("34-65453-89-9", "1984", "George Orwell", 200), 80);
		lb.vender(new Libro("34-65488-89-9", "Fahrenheit 451", "Ray Bradbury", 500), 90);
		lb.vender(new Libro("34-77488-89-9", "Soy leyenda", "Richard Matheson", 600), 80);
		lb.vender(new Libro("34-33338-89-9", "El fin de la eternidad", "Isaac Asimov", 600), 50);
		lb.vender(new Libro("34-33338-00-9", "Las estrellas, mi destino", "Alfred Bester", 400), 60);
		lb.vender(new Libro("77-33338-89-9", "Solaris", "Stanislaw Lem", 350), 70);
		lb.vender(new Libro("77-55555-89-9", "Dune", "Frank Herbert", 760), 60);
		lb.vender(new Libro("77-33338-99-9", "Guía del autoestopista galáctico", "Douglas Adams", 460), 50);
		lb.vender(new Libro("88-33338-99-9", "El problema de los tres cuerpos", "Liu Cixin", 460), 40);

		System.out.println(lb);
		System.out.println("Ganancias totales: " + lb.ganancias() + " euros");

	}

}
