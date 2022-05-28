package com.generation.f20220527;

import java.util.HashMap;
import java.util.Scanner;

public class MenusCasino {

	public static void main(String[] args) {
		HashMap objHashMap = new HashMap();
		Scanner sc = new Scanner(System.in);
		String platoUsuario;

		// Agregando keys y values al objHasMap .put
		objHashMap.put("comida1", "pastel de choclo");
		objHashMap.put("comida2", "humitas");
		objHashMap.put("comida3", "porotos con riendas");
		objHashMap.put("comida4", "sopaipilla pasadas <3");
		objHashMap.put("comida5", "milanesa con pure");

		System.out.println("Platos disponible Casino Grupo2");
		System.out.println("Los platos disponible son: " + objHashMap);
		// {menu1="",menu2=""}
		
		System.out.println("¿Que menu quiere?");
		platoUsuario = sc.next();

		System.out.println("El Menu elegido fue: " + objHashMap.get(platoUsuario));

		
	}

}
