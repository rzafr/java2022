/**
 * 
 */
package ejClaseForma;

/**
 * @author Ruben
 *
 */
public class Circulo extends Forma {

	private double radio;

	/**
	 * Constructor con parámetro
	 * 
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public Circulo(Circulo otroCirculo) {
		super();// Se puede poner this.id=otroCirculo.id y tendría el mismo id
		this.radio = otroCirculo.radio;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circulo [id=");
		builder.append(id);
		builder.append(", radio=");
		builder.append(radio);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(radio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))
			return false;
		return true;
	}

	@Override
	public double area() {
		return Math.round(Math.PI * Math.pow(this.radio, 2)*100)/100.00;
	}

	@Override
	public void dibujar() {
		System.out.println("Esto es un círculo");
	}

}
