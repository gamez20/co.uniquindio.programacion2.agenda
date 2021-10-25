package co.uniquindio.programacion2.agenda.model;

public class Grupo {
	
	
	private String nombre;
	
	
	
	public Grupo(String nombre) {
		this.nombre = nombre;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + "]";
	}
	
	
	
	
	
}
