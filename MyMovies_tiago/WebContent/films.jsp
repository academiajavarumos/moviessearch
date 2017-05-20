<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Week Releases</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
	
	function getDetails(){
		
		$.get( "http://api.themoviedb.org/3/discover/movie?primary_release_date.gte=2017-05-13&primary_release_date.lte=2017-05-20&api_key=e3e6d2f8ff9f741500e0352cf5da5c89", function( data ) {
			
			   console.log(data);
			
			$('#myModal').modal("show");
			});
	}
	
	</script>
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

			<c:forEach var="movie" items="${data}">

				<tbody>
					<tr>
						<td style="vertical-align: middle; font-size: 24px"><a
							href="#" onmouseover=getDetails(this)>${movie.originalTitle}</a></td>
						<td style="vertical-align: middle">${movie.releaseDate}</td>
						<td style="display: none;">
						<td><img
							src="https://image.tmdb.org/t/p/w500/${movie.poster}"
							height="200"></td>
			</c:forEach>
			</tbody>
		</table>
	</div>

	<!-- Modal -->
	<div id="myModal" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">cenas</h4>
				</div>
				<div class="modal-body">
					<p>Mais Cenas</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>

</body>
</html>