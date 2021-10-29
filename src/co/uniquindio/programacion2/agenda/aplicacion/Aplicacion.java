package co.uniquindio.programacion2.agenda.aplicacion;

import co.uniquindio.programacion2.agenda.exception.ContactoExcepction;
import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.test.TestData;

public class Aplicacion {

	
	
	public static void main(String[] args) {
		
		Agenda agenda;
		TestData testData = new TestData();
	
		
		agenda = testData.inicializarDatosPrueba();
		
		//crud
		//1. Crear contacto
		//crearContacto(agenda, "Carlos", "45678", 20);
		
		//2. actualizar contacto
//		actualizarContacto("Pedro","45678");
//		
//		//3. Consultar
//		consultarContacto("45678");
//		
//		//4. elmininar contacto
//		eliminarContacto("45678");

	}
	
	
	private static void crearContacto(Agenda agenda, String nombre, String telefono, int edad) {
		
		try {
			agenda.crearContacto(nombre,telefono,edad);
		} catch (ContactoExcepction e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	private static void consultarContacto(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void actualizarContacto(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarContacto(String string) {
		// TODO Auto-generated method stub
		
	}

}
