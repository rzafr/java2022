/**
 * 
 */
package examenPrime;

/**
 * @author Ruben
 *
 */
public class Pelicula extends Multimedia {

	/**
	 * Propiedades
	 */
	private int duracion;

	/**
	 * Constructor añadiéndole al del padre la duración
	 * 
	 * @param titulo
	 * @param esPlus
	 * @param precio
	 */
	public Pelicula(String titulo, boolean esPlus, double precio, int duracion) {
		super(titulo, esPlus, precio);
		this.duracion = duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", esPlus=");
		builder.append(esPlus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}

}
