package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signuppage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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

if(session.getAttribute("userid")!=null)
    response.sendRedirect("index.jsp");

      out.write("\n");
      out.write("\t\t\t<header id=\"header\">\n");
      out.write("\t\t\t\t<a class=\"logo\" href=\"index.jsp\">Mini Stack Exchange</a>\n");
      out.write("\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t<a href=\"#menu\">Menu</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<!-- Nav -->\n");
      out.write("\t\t\t<nav id=\"menu\">\n");
      out.write("\t\t\t\t<ul class=\"links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t                    <li><a href=\\\"loginpage.jsp\\\">Login</a></li>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"popularpage.jsp\">Popular</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t\t\n");
      out.write("                <br>\n");
      out.write("                <section id=\"main\" class=\"wrapper\">\n");
      out.write("                    <center>\n");
      out.write("                        <div class=\"inner\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                        <h3>Welcome to Mini Stack Exchange</h3>\n");
      out.write("                        <h6>Here is some thing that you have to fill to get started...</h6>\n");
      out.write("                          ");
      if (_jspx_meth_fn_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                          ");
      if (_jspx_meth_fn_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                          ");
      if (_jspx_meth_fn_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                          \n");
      out.write("                          ");
      if (_jspx_meth_fn_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                          ");
      if (_jspx_meth_fn_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\t<form method=\"post\" action=\"signupservlet\" enctype='multipart/form-data'>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-1-medium gtr-uniform\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                    \n");
      out.write("                                                                                    <div class=\"col-6 col-12-xsmall\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"name\" value=\"\" placeholder=\"User Name\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                \n");
      out.write("                                                                                    <br>\n");
      out.write("                                                                                    <div class=\"col-6 col-12-xsmall\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" id=\"name\" value=\"\" placeholder=\"Email Address\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                \n");
      out.write("                                                                                    <br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-6 col-12-xsmall\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\" value=\"\" placeholder=\"Password\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Break -->\n");
      out.write("                                                                                        <br>\n");
      out.write("                                                                                        <div class=\"col-6 col-12-xsmall\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"confirm\" id=\"confirm\" value=\"\" placeholder=\"Confirm Password\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Break -->\n");
      out.write("                                                                                        <br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"location\" id=\"location\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">- Select Location-</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Australia\">Australia</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Egypt\">Egypt</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"India\">India</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"New York\">New York</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"New Zealand\">New Zealand</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"South Africa\">South Africa</option>\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                        <br>\n");
      out.write("                                                                                            <div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"textarea\" id=\"textarea\" placeholder=\"Tell us something about You.\" rows=\"6\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                        <br>\n");
      out.write("                                                                                        <div class=\"col-12\">\n");
      out.write("                                                                                           Upload Your Profile Picture: <input type=\"file\"  accept=\".jpg,.png\" name=\"userphoto\" /> \n");
      out.write("                                                                                        </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"Submit\" value=\"Signup\" class=\"button primary\">\n");
      out.write("                                                                                        <input type=\"reset\" value=\"Clear\" class=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("                        </div>\n");
      out.write("                            </div>\n");
      out.write("                    </center>\n");
      out.write("                </section>\n");
      out.write("              \n");
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
    _jspx_th_fn_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param[\"mismatch\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_fn_if_0 = _jspx_th_fn_if_0.doStartTag();
    if (_jspx_eval_fn_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                              <br>\n");
        out.write("                            <p style=\"color:red;font-weight:bold;\">Password Doesn't match!!!..please try again</p>\n");
        out.write("                          <br>\n");
        out.write("                          ");
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
    _jspx_th_fn_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param[\"exists\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_fn_if_1 = _jspx_th_fn_if_1.doStartTag();
    if (_jspx_eval_fn_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                              <br>\n");
        out.write("                            <p style=\"color:red;font-weight:bold;\">Email Address Already Registered!!!..please try another one</p>\n");
        out.write("                          <br>\n");
        out.write("                          ");
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

  private boolean _jspx_meth_fn_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fn:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_fn_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_fn_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_fn_if_2.setPageContext(_jspx_page_context);
    _jspx_th_fn_if_2.setParent(null);
    _jspx_th_fn_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param[\"anscom\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_fn_if_2 = _jspx_th_fn_if_2.doStartTag();
    if (_jspx_eval_fn_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                              <br>\n");
        out.write("                            <p style=\"color:red;font-weight:bold;\">Hold on!!!You need to login before you interact interact with us.</p>\n");
        out.write("                          <br>\n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_fn_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_fn_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_2);
      return true;
    }
    _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_2);
    return false;
  }

  private boolean _jspx_meth_fn_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fn:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_fn_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_fn_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_fn_if_3.setPageContext(_jspx_page_context);
    _jspx_th_fn_if_3.setParent(null);
    _jspx_th_fn_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param[\"loc\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_fn_if_3 = _jspx_th_fn_if_3.doStartTag();
    if (_jspx_eval_fn_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                              <br>\n");
        out.write("                            <p style=\"color:red;font-weight:bold;\">please select location</p>\n");
        out.write("                          <br>\n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_fn_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_fn_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_3);
      return true;
    }
    _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_3);
    return false;
  }

  private boolean _jspx_meth_fn_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fn:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_fn_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_fn_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_fn_if_4.setPageContext(_jspx_page_context);
    _jspx_th_fn_if_4.setParent(null);
    _jspx_th_fn_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param[\"empty\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_fn_if_4 = _jspx_th_fn_if_4.doStartTag();
    if (_jspx_eval_fn_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                              <br>\n");
        out.write("                            <p style=\"color:red;font-weight:bold;\">About field is mandatory</p>\n");
        out.write("                          <br>\n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_fn_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_fn_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_4);
      return true;
    }
    _jspx_tagPool_fn_if_test.reuse(_jspx_th_fn_if_4);
    return false;
  }
}
