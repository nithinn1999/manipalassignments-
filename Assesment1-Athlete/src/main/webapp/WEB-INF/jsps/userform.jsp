<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<center>
<form action="addUser" method="post">
<table border = "1">
<br><br><br><br>
	<tr><td>AtheleteName :</td><td><input type="text" name="atheletename" pattern="^[A-Z]{1}[a-z]{2,40}" title="must start with capital letter" required></td></tr>
	<tr><td>Gender :</td><td><input type="radio" name="gender" value="male"> Male 
	<input type="radio" name="gender" value="female"> Female</td></tr>
  			
  	<tr><td>Category:</td><td><select name="category" id="category">
    			<optgroup label="">
      			<option value="Running">Running</option>
      			<option value="High Jump">High Jump</option>
    			<option value="Hurdles">Hurdles</option>
    			<option value="Relay">Relay</option>
    			<option value="Javelin Throw">Javelin Throw</option>
    			<option value="Shot put">Shot put</option>
    			</optgroup></select></td></tr>
    					 			
	<tr><td>Email :</td><td><input type="text" name="useremail"/></td></tr>
	<tr><td><label for="Mobile">Mobile:</label></td><td>
  	<input type="text" name="usermobile" pattern=".{10,10}" title="10 digits only" required></td></tr>
	
	<tr><td><input type="submit" value="Submit" /><a href="http://localhost:8080/spring-mvc-demo/userform">Cancel</a>
	</td><td><a href="http://localhost:8080/spring-mvc-demo">Home</a></td></tr>
</table>
</form>
</center>
</body>
</html>