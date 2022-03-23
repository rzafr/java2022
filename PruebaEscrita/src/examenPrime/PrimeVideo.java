/**
 * 
 */
package examenPrime;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class PrimeVideo {

	/**
	 * Propiedades
	 */
	private ArrayList<Multimedia> catalogo;
	private ArrayList<Cliente> suscriptores;
	private double ganancias;

	/**
	 * Constructor sin par�metros que inicializa los ArrayList y las ganancias a
	 * cero
	 */
	public PrimeVideo() {
		this.catalogo = new ArrayList<>();
		this.suscriptores = new ArrayList<>();
		this.ganancias = 0;
	}

	/**
	 * @return the catalogo
	 */
	public ArrayList<Multimedia> getCatalogo() {
		return catalogo;
	}

	/**
	 * @return the suscriptores
	 */
	public ArrayList<Cliente> getSuscriptores() {
		return suscriptores;
	}

	/**
	 * A�ade un suscriptor, si no estaba ya
	 * 
	 * @param c
	 */
	public void addSuscriptor(Cliente c) {
		if (this.suscriptores.indexOf(c) < 0)
			this.suscriptores.add(c);
	}

	/**
	 * A�ade una pel�cula al cat�logo, si no estaba ya
	 * 
	 * @param m
	 */
	public void addMultimedia(Multimedia m) {
		if (this.catalogo.indexOf(m) < 0)
			this.catalogo.add(m);
	}

	/**
	 * Si el cliente no es pro se a�ade a ganancias el precio del Multimedia
	 * 
	 * @param m
	 * @param c
	 */
	public void ver(Multimedia m, Cliente c) {
		if ((!c.esPro()) || (m.esPlus))
			this.ganancias += m.getPrecio();
	}

	/**
	 * Devuelve las ganancias generadas cuando los clientes ven multimedia m�s las
	 * ganancias de los todos los suscriptores que haya
	 * 
	 * @return
	 */
	public double getGanancias() {
		for (Cliente c : this.suscriptores) {
			this.ganancias += c.getPrecioMensual() * 12;
		}
		return this.ganancias;
	}
}
