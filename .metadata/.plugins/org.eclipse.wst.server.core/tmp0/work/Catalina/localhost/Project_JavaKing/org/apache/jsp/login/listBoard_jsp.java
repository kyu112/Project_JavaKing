/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.105
 * Generated at: 2020-10-05 06:43:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;

public final class listBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>:: 비트대학교 ::</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   function change_category(board_category){\r\n");
      out.write("      location.href=\"listBoard.do?board_category=\"+encodeURI(encodeURI(board_category));\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function change_pagesize(page_size){\r\n");
      out.write("\t   location.href=\"listBoard.do?page_size=\"+page_size; \r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor : black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: sans-serif;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\twidth: 2000px;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tpadding : 0;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logo {\r\n");
      out.write("\tdisplay : inline-block;\r\n");
      out.write("\tmargin-left : 40%;\r\n");
      out.write("\tpadding-top : 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#lock_image{\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#hello_box{\r\n");
      out.write("\tdisplay : inline-block;\r\n");
      out.write("\tmargin-left : 70%;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#name {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor:#083b90;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logout {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor:#8C8C8C;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav_boxes{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("\twidth : 100px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav_box {\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("\twidth : 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav1 {\r\n");
      out.write("\tmargin-left : 400px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav_window {\r\n");
      out.write("\tdisplay : none;\r\n");
      out.write("\tposition : absolute;\r\n");
      out.write("\twidth : 100%;\r\n");
      out.write("\theight : 160px;\r\n");
      out.write("\tbackground-color: #083b90;\r\n");
      out.write("\tbox-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav:hover {\r\n");
      out.write("\tbackground-color: #083b90;\r\n");
      out.write("\tcolor : #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav1:hover + #nav_window1{\r\n");
      out.write("\tdisplay : block;\r\n");
      out.write("\tborder-bottom: 1px #083b90 solid;\r\n");
      out.write("\tborder-top: 1px #083b90 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav2:hover + #nav_window2{\r\n");
      out.write("\tdisplay : block;\r\n");
      out.write("\tborder-bottom: 1px #083b90 solid;\r\n");
      out.write("\tborder-top: 1px #083b90 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav3:hover + #nav_window3{\r\n");
      out.write("\tdisplay : block;\r\n");
      out.write("\tborder-bottom: 1px #083b90 solid;\r\n");
      out.write("\tborder-top: 1px #083b90 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav4:hover + #nav_window4{\r\n");
      out.write("\tdisplay : block;\r\n");
      out.write("\tborder-bottom: 1px #083b90 solid;\r\n");
      out.write("\tborder-top: 1px #083b90 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav_window1:hover {\r\n");
      out.write("\tdisplay : block;\r\n");
      out.write("\tborder-bottom: 1px #083b90 solid;\r\n");
      out.write("\tborder-top: 1px #083b90 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav_window2:hover {\r\n");
      out.write("\tdisplay : block;\r\n");
      out.write("\tborder-bottom: 1px #083b90 solid;\r\n");
      out.write("\tborder-top: 1px #083b90 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav_window3:hover {\r\n");
      out.write("\tdisplay : block;\r\n");
      out.write("\tborder-bottom: 1px #083b90 solid;\r\n");
      out.write("\tborder-top: 1px #083b90 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav_window4:hover {\r\n");
      out.write("\tdisplay : block;\r\n");
      out.write("\tborder-bottom: 1px #083b90 solid;\r\n");
      out.write("\tborder-top: 1px #083b90 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav_title {\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav_right{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("\theight : 100%;\r\n");
      out.write("\twidth : 75%;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft : 25%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav_right_title {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav_right_box{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tpadding : 20px;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\tlist-style-type: square;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write("\tbackground-color: #EBF7FF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#section_main {\r\n");
      out.write("\tmargin-left: 320px;\r\n");
      out.write("\tmargin-top: 50px;\r\n");
      out.write("\twidth: 1250px;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("\tpadding : 50px;\r\n");
      out.write("\tborder : 2px #E1E1E1 solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("  display: block;\r\n");
      out.write("  margin-top: 1.5em;\r\n");
      out.write("  margin-bottom: 2em;\r\n");
      out.write("  margin-left: 0;\r\n");
      out.write("  margin-right: 0;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".p2 {\r\n");
      out.write("  display: block;\r\n");
      out.write("  margin-top: 0.3em;\r\n");
      out.write("  margin-bottom: 0.7em;\r\n");
      out.write("  margin-left: 0;\r\n");
      out.write("  margin-right: 0;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header{\r\n");
      out.write("  \ttext-align: center;\r\n");
      out.write(" \tpadding-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write(".topnav {\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tbackground-color: #083b90;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write(".topnav a {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: #f2f2f2;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 10px 16px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a:hover {\r\n");
      out.write("    background-color: #ddd;\r\n");
      out.write("    color: black;\r\n");
      out.write("} \r\n");
      out.write("   \r\n");
      out.write(".boarddiv {\r\n");
      out.write("\tpadding-top:6px;\r\n");
      out.write(" \tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pagenum {\r\n");
      out.write(" \tpadding-top:6px;\r\n");
      out.write(" \tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content{\r\n");
      out.write(" \tfloat:inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("\tbackground-color: #f1f1f1;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".write{\r\n");
      out.write("\tfloat:right;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("\tpadding-left: 20px;\r\n");
      out.write("\tpadding-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("\tborder-bottom: 1px solid #ddd;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:hover {\r\n");
      out.write("\tbackground-color: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page_str{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("\tbackground-color: #EBF7FF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer_box{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 150px;\r\n");
      out.write("\tbackground-color: #313740;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tmargin-top: 50px;\r\n");
      out.write("\tborder-top: 1px solid gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer_title{\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tcolor : #FFFFFF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 40px; \r\n");
      out.write("\tmargin-left:620px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer_text {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tcolor : #FFFFFF;\r\n");
      out.write("\tmargin-top:50px;\r\n");
      out.write("\tmargin-left:50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<header>\r\n");
      out.write("\t<div id = \"logo\">\r\n");
      out.write("\t\t<a href = \"main.do\"><img src =\"../image/logo3.png\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id = \"hello_box\">\r\n");
      out.write("\t\t<span id = \"name\">\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t\t님 반갑습니다.&nbsp;&nbsp;\r\n");
      out.write("\t\t<img src=\"../image/lock.png\" id= \"lock_image\">\r\n");
      out.write("\t\t<a href = \"logout.do\" id = \"logout\">로그아웃</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr>\r\n");
      out.write("</header>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<div id = \"nav_boxes\">\r\n");
      out.write("\t\t\t<div id = \"nav1\" class = \"nav\">\r\n");
      out.write("\t\t\t\t<a href = \"studentInfo.do\" class = \"nav\">학사정보</a><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id = \"nav_window1\" class =\"nav_window\">\r\n");
      out.write("\t\t\t\t<div id = \"nav_title1\" class = \"nav_title\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;학사정보\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id =\"nav_right1\" class = \"nav_right\">\r\n");
      out.write("\t\t\t\t\t<div id = \"nav_right_list1\" class = \"nav_right_list\">\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t학적\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"studentInfo.do\">학적조회</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t수업\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"classreg.jsp\">수강신청</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"classreg.jsp\">수강내역조회</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"classreg.jsp\">시간표조회</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t성적\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listGrade.do\">성적조회</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t등록\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listReg.do\">등록조회</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t교수\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listPro.do\">교수조회</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;·&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<div id = \"nav2\" class = \"nav\">\r\n");
      out.write("\t\t\t\t<a href = \"listBoard.do?board_boardno=100&board_category=%25EA%25B3%25B5%25EC%25A7%2580%25EC%2582%25AC%25ED%2595%25AD\" class = \"nav\">알림마당</a><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id = \"nav_window2\" class =\"nav_window\">\r\n");
      out.write("\t\t\t\t<div id = \"nav_title2\" class = \"nav_title\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;알림마당\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id =\"nav_right2\" class = \"nav_right\">\r\n");
      out.write("\t\t\t\t\t<div id = \"nav_right_list2\" class = \"nav_right_list\">\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t공지사항\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listBoard.do?board_boardno=100&board_category=%25EA%25B3%25B5%25EC%25A7%2580%25EC%2582%25AC%25ED%2595%25AD\">공지사항</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;·&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<div id = \"nav3\" class = \"nav\">\r\n");
      out.write("\t\t\t\t<a href = \"listBoard.do?board_boardno=300&board_category=%25EC%259E%2590%25EC%259C%25A0%25EA%25B2%258C%25EC%258B%259C%25ED%258C%2590\" class = \"nav\">참여마당</a><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id = \"nav_window3\" class =\"nav_window\">\r\n");
      out.write("\t\t\t\t<div id = \"nav_title3\" class = \"nav_title\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;참여마당\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id =\"nav_right3\" class = \"nav_right\">\r\n");
      out.write("\t\t\t\t\t<div id = \"nav_right_list3\" class = \"nav_right_list\">\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t중고장터\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listBoard.do?board_boardno=300&board_category=%25EC%2582%25BD%25EB%258B%2588%25EB%258B%25A4\">삽니다</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listBoard.do?board_boardno=300&board_category=%25ED%258C%259D%25EB%258B%2588%25EB%258B%25A4\">팝니다</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t게시판\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listBoard.do?board_boardno=300&board_category=%25EC%259E%2590%25EC%259C%25A0%25EA%25B2%258C%25EC%258B%259C%25ED%258C%2590\">자유게시판</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listBoard.do?board_boardno=300&board_category=%25EC%259D%25B5%25EB%25AA%2585%25EA%25B2%258C%25EC%258B%259C%25ED%258C%2590\">익명게시판</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;·&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<div id = \"nav4\" class = \"nav\">\r\n");
      out.write("\t\t\t\t<a href = \"listBoard.do?board_boardno=200&board_category=%25EC%258B%259C%25EC%2584%25A4QNA\" class = \"nav\">도움마당</a><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id = \"nav_window4\" class =\"nav_window\">\r\n");
      out.write("\t\t\t\t<div id = \"nav_title4\" class = \"nav_title\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;도움마당\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id =\"nav_right4\" class = \"nav_right\">\r\n");
      out.write("\t\t\t\t\t<div id = \"nav_right_list4\" class = \"nav_right_list\">\r\n");
      out.write("\t\t\t\t\t\t<div class = \"nav_right_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class = \"nav_right_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\tQnA\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class= \"inside_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listBoard.do?board_boardno=200&board_category=%25EC%258B%259C%25EC%2584%25A4QNA\">시설 QnA</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><p class = \"p2\"><a href = \"listBoard.do?board_boardno=200&board_category=%25ED%2595%2599%25EC%2582%25ACQNA\">학사 QnA</a></p></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<section>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<div id = \"section_main\">\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board_boardname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h2>\t\r\n");
      out.write("\t\t\t<div class=\"topnav\">\r\n");
      out.write("\t\t\t\t<a href=\"listBoard.do?board_boardno=100\">알림마당</a>\r\n");
      out.write("\t\t\t\t<a href=\"listBoard.do?board_boardno=200\">도움마당</a>\r\n");
      out.write("\t\t\t\t<a href=\"listBoard.do?board_boardno=300\">참여마당</a>\r\n");
      out.write("\t\t\t</div> \r\n");
      out.write("\t\t\t<div class=\"boarddiv\">\r\n");
      out.write("\t\t\t\t<select onchange=\"change_category(this.value)\">\r\n");
      out.write("\t\t\t\t\t<option>====카테고리 선택====</option>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"pagenum\">\r\n");
      out.write("\t\t\t\t<select onchange=\"change_pagesize(this.value)\">\r\n");
      out.write("\t\t\t\t\t<option>====한번에 볼 게시물 수 선택====</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">5개씩 보기</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"10\">10개씩 보기</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"20\">20개씩 보기</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<table width=\"100%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>순번</th>\r\n");
      out.write("\t\t\t\t\t<th>분류</th>\r\n");
      out.write("\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t\t<th>작성일</th>\r\n");
      out.write("\t\t\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<form action=\"listBoard.do\" method=\"post\">\r\n");
      out.write("\t\t\t<select name=\"keyword\">\r\n");
      out.write("\t\t\t\t<option value=\"board_title\">제목</option>\r\n");
      out.write("\t\t\t\t<option value=\"std_no\">작성자</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<input type=\"search\" name=\"search\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"검색\">\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<a href=\"insertBoard.do?board_boardno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board_boardno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"write\">글쓰기</a>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"page_str\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page_str}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("</body>\r\n");
      out.write("<footer>\r\n");
      out.write("\t<div id =\"footer_box\">\r\n");
      out.write("\t\t<div id = \"footer_title\">\r\n");
      out.write("\t\t비트대학교\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id = \"footer_text\">\r\n");
      out.write("\t\t\t　　주소 | 서울특별시 마포구 백범로 23 구프라자 B1<br>\r\n");
      out.write("\t\t\t대표전화 | 02-707-1480\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>\r\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /login/listBoard.jsp(476,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("cl");
      // /login/listBoard.jsp(476,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category_list}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      // /login/listBoard.jsp(476,5) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setBegin(0);
      // /login/listBoard.jsp(476,5) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category_list.size()}", java.lang.Integer.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).intValue());
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</option>\r\n");
            out.write("\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /login/listBoard.jsp(501,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("b");
      // /login/listBoard.jsp(501,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.rownum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.board_category}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td><a href=\"detailBoard.do?board_no=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.board_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.board_title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</a></td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.std_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.board_regdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.board_hit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\t\t\t\t\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
