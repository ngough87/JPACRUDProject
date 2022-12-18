<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Player</title>
</head>

<jsp:include page="projectNavBar.jsp"><jsp:param value="" name=""/></jsp:include>
<body>

<h1 >Search Project by ID</h1>
	<form action="findByIdForUpdate.do" method="GET">
		ID:
	 <input type="text" name="id"/> 
    <input type="submit" value="Search by Id" />
	</form>



<form action="updateForm.do" method="GET" >
		<input type="hidden" id="id" name="id" value="${project.id}"/>
	 <br>
		Project Number:
	 <input type="text" name="projectNumber" value="${project.projectNumber}" aria-label="Six-digit number"/>
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
	 <input type="text" name="clientName" value="${project.clientName }"/>
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
	   Point of Contact: 
    <input type="text"  name="pointOfContact" value="${project.pointOfContact }"/>
    <br>
	   Notes: 
    <input type="text" name="notes" value="${project.notes }" />
    <br>
	   Last Updated: 
    <input type="text" name="lastUpdated" placeholder="YYYY-MM-DD" aria-label="YYYY-MM-DD"/>
    <br>
	
      <input type="submit" value="Submit Project"/>
    
	</form>


</body>
</html>