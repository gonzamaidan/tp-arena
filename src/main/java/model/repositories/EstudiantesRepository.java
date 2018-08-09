package model.repositories;

import java.util.LinkedList;
import java.util.List;

import model.Estudiante;

public class EstudiantesRepository {

	private List<Estudiante> Estudiantes = new LinkedList<>();

	public void agregar(Estudiante Estudiante) {
		this.Estudiantes.add(Estudiante);
	}

	public List<Estudiante> all() {
		return Estudiantes;
	}
}
