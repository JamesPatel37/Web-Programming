<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="/WEB-INF/tlds/CoffeeShopTags.tld" prefix="cs320" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
</head>
<body>

	

	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<form action="CustomTags.jsp" method="get">
					Enter a coffee shop ID: <input type="text" name="id" />
					<input type="submit"/>		
				</form>	
			</div>
		</div>
	
	
		<div class="row">
			<div class="col-xs-12">			
						
				<div class="well">
					<h2>Coffee Shop Name <small>ID</small></h2>
					<p>
						1234 Street Address,
						City, State  Zipcode						
					</p>
					<p>
						Phone (123) 456-7890
					</p>
					
					<c:choose>
						<c:when test="${ !empty param.id }">
							<cs320:shopDetails coffeeShopId="1234" />
						</c:when>
						<c:otherwise>
							<h3>You must enter an ID</h3>
						</c:otherwise>
					</c:choose>
					
					
				</div>
			
			</div>
		</div>
	
	</div>
</body>
</html>