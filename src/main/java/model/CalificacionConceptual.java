package model;

public class CalificacionConceptual implements Calificacion {

	private NotaConceptual notaConceptual;
	
	public CalificacionConceptual(NotaConceptual notaConceptual) {
		super();
		this.notaConceptual = notaConceptual;
	}

	@Override
	public String obtenerCalificacion() {
		return this.notaConceptual.getCalificacionConceptual();
	}

	@Override
	public Boolean estaAprobado() {
		return this.notaConceptual.estaAprobado();
	}

}
