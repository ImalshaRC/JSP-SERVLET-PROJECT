<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

	<link rel="stylesheet" type="text/css" href="css/assigment.css"/>

<title>Insert title here</title>
</head>
<body>
	<br/>
	<center>
	<table class="styled-table">
	 <thead>
	 	<tr>
	 		<th>Feedback id</th>
	 		<th>rating score</th>
	 		<th>Feedback</th>
	 		<th>Update</th>
	 		<th>Delete</th>
	 	</tr>
	 </thead>
	 <tbody>
	 <c:forEach var="rev" items="${reviewDetails}">
		
		<c:set var="id" value="${rev.id}"/>
		<c:set var="rating" value="${rev.rating}"/>
		<c:set var="message" value="${rev.message}"/>
		
		<c:url value="updateReview.jsp" var="revUpdate">
			<c:param name="id" value="${id}"/>
			<c:param name="rating" value="${rating}"/>
			<c:param name="message" value="${message}"/>
		</c:url>
		
		<c:url value="deleteReview.jsp" var="revDelete">
			<c:param name="id" value="${id}"/>
			<c:param name="rating" value="${rating}"/>
			<c:param name="message" value="${message}"/>
		</c:url>

		<tr class="active-row">
			<td>${rev.id}</td>
			<td>${rev.rating}</td>
			<td>${rev.message}</td>
			<td><a href="${revUpdate}"> <input type="submit" name="submit" value="update"/> </a></td>
			<td><a href="${revDelete}"> <input type="button" name="delete" value="delete"></input></a></td>
		</tr>
		</c:forEach>
		</tbody>
	 	
	</table>
	</center>
</body>
</html>