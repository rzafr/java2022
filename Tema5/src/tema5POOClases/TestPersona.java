/**
 * 
 */
package tema5POOClases;

import java.util.Scanner;

/**
 * @author Ruben
 *
 */
public class TestPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Persona p = new Persona();

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu nombre: ");
		try {
			p.setNombre(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Dime tu edad: ");
		try {
			p.setEdad(Integer.parseInt(sc.nextLine()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Dime tu sexo (H o M): ");
		try {
			p.setSexo(sc.nextLine().charAt(0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Dime tu peso: ");
		try {
			p.setPeso(Double.parseDouble(sc.nextLine()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Dime tu altura: ");
		try {
			p.setAltura(Double.parseDouble(sc.nextLine()));
		} catch (Exception e) {
			System.out.println("Dime tu altura: ");
		}

		sc.close();

		// Comprobamos si la persona es mayor de edad o no
		if (p.esMayorDeEdad()) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
		}

		// Comprobamos si está en su peso ideal o no
		if (p.calcularIMC() == -1) {
			System.out.println("Estás por debajo de tu peso ideal.");
		} else if (p.calcularIMC() == 0) {
			System.out.println("Estás en tu peso ideal.");
		} else {
			System.out.println("Tienes sobrepeso.");
		}

		// Mostramos la información del objeto
		System.out.println(p);

	}

}
