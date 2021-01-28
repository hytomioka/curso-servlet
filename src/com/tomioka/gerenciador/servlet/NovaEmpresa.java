package com.tomioka.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/* m�todo doPost() s� aceita requisi��es do tipo POST */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeEmpresa = request.getParameter("nome");

		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		System.out.println("Nova empresa cadastrada");

		Banco banco = new Banco();
		banco.adiciona(empresa);

		PrintWriter out = response.getWriter();
		out.println("Empresa " + nomeEmpresa + " cadastrada com sucesso.");

	}

}
