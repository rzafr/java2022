/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class Password {

	// Propiedades
	private int longitud;
	private String contraseña;

	/**
	 * Constructor por defecto que genera una contraseña aleatoria de longitud 8
	 */
	public Password() {
		super();
		this.longitud = 8;
		this.contraseña = this.generarPassword();
	}

	/**
	 * Constructor que recibe como parámetro la longitud de la contraseña
	 * 
	 * @param longitud
	 */
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña = this.generarPassword();
	}

	/**
	 * Constructor copia
	 * 
	 * @param unPassword
	 */
	public Password(Password unPassword) {
		this.longitud = unPassword.getLongitud();
		this.contraseña = unPassword.generarPassword();
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Password [longitud=");
		builder.append(longitud);
		builder.append(", contraseña=");
		builder.append(contraseña);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Indica si la contraseña es fuerte o no
	 * 
	 * @return
	 */
	public boolean esFuerte() {
		boolean fuerte = false;
		int may = 0, min = 0, num = 0, sim = 0;

		for (int i = 0; i < this.contraseña.length(); i++) {
			if (this.contraseña.charAt(i) >= 65 && this.contraseña.charAt(i) <= 90)
				may++;
			else if (this.contraseña.charAt(i) >= 97 && this.contraseña.charAt(i) <= 122)
				min++;
			else if (this.contraseña.charAt(i) >= 48 && this.contraseña.charAt(i) <= 57)
				num++;
			else if (this.contraseña.charAt(i) >= 33 && this.contraseña.charAt(i) <= 47)
				sim++;
		}

		if (this.contraseña.length() >= 8 && may > 0 && min > 2 && num > 2 && sim > 0)
			fuerte = true;

		return fuerte;
	}

	/**
	 * Genera la contraseña del objeto con la longitud que tenga
	 * 
	 * @return
	 */
	public String generarPassword() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.longitud; i++) {
			// Obtenemos un número aleatorio para símbolo, número, mayúscula y minúscula
			int random = (int) (Math.random() * 4 + 1);
			switch (random) {
			case 1: {
				// Añadimos un símbolo a la contraseña
				sb.append((char) (Math.random() * (47 - 33 + 1) + 33));
				break;
			}
			case 2: {
				// Añadimos un número a la contraseña
				sb.append((char) (Math.random() * (57 - 48 + 1) + 48));
				break;
			}
			case 3: {
				// Añadimos una mayúscula a la contraseña
				sb.append((char) (Math.random() * (90 - 65 + 1) + 65));
				break;
			}
			case 4: {
				// Añadimos una minúscula a la contraseña
				sb.append((char) (Math.random() * (122 - 97 + 1) + 97));
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + random);
			}

		}
		return sb.toString();
	}
}
