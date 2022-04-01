<%@page import="controller.SpesaCtrl"%>


<% 
	String descrizione = null;
	
	if (request.getParameter("descrizione") != null){
		
		descrizione = request.getParameter("descrizione");		
	}
	
	if (descrizione != null){
		
		SpesaCtrl.addSpesa(descrizione);
	}
	
	response.sendRedirect("index.jsp?action=ListSpesa");
	
%>