package model;

import model.repositories.Repository;

public class Fixture {
	
	public static void initialize() {
		
		Estudiante gonza = new Estudiante("1465831", "Gonzalo", "Maidan", "gonzamaidan");
		
		Repository.estudiantes.agregar(gonza);
		
	}

	
	
}
