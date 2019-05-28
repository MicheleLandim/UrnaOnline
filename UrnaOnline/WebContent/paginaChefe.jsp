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
<title>Página Chefe</title>
</head>

<head>
<link href="css/paginaChefe.css" rel="stylesheet">
</head>

<body> 
<form class="boxChefe" method="post">
<h1>Página do Chefe de Seção</h1>
		<fieldset>
			<legend><strong>Resultado da Votação</strong></legend> 
				<table><!-- align="center" border="1px" width="80%" -->
					<tr>
						<th>Número do candidato</th>
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
			alert("Você será direcionado para a página de login.");
			window.location.href = "login.jsp";
		}
		</script>

</body>
</html>