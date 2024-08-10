import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 

 
@WebServlet("/firstservlet")
public class FirstServletApp extends HttpServlet {
	 
    public FirstServletApp() {
        System.out.println("Internally constructor called");
    }
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		String name=request.getParameter("uname");
		String city=request.getParameter("ucity");
 
       response.sendRedirect("/FirstDynamicWebProject/success.jsp");
	}


}
