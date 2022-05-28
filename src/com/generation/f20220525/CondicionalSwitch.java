package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// menu
		System.out.println("Ingrese opcion:");
		System.out.println("1 Sumar \n 2 Restar \n 3 Multiplicar \n 4 Dividir");
		int opcion = sc.nextInt(); // Variable dada por el usuario para compararla con case

		// Se ocupa generalmente en la creacion de menus, donde el usuario ingresa una
		// opcion para luego con switch irno al case que corresponde y realizar las
		// aciones dentro de esta.
		switch (opcion) {
		case 1:
			// Aqui va la accion para la opcion 1
			System.out.println("**Suma");
			break;// Luego de que realiza la accion va a salir

		case 2:
			System.out.println("**Resta");
			break;
		case 3:
			System.out.println("**Division");
			break;
		case 4:// Division lleva unas validaciones
			System.out.println("**Multiplicacion");
			break;

		default: // Es cuando ingres un numero que no corresponde dentro de las opciones
			System.out.println("Opcion invalida");
			break;
		}
		
		System.out.println("Fuera del switch");
	}
}
