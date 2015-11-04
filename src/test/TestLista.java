package test;

import static org.junit.Assert.*;
import listasEnlazadas.Lista;

import org.junit.Test;

public class TestLista {

	@Test
	public void test() {
		Lista lista = new Lista();
		lista.agregarOrd(45);
		lista.agregarOrd(5);
		lista.agregarOrd(44);
		lista.agregarOrd(70);
		lista.mostrarREC(lista.getInicio());

		assertTrue(lista.existeDatoREC(lista.getInicio(), 45));

		// TODO > add test handling to function below	
		lista.mostrarInversoREC(lista.getInicio());

	}

}
