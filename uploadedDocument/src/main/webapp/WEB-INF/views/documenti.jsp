<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

	img{
	width: 140px;
	height:100px
	}

</style>
</head>
<body>

	<h1>Upload Docs</h1>
	
	<form action="docs" method="post" enctype="multipart/form-data">
		
		<input type="file" name="file">
		<input type="submit" value="Carica">
		
	</form>

	
	<% List<String> files = (List<String>)request.getAttribute("files"); %>
	
	<table>
	
	<% for(String file : files){ %>
			
	<tr>
		<td><%=file %></td>
	</tr>
	
	<%}%>
	
	</table>

</body>
</html>