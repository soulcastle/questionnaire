/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-12-02 06:09:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>调查问卷系统</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta http-equiv=\"Access-Control-Allow-Origin\" content=\"*\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.ico\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/lib/layui-src/css/layui.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/layuimini.css?v=2.0.4.2\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/themes/default.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/lib/font-awesome-4.7.0/css/font-awesome.min.css\" media=\"all\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"static/js/html5.min.js\"></script>\r\n");
      out.write("    <script src=\"static/js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <style id=\"layuimini-bg-color\">\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body layuimini-all\">\r\n");
      out.write("<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"layui-header header\">\r\n");
      out.write("        <div class=\"layui-logo layuimini-logo\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layuimini-header-content\">\r\n");
      out.write("            <a>\r\n");
      out.write("                <div class=\"layuimini-tool\"><i title=\"展开\" class=\"fa fa-outdent\" data-side-fold=\"1\"></i></div>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!--电脑端头部菜单-->\r\n");
      out.write("            <ul class=\"layui-nav layui-layout-left layuimini-header-menu layuimini-menu-header-pc layuimini-pc-show\">\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <!--手机端头部菜单-->\r\n");
      out.write("            <ul class=\"layui-nav layui-layout-left layuimini-header-menu layuimini-mobile-show\">\r\n");
      out.write("                <li class=\"layui-nav-item\">\r\n");
      out.write("                    <a href=\"javascript:;\"><i class=\"fa fa-list-ul\"></i> 选择模块</a>\r\n");
      out.write("                    <dl class=\"layui-nav-child layuimini-menu-header-mobile\">\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("\r\n");
      out.write("                <li class=\"layui-nav-item\" lay-unselect>\r\n");
      out.write("                    <a href=\"javascript:;\" data-refresh=\"刷新\"><i class=\"fa fa-refresh\"></i></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"layui-nav-item mobile layui-hide-xs\" lay-unselect>\r\n");
      out.write("                    <a href=\"javascript:;\" data-check-screen=\"full\"><i class=\"fa fa-arrows-alt\"></i></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"layui-nav-item layuimini-setting\">\r\n");
      out.write("                    <a href=\"javascript:;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("                    <dl class=\"layui-nav-child\">\r\n");
      out.write("                        <dd>\r\n");
      out.write("                            <a href=\"javascript:;\" layuimini-content-href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("info\" data-title=\"基本资料\" data-icon=\"fa fa-gears\">基本资料</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                            <a href=\"javascript:;\" layuimini-content-href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("pwd\" data-title=\"修改密码\" data-icon=\"fa fa-gears\">修改密码</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                        <dd>\r\n");
      out.write("                            <a href=\"javascript:;\" class=\"login-out\">退出登录</a>\r\n");
      out.write("                        </dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"layui-nav-item layuimini-select-bgcolor\" lay-unselect>\r\n");
      out.write("                    <a href=\"javascript:;\" data-bgcolor=\"配色方案\">");
      out.write("</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--无限极左侧菜单-->\r\n");
      out.write("    <div class=\"layui-side layui-bg-black layuimini-menu-left\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--初始化加载层-->\r\n");
      out.write("    <div class=\"layuimini-loader\">\r\n");
      out.write("        <div class=\"layuimini-loader-inner\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--手机端遮罩层-->\r\n");
      out.write("    <div class=\"layuimini-make\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 移动导航 -->\r\n");
      out.write("    <div class=\"layuimini-site-mobile\"><i class=\"layui-icon\"></i></div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"layui-body\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layuimini-tab layui-tab-rollTool layui-tab\" lay-filter=\"layuiminiTab\" lay-allowclose=\"true\">\r\n");
      out.write("            <ul class=\"layui-tab-title\">\r\n");
      out.write("                <li class=\"layui-this\" id=\"layuiminiHomeTabId\" lay-id=\"\"></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"layui-tab-control\">\r\n");
      out.write("                <li class=\"layuimini-tab-roll-left layui-icon layui-icon-left\"></li>\r\n");
      out.write("                <li class=\"layuimini-tab-roll-right layui-icon layui-icon-right\"></li>\r\n");
      out.write("                <li class=\"layui-tab-tool layui-icon layui-icon-down\">\r\n");
      out.write("                    <ul class=\"layui-nav close-box\">\r\n");
      out.write("                        <li class=\"layui-nav-item\">\r\n");
      out.write("                            <a href=\"javascript:;\"><span class=\"layui-nav-more\"></span></a>\r\n");
      out.write("                            <dl class=\"layui-nav-child\">\r\n");
      out.write("                                <dd><a href=\"javascript:;\" layuimini-tab-close=\"current\">关 闭 当 前</a></dd>\r\n");
      out.write("                                <dd><a href=\"javascript:;\" layuimini-tab-close=\"other\">关 闭 其 他</a></dd>\r\n");
      out.write("                                <dd><a href=\"javascript:;\" layuimini-tab-close=\"all\">关 闭 全 部</a></dd>\r\n");
      out.write("                            </dl>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-tab-content\">\r\n");
      out.write("                <div id=\"layuiminiHomeTabIframe\" class=\"layui-tab-item layui-show\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"static/lib/layui-src/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"static/js/lay-config.js?v=2.0.0\" charset=\"utf-8\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['jquery', 'layer', 'miniAdmin'], function () {\r\n");
      out.write("        var $ = layui.jquery,\r\n");
      out.write("            layer = layui.layer,\r\n");
      out.write("            miniAdmin = layui.miniAdmin;\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("            iniUrl: \"menu\",    // 初始化接口\r\n");
      out.write("            urlHashLocation: true,      // 是否打开hash定位\r\n");
      out.write("            bgColorDefault: 3,      // 主题默认配置\r\n");
      out.write("            multiModule: false,          // 是否开启多模块\r\n");
      out.write("            menuChildOpen: false,       // 是否默认展开菜单\r\n");
      out.write("            loadingTime: 0,             // 初始化加载时间\r\n");
      out.write("            pageAnim: false,             // iframe窗口动画\r\n");
      out.write("            maxTabNum: 20,              // 最大的tab打开数量\r\n");
      out.write("        };\r\n");
      out.write("        miniAdmin.render(options);\r\n");
      out.write("\r\n");
      out.write("        $('.login-out').on(\"click\", function () {\r\n");
      out.write("            window.location = 'login.html';\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
