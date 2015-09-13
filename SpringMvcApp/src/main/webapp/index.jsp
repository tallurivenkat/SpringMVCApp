<%@page import="com.venkat.domain.Order"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.venkat.dao.BaseDao" %>
    <%@ page import="com.venkat.dao.BaseDaoImpl" %>
    <%@ page import="java.util.*" %>
    <%@ page import="org.springframework.web.context.WebApplicationContext" %>
     <%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/custom.css" rel="stylesheet">
<title>Order Management</title>
</head>
<body>
<br>
	<div align='center'>
		<h2>
			Welcome to Order Management System<br> <br>
		</h2>
		
	</div>
	
	<table class="reference" style="width:100%">
<tbody><tr>
	<th>Number</th>
	<th>First Name</th>
	<th>Last Name</th>		
	<th>Points</th>
</tr>
<tr>
	<td>1</td>
	<td>Eve</td>
	<td>Jackson</td>		
	<td>94</td>
</tr>
<tr>
	<td>2</td>
	<td>John</td>
	<td>Doe</td>		
	<td>80</td>
</tr>
<tr>
	<td>3</td>
	<td>Adam</td>
	<td>Johnson</td>		
	<td>67</td>
</tr>
<tr>
	<td>4</td>
	<td>Jill</td>
	<td>Smith</td>		
	<td>50</td>
</tr>
</tbody></table>
	
	<%
	
	WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(application);
	BaseDao baseDao=(BaseDao) context.getBean("baseDao");
	Order order=new Order();
	order.setTitle("Testing order");
	order.setPrice(45.34d);
	baseDao.persist(order);
	for(Order o1: baseDao.getAll(Order.class)){
		
		out.println(o1.getOrderId()+"---"+o1.getTitle()+"---"+o1.getPrice());
	}
	
	
	%>
	
</body>
</html>

<!-- <meta http-equiv="refresh" content="1; url=/SpringMvcApp/addOrder"/> -->