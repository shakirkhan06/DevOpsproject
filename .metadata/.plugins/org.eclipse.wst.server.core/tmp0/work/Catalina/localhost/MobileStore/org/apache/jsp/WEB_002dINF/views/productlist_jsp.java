/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2017-06-02 17:11:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/F:/DevOpsproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MobileStore/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1495968158000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"\r\n");
      out.write("\txmlns:th=\"http://www.thymeleaf.org\">\r\n");
      out.write(" \r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<title>Spring Datatables</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./resources/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("\t<link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"./resources/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"./resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./resources/css/jquery.dataTables.min.css\">\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("  \r\n");
      out.write("<style>\r\n");
      out.write("#addcat\r\n");
      out.write("{\r\n");
      out.write(" position: relative;\r\n");
      out.write("        left:500px;\r\n");
      out.write("width:500px;\r\n");
      out.write("height:700px;\r\n");
      out.write("/* display:none; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addsup\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write(" position: relative;\r\n");
      out.write("        left:500px;\r\n");
      out.write("width:500px;\r\n");
      out.write("height:700px;\r\n");
      out.write("/* display:none; */\r\n");
      out.write("}\r\n");
      out.write("#addpro\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write(" position: relative;\r\n");
      out.write("        left:500px;\r\n");
      out.write("width:500px;\r\n");
      out.write("height:700px;\r\n");
      out.write("\r\n");
      out.write("/* display:none; */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
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
      out.write("<body>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("   \r\n");
      out.write("   <p></p>\r\n");
      out.write("   <h1>Products List</h1>   \r\n");
      out.write("   <p> </p><p> </p>\r\n");
      out.write("   \r\n");
      out.write("       <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("\r\n");
      out.write("           <div class=\"panel panel-default panel-table\">\r\n");
      out.write("             <div class=\"panel-heading\">\r\n");
      out.write("               <div class=\"row\">\r\n");
      out.write("                 <div class=\"col col-xs-6\">\r\n");
      out.write("                   <h3 class=\"panel-title\">Product Data Table</h3>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col col-xs-6 text-right\">\r\n");
      out.write("                   <a href=\"add\"><button type=\"button\" class=\"btn btn-sm btn-primary btn-create\">Create New</button></a>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"panel-body\">\r\n");
      out.write("               <table class=\"table table-striped table-bordered table-list\">\r\n");
      out.write("                 <thead>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                       <th><em class=\"fa fa-cog\"></em></th>\r\n");
      out.write("                       <th class=\"hidden-xs\">ID</th>\r\n");
      out.write("                       <th>Name</th>\r\n");
      out.write("                       <th>Category</th>\r\n");
      out.write("                       <th>Supplier</th>\r\n");
      out.write("                       <th>Price</th>\r\n");
      out.write("                       <th>Image</th>                                                                        \r\n");
      out.write("                   </tr> \r\n");
      out.write("                 </thead>\r\n");
      out.write("                 <tbody>\r\n");
      out.write("                         \r\n");
      out.write("                         ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                       </tbody>\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("               </table>\r\n");
      out.write("           \r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"panel-footer\">\r\n");
      out.write("               <div class=\"row\">\r\n");
      out.write("                 <div class=\"col col-xs-4\">Page 1 of 5\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col col-xs-8\">\r\n");
      out.write("                   <ul class=\"pagination hidden-xs pull-right\">\r\n");
      out.write("                     <li><a href=\"#\">1</a></li>\r\n");
      out.write("                     <li><a href=\"#\">2</a></li>\r\n");
      out.write("                     <li><a href=\"#\">3</a></li>\r\n");
      out.write("                     <li><a href=\"#\">4</a></li>\r\n");
      out.write("                     <li><a href=\"#\">5</a></li>\r\n");
      out.write("                   </ul>\r\n");
      out.write("                   <ul class=\"pagination visible-xs pull-right\">\r\n");
      out.write("                       <li><a href=\"#\">«</a></li>\r\n");
      out.write("                       <li><a href=\"#\">»</a></li>\r\n");
      out.write("                   </ul>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("\r\n");
      out.write("</div></div>\r\n");
      out.write("\t</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/productlist.jsp(119,25) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/productlist.jsp(119,25) '${slist}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${slist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/productlist.jsp(119,25) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("p");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                         <tr>\r\n");
            out.write("                         <td>\r\n");
            out.write("                                <a class=\"btn btn-default\" href=\"product_edit?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.prodId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><em class=\"fa fa-pencil\"></em></a>\r\n");
            out.write("                             <a class=\"btn btn-danger\" href=\"product_delete?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.prodId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" ><em class=\"fa fa-trash\"></em></a>\r\n");
            out.write("                             \r\n");
            out.write("                           </td>\r\n");
            out.write("                           <td class=\"hidden-xs\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.prodId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                           <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.prodName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                           <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.prodCategory.categoryName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>     \r\n");
            out.write("                           <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.prodSupplier.supplierName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>    \r\n");
            out.write("                           <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.prodPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td> \r\n");
            out.write("                           <td><img src=\"./resources/image/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.proImage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"  class=\"img-rounded\" alt=\"\" width=\"75px\" height=\"50px\"/></td>         \r\n");
            out.write("                           </tr>       \r\n");
            out.write("                         ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
