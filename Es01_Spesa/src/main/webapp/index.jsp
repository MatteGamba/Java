<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>

<% if (request.getParameter("action") != null){%>

	<% if (request.getParameter("action").equals("addSpesa")){ %>
			<%@ include file="form_spesa.jsp" %>
	<% } %>
		
	<% if (request.getParameter("action").equals("ListSpesa")){ %>
		<%@ include file="list_spesa.jsp" %>
	<% } %>
	
	<% if (request.getParameter("action").equals("completa")){ %>
		<%@ include file="completa.jsp" %>
	<% } %>
		
		
		
<%} else { %>

<%@ include file="homepage.html" %>

<%} %>

<%@ include file="footer.jsp" %>