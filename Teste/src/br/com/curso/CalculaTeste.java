package br.com.curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaTeste {

	Calcula calcula;
	Double resultado;
	
	@Test
	public void testSomar() {
		calcula = new Calcula();
		resultado = calcula.somar(20.0, 10.0);
		assertEquals(Double.valueOf(30.0), resultado);
	}

	@Test
	public void testSubtrair() {
		calcula = new Calcula();
		resultado = calcula.subtrair(20.0, 10.0);
		assertEquals(Double.valueOf(10.0), resultado);
	}

	@Test
	public void testMultiplicar() {
		calcula = new Calcula();
		resultado = calcula.multiplicar(20.0, 10.0);
		assertEquals(Double.valueOf(200.0), resultado);
	}

	@Test
	public void testDividir() {
		calcula = new Calcula();
		resultado = calcula.dividir(20.0, 10.0);
		assertEquals(Double.valueOf(2.0), resultado);
	}

}
