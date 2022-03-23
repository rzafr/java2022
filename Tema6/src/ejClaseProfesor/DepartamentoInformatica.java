/**
 * 
 */
package ejClaseProfesor;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class DepartamentoInformatica {

	
	public static void main(String[] args) {
		
		ArrayList<Profesor> profesorado=new ArrayList<>();
		
		profesorado.add(new ProfesorTitular("INF001", "Juan", "Carrasco López", LocalDate.of(1980,6,20), 2000.90, true));
		profesorado.add(new ProfesorInterino("INF002", "Nuria", "Garcia López", LocalDate.of(1988,6,25), 1800.20, LocalDate.of(2014,8,25)));
		
		for(Profesor p : profesorado) {
			System.out.println(p.getNombre() + " gana " + p.importeNomina() + " €");
		}
	}
	
}
	