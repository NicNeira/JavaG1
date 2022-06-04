package com.generation.f20220524;

import java.util.Scanner;//Tengo que importar scanner

public class Condicional {
	public static void main(String[] args) {

		String nombre;
		// agrego la variable scanner para solicitar datos al usuario
		Scanner sc = new Scanner(System.in);

		// Validar la mayoria de edad
		// establecer punto critico --> 18 años

		int mayoriaEdad = 18;

		// solicitar el ingreso de edad
		System.out.println("Ingrese su edad");

		// capturando el ingreso por consola y guardandolo en una variable
		int edad = sc.nextInt();
		nombre = sc.nextLine();
		System.out.println("La edad ingresada es: " + edad);

		// Comparo la edad ingresada con la mayoria de edad del programa
		if (edad >= mayoriaEdad) {
			
			System.out.println("Usted es mayor de edad");// Si es mayor
		} else {
			System.out.println("No esta permitido su ingreso");// Si es menor
		}

	}
}
