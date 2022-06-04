package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class AlumnosGrupo2 {

	public static void main(String[] args) {
		//List es una interface / las interfaces solo definen los metodos es decir es solo la estructura
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>(); //Array List es una Clase como tal / tendremos atributos funciones y metodos
		
		//Instancia de una clase
		Alumno alumno = new Alumno ();
		Alumno gene = new Alumno ("Genesis","Quezada",27,"G1");
		Alumno gabo = new Alumno("Gabriel", "Guzman", 29, "G1");
		Alumno cata = new Alumno("Catalina", "Castillo", 26, "G1");
		Alumno carlos = new Alumno("Carlos", "Iturra", 26, "G1");
		Alumno nico = new Alumno("Nicolas", "Neira", 27, "G1");
		
		listaAlumnos.add(gene);
		listaAlumnos.add(gabo);
		listaAlumnos.add(cata);
		listaAlumnos.add(carlos);
		listaAlumnos.add(nico);

		System.out.println("*********************************");
		System.out.println("Nombre completo: " + gene.getNombre() + " " +gene.getApellido() + " Edad: " + gene.getEdad() + " curso " + gene.getCurso());
		System.out.println("Nombre completo: " + gabo.getNombre() + " " + gabo.getApellido() + " Edad: " + gabo.getEdad() + " Curso: " + gabo.getCurso());// get para obtener el atributo que tiene asignado mi variable
		System.out.println("nombre completo: " + cata.getNombre()+" "+ cata.getApellido() + " Edad: " + cata.getEdad() + " Curso: " + cata.getCurso());
		System.out.println("Nombre completo: " + carlos.getNombre()+" " + carlos.getApellido() + " - Edad: " + carlos.getEdad() + " - Curso: " + carlos.getCurso() );
		System.out.println("Nombre completo: " + nico.getNombre() +" "+ nico.getApellido() + " Edad: " + nico.getEdad() + " Curso: " + nico.getCurso());
		System.out.println("*********************************");
		
		System.out.println(gene.toString());
		
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getNombre()+ " " + listaAlumnos.get(i).getApellido() );
			
		}

		for (Alumno objAlumnos : listaAlumnos) {
			//System.out.println(objAlumnos.getNombre());
			//System.out.println(objAlumnos.getCurso());
			System.out.println(objAlumnos.toString());
		}
	}

}
