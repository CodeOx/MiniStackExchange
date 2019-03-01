<%@page import="java.sql.*"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page import="org.apache.commons.io.output.*"%>
<%@ page import="org.apache.commons.fileupload.servlet.*"%>
<%@ page import="org.apache.commons.fileupload.disk.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE HTML>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
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
                                    if(sa==null)sa="";
                                    else sa="Welcome,".concat(sa);
                                    %><%=sa%>
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
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">
						
						<%
                                                    String s=request.getParameter("id");
                                                    if(s!=null){
                                                    Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_31", "postgres", "1234")) {
             Statement st=connection.createStatement();
             Statement st2=connection.createStatement();
             Statement st3=connection.createStatement();
             System.out.println("Connected to PostgreSQL database!");
            ResultSet rs=st.executeQuery("SELECT * FROM users where id="+s+"");
            int as=-255;
            if(session.getAttribute("userid")!=null){ 
            
            String n=(session.getAttribute("userid")).toString();
            if(n.equals("null"))
            {}
            else
            {if(Integer.parseInt(s)!=Integer.parseInt(n))
            st3.executeQuery("SELECT increment_view("+s+")");
           
            }
            }
            if(rs.next()){
            out.println("<h2 style=\"color:green;\">User:"+rs.getString("displayname")+" </h2><hr><br><div class=row><div class=\"col-6 col-12-medium\">");
            out.println("<i><h3>Profile</h3></i>");
            out.println("<img width='300' height='300' src=displayphoto?userid=" +  rs.getString("id") + " ></img> <p/>");
            out.println("<b>Reputation: </b>"+rs.getInt("reputation")+"<hr style=\"width:300px\">");
            out.println("<b>User Since: </b>"+rs.getTimestamp("creationdate").toString().substring(0,10)+"<hr style=\"width:300px\">");
            out.println("<b>Last Seen: </b>"+rs.getTimestamp("lastaccessdate").toString().substring(0,10)+"<hr style=\"width:300px\">");
            out.println("<b>Location: </b>"+rs.getString("location")+"<hr style=\"width:300px\">");
            out.println("<b>About me: </b>"+rs.getString("aboutme")+"<hr style=\"width:500px\">");
            out.println("<b>Upvotes Recieved: </b>"+rs.getInt("upvotes")+"<hr style=\"width:300px\">");
            out.println("<b>Downvotes Recieved: </b>"+rs.getInt("downvotes")+"<hr style=\"width:300px\">");
            out.println("<b>Profile Views: </b>"+rs.getInt("views")+"<hr style=\"width:300px\"></div>");
            
            ResultSet rs2=st2.executeQuery("select * from posts where owneruserid="+s+" and posttypeid=1 limit 5");
            if(rs2.next()){
            out.println("<div class=\"col-6 col-12-medium\" style=\"background-color:lightgrey\"><center><h3>Popular posts</h3></center><br>");
            out.println(rs2.getString("title")+"<br>");
            int ss=rs2.getInt("id");
            out.println("<div align=\"right\"><a href=postpage.jsp?postid="+ss+" class=\"button primary small\">Goto Post</a>  </div><hr><br>");
            while(rs2.next()){
            out.println(rs2.getString("title")+"<br>");
            ss=rs2.getInt("id");
            out.println("<div align=\"right\"><a href=postpage.jsp?postid="+ss+" class=\"button primary small\">Goto Post</a>  </div><hr><br>");
            
            
            }
            out.println("</div>");
            }
            else{
            out.println("<div class=\"col-6 col-12-medium\" style=\"background-color:lightgrey\"><h3>The user does not have any posts</h3></div></div>");
            }
            }
            else{
            out.println("<center><h1>404 Page not Found</h1><br><h3>Oops....We have reached a dead end</h3></center>");
            }
                    
          }catch (SQLException e) {
            out.print(e);
                e.printStackTrace();} }
             else{
            out.println("<center><h1>404 Page not Found</h1><br><h3>Oops....We have reached a dead end</h3></center>");
            }
                                                   
                                                    %></div>
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