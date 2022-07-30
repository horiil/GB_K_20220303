/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-06-18 07:20:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.koreait.dao.MemberDAO;

public final class age_005fdb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.koreait.dao.MemberDAO");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

			
			
// DBConnection 부분	

		// 	코드가 중복되기 때문에 DB Connection을 관리할 dao 파일을 만들어준다.
		// DB Connection이 이루어 진다.
		// ....
		// ....
// 		Connection conn = null;
// 		String driver = "oracle.jdbc.driver.OracleDriver";
// 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
// 		// 오라클 사용자 계정 아이디
// 		String user = "ksh";
// 		// 오라클 사용자 계정 비밀번호
// 		String password = "ksh";

// 		Class.forName(driver);
// 		// 확인 문구
// 		System.out.println("jdbc driver 로딩성공!");
//		 연결하려는 계정의 주소, 아이디, 패스워드값을 넘긴다
		// 확인 문구
// 		System.out.println("오라클 연결 성공!!");
// 		conn = DriverManager.getConnection(url, user, password);
		
// DBConnection 부분	


// sql처리 부분

// 		jsp에 너무 많은 자바 코드가 있는것은 좋지않다. view단의 기능에 충실하는 것이 좋기 때문에 
//		DAO파일에 특정 메서드로 빼내는 것이 좋다.
	
// 		Connection conn = DBConnection.getConnection();
// 		String sql = "SELECT age FROM MEMBER WHERE name = ?";
// 		PreparedStatement pstm = conn.prepareStatement(sql);
		
// 		pstm.setString(1, name);
// 		ResultSet rs = pstm.executeQuery();
		

// sql처리 부분


// 		한 건만 받아올 떄
		String name = request.getParameter("name");

		MemberDAO mdao = new MemberDAO();
		int age = mdao.getAge(name);
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	화면에 출력\r\n");
      out.write("	");

		if( age != 0 ){
	
      out.write("\r\n");
      out.write("		이름 : ");
      out.print(name );
      out.write("<br>\r\n");
      out.write("		나이 : ");
      out.print(age );
      out.write("<br>	\r\n");
      out.write("	");

		} else {
	
      out.write("\r\n");
      out.write("		찾는 이름이 없습니다.	\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<input type=\"button\" value=\"다시 검색하기\" onclick=\"location.href='age_search.jsp'\">\r\n");
      out.write("	\r\n");
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
