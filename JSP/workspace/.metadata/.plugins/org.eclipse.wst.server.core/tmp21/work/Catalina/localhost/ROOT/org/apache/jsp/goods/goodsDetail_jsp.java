/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-06-30 16:16:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.gushipsam.goods.dao.goodsDTO;
import java.text.DecimalFormat;

public final class goodsDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1656589161226L));
    _jspx_dependants.put("/goods/../footer/footer.jsp", Long.valueOf(1656589161891L));
    _jspx_dependants.put("/goods/../header/header.jsp", Long.valueOf(1656605737214L));
    _jspx_dependants.put("jar:file:/C:/0900_GB_KSH/jsp/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp21/wtpwebapps/nine_three2/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("com.gushipsam.goods.dao.goodsDTO");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  숫자에 콤마 붙이기 위한 숫자포맷 라이브러리 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

   DecimalFormat df = new DecimalFormat("###,###"); // df.format(숫자)로 콤마 보이게 가능
   goodsDTO goodsDetail = (goodsDTO) request.getAttribute("goodsDetail");
   
   String foldername = null;
   if (goodsDetail.getgCatg().equals("냉장고")){
      foldername= "fridge";
   } else if (goodsDetail.getgCatg().equals("세탁기")){
      foldername= "washer";
   } else if (goodsDetail.getgCatg().equals("TV")){
      foldername= "tv";
   } else if (goodsDetail.getgCatg().equals("에어컨")){
      foldername= "ac";
   } else if (goodsDetail.getgCatg().equals("컴퓨터")){
      foldername= "pc";
   }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>구심삽 주문결제</title>\r\n");
      out.write("<script\r\n");
      out.write("   src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"goodsDetail.css\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"gu_icon.ico\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>구십삼</title>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main_css.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/slick.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/header.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/footer.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/minsu.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/common06.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cart06.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/checkout06.css\">\r\n");
      out.write("	<link rel=\"shortcut icon\" href=\"../img/gushipsam_icon.ico\">	\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/Mypage.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/User-Info.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/User-InfoUp.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/OrderList-Page.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/secession.css\">\r\n");
      out.write("	<script type=\"text/javascript\" src=\"../js/slick.min.js\"></script> \r\n");
      out.write("	<script type=\"text/javascript\" src=\"../js/slide.js\"></script> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("		<!-- 로고 -->\r\n");
      out.write("		<div class=\"login_search\">\r\n");
      out.write("			<a href=\"#\"onclick=\"location.href='../main/main.jsp'\" class= logo><img src= ../img/logo.png></a>\r\n");
      out.write(" 			<!-- 로그인, 로그아웃, 장바구니, 고객센터 -->\r\n");
      out.write(" 			<ul class = nav1>\r\n");
      out.write("						<li class= service><a href= \"../service/minsu1.sv\">고객센터 </a></li>\r\n");
      out.write("						<li class= basket><a href= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment/cart.pay\">장바구니 </a></li>\r\n");
      out.write("				");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("			<!-- 검색창 -->\r\n");
      out.write("		<div class=\"search1\">\r\n");
      out.write("			<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/SearchGoods.spm\" method=\"post\" name=\"searchForm\">\r\n");
      out.write("				<input placeholder=\"Search\" class= search name=\"searchtext\">\r\n");
      out.write("				<a class=\"btn\" href=\"javascript:document.searchForm.submit()\" role=\"button\">\r\n");
      out.write("					<img src=\"https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png\">\r\n");
      out.write("				</a>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("			<!-- 카테고리 -->\r\n");
      out.write("			<div class=\"category\">\r\n");
      out.write("				<div class= nav2> \r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=냉장고\" class=\"a\">냉장고</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=세탁기\" class=\"a\">세탁기</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=TV\" class=\"a\">TV</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=에어컨\" class=\"a\">에어컨</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:black;\">WINIA</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("		\r\n");
      out.write("						<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goods/goodsList.goods?gCatg=컴퓨터\" class=\"a\">컴퓨터</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:blue;\">SAMSUNG</a></li>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:red;\">LG</a></li>\r\n");
      out.write("								<li><a href=\"상품페이지 경로\" style=\"color:black;\">APPLE</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div> \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <div style=\"height: 220px;\"></div>\r\n");
      out.write("   <section>\r\n");
      out.write("      <table id=\"skeleton\">\r\n");
      out.write("         <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("               <div class=\"photo\">\r\n");
      out.write("                  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/");
      out.print(foldername );
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gImgs }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" width=\"450\" height=\"450\">\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("            <td id=\"details_td\">\r\n");
      out.write("               <div class=\"details\">\r\n");
      out.write("                  <div class=\"name\">\r\n");
      out.write("                     <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div id=\"name2_table\">\r\n");
      out.write("                  <table class=\"name2\">\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th>브랜드</th>\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gBrand }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th>모델명</th>\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gModel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th>판매가</th>\r\n");
      out.write("                        <td>");
      out.print(df.format(goodsDetail.getgPRICE()));
      out.write(" 원</td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th>크기</th>\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gSize}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <th>기타정보</th>\r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gEtc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                  </table>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"quantity\">\r\n");
      out.write("                  <span id=\"qty_title\">주문수량</span>\r\n");
      out.write("                  &nbsp; &nbsp;\r\n");
      out.write("                  <span class=btn>\r\n");
      out.write("                     <button type=\"button\" id=\"mbtn\">-</button>\r\n");
      out.write("                        <input type=\"text\" id=\"qty\" readonly value=\"1\">\r\n");
      out.write("                     <button type=\"button\" id=\"pbtn\">+</button>\r\n");
      out.write("                  </span>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"payment\">\r\n");
      out.write("                  <input type=\"button\" value=\"바로구매\" id=\"checkout_btn\" onclick=\"jumpToCheckout();\"> &nbsp;\r\n");
      out.write("                  <input type=\"button\" value=\"장바구니\" id=\"cart_btn\" onclick=\"insertCart();\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"extra_detail\">\r\n");
      out.write("                  <a onclick=\"window.open('explanation.jsp?gCatg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gCatg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&gImgl=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gImgl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("', '제품상세설명',\r\n");
      out.write("                                       'width=800, height=600, left=100, top=0');\">제품 상세 페이지로 이동</a>\r\n");
      out.write("               </div>\r\n");
      out.write("            </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <div style=\"height:100px\"></div>\r\n");
      out.write("   </section>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!--  	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/footer.css\"> -->\r\n");
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
      out.write("			<a  href=\"\"   target='blank'>사이트관리자</a>\r\n");
      out.write("			<a  href=\"\"   target='blank'>회사소개</a>\r\n");
      out.write("			<a  href=\"#\"  onclick=\"location.href='../main/map.jsp'\"> 찾아오시는 길</a>\r\n");
      out.write("			<a  href=\"#\"  onclick=\"location.href='../main/personalinfrom.jsp'\"> 개인정보처리방침</a>\r\n");
      out.write("	</footer>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("</html>\r\n");
      out.write("</body>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("   \r\n");
      out.write("   //수량 감소 버튼\r\n");
      out.write("   $('#mbtn').on(\"click\",function(){\r\n");
      out.write("      let qty = $('#qty').val();\r\n");
      out.write("      if (qty >= 2) {\r\n");
      out.write("         $('#qty').val(Number(qty)-1);\r\n");
      out.write("      }\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("   //수량 증가 버튼\r\n");
      out.write("   $('#pbtn').on(\"click\",function(){\r\n");
      out.write("      let qty = $('#qty').val();\r\n");
      out.write("      $('#qty').val(Number(qty)+1);\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   function jumpToCheckout(){\r\n");
      out.write("      if(!confirm(\"바로 구매를 진행하시겠습니까?\")) return false\r\n");
      out.write("      let gQTY = $('#qty').val();\r\n");
      out.write("      let gID = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("      \r\n");
      out.write("      location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment/checkoutdirect.pay?gid='+gID+'&gqty='+gQTY;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   function insertCart(){\r\n");
      out.write("      let gQTY = $('#qty').val();\r\n");
      out.write("      let gID = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsDetail.gID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("      userid = '");
      out.print( session.getAttribute("sessionId") );
      out.write("';\r\n");
      out.write("      if(userid == null || userid == '') {\r\n");
      out.write("         location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/IDPW/login.jsp';\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("         \r\n");
      out.write("      // ajax 통신\r\n");
      out.write("      let xhr = new XMLHttpRequest();\r\n");
      out.write("      xhr.open(\"GET\", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment/cartinsert.pay?gid='+gID+'&gqty='+gQTY, true);\r\n");
      out.write("      xhr.send();\r\n");
      out.write("      xhr.onreadystatechange = function(){\r\n");
      out.write("         if( xhr.readyState == XMLHttpRequest.DONE \r\n");
      out.write("               && xhr.status == 200 ){\r\n");
      out.write("            console.log(xhr.responseText);\r\n");
      out.write("         }         \r\n");
      out.write("      }\r\n");
      out.write("      if(confirm(\"해당 상품이 장바구니에 추가되었습니다!\\n장바구니로 이동하시겠습니까?\")) location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment/cart.pay';\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
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
      // /goods/goodsDetail.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("goodsDetail");
      // /goods/goodsDetail.jsp(9,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.goodsDetail }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /goods/../header/header.jsp(27,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("userID");
      // /goods/../header/header.jsp(27,1) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sessionId}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
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
          out.write("\r\n");
          out.write("					");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("				");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
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
      // /goods/../header/header.jsp(38,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId eq null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<li class= login>\r\n");
          out.write("							<a id=\"log_change\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/IDPW/login.jsp\">로그인</a>\r\n");
          out.write("						</li>\r\n");
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
          out.write("\r\n");
          out.write("						<li class= login>\r\n");
          out.write("							<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/lobby/mypage.spm\">마이페이지</a>\r\n");
          out.write("						</li>\r\n");
          out.write("						<li class= login>\r\n");
          out.write("							");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님 환영합니다.&nbsp;&nbsp;&nbsp;\r\n");
          out.write("							<a href=\"#\" onclick= \"location.href='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/main/sessionInitialization.jsp'\">로그아웃</a>\r\n");
          out.write("						</li>\r\n");
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
