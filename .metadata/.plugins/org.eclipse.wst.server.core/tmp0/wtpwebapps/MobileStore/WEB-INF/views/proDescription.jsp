<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Sha Mobile Store</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"
	type="text/javascript"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	type="text/javascript"></script>
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="row">
   <div class="col-xs-4 item-photo">
                    <img style="max-width:100%;" src="./resources/images/p1.jpg" />
                </div>
                <div class="col-xs-5" style="border:0px solid gray">
                    <!-- Datos del vendedor y titulo del producto -->
                    <h3>Men Shoe Grey & Black </h3>    
                    <h5 style="color:#337ab7">781 customer reviews <a href="#">adidas</a> � <small style="color:#337ab7">| 12 answered questions</small></h5>

                    <!-- Precios -->
                    <h6 class="title-price"><small>PRICE</small></h6>
                    <h3 style="margin-top:0px;">2750</h3>

                    <!-- Detalles especificos del producto -->
                    <div class="section">
                        <h6 class="title-attr" style="margin-top:15px;" ><small>COLOR</small></h6>                    
                         <div>
                            <div class="attr" style="width:25px;background:#5a5a5a;"></div>
                            <div class="attr" style="width:25px;background:white;"></div>
                        </div> 
                    </div>
                    
                    
                    <div class="section" style="padding-bottom:5px;">
                        <h6 class="title-attr"><small>Size</small></h6>    
                                        
                         <div> 
                        <br><br><br> <div class="attr2">9</div>
                        </div> 
                    </div>   
                                     

                    <!-- Botones de compra -->
                    <div class="section" style="padding-bottom:25px;">
                        
                  <a href="#" class="btn btn-info" role="button"  class="glyphicon glyphicon-shopping-cart" > Buy Now</a>
                    </div>                                        
                </div>                              
   <div class="col-xs-9">
                    <ul class="menu-items">
                        <li class="active">Product Details </li>
                        <li>Men Shoe Grey & Black</li>
                        
                    </ul>
                    <div style="width:100%;border-top:1px solid silver">
                        <p style="padding:15px;">
                            <small>
                            Stay connected either on the phone or the Web with the Shoe from Adidas. this Shoe stores precious photos and video and lets you upload them to a cloud or social network at blinding-fast move . With a 17-hour operating life from one charge, this phone allows you keep in touch even on the go. 

                            With its built-in photo editor, the Adidas allows you to long life with the touch of a smooth handling, eliminating extraneous background items. Usable with most carriers, this product is the perfect companion for work or entertainment.
                            </small>
                        </p>
                        <small>
                        <ul>
                            <li>Product Dimensions: 25.4 x 12.7 x 15.2 cm ; 299 g</li>
                            <li>ASIN: B01DB938EG</li>
                        </ul>  
                        </small>
                    </div>
                </div>	 	
	</div>
</div>
<jsp:include page="Footer.jsp" />
</body>
</html>