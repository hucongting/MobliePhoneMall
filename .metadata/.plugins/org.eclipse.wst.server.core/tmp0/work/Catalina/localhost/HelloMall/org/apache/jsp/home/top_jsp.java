/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-09-01 07:28:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--top 开始-->\r\n");
      out.write("    <div class=\"top\">\r\n");
      out.write("    \t<div class=\"top-con w1200\">\r\n");
      out.write("        \t<p class=\"t-con-l f-l\">您好，欢迎来到宅客微购</p>\r\n");
      out.write("            <ul class=\"t-con-r f-r\">\r\n");
      out.write("            \t<li><a href=\"my_message.jsp\">我 (个人中心)</a></li>\r\n");
      out.write("            \t<li><a href=\"my_cart.jsp\">我的购物车</a></li>\r\n");
      out.write("            \t<li><a href=\"my_order.jsp\">我的订单</a></li>\r\n");
      out.write("            \t<li class=\"erweima\">\r\n");
      out.write("                \t<a href=\"#\">扫描二维码</a>\r\n");
      out.write("                    <div class=\"ewm-tu\">\r\n");
      out.write("                    \t<a href=\"#\"><img src=\"images/erweima-tu.jpg\" /></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div style=\"clear:both;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--logo search 开始-->\r\n");
      out.write("    <div class=\"hd-info1 w1200\">\r\n");
      out.write("    \t<div class=\"logo f-l\">\r\n");
      out.write("        \t<h1><a href=\"#\" title=\"中林网站\"><img src=\"images/logo.jpg\" /></a></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"search f-r\">\r\n");
      out.write("        \t<ul class=\"sp\">\r\n");
      out.write("            \t<li class=\"current\" ss-search=\"sp\"><a href=\"JavaScript:;\">商品</a></li>\r\n");
      out.write("                <li ss-search=\"dp\"><a href=\"JavaScript:;\">店铺</a></li>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"srh\">\r\n");
      out.write("            \t<div class=\"ipt f-l\">\r\n");
      out.write("                \t<input type=\"text\" placeholder=\"搜索商品...\" ss-search-show=\"sp\" />\r\n");
      out.write("                    <input type=\"text\" placeholder=\"搜索店铺...\" ss-search-show=\"dp\" style=\"display:none;\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"f-r\">搜 索</button>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"sp2\">\r\n");
      out.write("                <li><a href=\"#\">绿豆</a></li>\r\n");
      out.write("                <li><a href=\"#\">大米</a></li>\r\n");
      out.write("                <li><a href=\"#\">驱蚊</a></li>\r\n");
      out.write("                <li><a href=\"#\">洗面奶</a></li>\r\n");
      out.write("                <li><a href=\"#\">格力空调</a></li>\r\n");
      out.write("                <li><a href=\"#\">洗发护发</a></li>\r\n");
      out.write("                <li><a href=\"#\">葡萄 </a></li>\r\n");
      out.write("                <li><a href=\"#\">脉动</a></li>\r\n");
      out.write("                <li><a href=\"#\">海鲜水产</a></li>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--nav 开始-->\r\n");
      out.write("    <div style=\"border-bottom:2px solid #F09E0B;\">\r\n");
      out.write("    \t<div class=\"nav w1200\">\r\n");
      out.write("    \t<a href=\"JavaScript:;\" class=\"sp-kj\" kj=\"\">\r\n");
      out.write("        \t商品分类快捷\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"kj-show2 none\" kj-sh=\"\">\r\n");
      out.write("            <div class=\"kj-info1\" mg=\"shiping\">\r\n");
      out.write("            \t<dl class=\"kj-dl1\">\r\n");
      out.write("               \t\t<dt><a href=\"#\">食品/饮料/酒水</a></dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                    \t零食/糖果/巧克力、饼干/糕点、生鲜<br />\r\n");
      out.write("                        酒水饮料/乳饮料、调味/速食<br />\r\n");
      out.write("                        粮油/干货、冲调制品\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"kj-info1\" style=\"border-bottom:none;\" mg=\"jiafang\">\r\n");
      out.write("            \t<dl class=\"kj-dl1\" style=\"padding:6px 10px;\">\r\n");
      out.write("               \t\t<dt><a href=\"#\">家居/家纺</a></dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                    \t浴室用品、餐具水具<br />\r\n");
      out.write("                        收纳/居家日用、针织纺品\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <div class=\"kj-if-show\" mg2=\"jiafang\">\r\n");
      out.write("                \t<dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl style=\"border-bottom:none;\">\r\n");
      out.write("                    \t<dt>家居/家纺</dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<a href=\"#\">坚果迷线</a>\r\n");
      out.write("                        \t<a href=\"#\">膨化食品</a>\r\n");
      out.write("                        \t<a href=\"#\">糖果果冻/巧克力/口香糖</a>\r\n");
      out.write("                        \t<a href=\"#\">肉类/熟食食品</a>\r\n");
      out.write("                        \t<a href=\"#\">进口食品</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul>\r\n");
      out.write("        \t<li><a href=\"#\">在线商城</a></li>\r\n");
      out.write("        \t<li><a href=\"#\">餐饮娱乐</a></li>\r\n");
      out.write("        \t<li><a href=\"#\">家政服务</a></li>\r\n");
      out.write("        \t<li><a href=\"#\">美容美发</a></li>\r\n");
      out.write("        \t<li><a href=\"#\">教育培训</a></li>\r\n");
      out.write("        \t<li><a href=\"#\">汽车房产</a></li>\r\n");
      out.write("        \t<li><a href=\"#\">家居建材</a></li>\r\n");
      out.write("        \t<li><a href=\"#\">二手市场</a></li>\r\n");
      out.write("            <div style=\"clear:both;\"></div>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--内容开始-->\r\n");
      out.write("    <div class=\"personal w1200\">\r\n");
      out.write("    \t<div class=\"personal-left f-l\">\r\n");
      out.write("        \t<div class=\"personal-l-tit\">\r\n");
      out.write("            \t<h3>个人中心</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li class=\"current-li per-li1\"><a href=\"my_message.jsp\">消息中心<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li2\"><a href=\"my_personal.jsp\">个人资料<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li3\"><a href=\"my_order.jsp\">我的订单<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li4\"><a href=\"my_make.jsp\">我的预约<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li5\"><a href=\"my_cart.jsp\">购物车<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li6\"><a href=\"my_address.jsp\">管理收货地址<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li7\"><a href=\"my_collection.jsp\">店铺收藏<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li8\"><a href=\"buyrecord.jsp\">购买记录<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li9\"><a href=\"lookrecored.jsp\">浏览记录<span>></span></a></li>\r\n");
      out.write("            \t<li class=\"per-li10\"><a href=\"vip_score.jsp\">会员积分<span>></span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
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
