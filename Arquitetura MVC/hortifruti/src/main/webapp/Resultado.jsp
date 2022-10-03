<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Arquitetura MVC</title>
</head>
<body>
<h1 align="center">Resultados das frutas escolhidas - JSP</h1>
<p>

<%

	List estilos = (List)request.getAttribute("estilos");
	Iterator i =estilos.iterator();
	while(i.hasNext())
	{out.print("<br> fruta escolhida no JSP = "+ i.next());}

%>


</body>
</html>