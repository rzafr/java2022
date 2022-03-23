/**
 * 
 */
package t5HerenciaBanco;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class CuentaCorriente extends CuentaBancaria {

	// Propiedades
	private final double modifComisiones = 0.40;

	private TarjetaCredito tarjetaCredito;
	private TarjetaDebito tarjetaDebito;

	/**
	 * Constructor parametrizado que genera un número de cuenta aleatorio
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisionesAnual
	 */
	public CuentaCorriente(double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisionesAnual) {
		super(saldo, tieneTarjetaDebito, tieneTarjetaDebito, comisionesAnual);
		this.tieneTarjetaCredito = true;
		this.tieneTarjetaDebito = true;
		this.comisionesAnual = comisionesAnual * this.modifComisiones;
		this.saldo = saldo - this.comisionesAnual;
		this.tarjetaCredito = new TarjetaCredito("Titular", LocalDate.of(2026, 2, 1), "456", 4000.5, 0.05, 3000.5);
		this.tarjetaDebito = new TarjetaDebito("Titular", LocalDate.of(2026, 2, 1), "234", 6000.5);
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
		builder.append("CuentaCorriente [numeroCuenta=");
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
		builder.append(", \n\t\t\t\ttarjetaCredito=");
		builder.append(tarjetaCredito);
		builder.append(", \n\t\t\t\ttarjetaDebito=");
		builder.append(tarjetaDebito);
		builder.append("]\n\t\t");
		return builder.toString();
	}

}
