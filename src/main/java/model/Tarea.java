package model;


public class Tarea {
 String nombre;
 TipoTarea tipo;
 
 	public Tarea ( String nombre, TipoTarea tipo) {
 		this.nombre=nombre;
 		this.tipo=tipo;
 	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoTarea getTipo() {
		return tipo;
	}
	public void setTipo(TipoTarea tipo) {
		this.tipo = tipo;
} 
}
