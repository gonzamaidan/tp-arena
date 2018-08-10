package model;

import model.repositories.Repository;

public class Fixture {
	
	public static void initialize() {
		
		Estudiante gonza = new Estudiante("1465831", "Gonzalo", "Maidan", "gonzamaidan");
		Estudiante abdu = new Estudiante("1389099", "Abdul", "Ganem", "abdulganem");
		Repository.estudiantes.agregar(gonza);
		Repository.estudiantes.agregar(abdu);
		
	}

	
	
}
