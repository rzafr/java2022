/**
 * 
 */
package ejClaseProfesor;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class ProfesorTitular extends Profesor {

	private boolean catedratico;
	
	
	/**
	 * 
	 */
	public ProfesorTitular() {
		super();
		this.catedratico=false;
	}



	/**
	 * @param otroProfesor
	 */
	public ProfesorTitular(ProfesorTitular otroProfesorTitular) {
		super(otroProfesorTitular);
		this.catedratico=otroProfesorTitular.catedratico;
	}


	/**
	 * @param regPersonal
	 * @param nombre
	 * @param apellidos
	 * @param fechaNac
	 * @param nomina
	 */
	public ProfesorTitular(String regPersonal, String nombre, String apellidos, LocalDate fechaNac, double nomina, boolean catedratico) {
		super(regPersonal, nombre, apellidos, fechaNac, nomina);
		this.catedratico=catedratico;
	}

	/**
	 * @return the catedratico
	 */
	public boolean isCatedratico() {
		return catedratico;
	}

	/**
	 * @param catedratico the catedratico to set
	 */
	public void setCatedratico(boolean catedratico) {
		this.catedratico = catedratico;
	}


	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorTitular [regPersonal=");
		builder.append(regPersonal);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNac=");
		builder.append(fechaNac);
		builder.append(", nomina=");
		builder.append(nomina);
		builder.append(", catedratico=");
		builder.append(catedratico);
		builder.append("]");
		return builder.toString();
	}

	

	@Override
	public double importeNomina() {
		return this.nomina*1.30;
	}

}
