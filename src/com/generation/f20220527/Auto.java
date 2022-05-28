package com.generation.f20220527;

public class Auto {
	//Definicion de clase es un modelo o prototipo para crear objetos
	//Objeto, nace apartir de la clase, caracteristicas o atributo
	//tiene metodos o funciones
	//Algo concreto, lo convertimos en abstracto (no tangible)
	//Tangible: usamos los 5 sentidos para describir


	//atributo
	//accesador | tipo | nombreDelAtributo
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;
	
	
	
	//CONSTRUCTORES
	
	//constructor vacio
	public Auto() {
		super();
	}
	
	
	//Constructor con parametros
	public Auto(String color, String marca, String modelo, Double velocidad) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
		
		
	}
	//accesadores y mutadores (get y set)


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	//metodos o funciones personalizadas
	
	//Las funciones dentro de un objeto no llevan el static
	public void aumentarVelocidad() {
		this.velocidad = 10d; //d o la minusculas para castear automaticamente
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//***ATRIBUTO DE COLABORACION*******
	//Es tomar un objeto y usarlo como atributo







}
