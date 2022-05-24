package com.generation.f20220523;

public class CalculoPromedio {

	// Control + shift + f para ordenar el formato
	public static void main(String[] args) {

		// int cantidadNotas = 12;
		// Creando un arreglo
		Integer[] notas = { 20, -50, 67, -45, -23, 560, 780, 94, 230, 10, 0, 100 };

		// promedio --> suma de todas las notas / cantidad de notas

		// Variable acumuladora
		int sumaNotas = 0;
		int notasFueraDeRango = 0;

		// como recorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {
			// validar la nota (negativa o mayor a 100)
			if (notas[i] < 0 || notas[i] > 100) {
				System.out.println("la nota: " + notas[i] + "en la posicion " + (i + 1) + ", esta fuera de rango");
				notasFueraDeRango++;
			}

			// Variable acumuladora, ella misma mas algo
			sumaNotas = sumaNotas + notas[i];// accedemos a cada uno de los valores

		}
		System.out.println("La cantidad de notas fuera de rango son: " + notasFueraDeRango);
		// System.out.println("suma de notas " + sumaNotas);

		if (notasFueraDeRango == 0) {// No hay notas fuera de rango

			// promedio --> suma todas las notas / cantidad de notas;
			float promedioNotas = sumaNotas / notas.length;
			System.out.println("\nEl promedio de notas es: " + promedioNotas);

			// validar si se cumplen los requisitos para aprobar
			// PUNTO CRITICO
			if (promedioNotas >= 50 && promedioNotas <= 100) {
				System.out.println("Alumno aprobado");
				System.out.println("\nEl promedio es: " + promedioNotas);

			} else if (promedioNotas >= 0 && promedioNotas <= 49) {
				System.out.println("Alumno Reprobado");
				System.out.println("\nEl promedio es: " + promedioNotas);

			} else {
				System.out.println("Error en los datos");
			}

		}

	}
}