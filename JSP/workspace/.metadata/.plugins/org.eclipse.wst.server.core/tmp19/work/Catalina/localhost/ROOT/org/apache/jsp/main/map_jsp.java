/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-06-15 14:11:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/main/../footer/footer.jsp", Long.valueOf(1655301882706L));
    _jspx_dependants.put("/main/../header/header.jsp", Long.valueOf(1655301882622L));
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/map_css.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>구십삼</title>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main_css.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class= header>\r\n");
      out.write("			<div class=\"login_search\">\r\n");
      out.write("			<a href=\"#\"onclick=\"location.href='../main/main.jsp'\" class= logo><img src= ../img/logo.png></a>\r\n");
      out.write("			<ul class = nav1>\r\n");
      out.write("				<li class= service><a href= \"center\">고객센터</a></li>\r\n");
      out.write("				<li class= basket><a href= \"basket\">장바구니</a></li>\r\n");
      out.write("				<li class= login><a href= \"login\">로그인</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<br>\r\n");
      out.write("		<div class=\"search1\">\r\n");
      out.write("			<input type=\"text\" placeholder=\"Search\" class= search>\r\n");
      out.write("			<a class=\"btn\" href=\"serch.html\" role=\"button\">\r\n");
      out.write("			<img src=\"https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png\">\r\n");
      out.write("			</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"category\">\r\n");
      out.write("		<div class= nav2>\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><a href=\"#\" class=\"a\">냉장고</a>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"shop1.html\">상품1</a></li>\r\n");
      out.write("						<li><a href=\"shop2.html\">상품2</a></li>\r\n");
      out.write("						<li><a href=\"shop3.html\">상품3</a></li>\r\n");
      out.write("						<li><a href=\"shop3.html\">상품4</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li><a href=\"#\" class=\"a\">세탁기</a>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"shop1.html\">상품1</a></li>\r\n");
      out.write("						<li><a href=\"shop2.html\">상품2</a></li>\r\n");
      out.write("						<li><a href=\"shop3.html\">상품3</a></li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"a\">TV</a>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"shop1.html\">상품1</a></li>\r\n");
      out.write("						<li><a href=\"shop2.html\">상품2</a></li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"a\">에어컨</a>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"shop1.html\">상품1</a></li>\r\n");
      out.write("						<li><a href=\"shop2.html\">상품2</a></li>\r\n");
      out.write("						<li><a href=\"shop3.html\">상품3</a></li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("\r\n");
      out.write("				<li><a href=\"#\" class=\"a\">컴퓨터</a>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"shop1.html\">상품1</a></li>\r\n");
      out.write("						<li><a href=\"shop2.html\">상품2</a></li>\r\n");
      out.write("						<li><a href=\"shop3.html\">상품3</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("/* 	<a href=\"#\" onclick=\"delchk();\">삭제하기</a>\r\n");
      out.write("	\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	function delchk(){\r\n");
      out.write("	    if(confirm(\"삭제하시겠습니까?\")){\r\n");
      out.write("	        location.href = \"write_del_ok.jsp?num=1\";\r\n");
      out.write("	        return true;\r\n");
      out.write("	    } else {\r\n");
      out.write("	        return false;\r\n");
      out.write("	    }\r\n");
      out.write("	} */\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<div class = \"map\">\r\n");
      out.write("	<div class = \"map-a\">\r\n");
      out.write("		<h1>찾아오시는 길</h1><br>\r\n");
      out.write("		<hr>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class = \"cnt\">\r\n");
      out.write("		<div class = \"cnt-a\">\r\n");
      out.write("			<p>주 소<br>\r\n");
      out.write("			서울특별시 강남구 테헤란로 146<br>\r\n");
      out.write("			연 락 처<br>\r\n");
      out.write("			010-6123-5456</p>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class = \"cnt-b\">\r\n");
      out.write("			<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1537.6081413323222!2d127.03482677125065!3d37.50020713766569!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ca3fe10658c31%3A0x3c9a3aa2832a63b4!2z7ISc7Jq47Yq567OE7IucIOqwleuCqOq1rCDthYztl6TrnoDroZwgMTQ2!5e0!3m2!1sko!2skr!4v1655196166793!5m2!1sko!2skr\" width=\"50%\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main_css.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- footer -->\r\n");
      out.write("	<footer>\r\n");
      out.write("		<p>\r\n");
      out.write("			<span>상호명 : 구십삼</span>\r\n");
      out.write("			<span>대표 : 김시우</span><br/>\r\n");
      out.write("			<span>이메일 : 93jow@gmail.com</span><br>\r\n");
      out.write("			<span>주소 : 서울 강남구 테헤란로 146</span><br/>\r\n");
      out.write("			<span>사업자등록번호 : 000-00-0000</span><br/>\r\n");
      out.write("			<span>Copyright 2022. cocoder. All Rights Reserved.</span>\r\n");
      out.write("		</p>\r\n");
      out.write("			<a href=\"\" target='blank'>사이트관리자</a>\r\n");
      out.write("			<a href=\"\" target='blank'>회사소개</a>\r\n");
      out.write("			<a href=\"#\" onclick=\"location.href='../main/map.jsp'\"> 찾아오시는 길</a>\r\n");
      out.write("			<a href=\"#\" onclick=\"location.href='../main/personalinfrom.jsp'\"> 개인정보처리방침</a>\r\n");
      out.write("	</footer>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("</html>\r\n");
      out.write("</body>");
      out.write("\r\n");
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
}