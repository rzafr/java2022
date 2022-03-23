/**
 * 
 */
package t6POOAvanzadaBiblioteca;

/**
 * @author Ruben
 *
 */
public class Libro extends Publicacion implements Prestable {

	// Atributos
	private boolean prestado;

	/**
	 * Constructor parametrizado
	 * 
	 * @param isbn
	 * @param titulo
	 * @param year
	 * @param paginas
	 */
	public Libro(String isbn, String titulo, int year, int paginas) {
		super(isbn, titulo, year, paginas);
		this.prestado = false;
	}

	/**
	 * Pasa el atributo prestado a true para indicar que ha sido prestado
	 */
	public void presta() {
		this.prestado = true;
	}

	/**
	 * Pasa el atributo prestado a false para indicar que ha sido devuelto
	 */
	public void devuelve() {
		this.prestado = false;
	}

	/**
	 * Indica si el libro está prestado o no
	 */
	public boolean estaPrestado() {
		return this.prestado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", year=");
		builder.append(year);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", autores=");
		builder.append(autores);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]\n");
		return builder.toString();
	}

}
