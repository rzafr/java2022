/**
 * 
 */
package t6POOAvanzadaScotify;

/**
 * @author Ruben
 *
 */
public class Cancion extends Multimedia {

	// Atributos
	private int posicion;
	private Genero genero;
	private Disco disco;

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param duracion
	 */
	public Cancion(String nombre, int duracion, int posicion, Genero genero, Disco disco) {
		super(nombre, duracion);
		this.posicion = posicion;
		this.genero = genero;
		this.disco = disco;
	}

	// Getters y setters

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * @return the disco
	 */
	public Disco getDisco() {
		return disco;
	}

	/**
	 * @param disco the disco to set
	 */
	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cancion [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", autores=");
		builder.append(autores);
		builder.append(", posicion=");
		builder.append(posicion);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", disco=");
		builder.append(disco);
		builder.append("]");
		return builder.toString();
	}

}
