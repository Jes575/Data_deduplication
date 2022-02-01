package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>textured_blue</title>\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style1.css\" title=\"style\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("      <div id=\"logo\">\n");
      out.write("        <div id=\"logo_text\">\n");
      out.write("          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\n");
      out.write("          <h1><a href=\"index.html\"><span class=\"logo_colour\">A Secured Data Deduplication in Cloud Storage</span></a></h1>\n");
      out.write("         <!-- <h2>Simple. Contemporary. Website Template.</h2>-->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"menubar\">\n");
      out.write("        <ul id=\"menu\">\n");
      out.write("          <!-- put class=\"selected\" in the li tag for the selected page - to highlight which page you're on -->\n");
      out.write("          <li class=\"selected\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"eligibleFiles.jsp\">Download</a></li>\n");
      out.write("          <li><a href=\"fileList.jsp\">Share</a></li>\n");
      out.write("          <li><a href=\"home.jsp\">Upload</a></li>\n");
      out.write("           ");

if(session.getAttribute("LoginID")==null)
{
	out.print("<li><a href='login.jsp'>Login</a></li>");	
}else{
	out.print("<li><a href='logout.jsp'>Logout</a></li>");
}

      out.write("\n");
      out.write("           \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"site_content\">\n");
      out.write("      <div class=\"sidebar\">\n");
      out.write("        <!-- insert your sidebar items here -->\n");
      out.write("       <!-- <h3>Latest News</h3>\n");
      out.write("        <h4>New Website Launched</h4>\n");
      out.write("        <h5>August 1st, 2013</h5>\n");
      out.write("        <p>2013 sees the redesign of our website. Take a look around and let us know what you think.<br /><a href=\"#\">Read more</a></p>\n");
      out.write("        <p></p>\n");
      out.write("        <h4>New Website Launched</h4>\n");
      out.write("        <h5>August 1st, 2013</h5>\n");
      out.write("        <p>2013 sees the redesign of our website. Take a look around and let us know what you think.<br /><a href=\"#\">Read more</a></p>\n");
      out.write("        <h3>Useful Links</h3>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"#\">link 1</a></li>\n");
      out.write("          <li><a href=\"#\">link 2</a></li>\n");
      out.write("          <li><a href=\"#\">link 3</a></li>\n");
      out.write("          <li><a href=\"#\">link 4</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <h3>Search</h3>\n");
      out.write("        <form method=\"post\" action=\"#\" id=\"search_form\">\n");
      out.write("          <p>\n");
      out.write("            <input class=\"search\" type=\"text\" name=\"search_field\" value=\"Enter keywords.....\" />\n");
      out.write("            <input name=\"search\" type=\"image\" style=\"border: 0; margin: 0 0 -9px 5px;\" src=\"style/search.png\" alt=\"Search\" title=\"Search\" />\n");
      out.write("          </p>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"content\">-->\n");
      out.write("        <!-- insert the page content here -->\n");
      out.write("       <!-- <h1>Welcome to the textured_blue template</h1>\n");
      out.write("        <p>This standards compliant, simple, fixed width website template is released as an 'open source' design (under a <a href=\"http://creativecommons.org/licenses/by/3.0\">Creative Commons Attribution 3.0 Licence</a>), which means that you are free to download and use it for anything you want (including modifying and amending it). All I ask is that you leave the 'design from HTML5webtemplates.co.uk' link in the footer of the template, but other than that...</p>\n");
      out.write("        <p>This template is written entirely in <strong>HTML5</strong> and <strong>CSS</strong>, and can be validated using the links in the footer.</p>\n");
      out.write("        <p>You can view more free HTML5 web templates <a href=\"http://www.html5webtemplates.co.uk\">here</a>.</p>\n");
      out.write("        <p>This template is a fully functional 5 page website, with an <a href=\"examples.html\">examples</a> page that gives examples of all the styles available with this design.</p>\n");
      out.write("        <h2>Browser Compatibility</h2>\n");
      out.write("        <p>This template has been tested in the following browsers:</p>\n");
      out.write("        <ul>\n");
      out.write("          <li>Internet Explorer 8</li>\n");
      out.write("          <li>Internet Explorer 7</li>\n");
      out.write("          <li>FireFox 3.5</li>\n");
      out.write("          <li>Google Chrome 6</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("      Copyright &copy; textured_blue | <a href=\"http://validator.w3.org/check?uri=referer\">HTML5</a> | <a href=\"http://jigsaw.w3.org/css-validator/check/referer\">CSS</a> | <a href=\"http://www.html5webtemplates.co.uk\">Free CSS Templates</a>\n");
      out.write("    </div>-->\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>textured_blue</title>\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style1.css\" title=\"style\" />\n");
      out.write("</head>\n");

    System.out.print("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"site_content\">\n");
      out.write("      <div class=\"sidebar\">\n");
      out.write("        <!-- insert your sidebar items here -->\n");
      out.write("       <!-- <h3>Latest News</h3>\n");
      out.write("        <h4>New Website Launched</h4>\n");
      out.write("        <h5>August 1st, 2013</h5>\n");
      out.write("        <p>2013 sees the redesign of our website. Take a look around and let us know what you think.<br /><a href=\"#\">Read more</a></p>\n");
      out.write("        <p></p>\n");
      out.write("        <h4>New Website Launched</h4>\n");
      out.write("        <h5>August 1st, 2013</h5>\n");
      out.write("        <p>2013 sees the redesign of our website. Take a look around and let us know what you think.<br /><a href=\"#\">Read more</a></p>\n");
      out.write("        <h3>Useful Links</h3>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"#\">link 1</a></li>\n");
      out.write("          <li><a href=\"#\">link 2</a></li>\n");
      out.write("          <li><a href=\"#\">link 3</a></li>\n");
      out.write("          <li><a href=\"#\">link 4</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <h3>Search</h3>\n");
      out.write("        <form method=\"post\" action=\"#\" id=\"search_form\">\n");
      out.write("          <p>\n");
      out.write("            <input class=\"search\" type=\"text\" name=\"search_field\" value=\"Enter keywords.....\" />\n");
      out.write("            <input name=\"search\" type=\"image\" style=\"border: 0; margin: 0 0 -9px 5px;\" src=\"style/search.png\" alt=\"Search\" title=\"Search\" />\n");
      out.write("          </p>\n");
      out.write("        </form>\n");
      out.write("      </div>-->\n");
      out.write("      <div id=\"content\">\n");
      out.write("        <!-- insert the page content here -->\n");
      out.write("    <!--    <h1>Welcome to the textured_blue template</h1>\n");
      out.write("        <p>This standards compliant, simple, fixed width website template is released as an 'open source' design (under a <a href=\"http://creativecommons.org/licenses/by/3.0\">Creative Commons Attribution 3.0 Licence</a>), which means that you are free to download and use it for anything you want (including modifying and amending it). All I ask is that you leave the 'design from HTML5webtemplates.co.uk' link in the footer of the template, but other than that...</p>\n");
      out.write("        <p>This template is written entirely in <strong>HTML5</strong> and <strong>CSS</strong>, and can be validated using the links in the footer.</p>\n");
      out.write("        <p>You can view more free HTML5 web templates <a href=\"http://www.html5webtemplates.co.uk\">here</a>.</p>\n");
      out.write("        <p>This template is a fully functional 5 page website, with an <a href=\"examples.html\">examples</a> page that gives examples of all the styles available with this design.</p>\n");
      out.write("        <h2>Browser Compatibility</h2>\n");
      out.write("        <p>This template has been tested in the following browsers:</p>\n");
      out.write("        <ul>\n");
      out.write("          <li>Internet Explorer 8</li>\n");
      out.write("          <li>Internet Explorer 7</li>\n");
      out.write("          <li>FireFox 3.5</li>\n");
      out.write("          <li>Google Chrome 6</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("      Copyright &copy; textured_blue | <a href=\"http://validator.w3.org/check?uri=referer\">HTML5</a> | <a href=\"http://jigsaw.w3.org/css-validator/check/referer\">CSS</a> | <a href=\"http://www.html5webtemplates.co.uk\">Free CSS Templates</a>\n");
      out.write("    </div>\n");
      out.write("  </div>-->\n");
      out.write("</body>\n");
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
