<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
	
	<%@include file="head.jsp" %>

</head>
<body>

	<div>
         <jsp:include page="header.jsp"></jsp:include>
    </div>
	
	<div id="container" class="m-3" >
				
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Title</th>
					<th>Artist</th>
					<th>Price</th>
					<th>Action</th>
				</tr>
			</thead>
			
			<tbody>
			
				<c:forEach var="tempVinyl" items="${vinyls}">
				
					<c:url var="updateLink" value="/vinyl/showFormForUpdate">
						<c:param name="vinylId" value="${tempVinyl.id}" />
					</c:url>
					
					<c:url var="deleteLink" value="/vinyl/delete">
						<c:param name="vinylId" value="${tempVinyl.id}" />
					</c:url>
						
					<tr>
						<td> ${tempVinyl.title}</td>
						<td> ${tempVinyl.artist}</td>
						<td> ${tempVinyl.price}</td>
						<td>
						
							<!--  display the update link -->
							<a href="${updateLink}" class="btn btn-primary">Edit</a>
							<a href="${deleteLink}" class="btn btn-danger"
							onclick="if (!(confirm('Are you sure? '))) return false">
							Delete </a>
						</td>
					</tr>
			
				</c:forEach>
			
			</tbody>
		
		</table>
		
		<!-- Button add vinyl -->
		
		<input type="button" class=" btn btn-dark mb-2" value="Add vinyl"
				onclick="window.location.href='showFormForAdd';return false;"/>
	
	</div>

</body>

</html>












