/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2017-06-02 16:42:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.niit.model.CategoryModel;
import com.niit.model.SupplierModel;
import java.util.List;

public final class Adding_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.niit.model.CategoryModel");
    _jspx_imports_classes.add("com.niit.model.SupplierModel");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Adding Page</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.9/jquery-ui.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.9/themes/blitzer/jquery-ui.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- dialog -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("input[type=text], input[type=password] {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tpadding: 12px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("\tbackground-color: #e7e7e7;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tpadding: 14px 20px;\r\n");
      out.write("\tmargin: 8px 0;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("\topacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cancelbtn {\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("\tpadding: 10px 18px;\r\n");
      out.write("\tbackground-color: #e7e7e7;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* .imgcontainer {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin: 24px 0 12px 0;\r\n");
      out.write("} */\r\n");
      out.write(".container1 {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 350px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* span.psw {\r\n");
      out.write("    float: right;\r\n");
      out.write("    padding-top: 16px;\r\n");
      out.write("} */\r\n");
      out.write("\r\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\r\n");
      out.write("/* @media screen and (max-width: 300px) {\r\n");
      out.write("    span.psw {\r\n");
      out.write("       display: block;\r\n");
      out.write("       float: none;\r\n");
      out.write("    }\r\n");
      out.write("    .cancelbtn {\r\n");
      out.write("       width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("} */\r\n");
      out.write("#addcat {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tleft: 500px;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 700px;\r\n");
      out.write("\t/* display:none; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addsup {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tleft: 500px;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 700px;\r\n");
      out.write("\t/* display:none; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addpro {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tleft: 500px;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 700px;\r\n");
      out.write("\r\n");
      out.write("\t/* display:none; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pan {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 10px;\r\n");
      out.write("\ttop:250px;\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theigth: 400px;\r\n");
      out.write("\tborder: 3px solid #05396B;\r\n");
      out.write("\tpadding: 250px 150px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#chead {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 20px;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#shead {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 130px;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#phead {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 220px;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#cbuttonadd {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 80px;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sbuttonadd {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 185px;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pbuttonadd {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 280px;\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* #cbuttonclose\r\n");
      out.write("{\r\n");
      out.write("position:absolute;\r\n");
      out.write("top:140px;\r\n");
      out.write("left:0px;\r\n");
      out.write("} */\r\n");
      out.write("\r\n");
      out.write("/* The Modal (background) */\r\n");
      out.write(".modal {\r\n");
      out.write("\tdisplay: none; /* Hidden by default */\r\n");
      out.write("\tposition: fixed; /* Stay in place */\r\n");
      out.write("\tz-index: 1; /* Sit on top */\r\n");
      out.write("\tpadding-top: 100px; /* Location of the box */\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\twidth: 100%; /* Full width */\r\n");
      out.write("\theight: 100%; /* Full height */\r\n");
      out.write("\toverflow: auto; /* Enable scroll if needed */\r\n");
      out.write("\tbackground-color: rgb(0, 0, 0); /* Fallback color */\r\n");
      out.write("\tbackground-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Modal Content */\r\n");
      out.write(".modal-content {\r\n");
      out.write("\tbackground-color: #fefefe;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("\tborder: 1px solid #888;\r\n");
      out.write("\twidth: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Close Button */\r\n");
      out.write(".close {\r\n");
      out.write("\tcolor: #aaaaaa;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tfont-size: 28px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".close:hover, .close:focus {\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    $(\"#addcat\").hide();\r\n");
      out.write("    $(\"#addsup\").hide();\r\n");
      out.write("    $(\"#addpro\").hide();\r\n");
      out.write("\r\n");
      out.write("    $(\"#cbuttonadd\").click(function() {\r\n");
      out.write("         $(\"#addcat\").show();\r\n");
      out.write("           $(\"#addsup\").hide();\r\n");
      out.write("           $(\"#addpro\").hide();\r\n");
      out.write("           \r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"#sbuttonadd\").click(function() {\r\n");
      out.write("       $(\"#addcat\").hide();\r\n");
      out.write("         $(\"#addsup\").show();\r\n");
      out.write("         $(\"#addpro\").hide();\r\n");
      out.write("  });\r\n");
      out.write("    \r\n");
      out.write("    $(\"#pbuttonadd\").click(function() {\r\n");
      out.write("       $(\"#addcat\").hide();\r\n");
      out.write("         $(\"#addsup\").hide();\r\n");
      out.write("         $(\"#addpro\").show();\r\n");
      out.write("  });\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"pan\" class=\"w3-container w3-white\">\r\n");
      out.write("\t\t<h1 id=\"chead\">Category</h1>\r\n");
      out.write("\t\t<button id=\"cbuttonadd\">Add</button>\r\n");
      out.write("\t\t<br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t<h1 id=\"shead\">Supplier</h1>\r\n");
      out.write("\t\t<button id=\"sbuttonadd\">Add</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t<h1 id=\"phead\">Product</h1>\r\n");
      out.write("\t\t<button id=\"pbuttonadd\">Add</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"addcat\">\r\n");
      out.write("\t\t<form id=\"myform\" action=\"category\">\r\n");
      out.write("\t\t\t<h2>Add Category</h2>\r\n");
      out.write("\t\t\t<div class=\"container1\">\r\n");
      out.write("\t\t\t\t<label><b>Category Id</b></label> <input type=\"text\" name=\"cId\"\r\n");
      out.write("\t\t\t\t\tvalue=\"\" style=\"width: 350px; display: block;\"> <label><b>Category\r\n");
      out.write("\t\t\t\t\t\tName</b></label> <input type=\"text\" name=\"cn\" value=\"\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 350px; display: block;\"> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\tid=\"myBtn\" value=\"Add\" onclick=\"dialog()\"> <input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\" value=\"Cancel\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"addsup\">\r\n");
      out.write("\t\t<h2>Add Supplier</h2>\r\n");
      out.write("\t\t<form action=\"supplier\" id=\"form_purge\" name=\"form_purge\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<label><b>Supplier Id</b></label> <input type=\"text\" name=\"sId\"\r\n");
      out.write("\t\t\t\t\tvalue=\"\" style=\"width: 350px; display: block;\"> <label><b>Supplier\r\n");
      out.write("\t\t\t\t\t\tName</b></label> <input type=\"text\" name=\"sn\" value=\"\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 350px; display: block;\"> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\tid=\"myBtn\" value=\"Add\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <input type=\"submit\" value=\"Add\"> -->\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Cancel\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"addpro\">\r\n");
      out.write("\t\t<h2>Add Product</h2>\r\n");
      out.write("\t\t<form action=\"product\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<label><b>Product Id</b></label> \r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"pId\" value=\"\" style=\"width: 350px; display: block;\"> \r\n");
      out.write("\t\t\t\t<label><b>Product Name</b></label> \r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"pn\" value=\"\" style=\"width: 350px; display: block;\">\r\n");
      out.write("\t\t\t    <label><b>Product Category</b></label> \r\n");
      out.write("\t\t\t    <select style=\"width: 350px; display: block;\" name=\"pc\">\r\n");
      out.write("\t\t\t\t\t<option>Select Category</option>\r\n");
      out.write("\t\t\t\t\t\t");

                 		List<CategoryModel> clist=(List<CategoryModel>) request.getAttribute("clist");
                			for(CategoryModel c : clist){
                    			out.println("<option value='"+ c.getCategoryId() +"'>"+ c.getCategoryName() + "</option>");
                			}
                		
      out.write("\r\n");
      out.write("\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t<br> \r\n");
      out.write("\t\t\t\t<label><b>Supplier Category</b></label> \r\n");
      out.write("\t\t\t\t<select style=\"width: 350px; display: block;\" name=\"psc\">\r\n");
      out.write("\t\t\t\t\t<option>Select Supplier</option>\r\n");
      out.write("\t\t\t\t\t ");

                 		List<SupplierModel> slist=(List<SupplierModel>) request.getAttribute("slist");
                			for(SupplierModel s : slist){
                   				 out.println("<option value='"+ s.getSupplierId() +"'>"+ s.getSupplierName() + "</option>");
                			}
                
            		 
      out.write("\r\n");
      out.write("\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t<br> \r\n");
      out.write("\t\t\t\t<label><b>Product Price</b></label> \r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"pp\" value=\"\" style=\"width: 350px; display: block;\"> \r\n");
      out.write("\t\t\t\t<label><b>Product Image</b></label> \r\n");
      out.write("\t\t\t\t<input type=\"file\" name=\"file\" value=\"fileupload\" style=\"width: 350px; display: block;\"> \r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Add\"> \r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Cancel\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
