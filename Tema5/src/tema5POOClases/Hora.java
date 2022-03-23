/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class Hora {

	// Propiedades
	private int milisegundos;
	private int segundos;
	private int minutos;
	private int horas;

	/**
	 * Constructor por defecto
	 */
	public Hora() {
		this.segundos = 0;
		this.minutos = 0;
		this.horas = 0;
	}

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param milisegundos
	 * @param segundos
	 * @param minutos
	 * @param horas
	 */
	public Hora(int milisegundos, int segundos, int minutos, int horas) {
		super();
		this.milisegundos = milisegundos;
		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;
	}

	/**
	 * Constructor copia
	 * 
	 * @param unaHora
	 */
	public Hora(Hora unaHora) {
		this.milisegundos = unaHora.milisegundos;
		this.segundos = unaHora.segundos;
		this.minutos = unaHora.minutos;
		this.horas = unaHora.horas;
	}

	/**
	 * Constructor al que se le pasa la hora en formato String
	 * 
	 * @param hora
	 */
	public Hora(String hora) {
		this.segundos = Integer.parseInt(hora.substring(6));
		this.minutos = Integer.parseInt(hora.substring(3, 5));
		this.horas = Integer.parseInt(hora.substring(0, 2));
	}

	/**
	 * @return the milisegundos
	 */
	public int getMilisegundos() {
		return milisegundos;
	}

	/**
	 * @param milisegundos the milisegundos to set
	 */
	public void setMilisegundos(int milisegundos) {
		this.milisegundos = milisegundos;
	}

	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + horas;
		result = prime * result + milisegundos;
		result = prime * result + minutos;
		result = prime * result + segundos;
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
		Hora other = (Hora) obj;
		if (horas != other.horas)
			return false;
		if (milisegundos != other.milisegundos)
			return false;
		if (minutos != other.minutos)
			return false;
		if (segundos != other.segundos)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (this.horas == 0)
			builder.append("00");
		else
			builder.append(horas);
		builder.append(":");
		if (this.minutos == 0)
			builder.append("00");
		else
			builder.append(minutos);
		builder.append(":");
		if (this.segundos == 0)
			builder.append("00");
		else
			builder.append(segundos);
		return builder.toString();
	}

	/**
	 * Verifica si una hora es válida
	 * 
	 * @return
	 */
	public boolean horaValida() {
		boolean valida = false;
		if (this.horas >= 0 && this.horas < 24) {
			if (this.minutos >= 0 && this.minutos <= 59) {
				if (this.segundos >= 0 && this.segundos <= 59)
					valida = true;
			}
		}
		return valida;
	}

	/**
	 * Suma un segundo a la hora actual
	 */
	public void segundoSiguiente() {
		if (horaValida()) {
			if (this.segundos == 59) {
				this.segundos = 0;
				if (this.minutos == 59) {
					this.minutos = 0;
					if (this.horas == 23)
						this.horas = 0;
					else
						this.horas++;
				} else
					this.minutos++;
			} else
				this.segundos++;
		}
	}

	/**
	 * Muestra la hora con los milisegundos: 16:46:59:756
	 * 
	 * @return
	 */
	public String horaCompleta() {
		String completa = "";
		if (this.milisegundos >= 0 && this.milisegundos <= 999) {
			completa = this.toString() + ":" + this.milisegundos;
		} else {
			completa = "Hora no válida";
		}
		return completa;
	}
}
