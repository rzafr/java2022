/**
 * 
 */
package ejersClase;

/**
 * @author Ruben
 *
 */
public class Lavadora extends Electrodomestico {

	protected double carga;

	/**
	 * 
	 */
	public Lavadora() {
		super();
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param peso
	 * @param eficiencia
	 * @param color
	 */
	public Lavadora(String marca, String modelo, double precio, double peso, Eficiencia eficiencia, Color color) {
		super(marca, modelo, precio, peso, eficiencia, color);
		this.carga=5;
	}
	
	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param peso
	 * @param eficiencia
	 * @param color
	 */
	public Lavadora(String marca, String modelo, double precio, double peso, Eficiencia eficiencia, Color color, double carga) {
		super(marca, modelo, precio, peso, eficiencia, color);
		this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lavadora [carga=");
		builder.append(carga);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", eficiencia=");
		builder.append(eficiencia);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
	public double precioFinal() {
		// Llama a precioFinal del padre -> Electrodomestico
		double precioF = super.precioFinal();
		if (this.carga > 8)
			return precioF+50;
		else
			return precioF;
	}
}
