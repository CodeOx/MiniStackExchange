<%-- 
    Document   : loginpa Created on : 17 Feb, 2019, 7:30:57 PM
    Author     : suraj
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" 
    prefix="fn" %> 
--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Mini Stack Exchange</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="is-preload">
<%
if(session.getAttribute("userid")!=null)
    response.sendRedirect("index.jsp");
%>
			<header id="header">
				<a class="logo" href="index.jsp">Mini Stack Exchange</a>
				<nav>
					<a href="#menu">Menu</a>
				</nav>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="index.jsp">Home</a></li>
					
                                          <li><a href="loginpage.jsp">Login</a></li>
                                        
					<li><a href="popularpage.jsp">Popular</a></li>
                                        <li><a href="postinspage.jsp">Create Post</a></li>
				</ul>
			</nav>
				
                <br>
                <section id="main" class="wrapper">
                    <center>
                        <div class="inner">
                            <div class="content">
                        <h3>Login To Mini Stack Exchange</h3>
                          <fn:if test='${not empty param["RetryLogin"]}'>
 <p style="color:red;font-weight:bold;">Wrong Username or Password.</p>
</fn:if>
 <fn:if test='${not empty param["anscom"]}'>
 <p style="color:red;font-weight:bold;">Hold on!!!You need to login before writing.</p>
</fn:if>
									<form method="post" action="loginservlet">
										<div class="col-1-medium gtr-uniform">
											<div class="col-6 col-12-xsmall">
												<input type="email" name="email" id="name" value="" placeholder="Email Address" />
											</div>
                                                                                
                                                                                    <br>
											<div class="col-6 col-12-xsmall">
												<input type="password" name="password" id="password" value="password" placeholder="Password" />
											</div>
											<!-- Break -->
                                                                                        <br>
											<input type="Submit" value="Login" class="button primary">
                                                                                        <input type="reset" value="Clear" class="button">
                                                                                        <br>
                                                                                        <br>
                                                                                        Not Having Account?No need to worry <a href="signuppage.jsp">Signup here.</a>
										</div>
									</form>
                        </div>
                            </div>
                    </center>
                </section>
              
			<footer id="footer">
				<div class="inner">
					<div class="content">
						<section>
							<h3>Mini Stack Exchange</h3>
							<p>The Website is developed on netbeans using java Server pages and servlets,using PostgreSQL on the backend and having a wide variety of features.</p>
						</section>
						<section>
							<h4>Shortcuts</h4>
							<ul class="alt">
								<li><a href="#">Login Page.</a></li>
								<li><a href="#">Signup Page.</a></li>
								<li><a href="#">Search page</a></li>
								<li><a href="#">Posts</a></li>
							</ul>
						</section>
						<section>
							<h4>Links to favorites</h4>
							<ul class="plain">
								<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
								<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
								<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
								<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
							</ul>
						</section>
					</div>
					<div class="copyright">
						&copy; Untitled. Photos <a href="#">SSS</a> <a href="https://coverr.co">Initiative</a>.
					</div>
				</div>
			</footer>


		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>