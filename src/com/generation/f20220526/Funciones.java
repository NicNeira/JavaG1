package com.generation.f20220526;
import java.util.Scanner;
public class Funciones {

	public static void main(String[] args) {
		// Funciones
		// 4 tipos de funciones
		// 2 que van a retornar (Cuando hablamos de retornar hacemos referencia a que
		// devuelven un valor)
		// 2 que no van a retornar. Funcion de tipo void no retorna nada, solo ejecuta
		// codigo
		// nombre_de_funcion se escribe con minuscula la primera letra
		// no puedo CREAR un metodo dentro de otro metodo, si puede llamar a otro metodo

		saludo();// llamado al metodo
		calculoSumaPares(false, 0, "33", 123l, "Neira");

		int edad = obtenerEdad();
		System.out.println("La edad es: " + edad);

		boolean mayorOmenor = validarMayorEdad(edad);
		if (mayorOmenor) {
			System.out.println("Puede ingresar al curso");
		} else {
			System.out.println("No puede ingresar");
		}

	}

	// Accesador tipo publica, cualquier otra clase podra llamarla o usarla desde
	// donde sea
	// accesador tipo_de_retorno nombre_funcion(parametros a recibir)
	public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {
		Integer num2 = Integer.parseInt(numero2);
		System.out.println(numero1 + numero2 + num2);// El casteo es solo para este momento
	}

	// Funcion de tipo void no retorna nada, solo ejecuta codigo
	public static void saludo() {
		// solicitar el ingreso de datos
		System.out.println("Buenos dias");

	}

	// Funciones que retornan un tipo de dato
	// Accesador tipo_de_dato nombre_funcion
	public static Integer obtenerEdad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese edad");
		Integer edad = sc.nextInt();

		return edad;// Retorna el contenido de la variable

	}

	public static Boolean validarMayorEdad(Integer edad) {
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
			return true;
		} else {
			System.out.println("Es menor de edad");
			return false;
		}
		// return true; //false
	}

}
