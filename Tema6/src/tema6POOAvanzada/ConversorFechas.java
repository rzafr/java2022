/**
 * 
 */
package tema6POOAvanzada;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Ruben
 *
 */
public class ConversorFechas {

	/**
	 * Convierte una fecha en formato normal dd/mm/yyyy a formato americano
	 * mm/dd/yyyy
	 * 
	 * @param fecha
	 * @return
	 */
	public static String normalToAmericano(String fecha) {

		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		LocalDate fech = LocalDate.parse(fecha, formato1);

		String fechFormat = fech.format(formato2);

		return fechFormat;

	}

	/**
	 * Convierte una fecha en formato americano mm/dd/yyyy a formato normal
	 * dd/mm/yyyy
	 * 
	 * @param fecha
	 * @return
	 */
	public static String americanoToNormal(String fecha) {

		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fech = LocalDate.parse(fecha, formato1);

		String fechFormat = fech.format(formato2);

		return fechFormat;
	}

	public static void main(String[] args) {

		String fecha1 = "28/02/2022";
		String fecha2 = "01/22/2022";

		// Pasamos la fecha en formato normal a americano
		System.out.println(normalToAmericano(fecha1));

		// Pasamos la fecha en formato americano a normal
		System.out.println(americanoToNormal(fecha2));

	}
}
