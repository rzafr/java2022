/**
 * 
 */
package tienda;

/**
 * @author Ruben
 *
 */
public class Categoria {

	private String nombre;

	/**
	 * Constructor al que se le pasa el nombre de la categoría
	 * @param nombre
	 */
	public Categoria(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categoria [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	
	
}
