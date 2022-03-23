/**
 * 
 */
package t5HerenciaBanco;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class TarjetaCredito extends Tarjeta {

	private double intereses;// Cuando sacas más de lo que tienes
	private double limiteCredito;// Te deja comprar con menos de cero hasta un límite

	/**
	 * @param nombreTitular
	 * @param fechaCaducidad
	 * @param codigoSeguridad
	 * @param intereses
	 * @param limiteCredito
	 */
	public TarjetaCredito(String nombreTitular, LocalDate fechaCaducidad, String codigoSeguridad, double saldo,
			double intereses, double limiteCredito) {
		super(nombreTitular, fechaCaducidad, codigoSeguridad, saldo);
		this.numeroTarjeta = this.generarNumeroTarjeta();
		this.intereses = intereses;
		this.limiteCredito = limiteCredito;
	}

	/**
	 * @return the intereses
	 */
	public double getIntereses() {
		return intereses;
	}

	/**
	 * @param intereses the intereses to set
	 */
	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}

	/**
	 * @return the limiteCredito
	 */
	public double getLimiteCredito() {
		return limiteCredito;
	}

	/**
	 * @param limiteCredito the limiteCredito to set
	 */
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaCredito [numeroTarjeta=");
		builder.append(numeroTarjeta);
		builder.append(", nombreTitular=");
		builder.append(nombreTitular);
		builder.append(", fechaCaducidad=");
		builder.append(fechaCaducidad);
		builder.append(", codigoSeguridad=");
		builder.append(codigoSeguridad);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", intereses=");
		builder.append(intereses);
		builder.append(", limiteCredito=");
		builder.append(limiteCredito);
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
		} else if (this.limiteCredito >= cant) {
			this.saldo -= cant;
			this.saldo -= (this.saldo * this.intereses);
		}
		return false;
	}

}
