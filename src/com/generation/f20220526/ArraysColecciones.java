package com.generation.f20220526;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysColecciones {

	public static void main(String[] args) {
		// Array ESTATICOS 
		// Hay que definir el tipo de dato en primera instancia

		// Array tipo String
		String[] colores = { "red", "blue", "yellow", "black" };

		// Array tipo Integer
		Integer[] numerosPar = { 2, 4, 6, 8, 10, 12 };
		int[] primerosNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Posicion incial es cero (0)
		System.out.println(colores[0]);
		System.out.println(numerosPar[0]);
		System.out.println(primerosNumeros[0]);

		// nombreArray[posicion]--> accediendo al elemento del arreglo en esa posicon
		System.out.println(numerosPar[3]);// 8

		numerosPar[3] = 14;// modifico el elemento en esa posicion
		System.out.println(numerosPar[3]);// 14

		// numerosPares[6] = 14; //Error fuera de indice
		// no podemos agregar por posicion si no existe un elementoS

		System.out.println("Tamaño array colores: " + colores.length);
		System.out.println("Tamaño array numeros pares: " + numerosPar.length);

		System.out.println(colores.toString());
		System.out.println(numerosPar.toString());
		System.out.println(primerosNumeros.toString());

		// Imprimir el contenido del arreglo
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPar));
		System.out.println(Arrays.toString(primerosNumeros));

		// recorrer un arreglo
		for (int i = 0; i < primerosNumeros.length; i++) {
			System.out.print(primerosNumeros[i] + ", ");
		}
		System.out.println("\n");

		// For each recorre de forma automatica el arreglo hasta que ya no hayan mas
		// elementos
		// For each tipo String para arreglos de texto
		System.out.println("Arreglo colores");
		for (String elemento : colores) {// { "red", "blue", "yellow", "black" };
			System.out.print(elemento + ", ");
		}

		// For each tipo in para arreglos de numeros
		System.out.println("Arreglo numerosPar");
		for (Integer elemento : numerosPar) { // { 2, 4, 6, 14, 10, 12 };
			System.out.print(elemento + ", ");
		}

		// For each tipo in para arreglos de numeros
		System.out.println("Arreglo Primeros numeros");
		for (int elemento : primerosNumeros) { // { 2, 4, 6, 14, 10, 12 };
			System.out.print(elemento + ", ");
		}
		
		
	}

}
