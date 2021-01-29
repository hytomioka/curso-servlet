<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.tomioka.gerenciador.servlet.Empresa" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem das Empresas no Banco</title>
</head>
<body>
<ul>
	<% 
		List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");
		for (Empresa empresa : lista) {
			out.println("<li>" + empresa.getNome() + "</li>");
		}
	%>

</ul>
</body>
</html>