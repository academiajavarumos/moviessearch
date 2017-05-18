package pt.rumos.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pt.rumos.model.NewReleasesResponse;
import pt.rumos.model.PopularMoviesService;


@WebServlet("/PopularMoviesServlet")
public class PopularMoviesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PopularMoviesServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PopularMoviesService popCall = new PopularMoviesService();
		NewReleasesResponse moviesListResponse =popCall.ApiCall();
		
		request.setAttribute("data", moviesListResponse.getFilms());
		request.getRequestDispatcher("popularMovies.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
