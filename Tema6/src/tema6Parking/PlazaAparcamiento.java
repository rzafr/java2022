/**
 * 
 */
package tema6Parking;

/**
 * @author Ruben
 *
 */
public class PlazaAparcamiento {

	// Atributos
	private int numPlaza;
	private boolean estaLibre;

	private static int num = 0;

	/**
	 * Constructor por defecto
	 */
	public PlazaAparcamiento() {
		PlazaAparcamiento.num++;
		this.numPlaza = PlazaAparcamiento.num;
		this.estaLibre = true;
	}

	/**
	 * Constructor por número de plaza
	 * 
	 * @param numPlaza
	 */
	public PlazaAparcamiento(int numPlaza) {
		this.numPlaza = numPlaza;
		this.estaLibre = true;
	}

	// Getters y setters

	/**
	 * @return the numPlaza
	 */
	public int getNumPlaza() {
		return numPlaza;
	}

	/**
	 * @param numPlaza the numPlaza to set
	 */
	public void setNumPlaza(int numPlaza) {
		this.numPlaza = numPlaza;
	}

	/**
	 * @return the estaLibre
	 */
	public boolean isEstaLibre() {
		return estaLibre;
	}

	/**
	 * @param estaLibre the estaLibre to set
	 */
	public void setEstaLibre(boolean estaLibre) {
		this.estaLibre = estaLibre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlazaAparcamiento [numPlaza=");
		builder.append(numPlaza);
		builder.append(", estaLibre=");
		builder.append(estaLibre);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numPlaza;
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
		PlazaAparcamiento other = (PlazaAparcamiento) obj;
		if (numPlaza != other.numPlaza)
			return false;
		return true;
	}

}
