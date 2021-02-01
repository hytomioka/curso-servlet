package com.tomioka.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Simulação de um banco de dados a partir de um modelo */
public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	/* Adiciona as empresas assim que o servidor é iniciado */
	static {
		Empresa emp1 = new Empresa();
		emp1.setNome("Intel");
		emp1.setId(chaveSequencial++);
		Empresa emp2 = new Empresa();
		emp2.setNome("GeForce");
		emp2.setId(chaveSequencial++);
		lista.add(emp1);
		lista.add(emp2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
		System.out.println("Empresa com o nome de " + empresa.getNome() + " adicionada no banco de dados");

	}
	
	public void remove(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				lista.remove(empresa);
				break;
			}
		}
	}
	/* Maneira rustica de escrever o metodo "remove". Remove ou adiciona um item na colecao sem haver
	 * necessidade de implementar o "break" */
	public void remove2(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		
		while (it.hasNext()) {
			Empresa emp = it.next();
			
			if (emp.getId() == id) {
				it.remove();
			}
		}
	}

	public static List<Empresa> getLista() {
		return lista;
	}

}
