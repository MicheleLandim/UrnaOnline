<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,
                  dao.RelatorioDAO,
                  dados.Candidatos"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�gina Chefe</title>
</head>

<head>
<link href="css/paginaChefe.css" rel="stylesheet">
</head>

<body> 
<form class="boxChefe" method="post">
<h1>P�gina do Chefe de Se��o</h1>
		<fieldset>
			<legend><strong>Resultado da Vota��o</strong></legend> 
				<table><!-- align="center" border="1px" width="80%" -->
					<tr>
						<th>N�mero do candidato</th>
						<th>Nome do candidado</th>
						<th>Quantidade de votos</th>
					</tr>
					<%
					RelatorioDAO dao = new RelatorioDAO();
					List<Candidatos> candidato = dao.getLista();
					for (Candidatos x: candidato){
					%>
					<tr>
						<th><%= x.getNumero() %></th>
						<th><%= x.getNome() %></th>
						<th><%= x.getVotos() %></th> 
						</tr>
					<%
							}
					%>
				<tr> 
					<td><input type="button" onclick="redirecionar()" value="Sair" /></td>
				</tr>
				</table>
		</fieldset>
		</form>
		
		<script type="text/javascript">
		function redirecionar() {
			alert("Voc� ser� direcionado para a p�gina de login.");
			window.location.href = "login.jsp";
		}
		</script>

</body>
</html>