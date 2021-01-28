package com.tomioka.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

/* Simulação de um banco de dados a partir de um modelo */
public class Banco {

	private static List<Empresa> lista = new ArrayList<>();

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		System.out.println("Empresa com o nome de " + empresa.getNome() + " adicionada no banco de dados");

	}

	public static List<Empresa> getLista() {
		return lista;
	}

}
