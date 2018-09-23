package model;

public class SinCalificacion implements Calificacion {

	@Override
	public String obtenerCalificacion() {
		return "Sin calificar";
	}

	@Override
	public Boolean estaAprobado() {
		return false;
	}

	
}
