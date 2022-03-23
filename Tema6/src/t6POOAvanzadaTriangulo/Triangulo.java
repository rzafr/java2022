/**
 * 
 */
package t6POOAvanzadaTriangulo;

/**
 * @author Ruben
 *
 */
public abstract class Triangulo implements Comparable<Triangulo> {

	// Propiedades
	protected double lado1;
	protected double lado2;
	protected double lado3;

	/**
	 * Constructor por defecto
	 */
	public Triangulo() {
		this.lado1 = 1;
		this.lado2 = 1;
		this.lado3 = 1;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/**
	 * Constructor copia
	 * 
	 * @param tri
	 */
	public Triangulo(Triangulo t) {
		this.lado1 = t.lado1;
		this.lado2 = t.lado2;
		this.lado3 = t.lado3;
	}

	// Getters y setters

	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * @return the lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(lado1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Triangulo other = (Triangulo) obj;
		if (Double.doubleToLongBits(lado1) != Double.doubleToLongBits(other.lado1))
			return false;
		if (Double.doubleToLongBits(lado2) != Double.doubleToLongBits(other.lado2))
			return false;
		if (Double.doubleToLongBits(lado3) != Double.doubleToLongBits(other.lado3))
			return false;
		return true;
	}

	/**
	 * Devuelve -1 si el área del triángulo es menor que la del parámetro Devuelve 1
	 * si el área del triángulo es mayor que la del triángulo Devuelve 0 si el área
	 * del triángulo es igual que la del parámetro
	 * 
	 * @param t
	 * @return
	 */
	public int compareTo(Triangulo t) {
		if (this.area() < t.area())
			return -1;
		else if (this.area() > t.area())
			return 1;
		else
			return 0;
	}

	/**
	 * Calcula el área según el tipo de triángulo
	 * 
	 * @return
	 */
	public abstract double area();

	/**
	 * Calcula el perímetro del triángulo
	 * 
	 * @return
	 */
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	/**
	 * Valida si realmente un triángulo es del tipo que se está implementando
	 * 
	 * @return
	 */
	public abstract boolean valida();
}
