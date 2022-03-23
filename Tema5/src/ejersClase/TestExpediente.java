/**
 * 
 */
package ejersClase;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class TestExpediente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Expediente alu1 = new Expediente("Rubén", "Zafra", LocalDate.of(2000, 2, 20), 2);
		alu1.setSexo('H');
		System.out.println(alu1);
		
		
		
		

	}



}
