<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Artist List</title>
</head>
<body>
<h1>Imdb</h1>
	<h2>Artists</h2>
	<br>
	<a href="artists/add"> Add Artist</a>
	<table>

		<thead>
			<tr>
				<th>Name</th>
				<th>Place of Birth</th>
				<th>Action</th>

			</tr>
		</thead>

		<c:forEach var="artist" items="${artistList}">
			<tr>
				<td>${artist.firstName} &nbsp; ${artist.lastName}</td>
				<td>${artist.placeOfBirth}</td>
				<td>
				<form action="artists/update/${artist.id}" method="get">
						<button>Update</button>
					</form></td>
				<td><form action="artists/delete/${artist.id}" method="post">
						<button type="submit">Delete</button>
					</form></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>