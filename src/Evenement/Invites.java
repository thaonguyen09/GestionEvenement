package Evenement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Invites
 */
@WebServlet("/Invites")
public class Invites extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType( "text/html" );
		PrintWriter out = response.getWriter();
		ServletContext contexte = getServletContext();
		Vector invites = (Vector)contexte.getAttribute("invites");
		Enumeration e = invites.elements();
		out.println( "Liste des inscrits : " );
		while (e.hasMoreElements()){
			out.println(e.nextElement());
			out.println("<br/>");
		}

		
		out.println("<FORM ACTION='Inscription' METHOD='get'>");
		out.println("<INPUT TYPE='submit' VALUE='Inscrire un nouvel inscrit'/>" );
		out.println("</FORM>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
