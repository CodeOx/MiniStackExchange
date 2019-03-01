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
					                    <li><a href=\"loginpage.jsp\">Login</a></li>
                                        
							<li><a href="popularpage.jsp">Popular</a></li>
				</ul>
			</nav>
				
                <br>
                <section id="main" class="wrapper">
                    <center>
                        <div class="inner">
                            <div class="content">
                        <h3>Welcome to Mini Stack Exchange</h3>
                        <h6>Here is some thing that you have to fill to get started...</h6>
                          <fn:if test='${not empty param["mismatch"]}'>
                              <br>
                            <p style="color:red;font-weight:bold;">Password Doesn't match!!!..please try again</p>
                          <br>
                          </fn:if>
                          <fn:if test='${not empty param["exists"]}'>
                              <br>
                            <p style="color:red;font-weight:bold;">Email Address Already Registered!!!..please try another one</p>
                          <br>
                          </fn:if>
                          <fn:if test='${not empty param["anscom"]}'>
                              <br>
                            <p style="color:red;font-weight:bold;">Hold on!!!You need to login before you interact interact with us.</p>
                          <br>
                          </fn:if>
                          
                          <fn:if test='${not empty param["loc"]}'>
                              <br>
                            <p style="color:red;font-weight:bold;">please select location</p>
                          <br>
                          </fn:if>
                          <fn:if test='${not empty param["empty"]}'>
                              <br>
                            <p style="color:red;font-weight:bold;">About field is mandatory</p>
                          <br>
                          </fn:if>
                            
			  
									<form method="post" action="signupservlet" enctype='multipart/form-data'>
										<div class="col-1-medium gtr-uniform">
											
                                                                                    
                                                                                    <div class="col-6 col-12-xsmall">
												<input type="text" name="username" id="name" value="" placeholder="User Name" />
											</div>
                                                                                
                                                                                    <br>
                                                                                    <div class="col-6 col-12-xsmall">
												<input type="email" name="email" id="name" value="" placeholder="Email Address" />
											</div>
                                                                                
                                                                                    <br>
											<div class="col-6 col-12-xsmall">
												<input type="password" name="password" id="password" value="" placeholder="Password" />
											</div>
											<!-- Break -->
                                                                                        <br>
                                                                                        <div class="col-6 col-12-xsmall">
												<input type="password" name="confirm" id="confirm" value="" placeholder="Confirm Password" />
											</div>
											<!-- Break -->
                                                                                        <br>
											<div class="col-12">
												<select name="location" id="location">
													<option value="">- Select Location-</option>
													<option value="Australia">Australia</option>
													<option value="Egypt">Egypt</option>
													<option value="India">India</option>
													<option value="New York">New York</option>
													<option value="New Zealand">New Zealand</option>
													<option value="South Africa">South Africa</option>												</select>
											</div>
                                                                                        <br>
                                                                                            <div class="col-12">
												<textarea name="textarea" id="textarea" placeholder="Tell us something about You." rows="6"></textarea>
											</div>
                                                                                        <br>
                                                                                        <div class="col-12">
                                                                                           Upload Your Profile Picture: <input type="file"  accept=".jpg,.png" name="userphoto" /> 
                                                                                        </div>
											<br>
											<input type="Submit" value="Signup" class="button primary">
                                                                                        <input type="reset" value="Clear" class="button">
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