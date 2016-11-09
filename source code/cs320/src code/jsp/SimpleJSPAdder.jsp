<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple JSP Adder</title>
</head>
<body>

<% if( Math.random() < 0.5) { %>
<H1>Have a <I>nice</I> day!</H1>
<% } else { %>
<H1>Have a <I>lousy</I> day!</H1>
<% } %>



<h3>
	num1 =  <%= request.getParameter("num1") %> 
</h3>
<h3>
	num2 =  <%= request.getParameter("num2") %> 
</h3>

<%
	if (request.getParameter("num1") != null && 
		request.getParameter("num2") != null ){		
%>

<h2>
	num1 + num2 =  <%= Integer.parseInt(request.getParameter("num1")) + Integer.parseInt(request.getParameter("num2")) %> 
</h2>

<%
	}
%>


</body>
</html>