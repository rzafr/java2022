/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class Persona {

	// Propiedades
	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;

	/**
	 * Constructor por defecto que inicializa propiedades
	 */
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
	}

	/**
	 * Constructor con el nombre, edad y sexo pasados como parámetro, y el resto por
	 * defecto
	 * 
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

	/**
	 * Constructor con todos los miembros como parámetro
	 * 
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * Constructor copia
	 * 
	 * @param unaPersona
	 */
	public Persona(Persona unaPersona) {
		this.nombre = unaPersona.nombre;
		this.edad = unaPersona.edad;
		this.sexo = unaPersona.sexo;
		this.peso = unaPersona.peso;
		this.altura = unaPersona.altura;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Indicará si la persona está en su peso ideal
	 * 
	 * @return
	 */
	public int calcularIMC() {
		double imc = 0;
		int resultado = 0;

		imc = this.peso / Math.pow(this.altura, 2);

		if (imc < 20) {
			resultado = -1;// Peso por debajo del ideal
		} else if (imc >= 20 && imc <= 25) {
			resultado = 0;// Peso ideal
		} else if (imc > 25) {
			resultado = 1;// Sobrepeso
		}
		return resultado;
	}

	/**
	 * Indica si la persona es mayor de edad
	 * 
	 * @return
	 */
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (this.edad >= 18) {
			mayor = true;
		}
		return mayor;
	}
}
