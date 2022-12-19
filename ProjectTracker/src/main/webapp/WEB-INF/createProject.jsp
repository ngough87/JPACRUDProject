<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Project</title>
<link rel="stylesheet" type="text/css" href="myStyles.css">
</head>
<jsp:include page="projectNavBar.jsp"><jsp:param value="" name=""/></jsp:include>
	<br>
<body>

<div id="form-wrapper" style="max-width:500px;margin:auto;">
<h1> Create New Project</h1>

<form action="create.do" method="GET" >

	 <br>
			Project Number:
	 <input type="text" name="projectNumber" value="${project.projectNumber}" placeholder="Project Number" aria-label="Six-digit number"/>
	  <br>
	<br>
	  <label for="project">Project Type:</label>
  <select  name="project">
    <option value="step">Step-Up Authentication</option>
    <option value="fullproject">Full project</option>
    <option value="dotp visa">dOTP Visa</option>
    <option value="dotp mc">dOTP MC</option>
    <option value="prov">Provisioning</option>
    <option value="first">First-time Wallet</option>
  	</select>
  	 <br>
	<br>
	 	Client Name:
	 <input type="text" name="clientName" value="${project.clientName }"/>
	 <br>
	<br>
	  <label for="status">Project Status:</label>
  	<select  name="status" id="status">
    <option value="NEW">NEW</option>
    <option value="In-progress">In-progress</option>
    <option value="On Hold">On Hold</option>
    <option value="Blocked">Blocked</option>
    <option value="Completed">Completed</option>
  	</select>
  	 <br>
	<br>
	   Point of Contact: 
    <input type="text"  name="pointOfContact" value="${project.pointOfContact }"/>
     <br>
	<br>
	   Notes: 
    <input type="text" name="notes" value="${project.notes }" />
    <br>
	<br>
	   Last Updated: 
    <input type="text" name="lastUpdated" placeholder="YYYY-MM-DD" aria-label="YYYY-MM-DD" value="${project.lastUpdated }"/>
    <br>
	<br>
      <input type="submit" class="btn btn-primary" role="button" />
      
    
	</form>
	<br>
	<div id="form-wrapper" style="max-width:500px;margin:auto;">
<form action="deleteProject.do" method="GET" >
		<input type="hidden" id="id" name="id" value="${project.id}"/>
	
      <input type="submit" value="Delete Project" class="btn btn-primary" role="button"/>
    
	</form>
	 <br>
	<br>
</div>
</div>

	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>	
</body>

<jsp:include page="footer.jsp"/>
</html>