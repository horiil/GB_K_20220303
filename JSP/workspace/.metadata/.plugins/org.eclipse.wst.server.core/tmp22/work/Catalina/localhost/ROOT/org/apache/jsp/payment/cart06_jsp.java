/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-07-01 00:37:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.payment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gushipsam.payment.dao.CartDTO;
import java.util.List;
import java.text.DecimalFormat;

public final class cart06_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/0900_GB_KSH/jsp/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp22/wtpwebapps/93test/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/payment/../header/header.jsp", Long.valueOf(1656635277000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1656635277000L));
    _jspx_dependants.put("/payment/../footer/footer.jsp", Long.valueOf(1656635277000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.gushipsam.payment.dao.CartDTO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.text.DecimalFormat");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("\n");
      out.write(" 	<!--  숫자에 콤마 붙이기 위한 숫자포맷 라이브러리 -->\n");
      out.write("\n");
      out.write("\n");

	DecimalFormat df = new DecimalFormat("###,###"); 						// df.format(숫자)로 콤마 보이게 가능
	
	
	List<CartDTO> cartList = (List) request.getAttribute("cartList");


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>구심삽 장바구니</title>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>구십삼</title>\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main_css.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/slick.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/header.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/footer.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/minsu.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/common06.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cart06.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/checkout06.css\">\n");
      out.write("	<link rel=\"shortcut icon\" href=\"../img/gushipsam_icon.ico\">	\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/Mypage.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/User-Info.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/User-InfoUp.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/OrderList-Page.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/secession.css\">\n");
      out.write("	<script type=\"text/javascript\" src=\"../js/slick.min.js\"></script> \n");
      out.write("	<script type=\"text/javascript\" src=\"../js/slide.js\"></script> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("	<div>\n");
      out.write("		<!-- 로고 -->\n");
      out.write("		<div class=\"login_search\">\n");
      out.write("			<a href=\"#\"onclick=\"location.href='../main/main.jsp'\" class= logo><img src= ../img/logo.png></a>\n");
      out.write(" 			<!-- 로그인, 로그아웃, 장바구니, 고객센터 -->\n");
      out.write(" 			<ul class = nav1>\n");
      out.write("						<li class= service><a href= \"../service/minsu1.sv\">고객센터 </a></li>\n");
      out.write("						<li class= basket><a href= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment/cart.pay\">장바구니 </a></li>\n");
      out.write("				");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("			</ul>\n");
      out.write("			<!-- 검색창 -->\n");
      out.write("		<div class=\"search1\">\n");
      out.write("			<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/SearchGoods.spm\" method=\"post\" name=\"searchForm\">\n");
      out.write("				<input placeholder=\"Search\" class= 'search_main' name=\"searchtext\">\n");
      out.write("				<a class=\"btn\" href=\"javascript:document.searchForm.submit()\" role=\"button\">\n");
      out.write("					<img src=\"https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png\">\n");
      out.write("				</a>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("			<!-- 카테고리 -->\n");
      out.write("			<div class=\"category\">\n");
      out.write("				<div class= nav2> \n");
      out.write("					<ul>\n");
      out.write("						<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=냉장고\" class=\"a\">냉장고</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</li>\n");
      out.write("						<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=세탁기\" class=\"a\">세탁기</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li><a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=TV\" class=\"a\">TV</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=에어컨\" class=\"a\">에어컨</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:black;\">WINIA</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("		\n");
      out.write("						<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=컴퓨터\" class=\"a\">컴퓨터</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:black;\">APPLE</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</li>\n");
      out.write("					</ul>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div> \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<body id=\"payment\">\n");
      out.write("	<section id='cart'>\n");
      out.write("		<br>\n");
      out.write("		<div id=\"title_big\">장바구니</div>\n");
      out.write("		<span id=\"ajaxed_span\">\n");
      out.write("			<table id=\"order_tb\">\n");
      out.write("				<colgroup>\n");
      out.write("					<col width=\"2.5%\">\n");
      out.write("					<col width=\"60%\">\n");
      out.write("					<col width=\"15%\">\n");
      out.write("					<col width=\"7.5%\">\n");
      out.write("					<col width=\"15%\">\n");
      out.write("				</colgroup>\n");
      out.write("				<thead>\n");
      out.write("					<tr>\n");
      out.write("						<td colspan=\"5\">\n");
      out.write("							<h3 id=\"title\">구십삼 주문상품</h3>\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("					<tr class=\"table_top\">\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\"><input type=\"checkbox\" name=\"chk_all\" id=\"chk_all\"></div>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\">상품정보</div>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\">판매가</div>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\">수량</div>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\">구매가</div>\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("				</thead>\n");
      out.write("				<tbody>\n");
      out.write("					");
 for (CartDTO item : cartList) { 
      out.write("\n");
      out.write("					<tr>\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\"><input type=\"checkbox\" name=\"chk\"></div>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<table class=\"goods_tb\">\n");
      out.write("								<colgroup>\n");
      out.write("									<col width=\"20%\">\n");
      out.write("									<col width=\"80%\">\n");
      out.write("								</colgroup>\n");
      out.write("								<tr>\n");
      out.write("									<td rowspan=\"2\">\n");
      out.write("										");

										String foldername = null;
										String catg = item.getgCATG();
										String img = item.getgIMGS();
										
										switch (catg) {
										case "냉장고" : foldername= "fridge"; break;
										case "세탁기" : foldername= "washer"; break;
										case "TV" : foldername= "tv"; break;
										case "에어컨" : foldername= "ac"; break;
										case "컴퓨터" : foldername= "pc"; break;
										}
										
      out.write("\n");
      out.write("										<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsDetail.goods?gID=");
      out.print(item.getgID() );
      out.write("\">\n");
      out.write("											<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/");
      out.print(foldername );
      out.write('/');
      out.print(img );
      out.write("\" style=\"width:100%\">\n");
      out.write("										</a>\n");
      out.write("									</td>\n");
      out.write("									<td id=\"brand\">");
      out.print(item.getgBRAND());
      out.write("</td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<td>");
      out.print(item.getgNAME());
      out.write("</td>\n");
      out.write("								</tr>\n");
      out.write("							</table>\n");
      out.write("						</td>\n");
      out.write("						");
 int price = item.getgPRICE(); int qty = item.getcQTY(); 
      out.write("\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\">");
      out.print( df.format(price) );
      out.write("</div>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\">");
      out.print( qty );
      out.write("</div>\n");
      out.write("						</td>\n");
      out.write("						<td>\n");
      out.write("							<div class=\"align_center\">");
      out.print( df.format(price*qty) );
      out.write("</div>\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("					");
 } 
      out.write("\n");
      out.write("					<tr>\n");
      out.write("						<td colspan=\"5\" style=\"height: 150px\" id=\"zerocart\">\n");
      out.write("							<div class=\"align_center\" style=\"font-size:30px\">¯\\_(ツ)_/¯</div>\n");
      out.write("							<div class=\"align_center\" style=\"font-size:17px; font-weight:bold;\">장바구니에 저장된 상품이 없습니다.</div>\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("				</tbody>\n");
      out.write("			</table>\n");
      out.write("		</span>\n");
      out.write("		<input type=\"button\" class=\"select_button\" id=\"select_button\" value=\" 선택상품 삭제  \" onclick=\"deleteTableRow();\">\n");
      out.write("		<br>\n");
      out.write("		<div class=\"align_center\">\n");
      out.write("				<input type=\"button\" class=\"order_button1\" id=\"order_button1\" value=\"선택주문\" onclick=\"jumpPageSome();\"> &nbsp;\n");
      out.write("				<input type=\"button\" class=\"order_button2\" id=\"order_button2\"  value=\"전체주문\" onclick=\"jumpPageAll()\">\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("	</section>\n");
      out.write("	<div style=\"height:100px\"></div>\n");
      out.write("	");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<!--  	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/footer.css\"> -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<!-- footer -->\n");
      out.write("	<footer>\n");
      out.write("		<p>\n");
      out.write("			<span>상호명 : 구십삼</span>\n");
      out.write("			<span>대표 : 김시우</span><br/>\n");
      out.write("			<span>이메일 : 93jow@gmail.com</span><br>\n");
      out.write("			<span>주소 : 서울 강남구 테헤란로 146</span><br/>\n");
      out.write("			<span>사업자등록번호 : 000-00-0000</span><br/>\n");
      out.write("			<span>Copyright 2022. cocoder. All Rights Reserved.</span>\n");
      out.write("		</p>\n");
      out.write("			<a  href=\"\"   target='blank'>사이트관리자</a>\n");
      out.write("			<a  href=\"\"   target='blank'>회사소개</a>\n");
      out.write("			<a  href=\"#\"  onclick=\"location.href='../main/map.jsp'\"> 찾아오시는 길</a>\n");
      out.write("			<a  href=\"#\"  onclick=\"location.href='../main/personalinfrom.jsp'\"> 개인정보처리방침</a>\n");
      out.write("	</footer>\n");
      out.write("	\n");
      out.write("	<script>\n");
      out.write("	\n");
      out.write("	</script>\n");
      out.write("</html>\n");
      out.write("</body>");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("//------------cid_arr 배열 사용하는 함수 모음 시작-----------------------//\n");
      out.write("	\n");
      out.write("	//결제페이지에 전달할 파라미터 저장 배열 (현재 브랜드 저장하며, 나중에는 상품id 전달할 예정)\n");
      out.write("	let cid_arr = [];\n");
      out.write("	\n");
      out.write("	//cid_arr 최초 생성\n");
      out.write("	");
 for (CartDTO item : cartList ) {
		pageContext.setAttribute("cID",item.getcID());
	
      out.write("\n");
      out.write("		cid_arr.push(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\");\n");
      out.write("	");
}
      out.write("\n");
      out.write("	\n");
      out.write("	//선택 상품 삭제. 맨 뒷 번호부터 차례대로 체크박스 확인. 체크되었을 경우 해당 테이블 열 삭제 + 해당 브랜드 brandarr에서 삭제. 완료되면 reset() 함수 실행\n");
      out.write("	function deleteTableRow() {\n");
      out.write("		\n");
      out.write("		if (confirm(\"선택된 상품을 삭제하시겠습니까?\") == false){    \n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		checks = $('input[name=\"chk\"]');\n");
      out.write("		let len = checks.length;\n");
      out.write("		let del_cids=[];\n");
      out.write("		let count = 0;\n");
      out.write("		\n");
      out.write("		for( var i = len-1; i >= 0  ; i--) {		//1부터 시작하면 중간에 테이블 길이 줄어들어서 index가 맞지 않아 에러남\n");
      out.write("			if( checks[i].checked == true){\n");
      out.write("				count++;\n");
      out.write("				del_cids.push(cid_arr.splice(i,1));\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		if(count==0){\n");
      out.write("			alert(\"상품을 선택해주세요.\");\n");
      out.write("		} else {\n");
      out.write("			// ajax 통신\n");
      out.write("			let xhr = new XMLHttpRequest();\n");
      out.write("			xhr.open(\"GET\", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment/cartdel.pay?delcids='+del_cids, true);\n");
      out.write("			xhr.send();\n");
      out.write("			xhr.onreadystatechange = function(){\n");
      out.write("				if( xhr.readyState == XMLHttpRequest.DONE \n");
      out.write("						&& xhr.status == 200 ){\n");
      out.write("// 					alert(xhr.responseText);\n");
      out.write("// 					console.log(xhr.responseText);\n");
      out.write("					$('#ajaxed_span').html(xhr.responseText);\n");
      out.write("				}			\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("	\n");
      out.write("	}	\n");
      out.write("	\n");
      out.write("	// 선택한 상품의 브랜드만 파라미터로 전송하기\n");
      out.write("	function jumpPageSome(){\n");
      out.write("		checks = $('input[name=\"chk\"]');\n");
      out.write("		let checked = $(\"input[name=chk]:checked\").length;\n");
      out.write("		if( checked == 0 ) {\n");
      out.write("			alert(\"주문 가능한 상품이 없습니다.\")\n");
      out.write("			return false;\n");
      out.write("		} else {\n");
      out.write("			let cid_arr_checked = [];\n");
      out.write("			for(let i=0; i<cid_arr.length;i++){\n");
      out.write("				if( checks[i].checked == true) cid_arr_checked.push(cid_arr[i]);\n");
      out.write("			}\n");
      out.write("			location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment/checkout.pay?cids='+cid_arr_checked;\n");
      out.write("		}\n");
      out.write("	}	\n");
      out.write("	\n");
      out.write("	// 모든 상품의 브랜드를 파라미터로 전송하기\n");
      out.write("	function jumpPageAll(){\n");
      out.write("		var exist = $(\"input[name=chk]\").length;\n");
      out.write("		if( exist == 0 ) {\n");
      out.write("			alert(\"주문가능한 상품이 없습니다.\");\n");
      out.write("			return false;\n");
      out.write("		} else{\n");
      out.write("			location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment/checkout.pay?cids='+cid_arr;\n");
      out.write("		}\n");
      out.write("	}\n");
      out.write("//------------cid_arr 배열 사용하는 함수 모음 끝-----------------------//\n");
      out.write("</script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/cart06.js\"></script>\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /payment/../header/header.jsp(27,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("userID");
      // /payment/../header/header.jsp(27,1) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("					");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("				");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /payment/../header/header.jsp(38,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId eq null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("						<li class= login>\n");
          out.write("							<a id=\"log_change\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/IDPW/login.jsp\">로그인</a>\n");
          out.write("						</li>\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("						<li class= login>\n");
          out.write("							<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/lobby/mypage.spm\">마이페이지</a>\n");
          out.write("						</li>\n");
          out.write("						<li class= login>\n");
          out.write("							");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님 환영합니다.&nbsp;&nbsp;&nbsp;\n");
          out.write("							<a href=\"#\" onclick= \"location.href='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/main/sessionInitialization.jsp'\">로그아웃</a>\n");
          out.write("						</li>\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
