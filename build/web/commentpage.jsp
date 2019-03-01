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
                                    if(sa==null)response.sendRedirect("loginpage.jsp?anscom=true");
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
                                                    String s=request.getParameter("postid");
                                                    Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_31", "postgres", "1234")) {
             Statement st=connection.createStatement();
             Statement st2=connection.createStatement();
             Statement st3=connection.createStatement();
             Statement st4=connection.createStatement();
             Statement st5=connection.createStatement();
             Statement st6=connection.createStatement();
             Statement st7=connection.createStatement();
             System.out.println("Connected to PostgreSQL database!");
            ResultSet rs=st.executeQuery("SELECT * FROM posts where id="+s+"");
            if(rs.next()){
                String users=rs.getString("owneruserid");
                ResultSet rs2=st2.executeQuery("SELECT * FROM users where id="+users);
                if(rs2.next()){
                    out.println("<h1>Add comment</h1><blockquote><font color=black><h2>"+rs.getString("title")+"</h2></font><hr>"+"Asked By:<a href=userpage.jsp?id="+users+">"+rs2.getString("displayname")+"</a><hr><p>"+rs.getString("body")+"</p></blockquote>");
                out.println("<form action=\"commentservlet\" method=\"post\"><input type=\"text\" name=\"postid\" value=\""+s+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><textarea name=\"textarea\" rows=10></textarea><br><input type=\"submit\" value=\"Comment\">   <a href=\"postpage.jsp?postid="+s+"\" class=\"button primary\">Cancel</a></form>");
                }
            
            }
            
            else{
            out.println("<center><h1>404 Page not Found</h1><br><h3>Oops....We have reached a dead end</h3></center>");
            }
                    
          }catch (SQLException e) {
            out.print(e);
                e.printStackTrace();}   
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