<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/custom.css" rel="stylesheet">
<title>welcome</title>
</head>
<body>
<body>
 
	<br>
	<br>
	<div align='left'
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px;">
 
		<h3>Add Client:</h3>
		<hr>
		<sf:form  commandName="client" action="/SpringMvcApp/saveClient">
		Name: <sf:input path="name"/><br>
		<br>
		Email: <sf:input path="email"/> <br>
		<br>
		<input type="submit">
		</sf:form>
	</div>
	
	
</body>
</body>
</html>