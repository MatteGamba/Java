package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;

import java.io.IOException;

/**
 * Servlet implementation class Canzoni
 */

@WebServlet("/canzoniMVC")
public class Canzoni extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private JukeBox jukebox;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Canzoni() {
    	this.jukebox = new JukeBox();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StringBuilder sb = new StringBuilder();
		for(Canzone c : this.jukebox.tutteLeCanzoni()) {
			sb.append(c);
		}
		
		response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
