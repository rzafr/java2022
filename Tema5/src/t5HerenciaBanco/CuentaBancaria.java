/**
 * 
 */
package t5HerenciaBanco;

/**
 * @author Ruben
 *
 */
public class CuentaBancaria {

	// Propiedades
	protected String numeroCuenta;
	protected double saldo;
	protected boolean tieneTarjetaCredito;
	protected boolean tieneTarjetaDebito;
	protected double comisionesAnual; // Euros de comisión que tiene esa cuenta al año

	/**
	 * Constructor parametrizado
	 * 
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionesAnual
	 */
	public CuentaBancaria(double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisionesAnual) {
		super();
		this.numeroCuenta = this.generarNumeroCuenta();
		this.saldo = saldo;
		this.tieneTarjetaCredito = tieneTarjetaCredito;
		this.tieneTarjetaDebito = tieneTarjetaDebito;
		this.comisionesAnual = comisionesAnual;
	}

	/**
	 * Constructor copia
	 * 
	 * @param cb
	 */
	public CuentaBancaria(CuentaBancaria cb) {
		this.numeroCuenta = this.generarNumeroCuenta();
		this.saldo = cb.saldo;
		this.tieneTarjetaCredito = cb.tieneTarjetaCredito;
		this.tieneTarjetaDebito = cb.tieneTarjetaDebito;
		this.comisionesAnual = cb.comisionesAnual;
	}

	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @return the tieneTarjetaCredito
	 */
	public boolean isTieneTarjetaCredito() {
		return tieneTarjetaCredito;
	}

	/**
	 * @return the tieneTarjetaDebito
	 */
	public boolean isTieneTarjetaDebito() {
		return tieneTarjetaDebito;
	}

	/**
	 * @return the comisionesAnual
	 */
	public double getComisionesAnual() {
		return comisionesAnual;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaBancaria [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTarjetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisionesAnual=");
		builder.append(comisionesAnual);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
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
		CuentaBancaria other = (CuentaBancaria) obj;
		if (numeroCuenta == null) {
			if (other.numeroCuenta != null)
				return false;
		} else if (!numeroCuenta.equals(other.numeroCuenta))
			return false;
		return true;
	}

	/**
	 * Genera un número de cuenta de 20 dígitos aleatoriamente
	 * 
	 * @return
	 */
	public String generarNumeroCuenta() {
		StringBuilder sb = new StringBuilder(20);
		for (int i = 0; i < 20; i++) {
			sb.append((int) (Math.random() * 10));
		}
		return sb.toString();
	}

	/**
	 * Suma la cantidad a ingresar al saldo de la cuenta
	 * 
	 * @param cant
	 */
	public void ingresar(double cant) {
		this.saldo += cant;
	}

	/**
	 * Resta la cantidad al saldo de la cuenta, si hay dinero suficiente
	 * 
	 * @param cant
	 */
	public boolean retirar(double cant) {
		if (this.saldo >= cant) {
			this.saldo -= cant;
			return true;
		}
		return false;
	}
}
