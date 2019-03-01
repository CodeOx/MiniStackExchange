<%@page import="java.sql.*"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="connectionpack.Config"%>
<html>
	<head>
		<title>Mini Stack Exchange</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="assets/css/main.css" />
                <script type="text/x-mathjax-config">
  MathJax.Hub.Config({tex2jax: {inlineMath: [['$','$'], ['\\(','\\)']]}});
</script>
<script type="text/javascript"
  src="http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML">
</script>
	</head>
	<body class="is-preload">

			<header id="header">
				<a class="logo" href="index.jsp">Mini Stack Exchange</a>
				<nav>
                                    
                                    <%
                                    String sa=(String)session.getAttribute("username");
                                    if(sa==null)response.sendRedirect("loginpage.jsp?anscom=True");
                                    else sa="Welcome,".concat(sa);
                                    %><%=sa%>
					<a href="#menu">Menu</a>
				</nav>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="index.jsp">Home</a></li>
					    <li><a href=\"loginpage.jsp\">Login</a></li>
                                        
					<li><a href="popularpage.jsp">Popular</a></li>
                                        <li><a href="postinspage.jsp">Create Post</a></li>
				</ul>
			</nav>
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">
						<header>
                                                    <%
                                                    
                    String sb=(String)session.getAttribute("userid");
                                    
                out.println("<form action=\"postinservlet\" method=\"post\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><input type=\"text\" placeholder=\"title\" name=\"title\"><br><textarea name=\"textarea\" rows=10></textarea><br><input type=\"submit\" value=\"Post\">   <a href=\"index.jsp\" class=\"button primary\">Cancel</a></form>");
                
            
            
            
            
                    
                                                   %>
							
						</header>
						<hr />
						</div>
				</div>
			</section>
	
		<!-- Footer -->
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