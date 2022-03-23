/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class Libro {

	// Propiedades
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private double precioCompra;
	private double precioVenta;
	private boolean vendido;

	/**
	 * Constructor con parámetros
	 * 
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numeroPaginas
	 * @param vendido
	 */
	public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.precioCompra = 0;
		this.precioVenta = 0;
		this.vendido = false;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the vendido
	 */
	public boolean isVendido() {
		return vendido;
	}

	/**
	 * @param vendido the vendido to set
	 */
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @return the numeroPaginas
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("El libro ");
		builder.append(titulo);
		builder.append(" con ISBN ");
		builder.append(isbn);
		builder.append(" creado por el autor ");
		builder.append(autor);
		builder.append(" tiene ");
		builder.append(numeroPaginas);
		builder.append(" páginas.");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}
