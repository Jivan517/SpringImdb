<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Director</title>
</head>
<body>
<h1>IMDb</h1>
<h2>Update Director</h2>
<form:form modelAttribute = "director" action="${pageContext.request.contextPath}/directors/update/${director.id}" method="post">
	
	<table>
		<tr>
			<td><form:hidden path="id" value = "${director.id}"/></td>
		</tr>
		<tr>
			<td>FirstName:</td>
			<td><form:input path="firstName" value = "${director.firstName }"/> </td>
			<td><form:errors path = "firstName" cssStyle="color:red"/> </td>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><form:input path="lastName" value = "${director.lastName }" /> </td>
			<td><form:errors path = "lastName" cssStyle="color:red"/> </td>
		</tr>
				
	</table>
	<br>
	<input type="submit" value = "Update"/>
</form:form>
<br>
	<form action="${pageContext.request.contextPath}/directors" method="GET">
						<button>Cancel</button>
					</form>
	
</body>
</html>