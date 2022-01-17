<%@page import="model.Libro"%>
<%@page import="controller.LibreriaCtrl"%>
<h2>Elenco libri</h2>

<table>
<tr>
	<th>Titolo</th>
	<th>Prezzo</th>
</tr>
<%	for (Libro l : LibreriaCtrl.getLibri()){%>
<tr>
	<td><%= l.getTitolo() %></td>
	<td><%= l.getPrezzo() %></td>
</tr>
<%} %>
</table>