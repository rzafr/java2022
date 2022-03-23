/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class Pez implements Cloneable {

	// Propiedades
	protected String nombre;
	private static int numPeces;

	/**
	 * Constructor sin parámetro que inicializa la propiedad
	 */
	public Pez() {
		this.nombre = "";
		Pez.numPeces++;
	}

	/**
	 * Constructor con parámetro
	 * 
	 * @param nombre
	 */
	public Pez(String nombre) {
		this.nombre = nombre;
		Pez.numPeces++;
	}

	/**
	 * Constructor copia
	 * 
	 * @param p
	 */
	public Pez(Pez p) {
		this.nombre = p.getNombre();
		Pez.numPeces++;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the numPeces
	 */
	public static int getNumPeces() {
		return Pez.numPeces;
	}

	@Override
	public Object clone() {
		Object objeto = null;
		try {
			objeto = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println("Error al duplicar");
		}
		Pez.numPeces++;
		return objeto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Pez other = (Pez) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
