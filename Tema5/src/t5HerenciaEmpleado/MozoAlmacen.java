/**
 * 
 */
package t5HerenciaEmpleado;

/**
 * @author Ruben
 *
 */
public class MozoAlmacen extends Operario {

	private int peligrosidad;

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param haceHorasExtra
	 * @param peligrosidad
	 */
	public MozoAlmacen(String nombre, int edad, double salario, boolean haceHorasExtra, int peligrosidad) {
		super(nombre, edad, salario, haceHorasExtra);
		this.peligrosidad = peligrosidad;
	}

	/**
	 * @return the peligrosidad
	 */
	public int getPeligrosidad() {
		return peligrosidad;
	}

	/**
	 * @param peligrosidad the peligrosidad to set
	 */
	public void setPeligrosidad(int peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MozoAlmacen [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", haceHorasExtra=");
		builder.append(haceHorasExtra);
		builder.append(", peligrosidad=");
		builder.append(peligrosidad);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void plus() {
		if ((this.peligrosidad == 3) || ((this.peligrosidad == 2) && (super.getEdad() > 30))
				|| ((this.peligrosidad == 1) && (super.getEdad() < 30))) {
					super.setSalario(super.getSalario() + super.plus);
		}
		if (super.isHaceHorasExtra() == true) {
			super.setSalario(super.getSalario() + super.plus * 2);
		}
	}

}
