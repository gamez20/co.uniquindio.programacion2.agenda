package co.uniquindio.programacion2.agenda.model;

/**
 * Clase Contacto
 * @author Curso programaciÃ³n 2 nocturna
 *
 */
public class Contacto {
	
	
	Grupo [] listGruposAsociados;
	
	
	/**
	 * MÃƒÂ©ï¸�todo constructor para inicializar solo el nombre
	 * @param nombre
	 */
	public Contacto(String nombre) {
		this.nombre = nombre;
		this.telefono = "0000000000";
	}
	
	
	// Declaracion de los atributos
	private String nombre;
	private String telefono;
	private int edad;
	
	/**
	 * MÃƒÂ©todo constructor para crear los grupos
	 * 
	 * @param nombre
	 */
	public Contacto(String nombre, String telefono, int edad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
		
		listGruposAsociados = new Grupo [3];
	}
	
	
	
	
	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}




	/**
	 * MÃƒÂ©todo para obtener el nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * MÃƒÂ©todo para modificar el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * MÃƒÂ©todo para obtener el telÃƒÂ©fono
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * MÃƒÂ©todo para modificar el telÃƒÂ©fono
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
}
