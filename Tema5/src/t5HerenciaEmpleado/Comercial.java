/**
 * 
 */
package t5HerenciaEmpleado;

/**
 * @author Ruben
 *
 */
public class Comercial extends Empleado {

	private double comision;

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param comision
	 */
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	/**
	 * @return the comision
	 */
	public double getComision() {
		return comision;
	}

	/**
	 * @param comision the comision to set
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comercial [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", comision=");
		builder.append(comision);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void plus() {
		if ((super.getEdad() > 30) && this.comision > 200) {
			super.setSalario(super.getSalario() + super.plus);
		}
	}

}
