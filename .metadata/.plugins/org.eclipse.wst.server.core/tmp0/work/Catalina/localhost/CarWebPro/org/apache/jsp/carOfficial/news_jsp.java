/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0
 * Generated at: 2019-07-04 08:37:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.carOfficial;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class news_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/study/CAR/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CarWebPro/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1561685519668L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<title>恒达汽修有限公司</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/meteinfo_ui.css\"\r\n");
      out.write("\tid=\"metuimodule\" data-module=\"1\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/metinfo.css\" />\r\n");
      out.write("<script src=\"js/jQuery1.7.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/metinfo_ui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/ch.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--[if IE]>\r\n");
      out.write("<script src=\"public/js/html5.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"m-nav\">\r\n");
      out.write("\t\t<nav class=\"inner\">\r\n");
      out.write("\t\t\t<ul class=\"list-none\">\r\n");
      out.write("\t\t\t\t<li id=\"nav_10001\" style='width: 123px;'><a href='index.html'\r\n");
      out.write("\t\t\t\t\ttitle='网站首页' class='nav'><span>网站首页</span></a></li>\r\n");
      out.write("\t\t\t\t<li id='nav_1' style='width: 123px;'><a href='about.html'\r\n");
      out.write("\t\t\t\t\t0 title='关于我们' class='hover-none nav'><span>关于我们</span></a></li>\r\n");
      out.write("\t\t\t\t<li id='nav_2' style='width: 123px;' class='navdown'><a\r\n");
      out.write("\t\t\t\t\thref='news.html' title='信息中心' class='hover-none nav'><span>信息中心</span></a></li>\r\n");
      out.write("\t\t\t\t<li id='nav_3' style='width: 123px;'><a href='product.html'\r\n");
      out.write("\t\t\t\t\ttitle='恒达汽修产品' class='hover-none nav'><span>恒达汽修产品</span></a></li>\r\n");
      out.write("\t\t\t\t<li id='nav_4' style='width: 122px;'><a href='cases.html'\r\n");
      out.write("\t\t\t\t\ttitle='服务车型' class='hover-none nav'><span>服务车型</span></a></li>\r\n");
      out.write("\t\t\t\t<li id='nav_34' style='width: 122px;'><a href='joinUs.html'\r\n");
      out.write("\t\t\t\t\ttitle='在线招聘' class='hover-none nav'><span>在线招聘</span></a></li>\r\n");
      out.write("\t\t\t\t<li id='nav_11' style='width: 122px;'><a href='booking.html'\r\n");
      out.write("\t\t\t\t\ttitle='在线预约' class='hover-none nav'><span>在线预约</span></a></li>\r\n");
      out.write("\t\t\t\t<li id='nav_18' style='width: 122px;'><a href='contact.html'\r\n");
      out.write("\t\t\t\t\ttitle='联系我们' class='hover-none nav'><span>联系我们</span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"inner top\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"../\" title=\"汽配公司\" id=\"web_logo\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"img/1363847903.png\" style=\"width: 210px; height: 55px;\"\r\n");
      out.write("\t\t\t\talt=\"汽配公司\" title=\"汽配公司\" style=\"margin:0px 0px 0px 10px;\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"top-seo\">\r\n");
      out.write("\t\t\t\t<div class=\"tpseotxt\">\r\n");
      out.write("\t\t\t\t\t<p>&nbsp;020-5856-1762</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"inner met_flash\">\r\n");
      out.write("\t\t<div class=\"flash\">\r\n");
      out.write("\t\t\t<img src='img/1363850250.jpg' width='980' alt='' height='300'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"sidebar inner\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"sb_nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h3 class='title'>信息中心</h3>\r\n");
      out.write("\t\t\t<div class=\"active b-r\" id=\"sidebar\" data-csnow=\"2\" data-class3=\"0\"\r\n");
      out.write("\t\t\t\tdata-jsok=\"2\">\r\n");
      out.write("\t\t\t\t<dl class=\"list-none navnow\">\r\n");
      out.write("\t\t\t\t\t<dt id='part2_19'>\r\n");
      out.write("\t\t\t\t\t\t<a href='news.html' title='汽车保养' class=\"zm\"><span>汽车保养</span></a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl class=\"list-none navnow\">\r\n");
      out.write("\t\t\t\t\t<dt id='part2_20'>\r\n");
      out.write("\t\t\t\t\t\t<a href='news.html' title='行业新闻' class=\"zm\"><span>行业新闻</span></a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h3 class='title line'>联系方式</h3>\r\n");
      out.write("\t\t\t<div class=\"active editor b-r\">\r\n");
      out.write("\t\t\t\t<div>电话：020-5856-1762</div>\r\n");
      out.write("\t\t\t\t<div>手机：15521389512</div>\r\n");
      out.write("\t\t\t\t<div>QQ：913405314</div>\r\n");
      out.write("\t\t\t\t<div>联系人：谭先生</div>\r\n");
      out.write("\t\t\t\t<div>邮箱：hengdaqixiu@163.com</div>\r\n");
      out.write("\t\t\t\t<div>邮编：404100</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class='sb_box b-r'>\r\n");
      out.write("\t\t\t<h3 class=\"title\">\r\n");
      out.write("\t\t\t\t<div class=\"position\">\r\n");
      out.write("\t\t\t\t\t当前位置：<a href=\"../\" title=\"网站首页\">网站首页</a> &gt; <a href=../new/ >信息中心</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<span>信息中心</span>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"active\" id=\"newslist\">\r\n");
      out.write("\t\t\t\t<ul class='list-none metlist'>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div id=\"flip\">\r\n");
      out.write("\t\t\t\t\t<div class='digg4 metpager_8'>\r\n");
      out.write("\t\t\t\t\t\t<span class='disabled disabledfy'><b>«</b></span><span\r\n");
      out.write("\t\t\t\t\t\t\tclass='disabled disabledfy'>‹</span><span class='current'>1</span><span\r\n");
      out.write("\t\t\t\t\t\t\tclass='disabled disabledfy'>›</span><span\r\n");
      out.write("\t\t\t\t\t\t\tclass='disabled disabledfy'><b>»</b></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<footer class=\"inner\">\r\n");
      out.write("\t\t<div class=\"foot-nav\">\r\n");
      out.write("\t\t\t<a href=\"about.html\" 0 title='关于我们'>关于我们</a><span> |</span><a\r\n");
      out.write("\t\t\t\thref='feedback.html' title='客户留言'>客户留言</a><span>| <span><a\r\n");
      out.write("\t\t\t\t\thref='booking.html' title='在线预约'>在线预约</a><span>| </span><a\r\n");
      out.write("\t\t\t\t\thref='joinUs.html' title='人才招聘'>人才招聘</a><span>| <a\r\n");
      out.write("\t\t\t\t\t\thref='contact.html' title='网站地图'>联系我们</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"foot-text\">\r\n");
      out.write("\t\t\t<p>恒达汽修有限公司版权所有 2017-2018 备案号：渝ICP备13004606</p>\r\n");
      out.write("\t\t\t<p>电话：020-5856-1762</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
      // /carOfficial/news.jsp(115,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/carOfficial/news.jsp(115,5) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /carOfficial/news.jsp(115,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<li class='list top'><span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.releaseTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span><a\r\n");
            out.write("\t\t\t\t\t\t\thref='new8.html' title='");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.tiltle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("' target='_self'>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.tiltle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
