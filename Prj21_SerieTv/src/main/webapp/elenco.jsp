<%@page import="model.Serie"%>
<%@page import="java.util.List"%>
<h1>Le nostre Serie TV</h1>

<table>

	<tr>
		<th>Titolo</th>
		<th>Genere</th>
	</tr>

<%  List<Serie> elenco = (List<Serie>) request.getAttribute("elenco");       %>

<% for (Serie s : elenco) {   %>

	<tr>
		<td> <%= s.getTitolo() %> </td>
		<td><a href = "?genere=<%= s.getGenere() %>"> <%= s.getGenere() %> </a> </td>
	</tr>

<%} %>
</table>