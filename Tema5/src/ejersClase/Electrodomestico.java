/**
 * 
 */
package ejersClase;

/**
 * @author Ruben
 *
 */
public class Electrodomestico {

	enum Color { BLANCO, NEGRO, ROJO, AZUL, GRIS };
	enum Eficiencia { A, B, C, D, E, F, G };
	
	protected String marca;
	protected String modelo;
	protected double precio;
	protected double peso;
	protected Eficiencia eficiencia;
	protected Color color;
	
	
	public Electrodomestico() {
		this.precio = 100;
		this.peso = 5;
		this.eficiencia = Eficiencia.F;
		this.color = Color.BLANCO;
	}
	
	
	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param peso
	 * @param eficiencia
	 * @param color
	 */
	public Electrodomestico(String marca, String modelo, double precio, double peso, Eficiencia eficiencia,
			Color color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.peso = peso;
		this.eficiencia = eficiencia;
		this.color = color;
	}


	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}


	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
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
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}


	/**
	 * @return the eficiencia
	 */
	public Eficiencia getEficiencia() {
		return eficiencia;
	}


	/**
	 * @param eficiencia the eficiencia to set
	 */
	public void setEficiencia(Eficiencia eficiencia) {
		this.eficiencia = eficiencia;
	}


	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}


	
	
	// comprobarConsumoEnergetico(char letra) como tenemos ya el enum no se hace
	// comprobarColor(String color) este igual
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Electrodomestico [marca=");
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
		double precioF=0;
		switch (this.eficiencia) {
		case A: {
			precioF = this.precio + 100;
			break;
		}
		case B: {
			precioF = this.precio + 80;
			break;
		}
		case C: {
			precioF = this.precio + 60;
			break;
		}
		case D: {
			precioF = this.precio + 50;
			break;
		}
		case E: {
			precioF = this.precio + 30;
			break;
		}
		case F: {
			precioF = this.precio + 20;
			break;
		}
		case G: {
			precioF = this.precio + 10;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.eficiencia);
		}
		
		if (this.peso >= 0 && this.peso <= 19)
			precioF += 10;
		
		return precioF;
	}
}
