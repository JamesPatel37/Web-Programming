<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Request Counter</title>
</head>
<body>

<h1>
	${ session["JSESSIONID"] }
</h1>

<%! private static int pageViews = 0; %>

<% int localVariable = 10; %>

<h1>
	This page has been viewed:
	<%= ++pageViews %>
</h1>

</body>
</html>