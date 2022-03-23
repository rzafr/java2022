/**
 * 
 */
package tienda;

/**
 * @author Ruben
 *
 */
public abstract class Cliente implements Descontable {

	// Atributos
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected String localidad;
	protected String direccion;
	
	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param localidad
	 * @param direccion
	 */
	public Cliente(String nombre, String apellidos, String dni, String localidad, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.localidad = localidad;
		this.direccion = direccion;
	}

	/**
	 * Constructor copia
	 * 
	 * @param c
	 */
	public Cliente(Cliente unCliente) {
		this.nombre = unCliente.nombre;
		this.apellidos = unCliente.apellidos;
		this.dni = unCliente.dni;
		this.localidad = unCliente.localidad;
		this.direccion = unCliente.direccion;
	}

	// Getters y setters

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}

	public abstract double descuento();

}
