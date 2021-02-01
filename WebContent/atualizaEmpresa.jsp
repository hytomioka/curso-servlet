<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/atualizaEmpresa" var="LinkServletAtualizaEmpresa"/>
<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" var="dataAbertura"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${LinkServletAtualizaEmpresa}?id=${empresa.id}" method="post">
		
		Nome da empresa: <input type="text" name="nome" value="${empresa.nome}">
		Data de abertura: <input type="text" name="dataAbertura" value="${dataAbertura}">
		
		<input type="submit">
	
	</form>
</body>
</html>