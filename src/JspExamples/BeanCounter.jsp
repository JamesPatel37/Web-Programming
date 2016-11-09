<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="counterBean" class="cs320.beans.CounterBean" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
</head>
<body>

<h1>
	<small>This page has been viewed: </small>
	<jsp:getProperty property="count" name="counterBean"/>
	time(s).
</h1>

<p class="lead">This page is a JSP example that reads the count (
	<jsp:getProperty property="count" name="counterBean" />
) from a CounterBean and displays it</p> 

</body>
</html>