/**
 * 
 */
package t5HerenciaBanco;

/**
 * @author Ruben
 *
 */
public class CuentaAhorro extends CuentaBancaria {

	// Propiedades
	private double tipoInteres;

	private final double modifComisiones = 0.50;

	/**
	 * Constructor parametrizado que genera un número de cuenta aleatorio
	 * 
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionesAnual
	 * @param tipoInteres
	 */
	public CuentaAhorro(double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito, double comisionesAnual,
			double tipoInteres) {
		super(saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionesAnual);
		this.numeroCuenta = this.generarNumeroCuenta();
		this.tipoInteres = tipoInteres;
		this.comisionesAnual = comisionesAnual * this.modifComisiones;
		this.saldo = (saldo * tipoInteres) - this.comisionesAnual;
	}

	/**
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
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
		builder.append("CuentaAhorro [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTarjetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisionesAnual=");
		builder.append(comisionesAnual);
		builder.append(", tipoInteres=");
		builder.append(tipoInteres);
		builder.append(", modifComisiones=");
		builder.append(modifComisiones);
		builder.append("]\n\t\t");
		return builder.toString();
	}

}
