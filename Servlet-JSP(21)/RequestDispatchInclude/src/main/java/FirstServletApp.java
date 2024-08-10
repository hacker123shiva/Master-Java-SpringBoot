import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
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
		PrintWriter pw=response.getWriter();
		pw.println("Before dispatching");
		RequestDispatcher rdsp=request.getRequestDispatcher("/SecondServletApp");
		rdsp.include(request, response);
		
	
		pw.println("After  response come, Name from 1st : "+name);
		pw.println("After response come, dispatching City from 1st: "+city);
		
		//use html tag for formating
//		pw.println("<h1> Name is : "+name+"</h1>");
//		pw.println("<h1> City is :"+city+"</h1>");
		
		pw.close();
      
	}


}
