<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>P�gina Mes�rio</title>
</head>
<head>
<link href="css/paginaMesario.css" rel="stylesheet">
</head>

<body>
	<form class="boxMesario" action="updateServelet" method="post">
	
		<h1>Formul�rio para liberar Eleitor</h1>

		<label for="txtCOD_TITULO"> <span>N�mero do t�tulo</span> <input
			type="text" id="titulo" name="txtCOD_TITULO" required maxlength="14" />
		</label> <label for="txtZONA"> <span>Zona</span> <input type="text"
			name="txtZONA" required maxlength="3" />
		</label> <label for="txtSECAO_ELEITORAL"> <span>Se��o Eleitoral</span>
			<input type="text" name="txtSECAO_ELEITORAL" required maxlength="4" />
		</label>

		<div>
			<input type="radio" name="PERMITE_VOTAR" value="S"> Liberado
			<br> <input type="radio" name="PERMITE_VOTAR" value="N">
			Bloqueado <br>
		</div>

		<table class="tabela">
			<tr>
				<td><input type="submit" onclick="alteracao()" value="Validar" /></td>
				<td><input type="button" onclick="redirecionar()" value="Sair" /></td>
			</tr>
		</table>
	</form>
	
		<script  type="text/javascript">
		function alteracao() {
			alert('Altera��o do Status do eleitor realizado com sucesso!');
			window.location.href = "paginaMesario.jsp";
		}

		function redirecionar() {
			alert('Voc� ser� direcionado para a p�gina de login.');
			window.location.href = "login.jsp";
	}
    </script>


</body>
</html>