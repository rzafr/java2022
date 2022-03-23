/**
 * 
 */
package t6POOAvanzadaBiblioteca;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Publicacion {

	// Atributos
	protected String isbn;
	protected String titulo;
	protected int year;
	protected int paginas;
	protected ArrayList<Autor> autores;

	/**
	 * Constructor parametrizado
	 * 
	 * @param isbn
	 * @param titulo
	 * @param year
	 * @param paginas
	 */
	public Publicacion(String isbn, String titulo, int year, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.year = year;
		this.paginas = paginas;
		this.autores = new ArrayList<>();
	}

	// Getters y setters

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
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", year=");
		builder.append(year);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append("]\n");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Publicacion other = (Publicacion) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	/**
	 * Añade un nuevo autor al ArrayList indicando nombre y apellidos
	 * 
	 * @param nombre
	 * @param apellidos
	 */
	public void addAutor(String nombre, String apellidos) {
		this.autores.add(new Autor(nombre, apellidos));
	}

	/**
	 * Elimina un autor del ArrayList indicando nombre y apellidos
	 * 
	 * @param nombre
	 * @param apellidos
	 */
	public boolean deleteAutor(String nombre, String apellidos) {
		for (Autor a : autores) {
			if (a.equals(new Autor(nombre, apellidos))) {
				autores.remove(a);
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}

}
