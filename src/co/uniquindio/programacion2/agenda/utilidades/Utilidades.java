package co.uniquindio.programacion2.agenda.utilidades;

import javax.swing.JOptionPane;

public class Utilidades {
	
	/**
	 * Método para mostrar el menú principal
	 * @return seleccion
	 */
	public static String mostrarMenu() {
		
		String[] opciones = {
				"Agregar contacto",
				"Existe contacto",
				"Buscar contacto",
				"Eliminar contacto",
				"Consultar disponibilidad de cupo",
				"Consultar espacios disponibles",
				"Salir"
		};
		
		String seleccion = (String) JOptionPane.showInputDialog(null, 
				"Selecciona una opción",
				"Agenda",
				JOptionPane.PLAIN_MESSAGE,
				null,
				opciones,
				opciones[0]);
		
		
		return seleccion;
		
	}
	
	/**
	 * Método para mostrar un mensaje en pantalla
	 * @param mensaje
	 */
	public static void imprimirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
}
