/**
 * 
 */
package examenPrime;

/**
 * @author Ruben
 *
 */
public class Episodio {

	/**
	 * Propiedades
	 */
	private String titulo;
	private int duracion;
	private Temporada temporada;

	/**
	 * Constructor por defecto
	 */
	public Episodio() {
		this.titulo = "";
		this.duracion = 0;
		this.temporada = null;
	}

	/**
	 * Constructor parametrizado con título y duración
	 * 
	 * @param titulo
	 * @param duracion
	 */
	public Episodio(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	/**
	 * @return the temporada
	 */
	public Temporada getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [titulo=");
		builder.append(titulo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", temporada=");
		builder.append(temporada);
		builder.append("]");
		return builder.toString();
	}

}
