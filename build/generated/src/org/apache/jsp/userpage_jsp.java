package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.io.output.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.disk.*;
import java.io.*;
import java.util.*;

public final class userpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("\tIndustrious by TEMPLATED\n");
      out.write("\ttemplated.co @templatedco\n");
      out.write("\tReleased for free under the Creative Commons Attribution 3.0 license (templated.co/license)\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Mini Stack Exchange</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("                <script type=\"text/x-mathjax-config\">\n");
      out.write("  MathJax.Hub.Config({tex2jax: {inlineMath: [['$','$'], ['\\\\(','\\\\)']]}});\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("  src=\"http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML\">\n");
      out.write("</script>\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"is-preload\">\n");
      out.write("\n");
      out.write("\t\t\t<header id=\"header\">\n");
      out.write("\t\t\t\t<a class=\"logo\" href=\"index.jsp\">Mini Stack Exchange</a>\n");
      out.write("\t\t\t\t<nav>\n");
      out.write("                                    \n");
      out.write("                                    ");

                                    String sa=(String)session.getAttribute("username");
                                    if(sa==null)sa="";
                                    else sa="Welcome,".concat(sa);
                                    
      out.print(sa);
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"#menu\">Menu</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<!-- Nav -->\n");
      out.write("\t\t\t<nav id=\"menu\">\n");
      out.write("\t\t\t\t<ul class=\"links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"loginpage.jsp\">Login</a></li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<li><a href=\"popularpage.jsp\">Popular</a></li>\n");
      out.write("                                        <li><a href=\"postinspage.jsp\">Create Post</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<section id=\"main\" class=\"wrapper\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t");

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
                                                   
                                                    
      out.write("</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t\t<footer id=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t<h3>Mini Stack Exchange</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>The Website is developed on netbeans using java Server pages and servlets,using PostgreSQL on the backend and having a wide variety of features.</p>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t<h4>Shortcuts</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"alt\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Login Page.</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Signup Page.</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Search page</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Posts</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t<h4>Links to favorites</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"plain\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon fa-twitter\">&nbsp;</i>Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon fa-facebook\">&nbsp;</i>Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon fa-instagram\">&nbsp;</i>Instagram</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon fa-github\">&nbsp;</i>Github</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t&copy; Untitled. Photos <a href=\"#\">SSS</a> <a href=\"https://coverr.co\">Initiative</a>.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/browser.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/breakpoints.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
