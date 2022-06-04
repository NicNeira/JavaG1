package com.generation.f20220601.modelos;

public class Gato extends Mascota {
	private Boolean garrasRetractil;
	private Boolean visionNocturna;
	private String sonidoVocal;

	public Gato() {
		super();
	}

	public Gato(Boolean garrasRetractil, Boolean visionNocturna, String sonidoVocal) {
		super();
		this.garrasRetractil = garrasRetractil;
		this.visionNocturna = visionNocturna;
		this.sonidoVocal = sonidoVocal;
	}

	public Boolean getGarrasRetractil() {
		return garrasRetractil;
	}

	public void setGarrasRetractil(Boolean garrasRetractil) {
		this.garrasRetractil = garrasRetractil;
	}

	public Boolean getVisionNocturna() {
		return visionNocturna;
	}

	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}

	public String getSonidoVocal() {
		return sonidoVocal;
	}

	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}

	/*
	 * @Override//SobreEscritura public String toString() { return
	 * "Gato [garrasRetractil=" + garrasRetractil + ", visionNocturna=" +
	 * visionNocturna + ", sonidoVocal=" + sonidoVocal + "]" + " " +
	 * super.toString(); }
	 */

	public void hacerSonido() {
		System.out.println("miauuuu ");
	}

}
