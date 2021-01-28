package com.tomioka.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

/* Simulação de um banco de dados a partir de um modelo */
public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	/* Adiciona as empresas assim que o servidor é iniciado */
	static {
		Empresa emp1 = new Empresa();
		emp1.setNome("Intel");
		Empresa emp2 = new Empresa();
		emp2.setNome("GeForce");
		lista.add(emp1);
		lista.add(emp2);
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		System.out.println("Empresa com o nome de " + empresa.getNome() + " adicionada no banco de dados");

	}

	public static List<Empresa> getLista() {
		return lista;
	}

}
