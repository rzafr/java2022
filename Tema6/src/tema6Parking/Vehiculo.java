/**
 * 
 */
package tema6Parking;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Ruben
 *
 */
public abstract class Vehiculo implements Descontable {

	// Atributos
	protected String matricula;
	protected String marca;
	protected LocalDateTime fechaEntrada;
	protected long minutos;
	protected PlazaAparcamiento plaza;

	/**
	 * Constructor por defecto
	 */
	public Vehiculo() {
		this.matricula = "";
		this.marca = "";
		this.fechaEntrada = null;
		this.minutos = 0;
		this.plaza = null;
	}

	/**
	 * Constructor parametrizado (sólo matrícula y marca)
	 * 
	 * @param matricula
	 * @param marca
	 */
	public Vehiculo(String matricula, String marca) {
		this.matricula = matricula;
		this.marca = marca;
	}

	/**
	 * Constructor copia
	 */
	public Vehiculo(Vehiculo v) {
		this.matricula = v.matricula;
		this.marca = v.marca;
		this.fechaEntrada = v.fechaEntrada;
		this.minutos = v.minutos;
		this.plaza = v.plaza;
	}

	// Getters y setters

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the fechaEntrada
	 */
	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDateTime fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the minutos
	 */
	public long getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(long minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return the plaza
	 */
	public PlazaAparcamiento getPlaza() {
		return plaza;
	}

	/**
	 * @param plaza the plaza to set
	 */
	public void setPlaza(PlazaAparcamiento plaza) {
		this.plaza = plaza;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Contabiliza los minutos que han pasado desde la entrada hasta "ahora"
	 * 
	 * @return
	 */
	public long calcularMinutos() {
		return Duration.between(this.fechaEntrada, LocalDateTime.now()).toMinutes();
	}

	/**
	 * Calcula lo que cuesta dejar el vehículo en el parking
	 * 
	 * @return
	 */
	public abstract double calcularImporte();

	/**
	 * Devuelve el descuento a aplicar en el precio final según el tipo de vehículo
	 */
	public abstract double descuento();

}
