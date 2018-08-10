package model;

import java.util.ArrayList;
import java.util.List;

public class Asignacion {
	Tarea tarea;
	Estudiante estudiante;
	List<Calificacion> notas;
	
	public Asignacion (Estudiante estudiante, Tarea tarea) {
		this.tarea=tarea;
		this.estudiante=estudiante;
		this.notas = new ArrayList<Calificacion>();
	}
	
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
	
	public boolean notaFinal() {
		return notas.get(notas.size() - 1).estaAprobado();		
	}
}
