<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShaMobile Store</title>
<link rel="stylesheet" type="text/css" 	href="src/main/webapp/WEB-INF/views/MyStyle.css" />


<!-- carousel Slider AutoPlay-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js" type="text/javascript"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript"></script>

<!-- For glyphicon -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="engine1/jquery.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" type="text/css" href="engine1/style.css" />
</head>
<body>
	<%-- <header>
	<div class="w3-container w3-red" >
		<div class="collapse navbar-collapse" id="myNavbar">
					<a href="./"><img style="height: 120px" src="./resources/image/LogoNew.png" alt=""></img></a>
					<div class="row">
					<div style="width: 25%" class="search">
					<input  style="display: inline;" type="text" class="form-control input-sm" maxlength="64" placeholder="Search" />
					<button style="display: inline;"  type="submit" class="btn btn-primary btn-sm">Search</button>
					</div>
				<span id="sign" class="glyphicon glyphicon-user" style="color: white;"></span>
				<a class="b" href="login" style="color: white">Login</a> 
				<span id="sign" class="glyphicon glyphicon-user" style="color: white;"></span>
				<a class="b" href="reg" style="color: white">SignUp</a>
				<ul class="nav navbar-nav">
				<li class="active"><a href="./">Home</a></li>
				<li><a href="aboutus">About</a></li>
				<li><a href="admin/add">Adding</a></li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Product Category<span class="caret"></span></a>
      			<ul class="dropdown-menu">
       			<br>
         		<c:forEach items="${clist}" var="p">
         		<li><a href="productlistView?id=${p.categoryId}">${p.categoryName}</a></li>
          		<br>
       			</c:forEach>
        		</ul>
      			</li>
				<li><a href="supplierList">Supplier</a></li>
 				<li><a href="categoryList">Category</a></li>
 				<li><a href="productList">Product</a></li>
				<li><a href="#">Contact</a></li>
				</ul>

		</div>
	
	</div>
	</div>
	</header> --%>
	<nav class="navbar navbar-default" >
	<div  class="w3-container w3-red">

		<div class="navbar-header" style="height:150px">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
							
			<a class="navbar-brand" href="./">				
				<img src='<c:url value="./resources/image/LogoNew.png" />' width="175px" height="125px" class="img-responsive"/>
			</a>
		</div>		
		
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				
				<li class="dropdown"><a style="color: white;" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Products <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li>Category 1</li>
						<li>Category 1</li>
						<li>Category 1</li>
					</ul>
				</li>
					<li><a style="color: white;" href="<c:url value="admin/add"/>" role="button" aria-haspopup="true"
					aria-expanded="false">Add</a></li>
			</ul>
		
			
				<c:if test="${pageContext.request.userPrincipal.name  == 'admin'}">
                                <li><a href="<c:url value="/admin" />">Admin</a></li>
                 </c:if>
                 </ul>
			  <ul class="nav navbar-nav navbar-right">
			  <c:if test="${pageContext.request.userPrincipal.name == null }">
					<li>
					<span id="sign" class="glyphicon glyphicon-user" style="color: white;"></span>
					<a style="color: white;" href=' <c:url value="/login" />'>Login</a>
					</li><li>
					<span id="sign" class="glyphicon glyphicon-user" style="color: white;"></span>
					<a style="color: white;" href="/registerpage">Signup</a></li>
				
				</c:if>
				<c:if test="${pageContext.request.userPrincipal.name  != null}">
                               <li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
	              				<li><a href='<c:url value="/logout" />'>Signout</a></li>
                 </c:if>
				
				</ul>
		</div>		
	</div>
</nav>
</body>
</html>