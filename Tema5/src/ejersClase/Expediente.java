/**
 * 
 */
package ejersClase;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Expediente {
	
	// TIPO ENUM definido para mi clase
	enum Modalidad {FPB, GRADOMEDIO, GRADOSUPERIOR, ESO, BACHILLERATO};
	
	// PROPIEDADES
	private static int totalAlumnado=0; // Contador de objetos de tipo Expediente
	private final int id=Expediente.totalAlumnado+1; // Si no es final se hace en el constructor
	private String nombre;
	private String apellidos;
	private char sexo;
	private LocalDate fechaNacimiento;
	private Modalidad modalidad; // Ver enum Modalidad
	private int curso; // (1, 2)
	private ArrayList<NotasCurso> calificaciones; // Por simplificar serán solo 5 asignaturas, representan las calificaciones obtenidas a final de curso
	
	// CONSTRUCTORES
	/**
	 * Constructor con parámetros
	 */
	Expediente(String nombre, String apellidos, LocalDate fecha, int curso) {
		Expediente.totalAlumnado++;
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fecha;
		this.curso = curso;
		
		// Inicializar ArrayList
		this.calificaciones = new ArrayList<>();
	}
	
	
	
	public int getId() {
		return this.id;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}



	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}



	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}



	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}



	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}



	/**
	 * @return the totalAlumnado
	 */
	public static int getTotalAlumnado() {
		return totalAlumnado;
	}



	/**
	 * @return the calificaciones
	 */
	public ArrayList<NotasCurso> getCalificaciones() {
		return calificaciones;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expediente [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", modalidad=");
		builder.append(modalidad);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", calificaciones=");
		builder.append(calificaciones);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	// El equals no te ha salido igual

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	public int getEdad() {
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear();// Probar lengtYear
	}
	
	public boolean mayorEdad() {
		if (this.getEdad() >= 18) {
			return true;
		}
		return false;
	}
	
	/**
	 * Devuelve true si está en ESO o Bachillerato y le quedan dos o menos
	 * Devuelve true si está en ciclos y aprueba todas
	 * Devuelve false en caso contrario
	 * @return
	 */
	public boolean titula() {
		// Ver modalidad del expediente
		if (this.modalidad == Modalidad.BACHILLERATO || this.modalidad == Modalidad.ESO) {
			System.out.println("Comprobar GitHub para ver solución");
		}
		return false;
	}
}
