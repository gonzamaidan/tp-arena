package model;

public class Estudiante {

	private String legajo;
	private String nombre;
	private String apellido;
	private String usuarioGithub;
	
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
	
	
}
