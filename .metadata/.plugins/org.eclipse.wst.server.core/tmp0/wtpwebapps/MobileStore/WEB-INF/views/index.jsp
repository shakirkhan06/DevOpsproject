<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="MyStyle.css"/>


<!-- carousel Slider AutoPlay-->
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <jsp:include page="Header.jsp" />  
</head>

<body class="w3-container w3-Gray">
   
<div class="w3-container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
	<div class="carousel-inner" style="height:300px;">
      <div class="item active">
 	  <img src="./resources/image/phone1.jpg" style="width:100%;height:300px;">
	  </div>

	<div class="item">
 		 <img src="./resources/image/phone2.jpg" style="width:100%;height:300px;">
	</div>
	<div class="item">
 		 <img src="./resources/image/phone3.jpg" style="width:100%;height:300px;">
	</div>
	<div class="item">
 		 <img src="./resources/image/phone4.jpg" style="width:100%;height:300px;">
	</div>
	<div class="item">
 		 <img src="./resources/image/phone5.jpg" style="width:100%;height:300px;">
	</div>
	<a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
</div>
</div>
<div>
<hr>
	<div class="row">
	<div class="col-md-4"><div class="thumbnail">
	<a href=""><img height="120px" width="253px" src="./resources/image/phone2.jpg"></img></a>
	<div class="caption"><center><h3>Apple 4s </h3><p>Rs.50000</p></center>
	<a class="btn" href="proDescription">Buy Now</a></div></div></div>
	<div class="col-md-4"><div class="thumbnail">
	<a href=""><img height="120px" width="253px" src="./resources/image/phone3.jpg"></img></a>
	<div class="caption"><center><h3>Moto</h3><p>Rs.12750</p></center>
	<a class="btn" href="proDescription">Buy Now</a></div></div></div>
	<div class="col-md-4"><div class="thumbnail">
	<a href=""><img height="120px" width="253px" src="./resources/image/phone4.jpg"></img></a>
	<div class="caption"><center><h3>Oppo A37</h3><p>Rs.10750</p></center>
	<a class="btn" href="proDescription">Buy Now</a></div></div></div>
	</div>
<hr>	
	<div class="row">
	<div class="col-md-4"><div class="thumbnail">
	<a href=""><img height="120px" width="253px" src="./resources/image/phone7.jpg"></img></a>
	<div class="caption"><center><h3>Hitachi</h3><p>Rs.10500</p></center>
	<a class="btn" href="proDescription">Buy Now</a></div></div></div>
	<div class="col-md-4"><div class="thumbnail">
	<a href=""><img height="120px" width="253px" src="./resources/image/phone3.jpg"></img></a>
	<div class="caption"><center><h3>Men Shoe Dark Grey </h3><p>Rs.2750</p></center>
	<a class="btn" href="proDescription">Buy Now</a></div></div></div>
	<div class="col-md-4"><div class="thumbnail">
	<a href=""><img height="120px" width="253px" src="./resources/image/phone5.jpg"></img></a>
	<div class="caption"><center><h3>Samsung Galaxy 5s </h3><p>Rs.2750</p></center>
	<a class="btn" href="proDescription">Buy Now</a></div></div></div>
	</div>
<hr>
</div>
<jsp:include page="Footer.jsp" /> 


<script>
var myIndex = 0;
carousel();

function carousel() {
  	$('#myCarousel').carousel({
	    interval: 1200
	});
    
}
//This is for Search Box
$(document).ready(function(e){
    $('.search-panel .dropdown-menu').find('a').click(function(e) {
		e.preventDefault();
		var param = $(this).attr("href").replace("#","");
		var concept = $(this).text();
		$('.search-panel span#search_concept').text(concept);
		$('.input-group #search_param').val(param);
	});
});
</script>
</body>
</html>