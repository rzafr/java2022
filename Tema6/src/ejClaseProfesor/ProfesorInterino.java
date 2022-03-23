/**
 * 
 */
package ejClaseProfesor;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Ruben
 *
 */
public class ProfesorInterino extends Profesor {

	private LocalDate fechaCom;

	/**
	 * 
	 */
	public ProfesorInterino() {
		super();
		this.fechaCom = LocalDate.now();
	}

	/**
	 * @param otroProfesor
	 */
	public ProfesorInterino(ProfesorInterino otroProfesorInterino) {
		super(otroProfesorInterino);
		this.fechaCom = otroProfesorInterino.fechaCom;
	}

	/**
	 * @param regPersonal
	 * @param nombre
	 * @param apellidos
	 * @param fechaNac
	 * @param nomina
	 */
	public ProfesorInterino(String regPersonal, String nombre, String apellidos, LocalDate fechaNac, double nomina,
			LocalDate fechaCom) {
		super(regPersonal, nombre, apellidos, fechaNac, nomina);
		this.fechaCom = fechaCom;
	}

	/**
	 * @return the fechaCom
	 */
	public LocalDate getFechaCom() {
		return fechaCom;
	}

	/**
	 * @param fechaCom the fechaCom to set
	 */
	public void setFechaCom(LocalDate fechaCom) {
		this.fechaCom = fechaCom;
	}

	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorInterino [regPersonal=");
		builder.append(regPersonal);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNac=");
		builder.append(fechaNac);
		builder.append(", nomina=");
		builder.append(nomina);
		builder.append(", fechaCom=");
		builder.append(fechaCom);
		builder.append("]");
		return builder.toString();
	}

	
	
	@Override
	public double importeNomina() {
		return this.nomina*1.10;
	}
	
	public Period tiempoTrabajado() {
		Period period = Period.between(this.fechaCom, LocalDate.now());
		return period;
	}
	//Para llamar a este método, como no está en las dos clases, se hace un casting con un instanceof (ver github)
	//Pero esto se carga el polimorfismo, pero esto es un parche
	//Habría que implantar el método también en la clase ProfesorTitular, dejándolo en blanco
	//SI HAS HECHO UNA BUENA HERENCIA, NO SE DEBERÍA PREGUNTAR POR EL TIPO DE INSTANCIA
}
