/**
 * 
 */
package t6POOAvanzadaBiblioteca;

/**
 * @author Ruben
 *
 */
public class Revista extends Publicacion {

	// Atributos
	private int numero;

	private static int num = 0;

	/**
	 * Constructor parametrizado
	 * 
	 * @param isbn
	 * @param titulo
	 * @param year
	 * @param paginas
	 */
	public Revista(String isbn, String titulo, int year, int paginas) {
		super(isbn, titulo, year, paginas);
		Revista.num++;
		this.numero = Revista.num;
	}

	// Getters y setters

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [numero=");
		builder.append(numero);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", year=");
		builder.append(year);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", autores=");
		builder.append(autores);
		builder.append("]\n");
		return builder.toString();
	}

}
