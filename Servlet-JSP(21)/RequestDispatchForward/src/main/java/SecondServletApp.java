

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 
@WebServlet("/SecondServletApp")
public class SecondServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public SecondServletApp() {
        System.out.println("SecondServletApp created");
    }

 
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String city=request.getParameter("ucity");
		
		PrintWriter pw=response.getWriter();
		pw.println("Name from 2nd : "+name);
		pw.println("City from  2nd: "+city);
		
		pw.close();
		
		
	}

}
