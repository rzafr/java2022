/**
 * 
 */
package examenPrime;

/**
 * @author Ruben
 *
 */
public abstract class Cliente {

	/**
	 * Propiedades
	 */
	protected String dni;
	protected String nombre;
	protected String email;
	protected double precioMensual;

	/**
	 * Constructor por defecto
	 */
	public Cliente() {
		this.dni = "";
		this.nombre = "";
		this.email = "";
		this.precioMensual = 0;
	}

	/**
	 * Constructor con todos los parámetros menos precioMensual
	 * 
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public Cliente(String dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param precioMensual the precioMensual to set
	 */
	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append(", precioMensual=");
		builder.append(precioMensual);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	/**
	 * Devuelve un boolean indicando si el cliente es Pro
	 * 
	 * @return
	 */
	public abstract boolean esPro();

	/**
	 * Devuelve el precio mensual según el cliente
	 * 
	 * @return
	 */
	public abstract double getPrecioMensual();
}
