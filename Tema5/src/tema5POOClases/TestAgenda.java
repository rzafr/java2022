/**
 * 
 */
package tema5POOClases;

import java.util.Scanner;

/**
 * @author Ruben
 *
 */
public class TestAgenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Agenda a = new Agenda();

		int opcion = 0;
		String nombre = "";
		int telefono = 0;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\nAGENDA TELEFÓNICA");
			System.out.println("-----------------");
			System.out.println("1. Añadir contacto nuevo");
			System.out.println("2. Listar contactos");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Eliminar contacto");
			System.out.println("5. Salir");
			System.out.println("\nElige una opción:");

			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Error. " + e.getMessage());
			}

			switch (opcion) {
				case 1:
					System.out.println("Introduce un nombre: ");
					try {
						nombre = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
	
					System.out.println("Introduce un número de teléfono: ");
					try {
						telefono = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
	
					if (a.addContacto(new Contacto(nombre, telefono)))
						System.out.println("El contacto se ha añadido con éxito");
					else
						System.out.println("El contacto no se pudo añadir, ya existe");
					break;
				case 2:
					System.out.println("Lista de Contactos: ");
					a.listarContactos();
					break;
				case 3:
					System.out.println("Introduce un nombre: ");
					try {
						nombre = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
	
					if (a.buscarContacto(nombre) < 0)
						System.out.println("Ese contacto no está en la agenda");
					else
						System.out.println("Teléfono de " + nombre + ": " + a.buscarContacto(nombre));
				
					break;
				case 4:
					System.out.println("Introduce un nombre: ");
					try {
						nombre = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error. " + e.getMessage());
					}
	
					if (a.eliminarContacto(new Contacto(nombre, 0)))
						System.out.println("Contacto eliminado");
					else
						System.out.println("No he encontrado ese teléfono para eliminar");
					break;
				case 5:
					System.out.println("Has salido del programa");
					break;
				default:
					System.out.println("Hay que introducir números entre 1 y 5");
			}
		} while (!(opcion == 5));

		sc.close();
	}

}
