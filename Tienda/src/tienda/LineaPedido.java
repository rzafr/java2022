/**
 * 
 */
package tienda;

/**
 * @author Ruben
 *
 */
public class LineaPedido {

	private Producto producto;
	private int cantidad;
	/**
	 * @param producto
	 * @param cantidad
	 */
	public LineaPedido(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/**
	 * Devuelve el precio por la cantidad aplicando el IVA
	 * @return
	 */
	public double subtotal() {
		return this.producto.getPrecio()*this.cantidad*this.producto.getIva();
	}
}
