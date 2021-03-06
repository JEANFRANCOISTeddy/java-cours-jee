package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter( "txtNom" );
        String nb_heures = request.getParameter( "txtNbHeures" );
        if ( nom == null ) nom = "";
        if ( nb_heures == null ) nb_heures = "";

        response.setContentType( "text/html" );
        try ( PrintWriter out = response.getWriter() ) {
            out.println( "<!DOCTYPE html>" );
            out.println( "<html>" );
            out.println( "    <body>" );
            out.println( "        <form method='GET' action='Controlleur2'>" );
            out.println( "            <label for='txtNom'>Nom </label>" ); 
            out.println( "            <input id='txtNom' name='txtNom' type='text' value='" + nom + "' autofocus /><br/>" );
            out.println( "            <label for='txtNbHeures'>Nb heures </label>" ); 
            out.println( "            <input name='txtNbHeures' type='text' value='" + nb_heures + "' /><br/>" );
            out.println( "            <br/>" );
            out.println( "            <input name='btnConnect' type='submit' value='Créer cette matière' /><br/>" );
            out.println( "        </form>" );
            
            out.println( "    </body>" );
            out.println( "</html>" );

        }    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
