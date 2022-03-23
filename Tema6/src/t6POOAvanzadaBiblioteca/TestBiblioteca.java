/**
 * 
 */
package t6POOAvanzadaBiblioteca;

import java.util.Scanner;

/**
 * @author Ruben
 *
 */
public class TestBiblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos objeto biblioteca que inicializa el ArrayList de publicaciones
		Biblioteca b = new Biblioteca("Casa del Libro");

		// Con el métedo adquirirMaterial añadimos 10 libros y 5 números de una revista
		// a la biblioteca
		b.adquirirMaterial(new Libro("32-65453-56-9", "En las montañas de la locura", 1976, 500));
		b.adquirirMaterial(new Libro("34-65453-89-9", "1984", 1966, 340));
		b.adquirirMaterial(new Libro("34-65488-89-9", "Fahrenheit 451", 1976, 700));
		b.adquirirMaterial(new Libro("34-77488-89-9", "Soy leyenda", 1980, 500));
		b.adquirirMaterial(new Libro("34-33338-89-9", "El fin de la eternidad", 1956, 320));
		b.adquirirMaterial(new Libro("34-33338-00-9", "Las estrellas, mi destino", 1956, 200));
		b.adquirirMaterial(new Libro("77-33338-89-9", "Solaris", 1966, 200));
		b.adquirirMaterial(new Libro("77-55555-89-9", "Dune", 1971, 450));
		b.adquirirMaterial(new Libro("77-33338-99-9", "Guía del autoestopista galáctico", 1946, 780));
		b.adquirirMaterial(new Libro("88-33338-99-9", "El problema de los tres cuerpos", 1956, 400));

		b.adquirirMaterial(new Revista("22-33338-99-9", "Science", 2022, 100));
		b.adquirirMaterial(new Revista("22-33338-99-9", "Science", 2022, 100));
		b.adquirirMaterial(new Revista("22-33338-99-9", "Science", 2022, 100));
		b.adquirirMaterial(new Revista("22-33338-99-9", "Science", 2022, 100));
		b.adquirirMaterial(new Revista("22-33338-99-9", "Science", 2022, 100));

		// Probamos las clases con un menú
		int opcion = 0;
		String titulo = "";

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\nBIBLIOTECA");
			System.out.println("----------");
			System.out.println("1. Prestar");
			System.out.println("2. Devolver");
			System.out.println("3. Buscar");
			System.out.println("4. Salir");
			System.out.println("\nElige una opción:");

			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Error. " + e.getMessage());
			}

			switch (opcion) {
				case 1:
					System.out.println("Introduce el título del libro: ");
					try {
						titulo = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
	
					if (b.buscar(titulo) instanceof Libro) {
						if (!((Libro) b.buscar(titulo)).estaPrestado()) {
							((Libro) b.buscar(titulo)).presta();
							System.out.println("Libro prestado");
						} else {
							System.out.println("El libro no está en la biblioteca");
						}
					} else {
						System.out.println("Ese libro no existe");
					}
	
					break;
				case 2:
					System.out.println("Introduce el título del libro: ");
					try {
						titulo = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
	
					if (b.buscar(titulo) instanceof Libro) {
						if (((Libro) b.buscar(titulo)).estaPrestado()) {
							((Libro) b.buscar(titulo)).devuelve();
							System.out.println("Libro devuelto");
						} else {
							System.out.println("El libro ya está en la biblioteca");
						}
					} else {
						System.out.println("Ese libro no existe");
					}
					break;
				case 3:
					System.out.println("Introduce el título de la publicación: ");
					try {
						titulo = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
	
					System.out.println(b.buscar(titulo).toString());
					break;
				case 4:
					System.out.println("Has salido de la biblioteca\n");
					break;
				default:
					System.out.println("Hay que introducir números entre 1 y 4");
			}
		} while (!(opcion == 4));

		sc.close();

		// Añadimos autores a las publicaciones
		b.buscar("El fin de la eternidad").addAutor("Isaac", "Asimov");
		b.buscar("Solaris").addAutor("Stanislaw", "Lem");
		b.buscar("En las montañas de la locura").addAutor("Isaac", "Asimov");
		b.buscar("Science").addAutor("Isaac", "Asimov");
		b.buscar("Soy leyenda").addAutor("Richard", "Matheson");

		// Buscamos todas las "publicaciones" de Isaac Asimov
		System.out.println(b.buscar(new Autor("Isaac", "Asimov")));

	}

}
