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
	private String contrase�a;

	/**
	 * Constructor por defecto que genera una contrase�a aleatoria de longitud 8
	 */
	public Password() {
		super();
		this.longitud = 8;
		this.contrase�a = this.generarPassword();
	}

	/**
	 * Constructor que recibe como par�metro la longitud de la contrase�a
	 * 
	 * @param longitud
	 */
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrase�a = this.generarPassword();
	}

	/**
	 * Constructor copia
	 * 
	 * @param unPassword
	 */
	public Password(Password unPassword) {
		this.longitud = unPassword.getLongitud();
		this.contrase�a = unPassword.generarPassword();
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
	 * @return the contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Password [longitud=");
		builder.append(longitud);
		builder.append(", contrase�a=");
		builder.append(contrase�a);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Indica si la contrase�a es fuerte o no
	 * 
	 * @return
	 */
	public boolean esFuerte() {
		boolean fuerte = false;
		int may = 0, min = 0, num = 0, sim = 0;

		for (int i = 0; i < this.contrase�a.length(); i++) {
			if (this.contrase�a.charAt(i) >= 65 && this.contrase�a.charAt(i) <= 90)
				may++;
			else if (this.contrase�a.charAt(i) >= 97 && this.contrase�a.charAt(i) <= 122)
				min++;
			else if (this.contrase�a.charAt(i) >= 48 && this.contrase�a.charAt(i) <= 57)
				num++;
			else if (this.contrase�a.charAt(i) >= 33 && this.contrase�a.charAt(i) <= 47)
				sim++;
		}

		if (this.contrase�a.length() >= 8 && may > 0 && min > 2 && num > 2 && sim > 0)
			fuerte = true;

		return fuerte;
	}

	/**
	 * Genera la contrase�a del objeto con la longitud que tenga
	 * 
	 * @return
	 */
	public String generarPassword() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.longitud; i++) {
			// Obtenemos un n�mero aleatorio para s�mbolo, n�mero, may�scula y min�scula
			int random = (int) (Math.random() * 4 + 1);
			switch (random) {
			case 1: {
				// A�adimos un s�mbolo a la contrase�a
				sb.append((char) (Math.random() * (47 - 33 + 1) + 33));
				break;
			}
			case 2: {
				// A�adimos un n�mero a la contrase�a
				sb.append((char) (Math.random() * (57 - 48 + 1) + 48));
				break;
			}
			case 3: {
				// A�adimos una may�scula a la contrase�a
				sb.append((char) (Math.random() * (90 - 65 + 1) + 65));
				break;
			}
			case 4: {
				// A�adimos una min�scula a la contrase�a
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
