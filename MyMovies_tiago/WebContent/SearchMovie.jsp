<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Search Results</title>
</head>
<body>


	<div class="container">

		<table class="table table-hover">
			<thead>
				<tr style="background: beige;">
					<th>Film Name</th>
					<th>Release Date</th>
					<td style="display: none;">
					<th>Poster</th>
				</tr>
			</thead>

			<c:forEach var="movie" items="${filmsResult}">

				<tbody>
					<tr>
						<td id="movieTitle"
							style="vertical-align: middle; font-size: 24px"><a id="myAnchor" href="#"
							>${movie.originalTitle}</a></td>
						<td style="vertical-align: middle">${movie.releaseDate}</td>
						<td style="display: none;">
						<td><img
							src="https://image.tmdb.org/t/p/w500/${movie.poster}"
							height="200"></td>
			</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>