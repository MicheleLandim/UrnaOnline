<%@page import="servelet.LoginServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript">
  function validarLogin(){
	if(document.formLogin.txtCOD_TITULO.value==""){
		alert("Campo Usuário Não Informado");  
		return false;
	} 
	if(document.formLogin.txtSENHA.value==""){ 
		alert("Campo Senha Não Informado");
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
		<h1>Página de Login</h1>
		<input type="text" name="txtCOD_TITULO"
			placeholder="Número do Título de Eleitor" /> <input type="password"
			name="txtSENHA" placeholder="Senha" /> <select class="basic"
			id=opcao name=opcao>
			<option value="0">Selecione seu nível</option>
			<option value="1">Eleitor</option>
			<option value="2">Mesário</option>
			<option value="3">Chefe de seção</option>
		</select> <input type="submit" onclick="validarLogin()" value="Entrar" />
	</form>

</body>
</html>