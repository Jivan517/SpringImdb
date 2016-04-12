<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Movie</title>
</head>
<body>
<h1>Imdb</h1>
<h2>Update Movie</h2>
<form:form modelAttribute = "movie" action="${pageContext.request.contextPath}/movies/update/${movie.id}" method="post">
	
	<table>
		<tr>
			<td>Name:</td>
			<td><form:input path="name" value = "${movie.name }"/> </td>
			<td><form:errors path = "name" cssStyle="color:red"/> </td>
		</tr>
		<tr>
			<td>Year:</td>
			<td><form:input path="year" value = "${movie.year }"/> </td>
			<td><form:errors path = "year" cssStyle="color:red"/> </td>
		</tr>
		<tr>
			<td>Summary Plot:</td>
			<td><form:input path="summary" value = "${movie.summary }"/> </td>
			<td><form:errors path = "summary" cssStyle="color:red" /> </td>
		</tr>
		<tr>
			<td>Rating:</td>
			<td><form:input path="rating" value = "${movie.rating }"/> </td>
			<td><form:errors path = "rating" cssStyle="color:red" /> </td>
		</tr>
		
		
		<tr>
			<td>Genres:</td>
			<td><form:input path="genres" value = "${movie.genres }"/> </td>
			<td><form:errors path = "genres" cssStyle="color:color:red"/> </td>
		</tr>
		
		
		<tr>
			<td>Artists:</td>
			<td><form:input path="artists" value = "${movie.artists }"/> </td>
			<td><form:errors path = "artists" cssStyle="color:color:red"/> </td>
		</tr>
		
		
		<tr>
			<td>Director:</td>
			<td><form:input path="directors" value = "${movie.directors }"/> </td>
			<td><form:errors path = "directors" cssStyle="color:color:red"/> </td>
		</tr>
		
		
		<tr>
			<td>Comment:</td>
			<td><form:input path="comments" value = "${movie.comments }"/> </td>
			<td><form:errors path = "comments" cssStyle="color:color:red"/> </td>
		</tr>
				
	</table>
	<br>
	<input type="submit" value = "Update"/>
</form:form>
<br>
	<form action="${pageContext.request.contextPath}/movies" method="GET">
						<button>Cancel</button>
					</form>
	
</body>
</html>