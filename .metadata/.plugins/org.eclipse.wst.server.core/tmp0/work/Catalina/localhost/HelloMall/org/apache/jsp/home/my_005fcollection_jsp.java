/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-09-01 06:59:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class my_005fcollection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>收藏的店铺</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/shopping-mall-index.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zhonglin.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("    \t<div class=\"shop f-r\">\r\n");
      out.write("            <div class=\"shop-con\">\r\n");
      out.write("            \t<div class=\"shop-c-tit\">\r\n");
      out.write("                \t<h3>店铺收藏</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"shop-info\">\r\n");
      out.write("                \t<dl class=\"s-info-left f-l\">\r\n");
      out.write("                    \t<dt><a href=\"#\"><img src=\"images/shop-info-dt-tu.gif\" /></a></dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<h3><a href=\"#\">三只松鼠旗舰店</a></h3>\r\n");
      out.write("                            <p><img src=\"images/songshu2-dt-h3.gif\" /></p>\r\n");
      out.write("                            <p>卖家： 三只松鼠旗舰店</p>\r\n");
      out.write("                            <p>商品描述<span>4.61↑</span></p>\r\n");
      out.write("                            <p>服务态度<span>4.61↑</span></p>\r\n");
      out.write("                            <p>物流速度<span>4.61↑</span></p>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                \t<div class=\"s-info-right f-r\">\r\n");
      out.write("                    \t<ul class=\"s-r-ul1\" shuxing1=\"one\">\r\n");
      out.write("                        \t<li class=\"current\"><a href=\"JavaScript:;\">上新 15</a></li>\r\n");
      out.write("                        \t<li><a href=\"JavaScript:;\">优惠 247</a></li>\r\n");
      out.write("                        \t<li style=\"border-right:0;\"><a href=\"JavaScript:;\">热销 173</a></li>\r\n");
      out.write("                            <div style=\"clear:both;\"></div>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"s-r-ul f-l\" shuxingsw1=\"one\">\r\n");
      out.write("                        \t<ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu1.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu4.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a class=\"s-r-gd f-l\" href=\"#\">更多  >></a>\r\n");
      out.write("                    \t<div style=\"clear:both;\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"shop-info\">\r\n");
      out.write("                \t<dl class=\"s-info-left f-l\">\r\n");
      out.write("                    \t<dt><a href=\"#\"><img src=\"images/shop-info-dt-tu.gif\" /></a></dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<h3><a href=\"#\">三只松鼠旗舰店</a></h3>\r\n");
      out.write("                            <p><img src=\"images/songshu2-dt-h3.gif\" /></p>\r\n");
      out.write("                            <p>卖家： 三只松鼠旗舰店</p>\r\n");
      out.write("                            <p>商品描述<span>4.61↑</span></p>\r\n");
      out.write("                            <p>服务态度<span>4.61↑</span></p>\r\n");
      out.write("                            <p>物流速度<span>4.61↑</span></p>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                \t<div class=\"s-info-right f-r\">\r\n");
      out.write("                    \t<ul class=\"s-r-ul1\" shuxing2=\"two\">\r\n");
      out.write("                        \t<li class=\"current\"><a href=\"JavaScript:;\">上新 15</a></li>\r\n");
      out.write("                        \t<li><a href=\"JavaScript:;\">优惠 247</a></li>\r\n");
      out.write("                        \t<li style=\"border-right:0;\"><a href=\"JavaScript:;\">热销 173</a></li>\r\n");
      out.write("                            <div style=\"clear:both;\"></div>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"s-r-ul f-l\" shuxingsw2=\"two\">\r\n");
      out.write("                        \t<ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu1.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu4.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a class=\"s-r-gd f-l\" href=\"#\">更多  >></a>\r\n");
      out.write("                    \t<div style=\"clear:both;\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"shop-info\">\r\n");
      out.write("                \t<dl class=\"s-info-left f-l\">\r\n");
      out.write("                    \t<dt><a href=\"#\"><img src=\"images/shop-info-dt-tu.gif\" /></a></dt>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                        \t<h3><a href=\"#\">三只松鼠旗舰店</a></h3>\r\n");
      out.write("                            <p><img src=\"images/songshu2-dt-h3.gif\" /></p>\r\n");
      out.write("                            <p>卖家： 三只松鼠旗舰店</p>\r\n");
      out.write("                            <p>商品描述<span>4.61↑</span></p>\r\n");
      out.write("                            <p>服务态度<span>4.61↑</span></p>\r\n");
      out.write("                            <p>物流速度<span>4.61↑</span></p>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                \t<div class=\"s-info-right f-r\">\r\n");
      out.write("                    \t<ul class=\"s-r-ul1\" shuxing3=\"one\">\r\n");
      out.write("                        \t<li class=\"current\"><a href=\"JavaScript:;\">上新 15</a></li>\r\n");
      out.write("                        \t<li><a href=\"JavaScript:;\">优惠 247</a></li>\r\n");
      out.write("                        \t<li style=\"border-right:0;\"><a href=\"JavaScript:;\">热销 173</a></li>\r\n");
      out.write("                            <div style=\"clear:both;\"></div>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"s-r-ul f-l\" shuxingsw3=\"one\">\r\n");
      out.write("                        \t<ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu3.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"s-r-ul2\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu1.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu2.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li style=\"margin-right:0;\">\r\n");
      out.write("                                    <div class=\"tu\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/fa-r-con-li-tu4.gif\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3><a href=\"#\">鹌鹑蛋卤蛋</a></h3>\r\n");
      out.write("                                    <p>¥ 29.90<span>¥ 62.00</span></p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <div style=\"clear:both;\"></div>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a class=\"s-r-gd f-l\" href=\"#\">更多  >></a>\r\n");
      out.write("                    \t<div style=\"clear:both;\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--分页--> \r\n");
      out.write("            <div class=\"paging\">\r\n");
      out.write("            \t<div class=\"pag-left f-l\">\r\n");
      out.write("                \t<a href=\"#\" class=\"about left-r f-l\"></a>\r\n");
      out.write("                    <ul class=\"left-m f-l\">\r\n");
      out.write("                    \t<li><a href=\"#\">1</a></li>\r\n");
      out.write("                        <li class=\"current\"><a href=\"#\">2</a></li>\r\n");
      out.write("                        <li><a href=\"#\">3</a></li>\r\n");
      out.write("                        <li><a href=\"#\">4</a></li>\r\n");
      out.write("                        <li><a href=\"#\">5</a></li>\r\n");
      out.write("                        <li><a href=\"#\">6</a></li>\r\n");
      out.write("                        <li><a href=\"#\">...</a></li>\r\n");
      out.write("                        <li><a href=\"#\">100</a></li>\r\n");
      out.write("                        <div style=\"clear:both;\"></div>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                \t<a href=\"#\" class=\"about left-l f-l\">></a>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            \t<div class=\"pag-right f-l\">\r\n");
      out.write("                \t<div class=\"jump-page f-l\">\r\n");
      out.write("                        到第<input type=\"text\" />页\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button class=\"f-l\">确定</button>\r\n");
      out.write("                    <div style=\"clear:both;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--底部服务-->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottom.jsp", out, false);
      out.write("\r\n");
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
