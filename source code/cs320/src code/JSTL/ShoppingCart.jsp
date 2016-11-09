<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="cart" class="cs320.beans.ShoppingCartBean"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple Shopping Cart</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>

<p class="text-right">
	<a href="Login.jsp?logout=true" class="btn btn-primary">Logout</a>
</p>

<c:if test="${ empty sessionScope.user }">
	<c:redirect url="Login.jsp"></c:redirect>
</c:if>

<div class="container">
	<div class="page-header">
	  <h1>${ user }'s Shopping Cart <small>${ cart.numberOfItems } Item(s)</small></h1>
	</div>
	
	<c:forEach items="${ cart.items }" var="item">
		<div class="well">
			<h2>${ item.name } <small>Quantity: ${ item.quantity }</small><span class="pull-right">${ item.quantity } x ${ item.price } = ${ item.quantity * item.price }</span></h2>
		</div>
	</c:forEach>
	
</div>

</body>
</html>