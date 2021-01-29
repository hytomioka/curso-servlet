<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- "c:url" retorna a localizacao do recurso, neste caso: /gerenciador/novaEmpresa -->
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletNovaEmpresa}" method="post">
		<!-- Cabeçalho "Nome da Empresa" aparece no corpo do browser  --> 
		<!-- "name" em input precisa receber o parâmetro "nome", presente no getParameter() -->
		Nome da Empresa: <input type="text" name="nome">
		
		<!-- "submit" é o botão padrão -->
		<input type="submit">

	</form>
</body>
</html>