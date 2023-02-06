<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>USER PAGE</h1>
<%-- 
 ${listOfuser}

<c:if test="${not empty listOfuser}">

		<ul>
			<c:forEach var="listValue" items="${listOfuser}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if> 
	--%>
<a href="<%=request.getContextPath()%>/user/adduser"><button type="button" class="btn btn-primary">Add User</button></a>

 <table border="1">
<thead>
<tr>
<th>ID</th><th>First Name</th><th>Last Name</th><th>Email</th><th>DOB</th><th>Edit</th><th>Delete</th>
</tr>
</thead>
<tbody>
 <c:forEach var="user" items="${listOfuser}">
          <tr>
            <td>
              <c:out value="${user.id}" />
            </td>
            <td>
              <c:out value="${user.firstName}" />
            </td>
            <td>
              <c:out value="${user.lastName}" />
            </td>
             <td>
              <c:out value="${user.email}" />
            </td>
             <td>
              <c:out value="${user.dob}" />
            </td>
            <td>
             <a href="<%=request.getContextPath()%>/user/update/${user.id}">Update</a> 
             </td>
           <td>
             <a href="<%=request.getContextPath()%>/user/delete/${user.id}" onclick="return confirm('Do you really want to delete?')">Delete</a> 
             </td>
          </tr>
        </c:forEach> 
</tbody>
</table> 


</body>
</html>