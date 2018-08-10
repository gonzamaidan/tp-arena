package model.repositories;

import java.util.LinkedList;
import java.util.List;

import model.Tarea;

public class TareasRepository {

	private List<Tarea> Tareas = new LinkedList<>();

	public void agregar(Tarea Tarea) {
		this.Tareas.add(Tarea);
	}

	public List<Tarea> all() {
		return Tareas;
	}
}
