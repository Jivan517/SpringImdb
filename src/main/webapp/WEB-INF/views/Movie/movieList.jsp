<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie List</title>
</head>
<body>
<h1>Imdb</h1>
<h2>Availale Movies</h2>
<br>
<br>
<a href="artists"> Artists</a> &nbsp;&nbsp;<a href="directors"> Directors</a>
<br>
<br>
<strong>Filter: &nbsp;</strong> <input type = "text"> <button type="submit"> Search</button>
<br>
	<table>
	
	<thead>
	<tr>
		<th>Name</th>
		<th>Year of Release</th>
		<th>Rating</th>
		
	</tr>
	</thead>
	
	<c:forEach var="movie" items="${movieList}">
	<tr>
		<td>${movie.name}</td>
		<td>${movie.year}</td>
		<td>${movie.rating }</td>
		<td><a href="movies/update/${movie.id}">edit</a></td>
		<td><a href="movies/delete/${movie.id}">delete</a></td>
	</tr>
	</c:forEach>
	</table>
	
	<br>
<a href="movies/add"> Add Movie</a>
</body>
</html>