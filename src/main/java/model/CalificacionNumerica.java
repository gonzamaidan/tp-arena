package model;

public class CalificacionNumerica implements Calificacion {

	private static final Integer NOTA_MINIMA_APROBACION = 6;
	private Integer calificacion;
	
	public CalificacionNumerica(Integer calificacion) {
		if(calificacion < 0) throw new RuntimeException("La calificacion no puede ser negativa");
		if(calificacion > 10) throw new RuntimeException("La calificacion no puede ser mayor a 10");
		this.calificacion =  calificacion;
	}
	
	@Override
	public String obtenerCalificacion() {
		return calificacion.toString();
	}

	@Override
	public Boolean estaAprobado() {
		return calificacion >= NOTA_MINIMA_APROBACION;
	}

}
