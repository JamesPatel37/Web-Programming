<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="beanCounter" class="cs320.beans.PageCounterBean" scope="application"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>

<h2>
	<small>JSESSIONID Cookie: </small> 
	${ cookie.JSESSIONID.value } 
</h2>


<h1>This page has been viewed: ${ beanCounter.count }

	<%--
		<jsp:getProperty name="beanCounter" property="count" />
	--%>
time(s).
</h1>

<%--
<p>This page has been viewed by you <jsp:getProperty name="beanCounter" property="count" /> time(s).</p>
 --%>
</body>
</html>