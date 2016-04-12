<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Artist</title>
</head>
<body>
<h1>Imdb</h1>
<h2>Add Artist</h2>

<form:form modelAttribute = "artist" action="${pageContext.request.contextPath}/artists/add" method="post">
	
	<table>
		<tr>
			<td>FirstName:</td>
			<td><form:input path="firstName" /> </td>
			<td><form:errors path = "firstName" cssStyle="color:red"/> </td>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><form:input path="lastName" /> </td>
			<td><form:errors path = "lastName" cssStyle="color:red"/> </td>
		</tr>
		<tr>
			<td>Date of Birth:</td>
			<td><form:input path="dob"/> </td>
			<td><form:errors path = "dob" cssStyle="color:red" /> </td>
		</tr>
		<tr>
			<td>Place of Birth:</td>
			<td><form:input path="placeOfBirth" /> </td>
			<td><form:errors path = "placeOfBirth" cssStyle="color:red" /> </td>
		</tr>
		
		
		<tr>
			<td>Biography:</td>
			<td><form:input path="biography" /> </td>
			<td><form:errors path = "biography" cssStyle="color:color:red"/> </td>
		</tr>
		
		
				
	</table>
	<br>
	<input type="submit" value = "Add"/> &nbsp;&nbsp;
	
	</form:form>
	<br>
	<form action="${pageContext.request.contextPath}/artists" method="GET">
						<button>Cancel</button>
					</form>
	
	
</body>
</html>