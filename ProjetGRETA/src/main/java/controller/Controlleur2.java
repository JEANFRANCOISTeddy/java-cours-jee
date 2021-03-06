package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Matiere;

/**
 * Servlet implementation class Controlleur2
 */
@WebServlet("/Controlleur2")
public class Controlleur2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlleur2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter( "txtNom" );
        String nb_heures = request.getParameter( "txtNbHeures" );
        
        if(nom == null) {
        	getServletContext().getRequestDispatcher("/Form").
            include(request,response);
        }
        
        HttpSession session = request.getSession();
        session.setAttribute("nom", nom);
        
        Matiere m = new Matiere(nom, nb_heures);
        
    	getServletContext().getRequestDispatcher("/View3").
        include(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


