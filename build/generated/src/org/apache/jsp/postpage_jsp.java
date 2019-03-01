package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.PrintWriter;
import connectionpack.Config;

public final class postpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fn_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fn_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fn_if_test.release();
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
      out.write(" \n");
      out.write("\n");
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
 boolean loginstatus=false;
                                    String sa=(String)session.getAttribute("username");
                                    if(sa==null)sa="";
                                    else {sa="Welcome,".concat(sa);
                                    loginstatus=true;
                                    }
                                    
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
      out.write("\t\t\t\t\t    <li><a href=\"loginpage.jsp\">Login</a></li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<li><a href=\"popularpage.jsp\">Popular</a></li>\n");
      out.write("                                        <li><a href=\"postinspage.jsp\">Create Post</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<section id=\"main\" class=\"wrapper\">\n");
      out.write("                            \n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("                                            ");
      if (_jspx_meth_fn_if_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      if (_jspx_meth_fn_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t<header>\n");
      out.write("                                                    ");

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
                                                    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\n");
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

  private boolean _jspx_meth_fn_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fn:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_fn_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_fn_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_fn_if_0.setPageContext(_jspx_page_context);
    _jspx_th_fn_if_0.setParent(null);
    _jspx_th_fn_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param[\"alr\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_fn_if_0 = _jspx_th_fn_if_0.doStartTag();
    if (_jspx_eval_fn_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" <p style=\"color:red;font-weight:bold;\">You have already Upvoted/Downvoted</p>\n");
        int evalDoAfterBody = _jspx_th_fn_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_fn_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_0);
      return true;
    }
    _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_0);
    return false;
  }

  private boolean _jspx_meth_fn_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fn:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_fn_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_fn_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_fn_if_1.setPageContext(_jspx_page_context);
    _jspx_th_fn_if_1.setParent(null);
    _jspx_th_fn_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param[\"als\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_fn_if_1 = _jspx_th_fn_if_1.doStartTag();
    if (_jspx_eval_fn_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" <p style=\"color:red;font-weight:bold;\">You cannot Upvote/Downvote your own post</p>\n");
        int evalDoAfterBody = _jspx_th_fn_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_fn_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_1);
      return true;
    }
    _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_1);
    return false;
  }
}
