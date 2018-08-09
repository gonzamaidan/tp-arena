package ui.vm;

import org.uqbar.commons.utils.Observable;

import model.repositories.EstudiantesRepository;
import model.repositories.Repository;

@Observable
public class LoginViewModel {
	
	private String legajo;
	private EstudiantesRepository estudiantes = Repository.estudiantes;
	
	public LoginViewModel() {
		super();
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public EstudiantesRepository getEstudiantes() {
		return estudiantes;
	}

}
