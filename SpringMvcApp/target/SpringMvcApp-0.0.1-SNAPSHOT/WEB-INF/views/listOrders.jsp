<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
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
 
		<h3>Order Saved</h3>
		<hr>
		<h4>List of Orders</h4><br>
	</div>
	
	<table class="reference" style="width:100%">
      <tbody><tr>
	<th>OrderID</th>
	<th>Title</th>
	<th>Price</th>
</tr>
      <c:forEach items="${allOrders}" var="order">
        <tr>
          <td ><c:out value="${order.orderId}" /></td>
          <td ><c:out value="${order.title}" /></td>
          <td ><c:out value="${order.price}" /></td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
	
</body>
</body>
</html>