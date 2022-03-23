package ejersClase;

public class NotasCurso {

	// Propiedades
	private String materia; // La asignatura de la que son las notas
	private int curso; // Curso al que pertenece la asignatura
	private double nota1Ev;
	private double nota2Ev;
	private double nota3Ev;
	private double notaFinal; // Se calcula con la media aritmética de las otras tres
	
	/**
	 * Constructor base (materia y curso)
	 */
	public NotasCurso() {
		this.materia = "";
		this.curso = 0;
	}

	/**
	 * Constructor parametrizado (todos menos notaFinal)
	 * @param materia
	 * @param curso
	 * @param nota1Ev
	 * @param nota2Ev
	 * @param nota3Ev
	 */
	public NotasCurso(String materia, int curso, double nota1Ev, double nota2Ev, double nota3Ev) {
		super();
		this.materia = materia;
		this.curso = curso;
		this.nota1Ev = nota1Ev;
		this.nota2Ev = nota2Ev;
		this.nota3Ev = nota3Ev;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotasCurso [materia=");
		builder.append(materia);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", nota1Ev=");
		builder.append(nota1Ev);
		builder.append(", nota2Ev=");
		builder.append(nota2Ev);
		builder.append(", nota3Ev=");
		builder.append(nota3Ev);
		builder.append(", notaFinal=");
		builder.append(notaFinal);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + curso;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1Ev);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2Ev);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3Ev);
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
		NotasCurso other = (NotasCurso) obj;
		if (curso != other.curso)
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (Double.doubleToLongBits(nota1Ev) != Double.doubleToLongBits(other.nota1Ev))
			return false;
		if (Double.doubleToLongBits(nota2Ev) != Double.doubleToLongBits(other.nota2Ev))
			return false;
		if (Double.doubleToLongBits(nota3Ev) != Double.doubleToLongBits(other.nota3Ev))
			return false;
		return true;
	}

	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
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
	 * @return the nota1Ev
	 */
	public double getNota1Ev() {
		return nota1Ev;
	}

	/**
	 * @param nota1Ev the nota1Ev to set
	 */
	public void setNota1Ev(double nota1Ev) {
		this.nota1Ev = nota1Ev;
	}

	/**
	 * @return the nota2Ev
	 */
	public double getNota2Ev() {
		return nota2Ev;
	}

	/**
	 * @param nota2Ev the nota2Ev to set
	 */
	public void setNota2Ev(double nota2Ev) {
		this.nota2Ev = nota2Ev;
	}

	/**
	 * @return the nota3Ev
	 */
	public double getNota3Ev() {
		return nota3Ev;
	}

	/**
	 * @param nota3Ev the nota3Ev to set
	 */
	public void setNota3Ev(double nota3Ev) {
		this.nota3Ev = nota3Ev;
	}

	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		this.calcularNotaFinal(); // Lo ponemos aquí por si han cambiado las notas parciales
		return notaFinal;
	}

	/**
	 * Devuelve un boolean si la notaFinal >= 5
	 * @return
	 */
	public boolean aprobado() {
		if (this.notaFinal >= 5)
			return true;
		else
			return false;
		
		// se puede poner directamente así: return (this.notaFinal >=5);
	}
	
	/**
	 * Calcula la media de las notas y la asigna a notaFinal
	 */
	private void calcularNotaFinal() {
		this.notaFinal = (this.nota1Ev + this.nota2Ev + this.nota3Ev) / 3;
	}
}
