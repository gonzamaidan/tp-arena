package model;

import java.util.List;

public class Asignacion {
	Tarea tarea;
	Estudiante estudiante;
	List<Calificacion> notas;
	public Tarea getTarea() {
		return tarea;
	}
	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public List<Calificacion> getNotas() {
		return notas;
	}
	
	public void agregarNota(Calificacion Nota) {
		this.notas.add(Nota);
	}
	public void quitarNota(Calificacion Nota) {
		this.notas.remove(Nota);
	}
}
