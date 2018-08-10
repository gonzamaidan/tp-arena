package model;

public enum NotaConceptual {

	M_MENOS("M-"), M("M"), M_MAS("M+"),
	R_MENOS("R-"), R("R"), R_MAS("R+"), 
	B_MENOS("B-"), B("B"), B_MAS("B+"), 
	MB_MENOS("MB-"), MB("MB"), MB_MAS("MB+"),
	E_MENOS("E-"), E("E"), E_MAS("E+");

	private String calificacionConceptual;	
	NotaConceptual(String calificacionConceptual) {
		this.calificacionConceptual = calificacionConceptual;
	}
	
	public String getCalificacionConceptual() {
		return this.calificacionConceptual;
	}
	
	public Boolean estaAprobado() {
		return this.ordinal() > R_MAS.ordinal();
	}
	
}
