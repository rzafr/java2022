/**
 * 
 */
package ejersClase;

/**
 * @author Ruben
 *
 */
public class Television extends Electrodomestico {

	enum TecnologiaLCD { OLED, MICROLED, QLED };
	enum Resolucion { FHD, UHD, CUATROK, OCHOK };
	
	protected int pulgadas;
	protected TecnologiaLCD tecnologia;
	protected Resolucion resolucion;
	/**
	 * 
	 */
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param peso
	 * @param eficiencia
	 * @param color
	 */
	public Television(String marca, String modelo, double precio, double peso, Eficiencia eficiencia, Color color) {
		super(marca, modelo, precio, peso, eficiencia, color);
		// TODO Auto-generated constructor stub
		this.pulgadas=50;
		this.tecnologia=TecnologiaLCD.OLED;
		this.resolucion=Resolucion.FHD;
	}
	
	public Television(String marca, String modelo, double precio, double peso, Eficiencia eficiencia, Color color, 
			int pulgadas, TecnologiaLCD tecno, Resolucion reso) {
		super(marca, modelo, precio, peso, eficiencia, color);
		// TODO Auto-generated constructor stub
		this.pulgadas=pulgadas;
		this.tecnologia=tecno;
		this.resolucion=reso;
	}
	/**
	 * @return the pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}
	/**
	 * @param pulgadas the pulgadas to set
	 */
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	/**
	 * @return the tecnologia
	 */
	public TecnologiaLCD getTecnologia() {
		return tecnologia;
	}
	/**
	 * @param tecnologia the tecnologia to set
	 */
	public void setTecnologia(TecnologiaLCD tecnologia) {
		this.tecnologia = tecnologia;
	}
	/**
	 * @return the resolucion
	 */
	public Resolucion getResolucion() {
		return resolucion;
	}
	/**
	 * @param resolucion the resolucion to set
	 */
	public void setResolucion(Resolucion resolucion) {
		this.resolucion = resolucion;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Television [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", eficiencia=");
		builder.append(eficiencia);
		builder.append(", color=");
		builder.append(color);
		builder.append(", pulgadas=");
		builder.append(pulgadas);
		builder.append(", tecnologia=");
		builder.append(tecnologia);
		builder.append(", resolucion=");
		builder.append(resolucion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
}
