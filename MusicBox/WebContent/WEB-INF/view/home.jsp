<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <%@ include file="/WEB-INF/view/head_Include.jsp"%>
    
  </head>
<!-- NAVBAR
================================================== -->
  <body ng-app="myApp">
   <%--  <%@ include file="/WEB-INF/view/header.jsp"%> --%>
   
   	<p>5</p>
	<navi-directive></navi-directive>
	<%@ include file="/WEB-INF/view/carousel.jsp"%>
   

    <div class="container marketing">
		
      
		<%@ include file="/WEB-INF/view/features.jsp"%>
		<%@ include file="/WEB-INF/view/footer.jsp"%>
    </div>
   
  </body>
</html>
