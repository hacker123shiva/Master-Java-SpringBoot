<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
</head>
<body>

<!-- Scriptlet tag  -->  
<%
int age = 22;
String name = "Shiva";
System.out.println("Name is " + name + " and age is " + age);
%>

<!-- Declaration tag -->
<%! 
private int x = 23;
private String secondName = "Harsh";
%>

<!-- Expression tag -->
<h1>My Second name is <%= secondName %></h1>

<!-- Directive tag -->
<%@ page import="java.util.Date" %>
<%
Date date = new Date();
%>
<h2>Today's date is <%= date %></h2>

<!-- Implicit object -->
<!-- Session object -->
<%
out.println("<h2>.................Session Object..............</h2>");
String degree = (String) session.getAttribute("degree");
String gender = (String) session.getAttribute("gender");  // Corrected method
out.println("<h2>My degree is " + degree + " and gender is " + gender + "</h2>");
%>

<!-- Request object and PrintStream object (out) -->
<%
out.println("<h2>..............Request Object..................</h2>");
String str1 = request.getParameter("uname");
String str2 = request.getParameter("ucity");
%>

<h2>My name is <%= str1 %> and city is <%= str2 %></h2>

</body>
</html>
