package co.uniquindio.programacion2.agenda.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import co.uniquindio.programacion2.agenda.exception.ContactoExcepction;

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
	public void crearContacto(String nombre, String telefono, int edad) throws ContactoExcepction {
		
		Contacto contactoExistente = null;
		int posicion = -1;
		
		
		//1. Validar que no exista
		contactoExistente = obtenerContacto(telefono);
		
		if(contactoExistente == null){
			
			//2. Validar una posicion disponible (0 -9)
			posicion = obtenerPosicion();
			if(posicion != -1){
				
				//3. crear el contacto
				Contacto contacto = new Contacto(nombre,telefono,edad);
				
				//4. Agregarlo al arreglo (lista)
				listContactos[posicion] = contacto;
				
			}else{
				//lanzar una excpeción
				throw new ContactoExcepction("No se puede agregar mas contactos al arreglo. Esta lleno");
			}
			
			
		}else{
//			lanzar la excepcion
			throw new ContactoExcepction("El contacto ya existe");
		}
	}
	
	private int obtenerPosicion() {

		int posicion = -1;
		
		
		for (int i = 0; i < listContactos.length; i++) {
			
			if(listContactos[i] == null){
				posicion = i;
				break;
			}
		}
		
		return posicion;
	}
	
	
	private Contacto obtenerContacto(String telefono) {
		
		Contacto contacto = null;
		
		for(int i = 0; i < listContactos.length; i++){
			
			contacto = listContactos[i];
			
			if(contacto != null && contacto.getTelefono().equals(telefono)){
				break;
			}
		}
		return contacto; 
	}

	/**
	 * 
	 * Inicializar los datos de la edad del contacto de forma aleatoria entre un rango de 15 a 60
	 * 
	 */
	
	public Contacto inicializarEdadAleatoria(int edad){
		
		Contacto edadAleatoria = null;
		
		//Random es un objeto que permite obtener numeros aleatorios entre varios intervalos
		Random EdadAleatorio = new Random();
		
		// a este entero que es edad se le asigna un valor aleotario y con el metodo nextInt nos devuelve un valor entero entre 15 y 60 
		
		
		edad = 15 + EdadAleatorio.nextInt(60);
		
	//	System.out.println("Se esta imprimiendo de forma aleatoria en el rango de 15 a 60"+edad);	
		
		return edadAleatoria;
	}
	
	
	/**
	 * nuevo
	 * Ordenar la lista de contactos aplicando el método burbuja
	 * 
	 * */
	public void ordenarListaContactos() {
			
			Contacto contactoMovido = new Contacto();
			
	        int i, j;
	        
	        for (i = 0; i < listContactos.length ; i++) {
	            
	        	for (j = 0; j < listContactos.length - 1; j++) {
	                
	        		if (listContactos[j + 1].getEdad() < listContactos[j].getEdad()) {
	                	contactoMovido = listContactos[j + 1];
	                    listContactos[j + 1] = listContactos[j];
	                    listContactos[j] = contactoMovido;
	                }
	            }
	        }
	        
	        System.out.println("------------ahora ordenados-------------");
	        
			for (int l = 0; l < listContactos.length; l++) {
				
				System.out.println(listContactos[l].toString());
				
			}
		}

	
	/**
	 * nuevo
	 * Imprimir los contactos de las posiciones pares
	 * 
	 * */
	public String contactosPosicionPar() {
		
		String mensaje = "";
		
		for (int i = 0; i < listContactos.length ; i++) {
			  if (i%2 == 0 && listContactos[i] != null) {
				mensaje = listContactos[i].toString()  + "\n";
			  }
		}
	  
		return mensaje;
	}
	
	
	/**
	 * nuevo
	 * Obtener el promedio de edades de los contactos
	 * 
	 * */
	public double promedioEdades() {
		
		double promedio = 0;
		int contador = 0;
		
		for (int i = 0; i < listContactos.length ; i++) {
			 
			if(listContactos[i] != null) {
				contador++;
				promedio += listContactos[i].getEdad();
			 }
			 
		}
		
		return promedio/contador;
	}
	
	/**
	 * nuevo
	 * Asociar un contacto a un grupo dado el nombre del grupo
	 * @param nombreGrupo
	 * **/
	
	public String setContactoAGrupo(String nombreGrupo, Contacto contacto) {
		
		String mensaje = "OK";
		
		for (int i = 0; i < listGrupos.length; i++) {
			if (listGrupos[i] != null && listGrupos[i].getNombre().equalsIgnoreCase(nombreGrupo)) {
				listGrupos[i].setContacto(contacto);
			}else {
				mensaje = "Error\n El grupo no existe";
			}
		}
		return mensaje;
	}

}
