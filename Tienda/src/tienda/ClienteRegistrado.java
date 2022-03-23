/**
 * 
 */
package tienda;

import java.time.LocalDate;
import org.apache.commons.codec.digest.DigestUtils;//Se importa Class DigestUtils
/**
 * @author Ruben
 *
 */
public class ClienteRegistrado extends Cliente {

	// Atributos
	private String email;
	private String password;
	private LocalDate fechaNacimiento;
	private LocalDate fechaRegistro;

	private static double descuento = 5;

	/**
	 * Constructor parametrizado con todos los campos menos la fecha de registro
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param localidad
	 * @param direccion
	 * @param email
	 * @param password
	 * @param fechaNacimiento
	 */
	public ClienteRegistrado(String nombre, String apellidos, String dni, String localidad, String direccion,
			String email, String password, LocalDate fechaNacimiento) {
		super(nombre, apellidos, dni, localidad, direccion);
		this.email = email;
		this.password = DigestUtils.sha256Hex(password);//Llamada al método de la contraseña
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = LocalDate.now();
	}

	/**
	 * Constructor copia
	 * 
	 * @param c
	 */
	public ClienteRegistrado(ClienteRegistrado unCliente) {
		super(unCliente);
		this.email = unCliente.email;
		this.password = unCliente.password;
		this.fechaNacimiento = unCliente.fechaNacimiento;
		this.fechaRegistro = unCliente.fechaRegistro;
	}

	// Getters y setters

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the fechaRegistro
	 */
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteRegistrado [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Devuelve el descuento asociado a este tipo de cliente
	 */
	public double descuento() {
		return ClienteRegistrado.descuento;
	}

	/**
	 * Aplica a pass el mismo método y si devuelve lo mismo que hay almacenado en password devuelva true y en caso contrario false
	 * @param pass
	 * @return
	 */
	public boolean checkPassword(String pass) {
		if (this.password.equals(DigestUtils.sha256Hex(pass)))
			return true;
		else
			return false;
	}
}
