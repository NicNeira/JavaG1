package com.generation.f20220523;

public class CalculoPromedio {

	// Control + shift + f para ordenar el formato
	public static void main(String[] args) {
		
		//int cantidadNotas = 12;
		//Creando un arreglo
		Integer[] notas = {20,50,67,45,23,56,78,94,23,10,0,100}; 
		
		//promedio --> suma de todas las notas / cantidad de notas
		
		//Variable acumuladora
		int sumaNotas = 0;
		
		//como recorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {
			//Variable acumuladora, ella misma mas algo
			sumaNotas = sumaNotas + notas[i];
			
		}
		 System.out.println("suma de notas " + sumaNotas);
		 
		 float  promedioNotas = sumaNotas/notas.length;
		 System.out.println(promedioNotas);
		 
		 if (promedioNotas >=50 && promedioNotas<=100) {
			 System.out.println("Alumno aprobado");
		 }else {
			 System.out.println("Alumno Reprobado");
		 }
		
	}
}