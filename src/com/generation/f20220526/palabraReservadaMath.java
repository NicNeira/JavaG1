package com.generation.f20220526;

public class palabraReservadaMath {

	public static void main(String[] args) {
		// Math

		// elevar o potencia

		//.pow para elevar
		double numeroElevado = Math.pow(4.4, 1);
		System.out.println("El resultado es: " + numeroElevado);

		//.ceil para redondear al entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//.floor para redondear al entero enor
		double enteroMenor = Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//redondeo
		double enteroRedondeado = Math.round(numeroElevado);
		System.out.println(enteroRedondeado);
		
		double num1 =12;
		double num2= 5;
		double div = num1/num2;
		System.out.println("La division es: " + div);
		
		//numeor aleatorios
		//Math.random() valores por default >=0.0 y <1.0
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
		//numero aleatorios entre 0 y 10
		double num010 = Math.random()*10;
		System.out.println(num010);
		
		//numero aleatorios entre 2 y 8
		Double num28 = (Math.random() * (8-2) - 2 );
		System.out.println(".abs "+ Math.abs(num28));
		System.out.println(".round " + Math.round(num28));
		//numero aleatorios entre 4 y -4
		Double num44 = (Math.random() * (4-(-4))+ - 4 );
		System.out.println("negativo " + Math.round(num44));
		
		
		
	}

}
