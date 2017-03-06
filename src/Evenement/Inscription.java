package Evenement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String nom;
	private Vector invites = new Vector();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType( "text/html" );
		PrintWriter out = response.getWriter();
		ServletContext contexte = getServletContext();
		out.println("<FORM ACTION='Inscription' METHOD='get'>");
		out.println("<INPUT NAME='nom' TYPE='text'/>");
		out.println("<INPUT TYPE='submit' VALUE='nouvel inscrit'/>" );
		out.println("</FORM>");
		
		out.println("<FORM ACTION='Invites' METHOD='get'>");
		out.println("<INPUT TYPE='submit' VALUE='List nouvel inscrit'/>" );
		out.println("</FORM>");
		invites.add(request.getParameter("nom"));
		contexte.setAttribute("invites",invites);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		// TODO Auto-generated method stub
	}

}
