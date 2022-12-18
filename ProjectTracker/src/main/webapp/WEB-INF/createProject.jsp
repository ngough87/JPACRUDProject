<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Project</title>
</head>
<jsp:include page="projectNavBar.jsp"><jsp:param value="" name=""/></jsp:include>
	<br>
<body>
<form action="create.do" method="GET" >

	 <br>
		Project Number:
	 <input type="text" name="projectNumber" placeholder="Six-digit number" aria-label="Six-digit number"/>
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
	 	Client Name:
	 <input type="text" name="clientName"/>
	 <br>
	  <label for="project">Project Status:</label>
  	<select  name="project">
    <option value="new">NEW</option>
    <option value="Inprog">In-progress</option>
    <option value="onHold">On Hold</option>
    <option value="blocked">Blocked</option>
    <option value="complete">Completed</option>
  	</select>
  	<br>
	   Point of Contact: 
    <input type="text"  name="pointOfContact"/>
    <br>
	   Notes: 
    <input type="text" name="notes" />
    <br>
	   Last Updated: 
    <input type="text" name="lastUpdated" placeholder="YYYY-MM-DD" aria-label="YYYY-MM-DD"/>
    <br>
	
      ,<input type="submit" value="Submit Project"/>
    
	</form>
    

	
	
</body>
</html>