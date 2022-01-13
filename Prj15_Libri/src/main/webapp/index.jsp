
<!DOCTYPE html>
<%@page import="model.Libri"%>
<%@page import="controller.LibriCtrl"%>
<html>
<head>
<meta charset="UTF-8">
<title>Libreria</title>
<style type="text/css">
	h2 {
	color:red;
}
</style>
</head>
<body>

<h1>Libreria</h1>



<form action="">

	<input type="text" name="titolo" placeholder="Inserisci Titolo">
	<input type="text" name="prezzo" placeholder="Inserisci Prezzo">
	<input type="submit" value="Aggiungi Libro">
</form>


<%

	LibriCtrl controller = new LibriCtrl();

%>

<%

	if(request.getParameter("titolo") != null){
		String titolo = request.getParameter("titolo");
		//Libri libri = new Libri(titolo,10);
		controller.addLibro(titolo, 10);
	}

%>

<%

	for (Libri l:controller.getLibri()){ 
%>

	<h2><%= l.getTitolo() %></h2>

<%
	} 
%>
</body>
</html>