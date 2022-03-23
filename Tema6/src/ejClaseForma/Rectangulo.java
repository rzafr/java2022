/**
 * 
 */
package ejClaseForma;

/**
 * @author Ruben
 *
 */
public class Rectangulo extends Forma {

	protected double base;
	protected double altura;

	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo otroRectangulo) {
		super();
		this.base = otroRectangulo.base;
		this.altura = otroRectangulo.altura;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangulo [id=");
		builder.append(id);
		builder.append(", base=");
		builder.append(base);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(base);
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
		Rectangulo other = (Rectangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(base) != Double.doubleToLongBits(other.base))
			return false;
		return true;
	}

	@Override
	public double area() {
		return (Math.round(this.base * this.altura*100))/100.00;
	}

	@Override
	public void dibujar() {
		System.out.println("Esto es un rectángulo");
	}
}
