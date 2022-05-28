package com.generation.f20220527;

public class Alumno {

	// atributo
	// accesador | tipo | nombreDelAtributo
	private String curso;
	private String nombre;
	private String apellido;
	private Integer rut;
	private Double promedio;

	// CONSTRUCTORES

	// constructor vacio
	public Alumno() {
		super();
	}

	// Constructor con parametros
	public Alumno(String curso, String nombre, String apellido, Integer rut, Double promedio) {
		super();
		this.curso = curso;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.promedio = promedio;
	}

	// accesadores y mutadores (get y set)
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

}
