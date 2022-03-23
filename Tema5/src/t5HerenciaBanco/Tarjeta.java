/**
 * 
 */
package t5HerenciaBanco;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class Tarjeta {

	// Propiedades
	protected String numeroTarjeta;
	protected String nombreTitular;
	protected LocalDate fechaCaducidad;
	protected String codigoSeguridad;
	protected double saldo;

	/**
	 * Constructor parametrizado
	 * 
	 * @param numeroCuenta
	 * @param nombreTitular
	 * @param fechaCaducidad
	 * @param codigoSeguridad
	 */
	public Tarjeta(String nombreTitular, LocalDate fechaCaducidad, String codigoSeguridad, double saldo) {
		super();
		this.numeroTarjeta = this.generarNumeroTarjeta();
		this.nombreTitular = nombreTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.codigoSeguridad = codigoSeguridad;
		this.saldo = saldo;
	}

	/**
	 * Constructor copia
	 * 
	 * @param otraTarjeta
	 */
	public Tarjeta(Tarjeta otraTarjeta) {
		this.numeroTarjeta = this.generarNumeroTarjeta();
		this.nombreTitular = otraTarjeta.nombreTitular;
		this.fechaCaducidad = otraTarjeta.fechaCaducidad;
		this.codigoSeguridad = otraTarjeta.codigoSeguridad;
		this.saldo = otraTarjeta.saldo;
	}

	/**
	 * @return the fechaCaducidad
	 */
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * @param fechaCaducidad the fechaCaducidad to set
	 */
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * @return the numeroTarjeta
	 */
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @return the nombreTitular
	 */
	public String getNombreTitular() {
		return nombreTitular;
	}

	/**
	 * @return the codigoSeguridad
	 */
	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tarjeta [numeroTarjeta=");
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
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
		Tarjeta other = (Tarjeta) obj;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		return true;
	}

	/**
	 * Genera un número de tarjeta de 16 dígitos aleatoriamente
	 * 
	 * @return
	 */
	public String generarNumeroTarjeta() {
		StringBuilder sb = new StringBuilder(16);
		for (int i = 0; i < 16; i++) {
			sb.append((int) (Math.random() * 10));
		}
		return sb.toString();
	}
}
