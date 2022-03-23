/**
 * 
 */
package t6POOAvanzadaScotify;

/**
 * @author Ruben
 *
 */
public class Autor {

	// Atributos
	private String nombre;
	private String informacion;

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param informacion
	 */
	public Autor(String nombre, String informacion) {
		super();
		this.nombre = nombre;
		this.informacion = informacion;
	}

	// Getters y setters

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
	 * @return the informacion
	 */
	public String getInformacion() {
		return informacion;
	}

	/**
	 * @param informacion the informacion to set
	 */
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", informacion=");
		builder.append(informacion);
		builder.append("]");
		return builder.toString();
	}

}
