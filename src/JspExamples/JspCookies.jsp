<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="page-header">
  <h1>${ param.pageTitle } <small>CS320</small></h1>
</div>

<h2>
	<small>Server:</small>
	${ pageContext.servletContext.serverInfo }
</h2>


<h2>
	<small>Header ('User-Agent'):</small>
	${ header["User-Agent"] }
</h2>


<h2>
	<small>JSESSIONID Cookie:</small>
	${ cookie.JSESSIONID.value }
</h2>

</body>
</html>