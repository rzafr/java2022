/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class Direccion {

	// Propiedades
	private String tipoNombreVia;
	private int numero;
	private String poblacion;
	private String provincia;
	private String cp;
	private String pais;
	private double latitud;
	private double longitud;

	/**
	 * Constructor por defecto
	 */
	public Direccion() {
		this.tipoNombreVia = "";
		this.numero = 0;
		this.poblacion = "";
		this.provincia = "";
		this.cp = "";
		this.pais = "";
		this.latitud = 0;
		this.longitud = 0;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param tipoNombreVia
	 * @param numero
	 * @param poblacion
	 * @param provincia
	 * @param cp
	 * @param pais
	 * @param latitud
	 * @param longitud
	 */
	public Direccion(String tipoNombreVia, int numero, String poblacion, String provincia, String cp, String pais,
			double latitud, double longitud) {
		super();
		this.tipoNombreVia = tipoNombreVia;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.cp = cp;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	/**
	 * Constructor copia
	 * 
	 * @param unaDireccion
	 */
	public Direccion(Direccion unaDireccion) {
		this.tipoNombreVia = unaDireccion.tipoNombreVia;
		this.numero = unaDireccion.numero;
		this.poblacion = unaDireccion.poblacion;
		this.provincia = unaDireccion.provincia;
		this.cp = unaDireccion.cp;
		this.pais = unaDireccion.pais;
		this.latitud = unaDireccion.latitud;
		this.longitud = unaDireccion.longitud;
	}

	/**
	 * @return the tipoNombreVia
	 */
	public String getTipoNombreVia() {
		return tipoNombreVia;
	}

	/**
	 * @param tipoNombreVia the tipoNombreVia to set
	 */
	public void setTipoNombreVia(String tipoNombreVia) {
		this.tipoNombreVia = tipoNombreVia;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) {
		if (latitud < -90 || latitud > 90) {
			throw new IllegalArgumentException("Latitud no válida.");
		} else {
			this.latitud = latitud;
		}
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		if (longitud < -180 && longitud > 180) {
			throw new IllegalArgumentException("Longitud no válida.");
		} else {
			this.longitud = longitud;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [tipoNombreVia=");
		builder.append(tipoNombreVia);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", cp=");
		builder.append(cp);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", latitud=");
		builder.append(latitud);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(latitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Direccion other = (Direccion) obj;
		if (Double.doubleToLongBits(latitud) != Double.doubleToLongBits(other.latitud))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		return true;
	}

	/**
	 * Calcula la distancia entre dos direcciones en línea recta, teniendo en cuenta
	 * la curvatura terrestre
	 * 
	 * @param otra
	 * @return
	 */
	public double distanciaKM(Direccion otra) {
		int radio = 6378;

		// Convertimos los valores de latitud y longitud a radianes
		double lat1 = Math.toRadians(this.latitud);
		double lat2 = Math.toRadians(otra.latitud);
		double long1 = Math.toRadians(this.longitud);
		double long2 = Math.toRadians(otra.longitud);

		// Aplicamos la Fórmula del Haversine
		double vlat = lat2 - lat1;
		double vlong = long2 - long1;
		double a = Math.pow(Math.sin(vlat / 2), 2)
				+ (Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(vlong / 2), 2));
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		return radio * c;
	}
}
