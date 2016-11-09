<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bg" class="cs320.beans.BGColorBean"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Background Color Example Using Beans</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">


<jsp:setProperty name="bg" property="r" value="255" />
<jsp:setProperty name="bg" property="g" param="g" />
<jsp:setProperty name="bg" property="b" />

<jsp:setProperty name="bg" property="*" />


<style type="text/css">
	body{
		background-color: rgb(
							<jsp:getProperty name="bg" property="r" />,
							<jsp:getProperty name="bg" property="g" />,
							<jsp:getProperty name="bg" property="b" />);
	}
</style>

</head>
<body>



<h1>Background Color</h1>


<h3>Red:  ${ bg.r }</h3>
<h3>Green:  ${ bg.g }</h3>
<h3>Blue:  ${ bg.b }</h3>

<%--
<h3>Red:  <jsp:getProperty name="bg" property="r" /></h3>
<h3>Green:  <jsp:getProperty name="bg" property="g" /></h3>
<h3>Blue:  <jsp:getProperty name="bg" property="b" /></h3>
 --%>
 
</body>
</html>









