package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		
		// instancia de una clase
		// Es una definicion de un objeto por lo tanto ***podemos invocarla

		// Variable de tipo Alumno (como la clase dentro del package
		Alumno alumno = new Alumno();// Con los parentecis llamo al constructor vacio
		Alumno alumno2 = new Alumno("Leonardo", "Utreras", 26, "G1");
		
		listaAlumnos.add(alumno);
		listaAlumnos.add(alumno2);
		
		

		System.out.println(alumno.getNombre());
		System.out.println(alumno2.getNombre());// get para obtener el atributo que tiene asignado mi variable

		//setter
		alumno.setNombre("Nicolas");//Para asiganar un valor al atributo
		System.out.println(alumno.getNombre());
		
		/* for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getNombre());
			System.out.println(listaAlumnos.get(i).getApellido());
		}*/
		
		for (Alumno objetoalumno : listaAlumnos) {
			System.out.println(objetoalumno.getNombre());
			System.out.println(objetoalumno.getCurso());
		}
		
	}

}
 //Crear instancias y asiganar valores, con los compañeros, imprimir en pantalla 