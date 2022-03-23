/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class Producto {

	// Propiedades
	private int id;
	private String descripcion;
	private double precioUnitario;
	private int unidadesDisponibles;
	private int stockMaximo;
	private double descuento;
	
	/**
	 * Constructor por defecto
	 */
	public Producto() {
		this.id=0;
		this.descripcion="";
		this.precioUnitario=0;
		this.unidadesDisponibles=0;
		this.stockMaximo=0;
		this.descuento=0;
	}

	/**
	 * Constructor con todos los parámetros
	 * @param id
	 * @param descripcion
	 * @param precioUnitario
	 * @param unidadesDisponibles
	 * @param stockMaximo
	 * @param descuento
	 */
	public Producto(int id, String descripcion, double precioUnitario, int unidadesDisponibles, int stockMaximo,
			double descuento) {
		this.id = id;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.unidadesDisponibles = unidadesDisponibles;
		this.stockMaximo = stockMaximo;
		this.descuento = descuento;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precioUnitario
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	/**
	 * @return the unidadesDisponibles
	 */
	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	/**
	 * @param unidadesDisponibles the unidadesDisponibles to set
	 */
	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}

	/**
	 * @return the stockMaximo
	 */
	public int getStockMaximo() {
		return stockMaximo;
	}

	/**
	 * @param stockMaximo the stockMaximo to set
	 */
	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	/**
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precioUnitario=");
		builder.append(precioUnitario);
		builder.append(", unidadesDisponibles=");
		builder.append(unidadesDisponibles);
		builder.append(", stockMaximo=");
		builder.append(stockMaximo);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Producto other = (Producto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	/**
	 * Decrementa el atributo unidades disponibles si la cantidad a vender es inferior
	 * @param cantidad
	 * @return
	 */
	public boolean vender(int cantidad) {
		boolean vendido=false;
		if ((cantidad > 0) && (this.unidadesDisponibles >= cantidad)) {
			this.unidadesDisponibles -= cantidad;
			vendido= true;
		}
		return vendido;
	}
	
	/**
	 * Repone un producto para que alcance su stock máximo, devolviendo la diferencia entre el stock máximo y las unidades disponibles
	 * @return
	 */
	public int reponer() {
		int diferencia = this.stockMaximo - this.unidadesDisponibles;
		this.unidadesDisponibles=this.stockMaximo;
		return diferencia;
	}
}
