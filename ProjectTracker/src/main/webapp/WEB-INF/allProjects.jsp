<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="em">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>All projects</title>
 
</head>

<jsp:include page="projectNavBar.jsp"><jsp:param value="" name=""/></jsp:include>
<body>

<body>

<div class="container-fluid"> 
	<h1>Project List</h1>



	<c:choose>
	<c:when test="${empty project}">	<h2>No Projects Found</h2>	</c:when>
	<c:otherwise>
	<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Client</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="project" items="${project}">
				<tr>
					<td>${project.id}</td>
					
					<td><a href="projectDetails.do?id=${project.id}"> ${project.clientName}</a></td>

				</tr>
				</c:forEach>
			</tbody>

			</table>
		</c:otherwise>
	</c:choose>
	
</div>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>

<jsp:include page="footer.jsp"/>
</html>