<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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