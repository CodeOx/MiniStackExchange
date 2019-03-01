<%@page import="java.sql.*"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="connectionpack.Config"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/core"%> 

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
                                    
                                    <% boolean loginstatus=false;
                                    String sa=(String)session.getAttribute("username");
                                    if(sa==null)sa="";
                                    else {sa="Welcome,".concat(sa);
                                    loginstatus=true;
                                    }
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
                                            <fn:if test='${not empty param["alr"]}'>
 <p style="color:red;font-weight:bold;">You have already Upvoted/Downvoted</p>
</fn:if>
 <fn:if test='${not empty param["als"]}'>
 <p style="color:red;font-weight:bold;">You cannot Upvote/Downvote your own post</p>
</fn:if>
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
             Statement st8=connection.createStatement();
             Statement st9=connection.createStatement();
             Statement st10=connection.createStatement();
             Statement st11=connection.createStatement();
             Statement st12=connection.createStatement();
             Statement st13=connection.createStatement();
             Statement st14=connection.createStatement();
             Statement st16=connection.createStatement();
             
             System.out.println("Connected to PostgreSQL database!");
            ResultSet rs=st.executeQuery("SELECT * FROM posts where id="+s+" and posttypeid=1");
            if(loginstatus)
                st16.executeUpdate("update posts set viewcount=viewcount+1 where id="+s);
            ResultSet rs3=st3.executeQuery("SELECT * FROM comments where postid="+s+" order by score desc,creationdate desc");
            if(rs.next()){
                int sel;
                sel=rs.getInt("acceptedanswerid");
                String users=rs.getString("owneruserid");
                ResultSet rs2=st2.executeQuery("SELECT * FROM users where id="+users);
                if(rs2.next())
                    out.println("<font color=black><h2>"+rs.getString("title")+"</h2></font><hr>"+"Asked By:<a href=userpage.jsp?id="+users+">"+rs2.getString("displayname")+"</a><hr><p>"+rs.getString("body")+"</p><font style=\"color:green\">No Of Answers:"+rs.getString("answercount")+"</font>");
                out.println("<hr><a href=answerpage.jsp?postid="+s+" class=\"button primary small\">Answer</a>   <a href=commentpage.jsp?postid="+s+" class=\"button primary small\">Comment</a>   <form method=\"post\" action=\"upvote\"><input type=\"text\" name=\"postid\" value=\""+s+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><br><input type=\"submit\" value=\"upvote  \" class=\"button primary small\"></form>"
                        + "<form method=\"post\" action=\"downvotes\"><input type=\"text\" name=\"postid\" value=\""+s+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><input type=\"submit\" value=\"downvote\" class=\"button primary small\"></form><hr><h3>Comments</h3>");
                while(rs3.next())
            {   String r=rs3.getString("userid");
                ResultSet rs4=st4.executeQuery("SELECT * FROM users where id="+r);
                if(rs4.next()){
                if(!loginstatus){
                    out.println("<hr><font size=1>"+rs3.getString("texts")+"<p><br>By: <a href=userpage.jsp?id="+r+">"+rs4.getString("displayname")+"</a> On: "+rs3.getTimestamp("creationdate").toString().substring(0, 10)+"</font><br><a href=\"loginpage.jsp\" class=\"button small\">like</a>");
                }
                else{
                    out.println("<hr><font size=1>"+rs3.getString("texts")+"<p><br>By: <a href=userpage.jsp?id="+r+">"+rs4.getString("displayname")+"</a> On: "+rs3.getTimestamp("creationdate").toString().substring(0, 10)+"</font><br>");
                
                    String cmtid=rs3.getString("id");
                    String usr=(String)session.getAttribute("userid");
                ResultSet rs14=st14.executeQuery("select * from likestats where likecomment=true and commentid="+cmtid+" and userid="+usr);
                if(rs14.next())
               {
               out.println("<br><form method=\"post\" action=\"like\"><input type=\"text\" name=\"postid\" value=\""+s+"\" style=\"display:none;\"><input type=\"text\" name=\"commentid\" value=\""+cmtid+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><input type=\"submit\" value=\"Liked\" class=\"button primary small\"></form><hr>");
               }
               else{
               out.println("<br><form method=\"post\" action=\"like\"><input type=\"text\" name=\"postid\" value=\""+s+"\" style=\"display:none;\"><input type=\"text\" name=\"commentid\" value=\""+cmtid+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><input type=\"submit\" value=\"Like\" class=\"button small\"></form><hr>");
               }
               
                }
                }
            }
            ResultSet rs5=st5.executeQuery("select id from posts where parentid="+s+" order by score desc");
            out.println("<h3>Answers</h3><hr>");
            while(rs5.next()){
            String id3=rs5.getString("id");
            ResultSet rs6=st6.executeQuery("select * from posts where posttypeid<>1 and id="+id3);
            while(rs6.next()){
            ResultSet rs7=st7.executeQuery("select * from users where id="+rs6.getString("owneruserid"));
            String owner=null;
            if(rs7.next())
            {owner=rs7.getString("displayname");              
            }
            if(Integer.parseInt(id3)==sel)
                out.println("<div style=\"Background-color:#E4F9B7;\"><H3><div style=\"color:green\">Selected Answer</div></H3>");
            out.println("<hr><p>"+rs6.getString("body")+"</p>Answered By:<a href=userpage.jsp?id="+rs6.getString("owneruserid")+">"+owner+"</a>  On:"+rs6.getTimestamp("creationdate").toString().substring(0, 10));
            if(Integer.parseInt(id3)==sel)
                out.println("</div>");
            
            out.println("<hr><a href=commentpage.jsp?postid="+id3+" class=\"button primary small\">Comment</a><br><br><form method=\"post\" action=\"upvote\"><input type=\"text\" name=\"postid\" value=\""+id3+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><input type=\"submit\" value=\"upvote  \" class=\"button primary small\"></form>"
                    + "<form method=\"post\" action=\"downvotes\"><input type=\"text\" name=\"postid\" value=\""+id3+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><input type=\"submit\" value=\"downvote \" class=\"button primary small\"></form><br><h5>Comments</h5>");
            ResultSet rs8=st8.executeQuery("SELECT * FROM comments where postid="+id3+" order by score desc,creationdate desc");
            while(rs8.next())
            {   if(!loginstatus)
                {String r=rs8.getString("userid");
                ResultSet rs9=st9.executeQuery("SELECT * FROM users where id="+r);
                if(rs9.next())
                out.println("<hr><font size=1>"+rs8.getString("texts")+"<p><br>By: <a href=userpage.jsp?id="+r+">"+rs9.getString("displayname")+"</a> On: "+rs.getTimestamp("creationdate").toString().substring(0, 10)+"</font><br><a href=\"loginpage.jsp\" class=\"button small\">like</a>");
                }
            else{
            String r=rs8.getString("userid");
                ResultSet rs9=st9.executeQuery("SELECT * FROM users where id="+r);
            String usr=(String) session.getAttribute("userid");
            String cmtid=rs8.getString("id");
           ResultSet rs13=st13.executeQuery("select * from likestats where likecomment=true and commentid="+cmtid+" and userid="+usr);
                if(rs9.next())
                out.println("<font size=1>"+rs8.getString("texts")+"<p><br>By: <a href=userpage.jsp?id="+r+">"+rs9.getString("displayname")+"</a> On: "+rs.getTimestamp("creationdate").toString().substring(0, 10)+"</font>");
               if(rs13.next())
               {
               out.println("<br><form method=\"post\" action=\"like\"><input type=\"text\" name=\"postid\" value=\""+s+"\" style=\"display:none;\"><input type=\"text\" name=\"commentid\" value=\""+cmtid+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><input type=\"submit\" value=\"Liked\" class=\"button primary small\"></form><hr>");
               }
               else{
               out.println("<br><form method=\"post\" action=\"like\"><input type=\"text\" name=\"postid\" value=\""+s+"\" style=\"display:none;\"><input type=\"text\" name=\"commentid\" value=\""+cmtid+"\" style=\"display:none;\"><input type=\"text\" name=\"userid\" value=\""+session.getAttribute("userid")+"\" style=\"display:none;\"><input type=\"submit\" value=\"Like\" class=\"button small\"></form><hr>");
               }
            }
            }
            }
            }
            out.println("<hr><div style=\"background-color:#F7D1A9\"><h3><div style=\"color:blue;\">Related Post</div></h3>");
            ResultSet rs10=st10.executeQuery("select get_relatedpostids('"+rs.getString("title").replace("'", "")+"') as sr");
            while(rs10.next())
            {
                if(rs10.getString("sr")==null)
                    break;
                ResultSet rs11=st11.executeQuery("select * from posts where id in"+rs10.getString("sr").replace("{", "(").replace("}", ")"));
            while(rs11.next()){
            out.println(rs11.getString("title")+"<br>"+"<b>Asked By: </b><a href=userpage.jsp?id="+rs11.getString("owneruserid")+">");
            ResultSet rs12=st12.executeQuery("select displayname from users where id="+rs11.getString("owneruserid"));
            if(rs12.next())
            out.println(rs12.getString("displayname")+"</a> On:"+rs.getTimestamp("creationdate")+"<div align=\"right\"><a class=\"button primary small\" href=\"postpage.jsp?postid="+rs10.getString("sr")+"\" >Goto</a></div><hr>");
            }
            out.println("</div>");
            
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