<%@page isErrorPage="true"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<head>
<link href="css/errodeusuario.css" rel="stylesheet">
</head>
<body class="boxerro">
<body>
	<div align="center">
		<div id="cabecalho"></div>
		<div id="corpo">

			<img src="imagens/erro1.jpg" />
			<hr />
			Error :
			<%=exception.getMessage() %><br /> Exceção ocorrida :
			<%=exception.getClass() %>
			<br />
			<hr />
			<a href="login.jsp">Tentar Novamente</a>

		</div>
		<div id="rodape"></div>

	</div>

</body>
</html>