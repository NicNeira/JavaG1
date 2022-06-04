package com.generation.f20220601.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);// 54

		// assertEquals(valorEsperado,Resultado);
		assertEquals(54, resultado);
	}

	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(0, 0);

		// Equals
		assertEquals("No se puede dividir por cero", resultado);
		assertNotNull(resultado);
	}
}
