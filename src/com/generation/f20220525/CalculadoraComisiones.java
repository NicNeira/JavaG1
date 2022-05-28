package com.generation.f20220525;

//Importo la libreria Scanner
import java.util.Scanner;

public class CalculadoraComisiones {

	public static void main(String[] args) {

		// Inicializo la variable scanner
		Scanner sc = new Scanner(System.in);
		int venta; // Variable donde usuario ingresara monto de venta
		int formula; // Variable donde se almacenará la formula de la comisoin
		int comision30 = 30; // variable comision del 30%
		int comision20 = 20; // variable comision del 20%
		int comision10 = 10; // variable comision del 10%

		// Solicito al usuario el monto de venta
		System.out.println("Ingrese monto de venta");
		// Lo almaceno en variable venta
		venta = sc.nextInt();

		// Funcion if para condicionar datos ingresados
		// Si venta es menor o igual a 1000 no aplica comision
		if (venta <= 1000) {
			System.out.println("No aplica comision");

			// si entonces venta es mayor o igual a 1001 && venta es menor o igual a 4999,
			// aplicamos comision del 10%
		} else if (venta >= 1001 && venta <= 4999) {
			// Aplicamos formula de comision 10% e imprimimos
			formula = (venta * comision10) / 100;
			System.out.println("La comision para esta venta es: $" + formula);

			// Si entonces venta es identica a 5000 imprimimos que no aplica comision
		} else if (venta == 5000) {
			System.out.println("No hay comision para ventas de $5000");

			// Si venta es mayor o igual a 5001 && venta es menor o igual a 9999, aplicamos
			// comision del 20%
		} else if (venta >= 5001 && venta <= 9999) {
			// Aplicamos formula de comision 20% e imprimimos
			formula = (venta * comision20) / 100;
			System.out.println("La comision para esta venta es: $" + formula);

			// Si venta es mayor o igual a 10000, aplicamos comision del 30%
		} else if (venta >= 10000) {
			// Aplicamos formula de comision 30% e imprimimos
			formula = (venta * comision30) / 100;
			System.out.println("La comision para esta venta es: $" + formula);

		}

	}
}
