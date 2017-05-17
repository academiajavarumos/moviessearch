<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
<table class = "table">
	<th><h1>Movie Name</h1></th>
	<th><h1>Movie release date</h1></th>
	<th><h1>Movie poster</h1></th>
	
		<c:forEach var="movie" items="${data}">	
		
			<tr>${movie.originalTitle}</tr>
			<tr>${movie.releaseDate}</tr>	
			<tr>d>${movie.poster}</tr>
			
		</c:forEach>

	
	</table>
</body>
</html>