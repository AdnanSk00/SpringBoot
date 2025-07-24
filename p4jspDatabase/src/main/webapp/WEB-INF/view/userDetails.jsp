<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.tka.Model_Entity.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Data</title>
</head>
<body>

	<h2>HTML CODE</h2>
	
	
	<%
		out.println("********* JSP CODE *******<br><br>");
		int a = 10, b = 5;
		int c = a + b;
		out.println("Sum = " + c + "<br><br>"); 		// print data on web
		System.out.println("Sum = " + c); 	// print data on console
	
		
//		Object msgData = request.getAttribute("pgm");	// DD
//		out.println("msgData > " + msgData);
		String msgData = (String) request.getAttribute("pgm");	// Typecasting
		out.println("msgData > " + msgData.toUpperCase());
		
		out.println("<br><br>");
		
		User user = (User) request.getAttribute("userObj");
		out.println("user > " + user);
		out.println("<br><br>");
		
		out.println("userName > " + user.userName);
	%>
	
	<form>
		<h3>User Details :</h3>	
		
		Name : <input type="text" value="${userObj.userName}"> <br><br>
		
		Password : <input type="text" value="${userObj.password}"> <br><br>
	
	</form>
	
</body>
</html>

<!--
userDetails.jsp --- .jsp file
jsp(% %>) + html (form)
jstl - library of javaScript, we can write jsp data into html as value or object using ${}

 -->
 
 
 
 
 
 
 
 
 
 
 