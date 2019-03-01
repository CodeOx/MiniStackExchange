package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.PrintWriter;
import connectionpack.Config;

public final class searchpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Mini Stack Exchange</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"is-preload\">\n");
      out.write("\n");
      out.write("\t\t\t<header id=\"header\">\n");
      out.write("\t\t\t\t<a class=\"logo\" href=\"index.jsp\">Mini Stack Exchange</a>\n");
      out.write("\t\t\t\t<nav>\n");
      out.write("                                    ");

                                    String s=(String)session.getAttribute("username");
                                    if(s==null)s="";
                                    else s="Welcome,".concat(s);
                                    
      out.print(s);
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"#menu\">Menu</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<!-- Nav -->\n");
      out.write("\t\t\t<nav id=\"menu\">\n");
      out.write("\t\t\t\t<ul class=\"links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t    <li><a href=\"loginpage.jsp\">Login</a></li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<li><a href=\"popularpage.jsp\">Popular</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t\t<div id=\"heading\" >\n");
      out.write("\t\t\t\t<h1>Mini STack Exchange</h1>\n");
      out.write("                                </div>\n");
      out.write("<br>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("                                   <section> </section><!-- CTA -->\n");
      out.write("                \n");
      out.write("                <div class=\"inner\" >\n");
      out.write("                    <form method=\"post\" action=\"searchservlet\"><div class=\"row gtr-50\" style=\"width:300px;align-content:center\" align=\"center\"><input type=\"text\" name=\"searchtext\" id=\"search\" value=\"\" placeholder=\"Search by Keyword\">\n");
      out.write("                        <br><input type=\"submit\"  value=\"Search\"  class=\"button primary fit icon fa-search\">               \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                        <br>");

                        String mn=request.getParameter("search");
                        
      out.write("\n");
      out.write("                    <center><H2>You searched For: ");
      out.print(mn);
      out.write("</h2></center>\n");
      out.write("                    <ul class=\"alt\">\n");
      out.write("                        <form name=frm action=\"viewpost\"  method=\"post\" action=\"\">\n");
      out.write("                            <input type=\"hidden\" name=\"hdnbtn\"/>\n");
      out.write("                            \n");
      out.write("                ");
Connection conn=null;
                Statement st=null;
                Statement st2=null;
                String username=null;
                String search=request.getParameter("search");
        try{
               Class.forName("org.postgresql.Driver");   
        conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_31", "postgres", "1234");
        String posttext;
        int postid;
            st =conn.createStatement();
            st2=conn.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM posts where posttypeid=1 and (title like '%"+search+"%' or body like '%"+search+"%') order by creationdate desc");
            
            while(resultSet.next())
            {
                posttext = resultSet.getString("title");
                postid=resultSet.getInt("id");
                int userid=resultSet.getInt("owneruserid");
                ResultSet rs=st2.executeQuery("SELECT * FROM users where id="+userid);
                Timestamp date=resultSet.getTimestamp("creationdate");
                while(rs.next())
                username=rs.getString("displayname");
                String datea=date.toLocalDateTime().toString();
                datea=datea.substring(0, 10);
                
      out.write("\n");
      out.write("                \n");
      out.write("\t\t\t<li><section>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t<font color=\"black\"><p>");
      out.print(posttext);
      out.write("\n");
      out.write("</p></font>\n");
      out.write("Asked By:<a href=\"userpage.jsp?id=");
      out.print(userid);
      out.write("\"> ");
      out.print(username);
      out.write("</a> <b>On:");
      out.print(datea);
      out.write(' ');
      out.print(resultSet.getInt("viewcount"));
      out.write(" Views  <div style=\"color: green;\">");
      out.print(resultSet.getInt("answercount"));
      out.write(" Answers</div><div align=\"right\">  <b></b><button id=postid name=\"Goto\" value=");
      out.print(postid);
      out.write(" onclick=\"{document.frm.hdnbt.value=this.value;document.frm.submit();}\"   class=\"button primary small\">Goto Post</button></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                       \n");
      out.write("\t\t\t</section>\n");
      out.write("    ");
 }
      conn.close();
      }
    catch(Exception e){
        out.println(e);
    }
        
    
      out.write(" \n");
      out.write("    </form>\n");
      out.write("</ul>\n");
      out.write("                        </div>\n");
      out.write("\t\t\n");
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
