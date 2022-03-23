/**
 * 
 */
package tema6POOAvanzada;

/**
 * @author Ruben
 *
 */
public class Serie implements Entregable {

	// Propiedades
	private String titulo;
	private int numTemp;
	private String genero;
	private String creador;
	private boolean prestado;

	/**
	 * Constructor por defecto
	 */
	public Serie() {
		this.titulo = "";
		this.numTemp = 3;
		this.genero = "";
		this.creador = "";
		this.prestado = false;
	}

	/**
	 * Constructor con el título y el creador. El resto por defecto
	 * 
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.numTemp = 3;
		this.genero = "";
		this.creador = creador;
		this.prestado = false;
	}

	/**
	 * Constructor con todos los atributos como parámetro, excepto el atributo
	 * prestado
	 * 
	 * @param titulo
	 * @param numTemp
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int numTemp, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.genero = genero;
		this.creador = creador;
		this.prestado = false;
	}

	/**
	 * Constructor copia
	 * 
	 * @param otraSerie
	 */
	public Serie(Serie otraSerie) {
		this.titulo = otraSerie.titulo;
		this.numTemp = otraSerie.numTemp;
		this.genero = otraSerie.genero;
		this.creador = otraSerie.creador;
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
	 * @return the numTemp
	 */
	public int getNumTemp() {
		return numTemp;
	}

	/**
	 * @param numTemp the numTemp to set
	 */
	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
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
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [titulo=");
		builder.append(titulo);
		builder.append(", numTemp=");
		builder.append(numTemp);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", creador=");
		builder.append(creador);
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
