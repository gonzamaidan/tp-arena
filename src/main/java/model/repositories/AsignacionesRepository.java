package model.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import model.Asignacion;

public class AsignacionesRepository {

	private List<Asignacion> Asignaciones = new LinkedList<>();

	public void agregar(Asignacion Asignacion) {
		this.Asignaciones.add(Asignacion);
	}

	public List<Asignacion> all() {
		return Asignaciones;
	}

	public List<Asignacion> getAsignacionesDeLegajo(String legajo) {
		return all().stream().filter(asignacion -> asignacion.getEstudiante().tieneLegajo(legajo)).collect(Collectors.toList());
	}
}
