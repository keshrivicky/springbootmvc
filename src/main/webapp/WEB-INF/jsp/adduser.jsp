<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/user/save" method="POST">
<label>First Name</label> <input type ="text" name="fname" value="${firstName}" >
<br>
<label>Last Name</label> <input type ="text" name="lname" value="${lastName}" >
<br>
<label>Email</label> <input type ="text" name="email" value="${email}" >
<br>
<label>Date Of Birth</label> <input type ="text" name="dob" value="${dob}" >
<br>
<input type ="submit" value="Add User">
</form>
</body>
</html>