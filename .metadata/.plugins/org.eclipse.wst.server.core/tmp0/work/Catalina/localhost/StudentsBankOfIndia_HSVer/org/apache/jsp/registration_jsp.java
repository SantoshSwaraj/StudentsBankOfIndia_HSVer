/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.41
 * Generated at: 2017-04-02 02:03:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t\t<title>Registration</title>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./styles/footer.css\">\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("<!--=============================Banner Welcome to Students Bank Of India Stats=============================================-->\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\" style=\"background-color: #11dd48; border: 1px solid #69a5e5; height: 50px; color:white\">\r\n");
      out.write("                    <h3 style=\"font-family: Tahoma; text-align: center;\">Registation for Online Banking in SBI</h3>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    <!--=============================Banner Welcome to Students Bank Of India Ends=============================================-->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<h2>Register your account for Online Banking</h2> \r\n");
      out.write("        \r\n");
      out.write("        <form class=\"form-horizontal\" action=\"adminReg\" method=\"post\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Form Name -->\r\n");
      out.write("\t\t<legend>Register Here</legend>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Text input-->\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t<label class=\"col-md-4 control-label\" for=\"emp_fname\">First Name</label>  \r\n");
      out.write("  \t\t<div class=\"col-md-4\">\r\n");
      out.write("  \t\t<input id=\"emp_fname\" name=\"emp_fname\" placeholder=\"Insert your First Name\" class=\"form-control input-md\" required=\"\" type=\"text\">\r\n");
      out.write("  \t\t<span class=\"help-block\"> </span>  \r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Text input-->\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t<label class=\"col-md-4 control-label\" for=\"emp_mname\">Middle Name</label>  \r\n");
      out.write("  \t\t<div class=\"col-md-4\">\r\n");
      out.write("  \t\t<input id=\"emp_mname\" name=\"emp_mname\" placeholder=\"Insert your Middle Name\" class=\"form-control input-md\" type=\"text\">\r\n");
      out.write("  \t\t<span class=\"help-block\"> </span>  \r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- Text input-->\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("  \t<label class=\"col-md-4 control-label\" for=\"emp_lname\">Last Name</label>  \r\n");
      out.write("  \t<div class=\"col-md-4\">\r\n");
      out.write("  \t<input id=\"emp_lname\" name=\"emp_lname\" placeholder=\"Insert your Last Name\" class=\"form-control input-md\" required=\"\" type=\"text\">\r\n");
      out.write("  \t<span class=\"help-block\"> </span>  \r\n");
      out.write("  \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Text input-->\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("  \t<label class=\"col-md-4 control-label\" for=\"emp_design\">Designation</label>  \r\n");
      out.write("  \t<div class=\"col-md-4\">\r\n");
      out.write("  \t<input id=\"emp_design\" name=\"emp_design\" placeholder=\"Insert your Designation\" class=\"form-control input-md\" required=\"\" type=\"text\">\r\n");
      out.write("  \t<span class=\"help-block\"> </span>  \r\n");
      out.write("  \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- Text input-->\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("  \t<label class=\"col-md-4 control-label\" for=\"email\">Email</label>  \r\n");
      out.write("  \t<div class=\"col-md-4\">\r\n");
      out.write("  \t<input id=\"email\" name=\"email\" placeholder=\"Insert your Email\" class=\"form-control input-md\" required=\"\" type=\"text\">\r\n");
      out.write("  \t<span class=\"help-block\"> </span>  \r\n");
      out.write("  \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Text input-->\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("  \t<label class=\"col-md-4 control-label\" for=\"username\">UserName</label>  \r\n");
      out.write("  \t<div class=\"col-md-4\">\r\n");
      out.write("  \t<input id=\"username\" name=\"username\" placeholder=\"User Name\" class=\"form-control input-md\" required=\"\" type=\"text\">\r\n");
      out.write("  \t<span class=\"help-block\"> </span>  \r\n");
      out.write("  \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Text input-->\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("  \t<label class=\"col-md-4 control-label\" for=\"password\">Password</label>  \r\n");
      out.write("  \t<div class=\"col-md-4\">\r\n");
      out.write("  \t<input id=\"password\" name=\"password\" placeholder=\"Insert your Password\" class=\"form-control input-md\" required=\"\" type=\"password\">\r\n");
      out.write("  \t<span class=\"help-block\"> </span>  \r\n");
      out.write("  \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Button -->\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("  \t<label class=\"col-md-4 control-label\" for=\"singlebutton\"> </label>\r\n");
      out.write("  \t<div class=\"col-md-4\">\r\n");
      out.write("   \t <button id=\"singlebutton\" name=\"singlebutton\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("  \t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\t\r\n");
      out.write("\r\n");
      out.write("<!--=========================================================================================================================-->\r\n");
      out.write("  <!--=========================================================================================================================-->\r\n");
      out.write("  <!--=========================================================================================================================-->\r\n");
      out.write("  <!--============================================Footer Starts===============================================-->\r\n");
      out.write("  <!--footer start from here-->\r\n");
      out.write("  <footer>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-4 col-sm-6 footerleft \">\r\n");
      out.write("        <div class=\"logofooter\"> Logo</div>\r\n");
      out.write("        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley.</p>\r\n");
      out.write("        <p><i class=\"fa fa-map-pin\"></i> 210, Aggarwal Tower, Rohini sec 9, New Delhi -        110085, INDIA</p>\r\n");
      out.write("        <p><i class=\"fa fa-phone\"></i> Phone (India) : +91 9999 878 398</p>\r\n");
      out.write("        <p><i class=\"fa fa-envelope\"></i> E-mail : info@webenlance.com</p>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-2 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("        <h6 class=\"heading7\">GENERAL LINKS</h6>\r\n");
      out.write("        <ul class=\"footer-ul\">\r\n");
      out.write("          <li><a href=\"#\"> Career</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Privacy Policy</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Terms & Conditions</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Client Gateway</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Ranking</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Case Studies</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Frequently Ask Questions</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("        <h6 class=\"heading7\">LATEST POST</h6>\r\n");
      out.write("        <div class=\"post\">\r\n");
      out.write("          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>\r\n");
      out.write("          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>\r\n");
      out.write("          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("        <div class=\"fb-page\" data-href=\"https://www.facebook.com/facebook\" data-tabs=\"timeline\" data-height=\"300\" data-small-header=\"false\" style=\"margin-bottom:15px;\" data-adapt-container-width=\"true\" data-hide-cover=\"false\" data-show-facepile=\"true\">\r\n");
      out.write("          <div class=\"fb-xfbml-parse-ignore\">\r\n");
      out.write("            <blockquote cite=\"https://www.facebook.com/facebook\"><a href=\"https://www.facebook.com/facebook\">Facebook</a></blockquote>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("      <p>© 2016 - All Rights with Webenlance</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("      <ul class=\"bottom_ul\">\r\n");
      out.write("        <li><a href=\"#\">webenlance.com</a></li>\r\n");
      out.write("        <li><a href=\"#\">About us</a></li>\r\n");
      out.write("        <li><a href=\"#\">Blog</a></li>\r\n");
      out.write("        <li><a href=\"#\">Faq's</a></li>\r\n");
      out.write("        <li><a href=\"#\">Contact us</a></li>\r\n");
      out.write("        <li><a href=\"#\">Site Map</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--=========================Footer Ends Here===================-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
