package model;

import model.repositories.Repository;

public class Fixture {
	
	public static void initialize() {
		
		Estudiante gonza = new Estudiante("1465831", "Gonzalo", "Maidan", "gonzamaidan");
		Estudiante abdu = new Estudiante("1389099", "Abdul", "Ganem", "abdulganem");
		Repository.estudiantes.agregar(gonza);
		Repository.estudiantes.agregar(abdu);
		
		Tarea parcialDiscreta = new Tarea ("Parcial Mat. Discreta",TipoTarea.Parcial);
		Tarea parcialSyO = new Tarea ("Parcial Sistemas y Organizaciones",TipoTarea.Parcial);
		Tarea tpGestionDD = new Tarea ("Trabajo Práctico Gestión de Datos:Uber",TipoTarea.TrabajoPractico);
		Tarea tpDiseñoArena = new Tarea ("Trabajo Práctico DdS:Arena",TipoTarea.TrabajoPractico);
		Repository.tareas.agregar(parcialDiscreta);
		Repository.tareas.agregar(parcialSyO);
		Repository.tareas.agregar(tpGestionDD);
		Repository.tareas.agregar(tpDiseñoArena);
	
		Asignacion parcialGonzaSyO = new Asignacion(gonza,parcialSyO);
		Asignacion parcialGonzaDiscreta = new Asignacion(gonza,parcialDiscreta);
		Asignacion TpGonzaGestion = new Asignacion(gonza,tpGestionDD);
		Asignacion TpGonzaArena = new Asignacion(gonza,tpDiseñoArena);
		parcialGonzaSyO.agregarNota(new CalificacionNumerica(8));
		parcialGonzaDiscreta.agregarNota(new CalificacionConceptual(NotaConceptual.M_MAS));
		
		Asignacion parcialAbduSyO = new Asignacion(abdu,parcialSyO);		
		Asignacion parcialAbduDiscreta = new Asignacion(abdu,parcialDiscreta);
		Asignacion TpAbduGestion = new Asignacion(abdu,tpGestionDD);
		Asignacion TpAbduArena = new Asignacion(abdu,tpDiseñoArena);
		
		Repository.asignaciones.agregar(parcialGonzaSyO);
		Repository.asignaciones.agregar(parcialGonzaDiscreta);
		Repository.asignaciones.agregar(TpGonzaGestion);
		Repository.asignaciones.agregar(TpGonzaArena);
		Repository.asignaciones.agregar(parcialAbduSyO);
		Repository.asignaciones.agregar(parcialAbduDiscreta);
		Repository.asignaciones.agregar(TpAbduGestion);
		Repository.asignaciones.agregar(TpAbduArena);
		
	}

	
	
}
