/**
 * 
 */
package examenPrime;

/**
 * @author Ruben
 *
 */
public class Multimedia {

	/**
	 * Propiedades
	 */
	protected long codigo;
	protected String titulo;
	protected boolean esPlus;
	protected double precio;// Se aplica si no es cliente plus
	protected Genero genero;

	private static int autoincremento = 1;

	/**
	 * Constructor por defecto
	 */
	public Multimedia() {
		this.codigo = Multimedia.autoincremento;
		Multimedia.autoincremento++;
		this.titulo = "";
		this.esPlus = false;
		this.precio = 0;
		this.genero = null;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param titulo
	 * @param esPlus
	 * @param precio
	 */
	public Multimedia(String titulo, boolean esPlus, double precio) {
		this.codigo = Multimedia.autoincremento;
		Multimedia.autoincremento++;
		this.titulo = titulo;
		this.esPlus = esPlus;
		this.precio = precio;
		this.genero = null;
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
	 * @return the esPlus
	 */
	public boolean isEsPlus() {
		return esPlus;
	}

	/**
	 * @param esPlus the esPlus to set
	 */
	public void setEsPlus(boolean esPlus) {
		this.esPlus = esPlus;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
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
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
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
		Multimedia other = (Multimedia) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", esPlus=");
		builder.append(esPlus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

}
