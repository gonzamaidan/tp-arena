package model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

	private String legajo;
	private String nombre;
	private String apellido;
	private String usuarioGithub;
	private List<Asignacion> asignaciones = new ArrayList<>();
	
	public Estudiante(String legajo, String nombre, String apellido, String usuarioGithub) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuarioGithub = usuarioGithub;
	}

	public Boolean tieneLegajo(String legajo) {
		return this.legajo.equals(legajo);
	}
	
	public List<Asignacion> getAsignaciones() {
		return this.asignaciones;
	}
	
	public void addAsignacion(Asignacion asignacion) {
		this.asignaciones.add(asignacion);
	}
	
}
