

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	 

 
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String name=request.getParameter("uname");
		String email=request.getParameter("uemail");
		String password=request.getParameter("upassword");
		String city=request.getParameter("ucity");
		
		
		
		try {
			//loading and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/telusko_db";
			String username="root";
			String passwd="root";
			//create connection 
			Connection connt=DriverManager.getConnection(url,username,passwd);
			
			String query = "INSERT INTO PERSONINFO (UNAME, EMAIL,UPASSWORD, UCITY) VALUE(?,?,?,?)";
			PreparedStatement pstmt=connt.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, city);
			
			int rowAff=pstmt.executeUpdate();
			PrintWriter pw=response.getWriter();
			if(rowAff!=0) {
				pw.println("<h1> Data inserted Succesfully");
			}else {
				pw.println("<h1> Data not inserted</h1>");
			}
			pw.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			 
			e.printStackTrace();
		}
		
	}

}
