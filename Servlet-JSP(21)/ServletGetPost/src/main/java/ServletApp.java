import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 

 
@WebServlet("/servletapp")
public class ServletApp extends HttpServlet {
	 
    public ServletApp() {
        System.out.println("Internally constructor called");
    }
    
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//     
//		String name=request.getParameter("uname");
//		String city=request.getParameter("ucity");
//		
//		PrintWriter pw=response.getWriter();
//		pw.println("Name is : "+name);
//		pw.println("City is : "+city);
//		
//		//use html tag for formating
////		pw.println("<h1> Name is : "+name+"</h1>");
////		pw.println("<h1> City is :"+city+"</h1>");
//		
//		pw.close();
//      
//	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		String name=request.getParameter("uname");
		String city=request.getParameter("ucity");
		
		PrintWriter pw=response.getWriter();
		pw.println("Name is : "+name);
		pw.println("City is : "+city);
		
		//use html tag for formating
//		pw.println("<h1> Name is : "+name+"</h1>");
//		pw.println("<h1> City is :"+city+"</h1>");
		
		pw.close();
      
	}


}
