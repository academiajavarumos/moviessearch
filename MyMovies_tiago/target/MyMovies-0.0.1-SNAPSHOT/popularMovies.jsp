<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Popular Movies</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<script>

$(function getDetails(){
	

	$('a').mouseenter(function(){

    	var name = document.getElementById('header');
    	var title = $(this).text();
    	name.innerHTML = title;
    	
    	$.getJSON("http://api.themoviedb.org/3/search/movie?query="+title+"&api_key=e3e6d2f8ff9f741500e0352cf5da5c89", function( data1){
    		
    		var modalOverview = document.getElementById( 'middle' );
    		modalOverview.innerHTML = data1.results["0"].overview;
    		    	    
    	});
    	
    	$('#myModal').modal("show");
	
    });
   // console.log(data);
    
});

	
</script>
</head>
<body>
	<div class="container">

		<table class="table table-hover">
			<thead>
				<tr style="background: beige;">
					<th>Film Name</th>
					<th>Release Date</th>
					<th>Popularity</th>
					<th style="padding-left: 45px">Poster</th>
				</tr>
			</thead>

			<c:forEach var="movie" items="${data}">

				<tbody>
					<tr>
						<td style = "vertical-align:middle; font-size:24px"><a href="#">${movie.originalTitle}</a></td>
						<td style = "vertical-align:middle">${movie.releaseDate}</td>
						<td style = "vertical-align:middle; padding-left:20px">${movie.popularity}</td>
						<td><img src="https://image.tmdb.org/t/p/w500/${movie.poster}" height="200"></td>		
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
					<h4 class="modal-title" id="header">cenas</h4>
				</div>
				<div class="modal-body" id="middle">
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