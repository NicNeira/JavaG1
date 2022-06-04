package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		// **Herencia**

		// Instancias
		Mascota mascota = new Mascota();
		mascota.setColor("Gris");
		mascota.setNombre("Tom");

		Perro perro = new Perro();
		perro.setColor("RedFaund");
		perro.setNombre("ayun");

		Gato gato = new Gato();
		gato.setEspecie("Felino");
		gato.setPelaje("pelo");
		gato.setPeso(3);

		Mishi mishi = new Mishi(true);
		mishi.setColor("amarillo");

		// System.out.println(gato.toString());
		System.out.println("Mishi " + mishi.toString());// El toString se puede heredar

		// **Polimorfismo**
		List<Mascota> listaMascotas = new ArrayList<Mascota>();// Creacion de arreglo
		// Creacion de objeto
		Mascota regalon = new Mascota("negro", "Canne", "Pelo", "Firulais", 1.5f, "macho");

		listaMascotas.add(regalon);

		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setPeso(3);
		listaMascotas.add(felix);

		Mascota chocolo = new Perro();
		chocolo.setNombre("Chocolo");
		chocolo.setColor("Cafe");
		chocolo.setPeso(10);
		listaMascotas.add(chocolo);
		System.out.println("*********************");
		// Muchas formas de respuesta
		regalon.hacerSonido();// Llamando al metodo en mascota
		felix.hacerSonido();
		chocolo.hacerSonido();
		System.out.println("*********************");

		// Recorro el arreglo
		for (Mascota mascota2 : listaMascotas) {
			mascota2.hacerSonido();
		}

		// Transformar el objeto generico a uno especifico
		Perro perroChocolo = (Perro) chocolo;
		perroChocolo.setCantPaseos(6);

	}

}
