<%@page import="model.Spesa"%>
<%@page import="controller.SpesaCtrl"%>
<h2>Elenco Spesa</h2>

<table>
<tr>
	<th>Descrizione</th>
	<th></th>
</tr>
<%	for (Spesa sp : SpesaCtrl.getSpesa()){ %>
<tr>
	<td><%= sp.getDescrizione() %></td>
	<td><input type="checkbox"></td>
</tr>
	
<%} %>
</table>

