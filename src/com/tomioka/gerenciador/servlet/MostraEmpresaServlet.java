package com.tomioka.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraEmpresaServlet
 */
@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = (String) request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		Banco banco = new Banco();
		Empresa empresa = banco.busca(id);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formAtualizaEmpresa.jsp");
		request.setAttribute("empresa", empresa);
		rd.forward(request, response);
		
	}


}
