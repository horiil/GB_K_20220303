/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-07-01 00:38:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Info;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_002dInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/User-Info.css\"> -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<header> ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header/header.jsp", out, false);
      out.write(" </header>\n");
      out.write("	\n");
      out.write("	<div class=\"info-member-container\">\n");
      out.write("		<h1 class=\"info-usermodify-auth-title\">회원정보확인</h1>\n");
      out.write("		<p class=\"usermodify-msg\" style=\"margin-left: 18%\">\n");
      out.write("			<strong class=\"usermodify=mail\">\n");
      out.write("				testEmail@google.com\n");
      out.write("			</strong>\n");
      out.write("		\"님의 정보를 안전하게 보호하기 위해 비밀번호를 다시 한번 확인 합니다.\n");
      out.write("		</p>\n");
      out.write("		\n");
      out.write("		<form action=\"#\" name=\"user-info-certification\">\n");
      out.write("			<table class=\"info-UserModify-table\">\n");
      out.write("				<tbody>\n");
      out.write("					<tr style=\"height: 37px;\">\n");
      out.write("						<th scope=\"row\">아이디(이메일)</th>\n");
      out.write("						<td> testId </td>\n");
      out.write("					</tr>\n");
      out.write("					<tr>\n");
      out.write("						<th scope=\"row\">비밀번호</th>\n");
      out.write("						<td>\n");
      out.write("							<input type=\"password\" id=\"testpw\">\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("				\n");
      out.write("				</tbody>\n");
      out.write("			</table>	\n");
      out.write("		</form>\n");
      out.write("		<div class=\"info-usermodify-btn\">\n");
      out.write("			<button type=\"submit\" class=\"info-usermodify-submit\" onclick=\"location.href='User-InfoUp.jsp'\">확인</button>\n");
      out.write("			<button type=\"button\" class=\"info-usermodify-cancel\">취소</button>		</div>\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("	<footer> ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer/footer.jsp", out, false);
      out.write(" </footer>\n");
      out.write("</body>\n");
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
}