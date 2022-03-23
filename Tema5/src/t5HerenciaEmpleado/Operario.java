/**
 * 
 */
package t5HerenciaEmpleado;

/**
 * @author Ruben
 *
 */
public class Operario extends Empleado {

	protected boolean haceHorasExtra;

	/**
	 * Constructor con todas las propiedades
	 * 
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param haceHorasExtra
	 */
	public Operario(String nombre, int edad, double salario, boolean haceHorasExtra) {
		super(nombre, edad, salario);
		this.haceHorasExtra = haceHorasExtra;
	}

	/**
	 * @return the haceHorasExtra
	 */
	public boolean isHaceHorasExtra() {
		return haceHorasExtra;
	}

	/**
	 * @param haceHorasExtra the haceHorasExtra to set
	 */
	public void setHaceHorasExtra(boolean haceHorasExtra) {
		this.haceHorasExtra = haceHorasExtra;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operario [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", haceHorasExtra=");
		builder.append(haceHorasExtra);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void plus() {

	}

}
