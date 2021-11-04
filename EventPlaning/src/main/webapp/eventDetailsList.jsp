<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="tempUser.Hall" %>
<%@ page import="tempUser.Menu" %>
<%@ page import="tempUser.Deco" %>
<%@ page import="tempUser.Band" %>
<%@ page import="tempUser.TUser" %>
<%@ page import="tempUser.hallSelectorDBUtil" %>
<%@ page import="tempUser.MenuSelectorDBUtil" %>
<%@ page import="tempUser.DecoSelectorDBUtil" %>
<%@ page import="tempUser.BandSelectorDBUtil" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>LIST</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Events Planning Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //custom-theme -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome-icons -->
<link href="//fonts.googleapis.com/css?family=Great+Vibes" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/hall.js"></script>
</head>
<body>

<!-- banner -->
	<div class="banner">
		<div class="container">
			<!-- header -->
			<div class="w3_agile_menu">
				<div class="agileits_w3layouts_nav">
					<div id="toggle_m_nav">
						<div id="m_nav_menu" class="m_nav">
							<div class="m_nav_ham w3_agileits_ham" id="m_ham_1"></div>
							<div class="m_nav_ham" id="m_ham_2"></div>
							<div class="m_nav_ham" id="m_ham_3"></div>
						</div>
					</div>
					<div id="m_nav_container" class="m_nav wthree_bg">
						<nav class="menu menu--sebastian">
							<ul id="m_nav_list" class="m_nav menu__list">
								<li class="m_nav_item active" id="m_nav_item_1"> <a href="index.html" class="link link--kumya"><i class="fa fa-home" aria-hidden="true"></i><span data-letters="Home">Home</span></a></li>
								<li class="m_nav_item" id="moble_nav_item_2"> <a href="services.html" class="link link--kumya"><i class="fa fa-cog" aria-hidden="true"></i><span data-letters="Services">Services</span></a></li>
								<li class="m_nav_item" id="moble_nav_item_3"> <a href="about.html" class="link link--kumya"><i class="fa fa-info-circle" aria-hidden="true"></i><span data-letters="About Us">About Us</span></a></li>
								<li class="m_nav_item" id="moble_nav_item_4"> <a href="work.html" class="link link--kumya"><i class="fa fa-building-o" aria-hidden="true"></i><span data-letters="Our Work">Our Work</span></a></li>
								<li class="m_nav_item" id="moble_nav_item_6"> <a href="contact.html" class="link link--kumya"><i class="fa fa-envelope-o" aria-hidden="true"></i><span data-letters="Contact Us">Contact Us</span></a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
			<div class="header">
				<div class="agileits_w3layouts_logo">
					<h1><a href="index.jsp">Events Planning</a></h1>
				</div>
				
				<div class="clearfix"> </div>
			</div>	
	<div style="background-color:white; text-align:center; padding:100px 2px;">
		<% 
			hallSelectorDBUtil HS = new hallSelectorDBUtil();
			Hall h1 = HS.getHallDetails(TUser.getHall());
			
			MenuSelectorDBUtil MS = new MenuSelectorDBUtil();
			Menu m1 = MS.getMenuDetails(TUser.getMenu());
			
			DecoSelectorDBUtil DS = new DecoSelectorDBUtil();
			Deco d1 = DS.getDecoDetails(TUser.getDecoration());
			
			BandSelectorDBUtil BS = new BandSelectorDBUtil();
			Band b1 = BS.getBandDetails(TUser.getBand());			
		%>
		
		<%
			//calculate total price
			int total = h1.getPrice() + m1.getPrice() + d1.getPrice() + b1.getPrice();
		%>
	
			<hr>
			<h1>Type</h1>:  <% out.println(TUser.getType()); %> <br><br>
			<h1>Hall</h1>:	<% out.println(TUser.getHall()); %> <br><br>
			<h1>Menu</h1>:	<% out.println(TUser.getMenu()); %> <br><br>
			<h1>Decoration</h1>:	<% out.println(TUser.getDecoration()); %> <br><br>
			<h1>Band</h1>:	<% out.println(TUser.getBand()); %> <br><br>
			<h1>Total price</h1> :	<% out.println(total); %> <br><br>
			
		
			<hr>
		<form action="ArraangementSaveController" method="get">
			
			Enter Event Date <input type="date" name="date" required ><br><br>
			Enter Participation <input type ="text" name="participation" required><br><br><br>
				
			
			
			<input type="hidden" name="type1" value="<% out.print(TUser.getType()); %>">
			<input type="hidden" name="Hall" value="<% out.print(TUser.getHall()); %>">
			<input type="hidden" name="Menu" value="<% out.print(TUser.getMenu()); %>">
			<input type="hidden" name="Deco" value="<% out.print(TUser.getDecoration()); %>">
			<input type="hidden" name="Band" value="<% out.print(TUser.getBand()); %>">
			<input type="hidden" name="Tot" value="<% out.print(total); %>">
			<button name="button" value="confirm" class="button"> <span>Confirm</span> </button>
			
		</form>
		
		
	</div>
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<h2><a href="index.html">Events Planning</a></h2>
			<h3>Call (+94) 774 222 000</h3>
			
			<div class="agileits_w3three_nav">
				<div class="agileits_w3three_nav_left">
					<ul>
						<li><a href="index.html">Home</a></li>
						<li><a href="services.html">Services</a></li>
						<li><a href="about.html">About</a></li>
						<li><a href="work.html">Our Work</a></li>
						<li><a href="contact.html">Contact Us</a></li>
					</ul>
				</div>
				<div class="agileits_w3three_nav_right">
					<ul class="agileits_social_list">
						<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
						<li><a href="#" class="w3_agile_vimeo"><i class="fa fa-vimeo" aria-hidden="true"></i></a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<p>© 2021 Events Planning. All rights reserved </p>
		</div>
	</div>
<!-- //footer -->

<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- menu -->
	<script type="text/javascript" src="js/main.js"></script>
<!-- //menu -->
<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->

	
</body>
</html>