package com.generation.f20220601.modelos;

//La palabra extends, significa que estamos usando la herencia
public class Perro extends Mascota {
	private Integer cantPaseos;
	private Float tamanioHocico;
	private String sonidoVocal;
	
	public Perro() {
		super();
	}

	public Perro(Integer cantPaseos, Float tamanioHocico, String sonidoVocal) {
		super();
		this.cantPaseos = cantPaseos;
		this.tamanioHocico = tamanioHocico;
		this.sonidoVocal = sonidoVocal;
	}

	public Integer getCantPaseos() {
		return cantPaseos;
	}

	public void setCantPaseos(Integer cantPaseos) {
		this.cantPaseos = cantPaseos;
	}

	public Float getTamanioHocico() {
		return tamanioHocico;
	}

	public void setTamanioHocico(Float tamanioHocico) {
		this.tamanioHocico = tamanioHocico;
	}

	public String getSonidoVocal() {
		return sonidoVocal;
	}

	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}

	@Override//Sobre Escribiendo el metodo
	
	public String toString() {
		return "Perro [cantPaseos=" + cantPaseos + ", tamanioHocico=" + tamanioHocico + ", sonidoVocal=" + sonidoVocal
				+ "]" + super.toString();
	}
	
	public void hacerSonido() {
		System.out.println("Guau Guau");
	}
	
	
	
	
	
	
	
	
}
