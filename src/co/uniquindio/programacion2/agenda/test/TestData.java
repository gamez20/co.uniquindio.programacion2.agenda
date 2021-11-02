package co.uniquindio.programacion2.agenda.test;

import java.util.Iterator;
import java.util.Random;

import co.uniquindio.programacion2.agenda.model.Agenda;
import co.uniquindio.programacion2.agenda.model.Contacto;

public class TestData {
	
	public TestData() {
		// TODO Auto-generated constructor stub
	}

	public Agenda inicializarDatosPrueba() {
		
		Agenda agenda = new Agenda();
		
		Contacto[] listaContactos = agenda.getListContactos();
		
		String nombres[] = {"Juan", "Pablo", "Manuel", "Jhon", "Stiven", "Santiago", "Kimberly","Andrea","Sofia","Maria","Yuliana","Paula","Pedro",
				"Julian", "Agustin", "Oscar", "Tomas", "Susana", "Milena", "Luisa"};
		
		
		//generarNombre(nombres);
		//generarNumeroTel();
		
		for (int i = 0; i < listaContactos.length; i++) {
			
			if (listaContactos[i] == null) {
				listaContactos[i] = new Contacto(generarNombre(nombres), generarNumeroTel(),inicializarEdadAleatoria());
			}
			
			System.out.println(listaContactos[i].toString());
			
			
		}
		
		/*
		Contacto contacto = new Contacto("Juan", "12345", 20);
		listaContactos[0] = contacto;
		
		contacto = new Contacto("Pedro", "12345",21);
		listaContactos[1] = contacto;
		
		contacto = new Contacto("Ana", "12345",22);
		listaContactos[2] = contacto;
		*/
		return agenda;
		
	}
	

	public int inicializarEdadAleatoria(){
			
		int edad;
		//Random es un objeto que permite obtener numeros aleatorios entre varios intervalos
		Random EdadAleatorio = new Random();
		
		// a este entero que es edad se le asigna un valor aleotario y con el metodo nextInt nos devuelve un valor entero entre 15 y 60 
		
		edad = 15 + EdadAleatorio.nextInt(60);
		
		return edad;
	}
	

	private String generarNumeroTel() {
		
		int num  = (int)((Math.random()*8999) + 1000);
		
		if (num < 1000) {
			generarNumeroTel();
		}
		
		return String.valueOf(num);
	}

	private String generarNombre(String[] nombres) {
		
		int posicion = (int)(Math.random()* nombres.length);
		
		return nombres[posicion];
	}
	
	
	
	
	
	
}
