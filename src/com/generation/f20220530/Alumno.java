package com.generation.f20220530;

public class Alumno {

	// Estructura base
	// atributo
	// accesador | tipo | nombreDelAtributo
	// private //Protected o public (encapsulamiento) solamente accedemos dentro de
	// la misma clase
	// Public cualquiera que este dentro del package y desde cualquier parte

	private String nombre;
	private String apellido;
	private int edad;
	private String curso;

	// CONSTRUCTORES

	// constructor vacio
	public Alumno() { // Para asignar valores a nuestros atributos, Nosotros asignamos el contenido despues en otro momento
		super();
	}

	//Se crean para asignar valores a nuestro objeto
	
	// Constructor con parametros

	public Alumno(String nombre, String apellido, int edad, String curso) {//Le asignamos valores a todos los atributos, inmediatamente
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}

	// accesadores y mutadores (get y set)

	public String getNombre() {// get para obtener el valor que tiene asignado mi variable
		return nombre;
	}

	public void setNombre(String nombre) {//Para asiganar un valor dentro de la variable
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// Funciones / Metodo
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}
	
}
