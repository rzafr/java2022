/**
 * 
 */
package tema6Parking;

/**
 * @author Ruben
 *
 */
public class Coche extends Vehiculo {

	// Atributo
	private Combustible combustible;

	/**
	 * Contructor por defecto
	 */
	public Coche() {
		super();
		this.combustible = Combustible.ELECTRICO;
	}

	/**
	 * Constructor parametrizado (sólo matrícula, marca y segmento)
	 * 
	 * @param matricula
	 * @param marca
	 */
	public Coche(String matricula, String marca, Combustible combustible) {
		super(matricula, marca);
		this.combustible = combustible;
	}

	/**
	 * Constructor copia
	 * 
	 * @param c
	 */
	public Coche(Coche c) {
		super(c);
	}

	// Getter y setter

	/**
	 * @return the combustible
	 */
	public Combustible getCombustible() {
		return combustible;
	}

	/**
	 * @param combustible the combustible to set
	 */
	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append(", combustible=");
		builder.append(combustible);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double calcularImporte() {
		return ((Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos())
				- ((Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos()) * this.descuento()));
	}

	@Override
	public double descuento() {
		double descuento = 0;
		if (this.calcularMinutos() > 120)
			descuento = 0.05;
		if (this.calcularMinutos() > 3600)
			descuento += 0.30;
		if ((this.fechaEntrada.getDayOfWeek().toString().equals("SATURDAY"))
				|| (this.fechaEntrada.getDayOfWeek().toString().equals("SUNDAY"))) {
			descuento += 0.10;
		}
		if ((this.combustible == Combustible.GASOLINA) || (this.combustible == Combustible.DIESEL)) {
			descuento -= 0.10;
		} else {
			descuento += 0.10;
		}
		return descuento;
	}

}
