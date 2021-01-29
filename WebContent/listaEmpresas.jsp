<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.tomioka.gerenciador.servlet.Empresa"%>
<!-- importa a biblioteca JSTL Core, adicionando um prefixo para utiliza��o de seus m�todos -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem das Empresas no Banco</title>
</head>
<body>
	<br> Lista de Empresas
	</br>
	<ul>
		<!-- la�o de itera��o for do HTML. tag "items" � a lista a ser percorrida. tag "var" � a variavel de itera��o -->
		<c:forEach items="${ empresas }" var="empresa">
			<li>${ empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/></li>

		</c:forEach>
	</ul>

</body>
</html>