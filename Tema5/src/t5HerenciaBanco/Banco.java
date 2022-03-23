/**
 * 
 */
package t5HerenciaBanco;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Banco {

	private ArrayList<CuentaBancaria> cuentas;

	/**
	 * Constructor que inicializa el ArrayList
	 */
	public Banco() {
		this.cuentas = new ArrayList<>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [cuentas=");
		builder.append(cuentas);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Añade una CuentaBancaria al ArrayList cuentas
	 * 
	 * @param cb
	 */
	public void addCuenta(CuentaBancaria cb) {
		this.cuentas.add(cb);
	}

	/**
	 * Devuelve la cuenta dentro del banco que coincida con el número de cuenta
	 * pasado como parámetro
	 * 
	 * @param numeroDeCuenta
	 * @return
	 */
	public CuentaBancaria getCuenta(String numeroDeCuenta) {
		for (CuentaBancaria cb : cuentas) {
			if (cb.getNumeroCuenta().equals(numeroDeCuenta))
				return cb;
		}
		return null;
	}
}