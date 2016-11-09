<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bg" class="cs320.beans.BGColorBean" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BG Color JSP</title>

<jsp:setProperty name="bg" property="*" />

<style type="text/css">

	body{
		background-color: rgb(
			<jsp:getProperty name="bg" property="r" />,
			<jsp:getProperty name="bg" property="g" />,
			<jsp:getProperty name="bg" property="b" />
		);
	}
</style>

</head>
<body>

<h1>BG Color Bean Example</h1>

<%--
	<jsp:setProperty name="bg" property="g" />
	<jsp:setProperty name="bg" property="b" param="b" />
 --%>
 
 
 
<ul>
	<li>
		bg.r = <jsp:getProperty name="bg" property="r" />
	</li>
	<li>
		bg.g = <jsp:getProperty name="bg" property="g" />
	</li>
	<li>
		bg.b = <jsp:getProperty name="bg" property="b" />
	</li>
</ul>

</body>
</html>