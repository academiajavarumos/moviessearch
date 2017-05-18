package pt.rumos.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.rumos.model.WeekMoviesService;
import pt.rumos.model.NewReleasesResponse;



@WebServlet("/WeekMovieServlet")
public class WeekMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public WeekMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	WeekMoviesService newCall =  new WeekMoviesService();
	NewReleasesResponse moviesListResponse =newCall.ApiCall();
	
	request.setAttribute("data", moviesListResponse.getFilms());
	request.getRequestDispatcher("films.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

}
}