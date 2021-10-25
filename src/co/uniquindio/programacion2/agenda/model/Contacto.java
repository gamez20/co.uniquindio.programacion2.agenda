package co.uniquindio.programacion2.agenda.model;

/**
 * Clase Contacto
 * @author Curso programaci�n 2 nocturna
 *
 */
public class Contacto {
	
	// Declaración de los atributos
	private String nombre;
	private String telefono;
	
	/**
	 * Método constructor para inicializar solo el nombre
	 * @param nombre
	 */
	public Contacto(String nombre) {
		this.nombre = nombre;
		this.telefono = "0000000000";
	}
	
	/**
	 * Método constructor para inicializar nombre y teléfono
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * Método para obtener el nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método para modificar el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el teléfono
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Método para modificar el teléfono
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
