/**
 * 
 */
package t5HerenciaEmpleado;

/**
 * @author Ruben
 *
 */
public abstract class Empleado {

	// Propiedades
	protected String nombre;
	protected int edad;
	protected double salario;

	protected final int plus = 300;

	/**
	 * Constructor con las tres propiedades
	 * 
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the plus
	 */
	public int getPlus() {
		return plus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Método abstracto que en cada clase hija modificará el sueldo de manera
	 * distinta
	 * 
	 * @return
	 */
	public abstract void plus();

}
