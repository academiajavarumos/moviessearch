package pt.rumos.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.rumos.model.NewReleasesResponse;
import pt.rumos.model.SearchMovieService;


@WebServlet("/FindMovieServlet")
public class FindMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FindMovieServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String userQuery = request.getParameter("textinput");    
	    SearchMovieService newSearch = new SearchMovieService();
	    NewReleasesResponse queryResult = newSearch.searchMovie(userQuery); 
	    
		request.setAttribute("filmsResult", queryResult.getFilms() );
		request.getRequestDispatcher("SearchMovie.jsp").forward(request, response);

		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
