<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register (JSP)</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>

<h1>
	${ message }
</h1>

<form action="RegisterController" method="get">
  <div class="form-group">
    <label
    <c:if test="${!isValidFirstName}">
    		style="color: red;"
    	</c:if>
    >
    First Name</label>
    <input name="firstName" type="text" class="form-control" placeholder="Enter your first name">
  </div>
  <div class="form-group">
    <label>Email address</label>
    <c:if test="${!isValidEmail}"><p class="bg-danger">You must specify an e-mail</p></c:if>
    <input name="email" type="email" class="form-control" placeholder="Enter your email">
  </div>
  <div class="form-group">
    <label>Password</label>
    <input name="password" type="password" class="form-control" placeholder="Enter a password">
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>

</body>
</html>





