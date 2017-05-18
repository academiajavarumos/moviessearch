package pt.rumos.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.rumos.model.ApiCallService;
import pt.rumos.model.NewReleasesResponse;


@WebServlet("/MovieServlet")
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public MovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	ApiCallService newCall =  new ApiCallService();
	NewReleasesResponse moviesListResponse = newCall.ApiCall();
	
	request.setAttribute("data", moviesListResponse.getFilms());
	request.getRequestDispatcher("films.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//request.getRequestDispatcher("/index.jsp").forward(request, response);

}
}