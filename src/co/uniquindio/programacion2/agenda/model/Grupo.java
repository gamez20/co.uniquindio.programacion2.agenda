package co.uniquindio.programacion2.agenda.model;
import java.util.Arrays;
public class Grupo {
	
	

	private String nombre;
	private Contacto[] listGruposAsociados;
	private int numContactosAsociado = 0;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.listGruposAsociados= new Contacto[10];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void crearContacto(Contacto c) {
		listGruposAsociados[numContactosAsociado++] = c;
	}
	
	public void mostrarContactos() {
		for (int i = 0; i < listGruposAsociados.length; i++) {
			if (listGruposAsociados[i]!=null) {
				System.out.println(listGruposAsociados[i].toString());
			}
		}
	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", listGruposAsociados=" + Arrays.toString(listGruposAsociados)
				+ "]";
	}
	
}
