<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
<!-- expression language ${atributo} busca o "atributo" dentro da requisição e exibe-o no corpo HTML -->
<c:if test="${not empty empresa}">
	Empresa ${empresa} cadastrada com sucesso.
</c:if>

<c:if test="${empty empresa}">
	Nenhuma empresa cadastrada.
</c:if>

</body>
</html>