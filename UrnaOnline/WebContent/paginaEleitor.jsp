<%@page import="servelet.UpdatesServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página Eleitor</title>
</head>


<head>
<link href="css/paginaEleitor.css" rel="stylesheet">
</head>
<body>
	<form class="boxEleitor" action="updateServelet" method="post">
		<h1>Página do Eleitor</h1>
		<div class="itens">
			<h2 id="nome"></h2>
			<h2 id="partido"></h2>
			<div id="candidato">
				<img id="imagens"
					src="https://www.politize.com.br/wp-content/uploads/2016/07/paulo-candidato-eleicoes-politize-e1470154748570.png"
					width="280" height="230" />
			</div>
			<h2>Número do Candidato</h2>
			<label for="txtNUMERO_CANDIDATO"> <input id="numero"
				type="text" size="18" style="text-align: center; height: 30px"
				name="txtNUMERO_CANDIDATO" required />
			</label>
			<table class="tabela">
				<tr>
					<td><input name="votar" type="submit" value="Votar" onClick="voto()" /></td>
					<td><input type="button" onclick="redirecionar()" value="Sair" /></td>
				</tr>
			</table>
		</div>
	</form>

	<script type="text/javascript">
		document.getElementById("numero").addEventListener("input", criar10btn);
		function criar10btn() {
			if (document.getElementById("numero").value == "17") {
				document.getElementById("nome").innerHTML = "Bolsonaro"
				document.getElementById("partido").innerHTML = "PSL - Partido Social Liberal"
				document.getElementById("imagens").src = 'https://i.pinimg.com/originals/00/af/25/00af25219c9f96c6db013a2307048f54.gif';
			} else if (document.getElementById("numero").value == "13") {
				document.getElementById("nome").innerHTML = "Fernando Haddad"
				document.getElementById("partido").innerHTML = "PT - Partido dos Trabalhadores"
				document.getElementById("imagens").src = 'https://i.pinimg.com/originals/1c/e2/1f/1ce21f8f373dbdf3819e25d2536a171b.gif';
			} else if (document.getElementById("numero").value == "18") {
				document.getElementById("nome").innerHTML = "Marina Silva"
				document.getElementById("partido").innerHTML = "REDE - Rede Sustentabilidade"
				document.getElementById("imagens").src = 'https://especiais.gazetadopovo.com.br/eleicoes/2018/wp-content/themes/eleicoes-2018/img/propostas/animacoes/marina-silva.gif';
			} else if (document.getElementById("numero").value == "12") {
				document.getElementById("nome").innerHTML = "Ciro Gomes"
				document.getElementById("partido").innerHTML = "PDT - Partido Democrático Trabalhista"
				document.getElementById("imagens").src = 'https://especiais.gazetadopovo.com.br/eleicoes/2018/wp-content/themes/eleicoes-2018/img/propostas/animacoes/ciro-gomes.gif';
			} else if (document.getElementById("numero").value == "51") {
				document.getElementById("nome").innerHTML = "Cabo Daciolo"
				document.getElementById("partido").innerHTML = "PATRI - Patriota"
				document.getElementById("imagens").src = 'https://especiais.gazetadopovo.com.br/eleicoes/2018/wp-content/themes/eleicoes-2018/img/propostas/animacoes/cabo-daciolo.gif';
			}
		};
	</script>
	<script type="text/javascript">
		function redirecionar() {
			alert("Obrigada por colaborar com a votação.");
			window.location.href = "login.jsp";
		}
		function voto() {
			alert("Voto computado com sucesso!");
		}
	</script>
</body>
</html>

