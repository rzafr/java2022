/**
 * 
 */
package tema6Parking;

/**
 * @author Ruben
 *
 */
public class Furgoneta extends Vehiculo {

	// Atributo
	private float longitud;

	/**
	 * Constructor por defecto
	 */
	public Furgoneta() {
		super();
		this.longitud = 0;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param matricula
	 * @param marca
	 * @param longitud
	 */
	public Furgoneta(String matricula, String marca, float longitud) {
		super(matricula, marca);
		this.longitud = longitud;
	}

	/**
	 * Constructor copia
	 * 
	 * @param f
	 */
	public Furgoneta(Furgoneta f) {
		super(f);
	}

	// Getter y setter

	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Furgoneta [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double calcularImporte() {
		return (((Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos())
				+ (Parking.PRECIO_BASE_POR_METRO * this.longitud))
				- ((Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos())
						+ (Parking.PRECIO_BASE_POR_METRO * this.longitud) * this.descuento()));
	}

	@Override
	public double descuento() {
		double descuento = 0;
		if (this.calcularMinutos() > 120)
			descuento = 0.03;
		if (this.calcularMinutos() > 3600)
			descuento += 0.20;
		if ((this.fechaEntrada.getDayOfWeek().toString().equals("MONDAY"))
				|| (this.fechaEntrada.getDayOfWeek().toString().equals("TUESDAY"))
				|| (this.fechaEntrada.getDayOfWeek().toString().equals("WEDNESDAY"))
				|| (this.fechaEntrada.getDayOfWeek().toString().equals("THURSDAY"))
				|| (this.fechaEntrada.getDayOfWeek().toString().equals("FRIDAY"))) {
			descuento += 0.1;
		}
		return descuento;
	}

}
