

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
 
 
@WebServlet("/FirstServletApp")
public class FirstServletApp extends HttpServlet {
 

public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name=request.getParameter("uname");
		 String city=request.getParameter("ucity");
		 
		 
		  HttpSession session=request.getSession();
		  session.setAttribute("city",city);
		  session.setAttribute("name", name);
		  
		  response.sendRedirect("SecondServletApp");
	}

}
