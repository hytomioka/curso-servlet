<% 
	// "scriplet"
	String nomeEmpresa = (String) request.getAttribute("empresa");
	// System.out.println(nomeEmpresa);
%>

<html>
<body>
<!-- Empresa <% out.println(nomeEmpresa); %> cadastrada -->
<!-- ou através do atalho -->
Empresa <%= nomeEmpresa %> cadastrada com sucesso.
</body>
</html>