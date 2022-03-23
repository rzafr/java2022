/**
 * 
 */
package t5HerenciaBanco;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class TarjetaDebito extends Tarjeta {

	/**
	 * @param nombreTitular
	 * @param fechaCaducidad
	 * @param codigoSeguridad
	 */
	public TarjetaDebito(String nombreTitular, LocalDate fechaCaducidad, String codigoSeguridad, double saldo) {
		super(nombreTitular, fechaCaducidad, codigoSeguridad, saldo);
		this.numeroTarjeta = this.generarNumeroTarjeta();
	}

	/**
	 * @param otraTarjeta
	 */
	public TarjetaDebito(TarjetaDebito otraTarjeta) {
		super(otraTarjeta);

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaDebito [numeroTarjeta=");
		builder.append(numeroTarjeta);
		builder.append(", nombreTitular=");
		builder.append(nombreTitular);
		builder.append(", fechaCaducidad=");
		builder.append(fechaCaducidad);
		builder.append(", codigoSeguridad=");
		builder.append(codigoSeguridad);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Resta la cantidad al saldo de la tarjeta, si hay dinero suficiente
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
