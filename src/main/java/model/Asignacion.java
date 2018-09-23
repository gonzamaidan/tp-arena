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
	
	public Calificacion notaFinal() {
		return notas.stream().reduce(new SinCalificacion(), (calificacion1, calificacion2) -> calificacion2);		
	}
}
