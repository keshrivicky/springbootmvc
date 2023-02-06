<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/user/updateUser" method="POST">
<label>First Name</label> <input type ="text" name="fname" value="${firstName}" >
<br>
<label>Last Name</label> <input type ="text" name="lname" value="${lastName}" >
<br>
<label>Email</label> <input type ="text" name="email" value="${email}" >
<br>
<label>Date Of Birth</label> <input type ="text" name="dob" value="${dob}" >
<br>
 <input type="hidden"  name="id" value="${id}" />
<input type ="submit" value="update User">
</form>
</body>
</html>