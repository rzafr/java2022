/**
 * 
 */
package t5HerenciaEmpleado;

/**
 * @author Ruben
 *
 */
public class Repartidor extends Operario {

	private String zona;

	/**
	 * Constructor con todas las propiedades
	 * 
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param zona
	 */
	public Repartidor(String nombre, int edad, double salario, boolean haceHorasExtra, String zona) {
		super(nombre, edad, salario, haceHorasExtra);
		this.zona = zona;
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Repartidor [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", haceHorasExtra=");
		builder.append(haceHorasExtra);
		builder.append(", zona=");
		builder.append(zona);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void plus() {
		if ((super.getEdad() < 25) && (this.zona.equalsIgnoreCase("zona 3"))) {
			super.setSalario(super.getSalario() + super.plus);
		}
		if (super.isHaceHorasExtra() == true) {
			super.setSalario(super.getSalario() + super.plus * 2);
		}
	}

}
