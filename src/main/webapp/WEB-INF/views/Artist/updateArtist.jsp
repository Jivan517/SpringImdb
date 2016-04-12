<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Artist</title>
</head>
<body>
<h1>Imdb</h1>
<h2>Update Artist</h2>
<form:form modelAttribute = "artist" action="${pageContext.request.contextPath}/artists/update/${artist.id}" method="post">
	
	<table>
		<tr>
			<td><form:hidden path="id" value = "${artist.id}"/></td>
		</tr>
		<tr>
			<td>FirstName:</td>
			<td><form:input path="firstName" value = "${artist.firstName }"/> </td>
			<td><form:errors path = "firstName" cssStyle="color:red"/> </td>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><form:input path="lastName" value = "${artist.lastName }" /> </td>
			<td><form:errors path = "lastName" cssStyle="color:red"/> </td>
		</tr>
		<tr>
			<td>Date of Birth:</td>
			<td><form:input path="dob" value = "${artist.dob }"/> </td>
			<td><form:errors path = "dob" cssStyle="color:red" /> </td>
		</tr>
		<tr>
			<td>Place of Birth:</td>
			<td><form:input path="placeOfBirth"  value = "${artist.placeOfBirth }"/> </td>
			<td><form:errors path = "placeOfBirth" cssStyle="color:red" /> </td>
		</tr>
		
		
		<tr>
			<td>Biography:</td>
			<td><form:input path="biography" value = "${artist.biography }" /> </td>
			<td><form:errors path = "biography" cssStyle="color:color:red"/> </td>
		</tr>
		
		
				
	</table>
	<br>
	<input type="submit" value = "Update"/>
</form:form>
<br>
	<form action="${pageContext.request.contextPath}/artists" method="GET">
						<button>Cancel</button>
					</form>
	
</body>
</html>