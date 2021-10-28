package co.uniquindio.programacion2.agenda.test;

import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.model.Contacto;

public class TestData {
	
	public TestData() {
		// TODO Auto-generated constructor stub
	}

	public Agenda inicializarDatosPrueba() {
		
		Agenda agenda = new Agenda();
		
		Contacto[] listaContactos = agenda.getListContactos();
		
		Contacto contacto = new Contacto("Juan", "12345", 20);
		listaContactos[0] = contacto;
		
		contacto = new Contacto("Pedro", "12345",21);
		listaContactos[1] = contacto;
		
		contacto = new Contacto("Ana", "12345",22);
		listaContactos[2] = contacto;
		
		return agenda;
		
	}
	
	
	
	
	
	
}
