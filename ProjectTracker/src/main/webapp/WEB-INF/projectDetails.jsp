<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project Details</title>
</head>
<jsp:include page="projectNavBar.jsp"><jsp:param value="" name=""/></jsp:include>
	<br>
<body>
<h2>Project Details</h2>
	
	
	<ul>
		<li> Id: ${project.id}</li>
		<li>Project number: ${project.projectNumber}</li>
		<li>Project type: ${project.projectType}</li>
		<li>Client Name: ${project.clientName}</li>
		<li>Status: ${project.status}</li>
		
		<li>Point of Contact: ${project.pointOfContact}</li>
		
		<li>Notes: ${project.notes}</li>
		<li>Last Updated: ${project.lastUpdated}</li>
		
		
		</ul>
		
		<br>
		<a href="home.do" class="btn btn-primary" role="button">Return to main menu </a>
		
	
</body>
</html>