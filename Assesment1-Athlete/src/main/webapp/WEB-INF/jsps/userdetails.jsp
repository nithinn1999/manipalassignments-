<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2><u>Registered Athletes:</u></h2>
	<table border="1">
	<tr>
		<th>AthleteID</th>
		<th>AtheleteName</th>
		<th>Gender</th>
		<th>Category</th>
		<th>Email</th>
		<th>Mobile</th>
	</tr>
	<c:forEach var="user" items="${userList}">
	<tr>
		<td>${user.id}</td>
		<td>${user.atheletename}</td>
		<td>${user.gender}</td>
		<td>${user.category}</td>
		<td>${user.useremail}</td>
		<td>${user.usermobile}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>