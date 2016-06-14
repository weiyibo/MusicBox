<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="head_Include.jsp"%>

</head>
<a name="top"></a>
<body ng-app="myApp">
	<div id="container">
		<%@ include file="header.jsp"%>
		
		<div ng-view></div>

		<%@ include file="footer.jsp"%>
	</div>
	<back-top>Scroll top</back-top>
</body>
</html>
