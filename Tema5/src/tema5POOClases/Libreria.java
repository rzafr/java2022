/**
 * 
 */
package tema5POOClases;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Libreria {

	private ArrayList<Libro> bookshop;

	/**
	 * Constructor que inicializa el ArrayList
	 */
	public Libreria() {
		this.bookshop = new ArrayList<>();
	}

	/**
	 * Asigna un precio de compra al libro y lo añade a la librería
	 * 
	 * @param li
	 * @param precioCompra
	 */
	public void adquirir(Libro li, double precioCompra) {
		li.setPrecioCompra(precioCompra);
		this.bookshop.add(li);
	}

	/**
	 * Pone el precio de venta y cambia el estado a “vendido = true”
	 * 
	 * @param li
	 * @param precioVenta
	 */
	public void vender(Libro li, double precioVenta) {
		// Hay que buscar el libro en la librería y ponerle el precio de venta
		for (Libro l : bookshop) {
			if (l.equals(li)) {
				l.setPrecioVenta(precioVenta);
				l.setVendido(true);
			}
		}
		// Se podría realizar de esta otra manera (vista en clase)
		// Libro l = bookshop.get(bookshop.indexOf(li));
		// l.setPrecioVenta(precioVenta);
		// l.setVendido(true);
	}

	/**
	 * Calcula las ganancias de todos los libros que hemos vendido
	 * 
	 * @return
	 */
	public double ganancias() {
		double total = 0;
		for (Libro l : bookshop) {
			if (l.isVendido())
				total += l.getPrecioVenta() - l.getPrecioCompra();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libreria [bookshop=");
		builder.append(bookshop);
		builder.append("]");
		return builder.toString();
	}

}
