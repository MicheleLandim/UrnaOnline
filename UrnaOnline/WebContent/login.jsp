<%@page import="servelet.LoginServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript">
  function validarLogin(){
	if(document.formLogin.txtCOD_TITULO.value==""){
		alert("Campo Usu�rio N�o Informado");  
		return false;
	} 
	if(document.formLogin.txtSENHA.value==""){ 
		alert("Campo Senha N�o Informado");
		return false;
	} 
	
	document.formLogin.submit();
  }
</script>
<head>
<link href="css/login.css" rel="stylesheet">
</head>
<title>Acessar</title>
<body>
	<form id="fundo" class="box" name="formlogin" action="LoginServelet"
		method="post">
		<h1>P�gina de Login</h1>
		<input type="text" name="txtCOD_TITULO"
			placeholder="N�mero do T�tulo de Eleitor" /> <input type="password"
			name="txtSENHA" placeholder="Senha" /> <select class="basic"
			id=opcao name=opcao>
			<option value="0">Selecione seu n�vel</option>
			<option value="1">Eleitor</option>
			<option value="2">Mes�rio</option>
			<option value="3">Chefe de se��o</option>
		</select> <input type="submit" onclick="validarLogin()" value="Entrar" />
	</form>

</body>
</html>