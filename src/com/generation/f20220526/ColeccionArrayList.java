package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ColeccionArrayList {

	public static void main(String[] args) {
		// ArrayList <Tipo_de_dato> nombre_de_Variable = new ArrayList <Tipo_de_dato>();
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();

		// Agregar un elemento a la lista
		colores.add("rojo");
		System.out.println(colores);
		colores.add("azul");
		// Si existe un elemento en esa posicion, lo remplaza y corre desde donde estaba
		// hacia la derecha
		colores.add(1, "amarillo");
		System.out.println(colores);
		// System.out.println(colores[]);

		// Acceder a un elemento .get();
		System.out.println(colores.get(2));

		// Tamaño del elemento .size();
		System.out.println(colores.size());

		// modificar un elemento .set();
		colores.set(1, "Negro");
		System.out.println(colores);

		// quitar un elemento
		colores.remove(2);
		System.out.println(colores);

		// recorrer
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}

		// For each
		System.out.println("***********************");
		for (String i : colores) {
			System.out.println(i);
		}

		// Ordenar el arreglo de forma ascendentemente independiente string
		// alfabeticamente (A-Z) o numeros
		Collections.sort(colores);
		System.out.println(colores);

		System.out.println("********************");
		// quitar todos los elementos
		colores.clear();
		System.out.println(colores);

		numerosPares.add(14);
		numerosPares.add(2);
		numerosPares.add(8);
		numerosPares.add(6);
		numerosPares.add(10);
		numerosPares.add(20);
		System.out.println(numerosPares + " ");

		// Ordenar numeros de forma ascendente
		Collections.sort(numerosPares);
		System.out.println(numerosPares);

		// No ordena descendetemente sino que invierte el arreglo
		Collections.reverse(numerosPares);
		System.out.println(numerosPares);

	}

}
