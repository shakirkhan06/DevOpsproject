<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
	
</head>
<body class="w3-container w3-gray">
  <jsp:include page="Header.jsp" />  
<div id="loginform">
<form action="login">
 

  <div class="containers">
    <label><b>Username</b></label>
    <input class="logininput" type="text" placeholder="Enter Username" name="uname" required>

    <label><b>Password</b></label>
    <input class="logininput" type="password" placeholder="Enter Password" name="psw" required>
    <div class="containers" >   
    <button class="loginbtn"  type="submit">Login</button>
    <button class="loginbtn" type="button">Cancel</button>
     </div>
  </div>

  <div class="containers">
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
 
</form>
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
