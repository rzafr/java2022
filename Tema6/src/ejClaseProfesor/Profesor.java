/**
 * 
 */
package ejClaseProfesor;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public abstract class Profesor {

	protected String regPersonal;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNac;
	protected double nomina;
	
	/**
	 * @param regPersonal
	 * @param nombre
	 * @param apellidos
	 * @param fechaNac
	 * @param nomina
	 */
	public Profesor(String regPersonal, String nombre, String apellidos, LocalDate fechaNac, double nomina) {
		super();
		this.regPersonal = regPersonal;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.nomina = nomina;
	}

	/**
	 * 
	 */
	public Profesor() {
		super();
		this.regPersonal = "";
		this.nombre = "";
		this.apellidos = "";
		this.fechaNac = LocalDate.now();
		this.nomina = 0;
	}
	
	public Profesor(Profesor otroProfesor) {
		this.regPersonal = otroProfesor.regPersonal;
		this.nombre = otroProfesor.nombre;
		this.apellidos = otroProfesor.apellidos;
		this.fechaNac = otroProfesor.fechaNac;
		this.nomina = otroProfesor.nomina;
	}

	/**
	 * @return the regPersonal
	 */
	public String getRegPersonal() {
		return regPersonal;
	}

	/**
	 * @param regPersonal the regPersonal to set
	 */
	public void setRegPersonal(String regPersonal) {
		this.regPersonal = regPersonal;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fechaNac
	 */
	public LocalDate getFechaNac() {
		return fechaNac;
	}

	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * @return the nomina
	 */
	public double getNomina() {
		return nomina;
	}

	/**
	 * @param nomina the nomina to set
	 */
	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [regPersonal=");
		builder.append(regPersonal);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNac=");
		builder.append(fechaNac);
		builder.append(", nomina=");
		builder.append(nomina);
		builder.append("]");
		return builder.toString();
	}
	
	
	public abstract double importeNomina();
}
