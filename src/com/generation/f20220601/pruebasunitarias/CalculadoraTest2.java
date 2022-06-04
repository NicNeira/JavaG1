package com.generation.f20220601.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);//54
		
		//assertEquals(valorEsperado,Resultado);
		assertEquals(54, resultado);
	}

	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivision() {
		fail("Not yet implemented");
	}

}
