<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
</head>
<body>
	<h1>User Registration Form</h1>
	
	<form action="/insert-user" method="post">
	
	Enter name : <input type="text" id="userName" name="userName"> <br><br>
	
	Enter password : <input type="password" id="password" name="password"> <br><br>
	
	<input type="submit">
	
	</form>
</body>
</html>