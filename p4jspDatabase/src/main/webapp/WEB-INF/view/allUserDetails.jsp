<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.tka.Model_Entity.User, java.util.*" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All User Data</title>
</head>
<body>
	<%
		List<User> userList = (List<User>) request.getAttribute("userList");
		out.println("userList > " + userList);
		out.println("<br><br>");
	%>
	
	<form>
		<h3>All User Details :</h3>	
		<table border="1" cellpadding="8" cellspacing="0">
			<tr>
				<th>User Name</th>
				<th>Password</th>
			</tr>
			<c:forEach var="user" items="${userList}">
				<tr>
					<td>${user.userName}</td>
					<td>${user.password}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
	
</body>
</html>