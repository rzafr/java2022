/**
 * 
 */
package tema6POOAvanzada;

/**
 * @author Ruben
 *
 */
public class Videojuego implements Entregable {

	// Atributos
	private String titulo;
	private int horasEstimadas;
	private String genero;
	private String desarrollador;
	private boolean prestado;

	/**
	 * Constructor por defecto. Las horas estimadas serán de 100 horas, y prestado
	 * será false
	 */
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 100;
		this.genero = "";
		this.desarrollador = "";
		this.prestado = false;
	}

	/**
	 * Constructor con el título y horas estimadas, y el resto por defecto
	 * 
	 * @param titulo
	 * @param horasEstimadas
	 */
	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = "";
		this.desarrollador = "";
		this.prestado = false;
	}

	/**
	 * Constructor con todos los atributos, excepto el atributo prestado
	 * 
	 * @param titulo
	 * @param horasEstimadas
	 * @param genero
	 * @param desarrollador
	 */
	public Videojuego(String titulo, int horasEstimadas, String genero, String desarrollador) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
		this.prestado = false;
	}

	/**
	 * Constructor copia
	 * 
	 * @param otroVideojuego
	 */
	public Videojuego(Videojuego otroVideojuego) {
		this.titulo = otroVideojuego.titulo;
		this.horasEstimadas = otroVideojuego.horasEstimadas;
		this.genero = otroVideojuego.genero;
		this.desarrollador = otroVideojuego.desarrollador;
		this.prestado = false;
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
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the desarrollador
	 */
	public String getDesarrollador() {
		return desarrollador;
	}

	/**
	 * @param desarrollador the desarrollador to set
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Videojuego [titulo=");
		builder.append(titulo);
		builder.append(", horasEstimadas=");
		builder.append(horasEstimadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", desarrollador=");
		builder.append(desarrollador);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void entregar() {
		this.prestado = true;
	}

	@Override
	public void devolver() {
		this.prestado = false;
	}

	@Override
	public boolean isPrestado() {
		return this.prestado;
	}

}
