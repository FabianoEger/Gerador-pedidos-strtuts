<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <s:head/>
    <title>Edita cliente</title>
    <link href="css/jquery-ui.css" rel="stylesheet">
    <script src="js/jquery.js"></script>
    <script src="js/jquery-ui.js"></script>
  </head>
  <body>
    <h1>Adiciona cliente</h1>
    <hr/>
    <s:form action="criaEditaCliente" method="post">
    	<s:textfield key="cliente.nome" label="Nome" />
    	<s:textfield key="cliente.email" label="E-mail" />
    	
    	<s:if test="#idCliente != 0">
    		<s:hidden key="idCliente" />
    	</s:if>
    	<s:submit value="Gravar" /> 
    </s:form>
  </body>
</html>