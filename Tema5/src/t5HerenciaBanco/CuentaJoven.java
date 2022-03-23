/**
 * 
 */
package t5HerenciaBanco;

/**
 * @author Ruben
 *
 */
public class CuentaJoven extends CuentaBancaria {

	// Propiedades
	private final double modifComisiones = 0.25;

	/**
	 * Constructor parametrizado que genera un número de cuenta aleatorio
	 * 
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionesAnual
	 */
	public CuentaJoven(double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito, double comisionesAnual) {
		super(saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionesAnual);
		this.numeroCuenta = this.generarNumeroCuenta();
		this.comisionesAnual = comisionesAnual * this.modifComisiones;
		this.saldo = saldo - this.comisionesAnual;
	}
	
	/**
	 * Constructor parametrizado que recibe un número de cuenta para realizar el apartado de buscar por número de cuenta
	 * 
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionesAnual
	 */
	public CuentaJoven(String numeroCuenta, double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito, double comisionesAnual) {
		super(saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionesAnual);
		this.numeroCuenta = numeroCuenta;
		this.comisionesAnual = comisionesAnual * this.modifComisiones;
		this.saldo = saldo - this.comisionesAnual;
	}

	/**
	 * @return the modifComisiones
	 */
	public double getModifComisiones() {
		return modifComisiones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaJoven [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTarjetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisionesAnual=");
		builder.append(comisionesAnual);
		builder.append(", modifComisiones=");
		builder.append(modifComisiones);
		builder.append("]\n\t\t");
		return builder.toString();
	}

}
