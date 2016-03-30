<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de clientes</title>
</head>
<body>
  <h2>
    <s:property value="mensagem"/>
  </h2>
  <a href="editaCliente">Novo Contato</a>
  <table>
    <thead>
      <tr>
        <th>Nome</th>
        <th>E-Mail</th>
        <th colspan="2">Acoes</th>
      </tr>
    </thead>
    <s:iterator value="clientes" status="idCliente">
      <s:if test="#idCliente.even == true">
        <s:set var="bgColor" value="%{'aaee88'}" />
  	  </s:if>
  	  <s:else>
  	    <s:set var="bgColor" value="%{'ffffff'}" />
  	  </s:else>
  	  <tr bgcolor="<s:property value="bgColor"/>">
  	    <td><s:property value="nome"/></td>
  	    <td>
		  <s:if test="%{email != '' && email != null}">
  			<a href="mailto:'<s:property value="email"/>'">
  			  <s:property value="email"/>
  			</a>
  		  </s:if>
  		  <s:else>
			E-mail nao informado
		  </s:else>
            </td>
			<s:url id="editar" action="editaCliente" var="editUrl">
				<s:param name="idCliente">
					<s:property value="idCliente" />
				</s:param>
			</s:url>
			<s:url id="remover" action="removeCliente" var="removeUrl">
				<s:param name="idCliente">
					<s:property value="idCliente" />
				</s:param>
			</s:url>
		<td>
		  <a href='<s:property value="#editUrl"/>'>Editar</a>
	    </td>
	    <td>
	      <a href='<s:property value="#removeUrl"/>'>Remover</a>
	    </td>
  	  </tr>
  	</s:iterator>
  </table>
</body>
</html>