package co.uniquindio.programacion2.agenda.aplicacion;

import javax.swing.JOptionPane;

import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.model.Contacto;

import static co.uniquindio.programacion2.agenda.utilidades.Utilidades.*;

public class Aplicacion {
	
	public static void main(String[] args) {
		
		// Opción seleccionada por el usuairo
		String seleccion = "";
		
		
		// Variables Auxiliares
		Agenda agenda = new Agenda();
		
		String nombreContracto = "";
		String telefonoContactoString = "";
		
		
		do {
			
			seleccion = mostrarMenu();
			
			switch (seleccion) {
			
			case "Agregar contacto":
				
				// El usuario ingresa el nombre del contacto
				
				
				// EL usuario ingresa el número de teléfono
				
				
				// imprimirMensaje("Nuevo contacto");
				
				break;
			case "Existe contacto":
				
				break;
			case "Buscar contacto":
				
				break;
			case "Eliminar contacto":
				
				break;
			case "Consultar disponibilidad de cupo":
				
				break;
			case "Consultar espacios disponibles":
				
				break;
			}
						
		} while (seleccion != "Salir");

		
	}	
	
}
