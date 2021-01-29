package com.tomioka.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/* m�todo doPost() s� aceita requisi��es do tipo POST */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeEmpresa = request.getParameter("nome");
		String dataAberturaString = request.getParameter("dataAbertura");
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataAberturaString);
		} catch (ParseException e) {
			/* Caso o dataAbertura esteja inv�lido, para a execu��o */
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		System.out.println("Nova empresa cadastrada");

		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		/* Redirecionamento Client Side
		 * O servlet manda uma reposta de redirecionamento ao navegador, terminando a requisi��o */
		response.sendRedirect("listaEmpresas");
		
//		/* A requisi��o HTTP ser� despachada para outro arquivo */
		/* Redirecionamento Server Side */
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		/* A requi��o ir� despachar o objeto empresa */
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
		
	}

}
