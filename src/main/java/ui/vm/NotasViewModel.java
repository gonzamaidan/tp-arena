package ui.vm;

import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.utils.Observable;

import model.Asignacion;
import model.Calificacion;
import model.Estudiante;
import model.repositories.Repository;

@Observable
public class NotasViewModel {
	
	private List<Asignacion> asignaciones;
	private Estudiante estudiante;
	
	public NotasViewModel(String legajo) {
		super();
		this.estudiante = Repository.estudiantes.getEstudiante(legajo).get();
		this.asignaciones = Repository.asignaciones.getAsignacionesDeLegajo(legajo);
	}

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public List<Calificacion> getUltimasNotas() {
		return asignaciones.stream().map(asignacion -> asignacion.notaFinal()).collect(Collectors.toList());
	}
	
	public Estudiante getEstudiante() {
		return estudiante;
	}
	
	
	
	
}
