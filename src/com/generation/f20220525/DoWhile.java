package com.generation.f20220525;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// DoWhile
		// A lo menos se ejecutara una vez
		int termino = 8;

		do {

			System.out.println("DoWhile El valor del termino es: " + termino);
			termino++;
		} while (termino <= 10);

		System.out.println("****************************");

		while (termino <= 10) {
			System.out.println("El valor de termino es: " + termino);
			termino++;

		}
		System.out.println("*************Fin************");
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		//DoWhile siempre se ejecuta al menos una vez
		do {
			System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt();
			
			
			//Se repite mientras lo de dentro sea verdadero, si la condicion no se cumple se sale del bucle
		} while (opcion<0 || opcion >4);
		
		
		
	}
}