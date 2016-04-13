<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie List</title>
</head>
<body>
	<h1>IMDb</h1>
	<h2>Availale Movies</h2>
	<br>
	<br>
	<div>
		<a href="artists"> Artists</a> &nbsp;&nbsp; <a href="directors">
			Directors</a>
	</div>
	<br>
	<br>
	<div>

		<strong>Filter: &nbsp;</strong> <br><br>
		<form:form action="${pageContext.request.contextPath}/movies/search" modelAttribute="filter" method="post">


			<div style="display:block; margin-left:20px;">
				<form:radiobuttons path="id" items="${filterList }"
					itemLabel="filter" itemValue="id" />
					&nbsp;
					<form:errors path = "id" cssStyle="color:red"/>
			</div>
			<br>
			<strong>Search Term: &nbsp;</strong> 
			<div style="display:inline;">
			
				<form:input path="text" /> &nbsp;<form:errors path = "text" cssStyle="color:red"/>
				<button type="submit">Search</button>
			</div>

			
		</form:form>


	</div>
	<br>
	<table style= "cellpadding:10px;">

		<thead>
			<tr>
				<th>Name</th>
				<th>Year</th>
				<th>Rating</th>

			</tr>
		</thead>

		<c:forEach var="movie" items="${movieList}">
			<tr>
				<td>${movie.name}</td>
				<td>${movie.year}</td>
				<td>${movie.rating }</td>
				<td><form action="movies/update/${movie.id}" method="get">
						<button>Update</button>
					</form></td>
				<td><form action="movies/delete/${movie.id}" method="post">
						<button type="submit">Delete</button>
					</form></td>
			</tr>
		</c:forEach>
	</table>

	<br>
	<a href="movies/add"> Add Movie</a>
</body>
</html>