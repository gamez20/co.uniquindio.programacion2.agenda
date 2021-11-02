package co.uniquindio.programacion2.agenda.model;

import java.util.Iterator;

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

	public void setContacto(Contacto contacto) {
		
		for (int i = 0; i < listContactosAsociados.length; i++) {
			if (listContactosAsociados[i] != null) {
				listContactosAsociados[i] = contacto;
				break;
			}
		}
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
