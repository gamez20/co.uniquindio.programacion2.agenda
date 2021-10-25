package co.uniquindio.programacion2.agenda.model;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Clase Agenda
 * @author Curso programación 2 nocturna
 *
 */
public class Agenda {

	private Contacto[] listContactos;
	private Grupo[] listGrupos;
	private String nombre;
	private int tamanioListContactos;
	private int tamanioListGrupos;


	/**
	 * Metodo constructor vacio en el cual sus parametros se asignan por defecto
	 */
	public Agenda(){
		this.nombre = "defecto";
		this.tamanioListContactos = 10;
		this.tamanioListGrupos = 10;
		listContactos = new Contacto[this.tamanioListContactos];
		listGrupos = new Grupo[this.tamanioListGrupos];

	}
	/**
	 * Metodo contructor en el cual se le asigna el nombre por parametro
	 * y el tamaño de los arreglos se asignan por defectos
	 * @param nombre
	 */
	public Agenda(String nombre) {

		this.nombre = nombre;
		this.tamanioListContactos = 10;
		this.tamanioListGrupos = 10;
		listContactos = new Contacto[this.tamanioListContactos];
		listGrupos = new Grupo[this.tamanioListGrupos];
	}

	/**
	 * Metodo constructor en el cual se asignan los datos por medio de paramtros
	 * 
	 * @param nombre
	 * @param tamanioListContacto
	 * @param tamanioListGrupo
	 */
	public Agenda(String nombre,int tamanioListContactos,int tamanioListGrupos ) {
		this.nombre = nombre;
		this.tamanioListContactos = tamanioListGrupos;
		this.tamanioListGrupos = tamanioListGrupos;
		listContactos = new Contacto[this.tamanioListContactos];
		listGrupos = new Grupo[this.tamanioListGrupos];
	}






	/**
	 * @return the tamanioListContactos
	 */
	public int getTamanioListContactos() {
		return tamanioListContactos;
	}
	/**
	 * @param tamanioListContactos the tamanioListContactos to set
	 */
	public void setTamanioListContactos(int tamanioListContactos) {
		this.tamanioListContactos = tamanioListContactos;
	}
	/**
	 * @return the tamanioListGrupos
	 */
	public int getTamanioListGrupos() {
		return tamanioListGrupos;
	}
	/**
	 * @param tamanioListGrupos the tamanioListGrupos to set
	 */
	public void setTamanioListGrupos(int tamanioListGrupos) {
		this.tamanioListGrupos = tamanioListGrupos;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agenda [listContactos=" + Arrays.toString(listContactos) + ", listGrupos=" + Arrays.toString(listGrupos)
		+ ", nombre=" + nombre + "]";
	}

	/**
	 * @return the listContactos
	 */
	public Contacto[] getListContactos() {
		return listContactos;
	}

	/**
	 * @param listContactos the listContactos to set
	 */
	public void setListContactos(Contacto[] listContactos) {
		this.listContactos = listContactos;
	}

	/**
	 * @return the listGrupos
	 */
	public Grupo[] getListGrupos() {
		return listGrupos;
	}

	/**
	 * @param listGrupos the listGrupos to set
	 */
	public void setListGrupos(Grupo[] listGrupos) {
		this.listGrupos = listGrupos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





}
