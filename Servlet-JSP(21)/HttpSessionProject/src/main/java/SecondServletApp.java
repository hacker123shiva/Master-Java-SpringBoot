

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
 
@WebServlet("/SecondServletApp")
public class SecondServletApp extends HttpServlet {
 
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession(false);
		 
		 String name=(String)session.getAttribute("name");
		 String city=(String)session.getAttribute("city");
		 
		 
		 PrintWriter pw=response.getWriter();
		 pw.println("<h1> Name is "+name);
		 pw.println("<h1> City is "+city);
		 
		 pw.close();
	}

}
