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
	<div align='center'
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px;">
 
		<h3>Add Order:</h3>
		<hr>
		<sf:form  commandName="order" action="/SpringMvcApp/saveOrder">
		Title: <sf:input path="title"/><sf:errors path="title" cssClass="error"></sf:errors><br>
		<br>
		Price: <sf:input path="price"/> <sf:errors path="price" cssClass="error"></sf:errors><br>
		<br>
		<input type="submit">
		</sf:form>
	</div>
	
	
</body>
</body>
</html>