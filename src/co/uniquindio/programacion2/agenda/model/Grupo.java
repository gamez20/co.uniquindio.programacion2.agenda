package co.uniquindio.programacion2.agenda.model;

public class Grupo {
	
	
	private String nombre;
	private Contacto[] listContactosAsociados;
	
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.listContactosAsociados = new Contacto[5];
	}

	public Contacto[] getListContactosAsociados() {
		return listContactosAsociados;
	}

	public void setListContactosAsociados(Contacto[] listContactosAsociados) {
		this.listContactosAsociados = listContactosAsociados;
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
