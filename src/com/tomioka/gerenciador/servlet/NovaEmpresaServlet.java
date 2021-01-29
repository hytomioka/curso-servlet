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

	/* método doPost() só aceita requisições do tipo POST */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeEmpresa = request.getParameter("nome");
		String dataAberturaString = request.getParameter("dataAbertura");
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataAberturaString);
		} catch (ParseException e) {
			/* Caso o dataAbertura esteja inválido, para a execução */
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		System.out.println("Nova empresa cadastrada");

		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		/* Redirecionamento Client Side
		 * O servlet manda uma reposta de redirecionamento ao navegador, terminando a requisição */
		response.sendRedirect("listaEmpresas");
		
//		/* A requisição HTTP será despachada para outro arquivo */
		/* Redirecionamento Server Side */
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		/* A requição irá despachar o objeto empresa */
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
		
	}

}
