<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Simple Adder</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
</head>
<body>

<% if (Math.random() > 0.5){  %>

<h1>Have a <strong>Nice</strong> day!</h1>

<%  } else { %>

<h1>Have a <strong>Lousy</strong> day!</h1>

<%  } %>



<h2>Num 1:  <%= request.getParameter("num1") %></h2>
<h2>Num 2:  <%= request.getParameter("num2") %></h2>

<% 
	if (request.getParameter("num1") != null && 
       request.getParameter("num2") != null){
%>

<h2>
	Sum:  
	<%= 
		Integer.parseInt(request.getParameter("num1")) + 
	    Integer.parseInt(request.getParameter("num2")) 
	%>	
</h2>


<%
	}
%>


</body>
</html>