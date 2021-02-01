package com.tomioka.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/atualizaEmpresa")
public class AtualizaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = (String) request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		String nomeEmpresa = request.getParameter("nome");
		String dataAberturaString = request.getParameter("dataAbertura");
		
		Date dataAbertura = null;
		
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataAberturaString);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		banco.atualiza(id, nomeEmpresa, dataAbertura);
		
		response.sendRedirect("listaEmpresas");
		
		
	}

}
