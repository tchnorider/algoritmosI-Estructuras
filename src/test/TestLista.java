package test;

import static org.junit.Assert.*;

import java.util.List;

import listasEnlazadas.Lista;

import org.junit.Before;
import org.junit.Test;

public class TestLista {
	Lista lista;
	
	@Before
	public void inicializar(){
		 lista = new Lista();
	}

	@Test
	public void test() {
		
		lista.agregarOrd(45);
		lista.agregarOrd(5);
		lista.agregarOrd(44);
		lista.agregarOrd(70);
		lista.mostrarREC(lista.getInicio());
		
		assertTrue(lista.existeDatoREC(lista.getInicio(), 45));
		
	}
	/*
	@Test
	public void testInsertar(){
		int[] nros = { 70, 45, 44, 5 };
		assertArrayEquals("Testeo de lista inversa", nros, lista.retornarInversoREC(lista.getInicio(), 1));
	}
	*/
}
