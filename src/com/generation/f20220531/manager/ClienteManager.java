package com.generation.f20220531.manager;

import java.util.List;

import com.generation.f20220531.Cliente;

public class ClienteManager {
	// Funcion que permita recorrer el arreglo e imprimir

	// void es para que no retorne nada solo imprima (parametros que recibe)
	public void recorrerArregloCliente(List<Cliente> listaCliente) {// List<Cliente> listaCliente con eso traemos la
																	// variable desde la classe Main
		// for (int i = 0; i < listaCliente.size(); i++) {
		// System.out.println(listaCliente.get(i).getNombre());
		System.out.println(listaCliente.toString());
		// }
	}

}