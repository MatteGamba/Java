package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ricetta;
import service.RicetteService;

import java.io.IOException;

@WebServlet("/ricette")
public class RicetteMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RicetteService service;

	public RicetteMVC() {
		this.service = new RicetteService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("nome") != null && request.getParameter("regione") !=null) {
			this.service.addRicetta(new Ricetta(request.getParameter("nome"), request.getParameter("regione")));
		}	
		doGet(request, response);
	}

}
