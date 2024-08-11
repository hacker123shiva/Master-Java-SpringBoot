

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=     request.getSession();
		 session.setAttribute("degree", "B.Tech CSE");
		 session.setAttribute("gender", "Male");
	}

}
