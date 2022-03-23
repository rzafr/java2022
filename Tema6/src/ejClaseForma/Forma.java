/**
 * 
 */
package ejClaseForma;

/**
 * @author Ruben
 *
 */
public abstract class Forma implements Dibujable {

	protected int id;
	protected static int contaF;

	Forma() {
		Forma.contaF++;
		this.id = Forma.contaF;
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
		Forma other = (Forma) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public abstract double area();

	public abstract void dibujar();

}
