/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-11-04 07:05:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>管理员列表</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../static/lib/layui-src/css/layui.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../static/lib/font-awesome-4.7.0/css/font-awesome.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../static/css/public.css\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layuimini-container\">\r\n");
      out.write("    <div class=\"layuimini-main\">\r\n");
      out.write("        <fieldset class=\"table-search-fieldset\">\r\n");
      out.write("            <legend>查询条件</legend>\r\n");
      out.write("            <div style=\"margin: 10px 10px 10px 10px\">\r\n");
      out.write("                <form class=\"layui-form layui-form-pane\" action=\"\">\r\n");
      out.write("                    <div class=\"layui-form-item\">\r\n");
      out.write("                        <div class=\"layui-inline\">\r\n");
      out.write("                            <label class=\"layui-form-label\">账号</label>\r\n");
      out.write("                            <div class=\"layui-input-inline\">\r\n");
      out.write("                                <input type=\"text\" name=\"account\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"layui-inline\">\r\n");
      out.write("                            <label class=\"layui-form-label\">姓名</label>\r\n");
      out.write("                            <div class=\"layui-input-inline\">\r\n");
      out.write("                                <input type=\"text\" name=\"name\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"layui-inline\">\r\n");
      out.write("                            <label class=\"layui-form-label\">手机号码</label>\r\n");
      out.write("                            <div class=\"layui-input-inline\">\r\n");
      out.write("                                <input type=\"text\" name=\"phone\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"layui-inline\">\r\n");
      out.write("                            <button type=\"submit\" class=\"layui-btn \"  lay-submit lay-filter=\"data-search-btn\"><i class=\"layui-icon\"></i> 搜 索</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/html\" id=\"toolbarDemo\">\r\n");
      out.write("            <div class=\"layui-btn-container\">\r\n");
      out.write("                <button class=\"layui-btn layui-btn-sm data-add-btn\" lay-event=\"add\">\r\n");
      out.write("                    <i class=\"fa fa-plus\"></i>\r\n");
      out.write("                    添加 </button>\r\n");
      out.write("                <button class=\"layui-btn layui-btn-sm layui-btn-sm data-delete-btn\" lay-event=\"edit\">\r\n");
      out.write("                    <i class=\"fa fa-pencil\"></i>\r\n");
      out.write("                    修改 </button>\r\n");
      out.write("                <button class=\"layui-btn layui-btn-sm layui-btn-danger data-delete-btn\" lay-event=\"delete\">\r\n");
      out.write("                    <i class=\"fa fa-remove\"></i>\r\n");
      out.write("                    删除 </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <table class=\"layui-hide\" id=\"currentTableId\" lay-filter=\"currentTableFilter\"></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../static/lib/layui-src/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['form', 'table'], function () {\r\n");
      out.write("        var $ = layui.jquery,\r\n");
      out.write("            form = layui.form,\r\n");
      out.write("            table = layui.table;\r\n");
      out.write("\r\n");
      out.write("        table.render({\r\n");
      out.write("            elem: '#currentTableId',\r\n");
      out.write("            url: 'query',\r\n");
      out.write("            toolbar: '#toolbarDemo',\r\n");
      out.write("            contentType: 'application/json',\r\n");
      out.write("            method:\"post\",\r\n");
      out.write("            defaultToolbar: ['filter', 'exports', 'print'],\r\n");
      out.write("            cols: [[\r\n");
      out.write("                {type: \"checkbox\", width: 50},\r\n");
      out.write("                {field: 'id', width: 80, title: 'ID', sort: true},\r\n");
      out.write("                {field: 'account', width: 180, title: '用户名'},\r\n");
      out.write("                {field: 'name', width: 280, title: '姓名', sort: true},\r\n");
      out.write("                {field: 'phone', width: 280, title: '手机'},\r\n");
      out.write("                {field: 'remark', title: '备注', minWidth: 250}\r\n");
      out.write("            ]],\r\n");
      out.write("            limits: [10, 15, 20, 25, 50, 100],\r\n");
      out.write("            limit: 15,\r\n");
      out.write("            page: true,\r\n");
      out.write("            skin: 'line'\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 监听搜索操作\r\n");
      out.write("        form.on('submit(data-search-btn)', function (data) {\r\n");
      out.write("            var result = JSON.stringify(data.field);\r\n");
      out.write("            /*layer.alert(result, {\r\n");
      out.write("                title: '最终的搜索信息'\r\n");
      out.write("            });*/\r\n");
      out.write("            //执行搜索重载\r\n");
      out.write("            table.reload('currentTableId', {\r\n");
      out.write("                page: {\r\n");
      out.write("                    curr: 1\r\n");
      out.write("                },\r\n");
      out.write("                contentType:'application/json',\r\n");
      out.write("                where: data.field\r\n");
      out.write("            }, 'data');\r\n");
      out.write("\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        /**\r\n");
      out.write("         * toolbar监听事件\r\n");
      out.write("         */\r\n");
      out.write("        table.on('toolbar(currentTableFilter)', function (obj) {\r\n");
      out.write("            if (obj.event === 'add') {  // 监听添加操作\r\n");
      out.write("                var index = layer.open({\r\n");
      out.write("                    title: '添加用户',\r\n");
      out.write("                    type: 2,\r\n");
      out.write("                    shade: 0.2,\r\n");
      out.write("                    maxmin:false,\r\n");
      out.write("                    shadeClose: true,\r\n");
      out.write("                    area: ['80%', '80%'],\r\n");
      out.write("                    content: 'create',\r\n");
      out.write("                    end:function(){\r\n");
      out.write("                        table.reload('currentTableId');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                $(window).on(\"resize\", function () {\r\n");
      out.write("                    layer.full(index);\r\n");
      out.write("                });\r\n");
      out.write("            } else if (obj.event === 'delete') {  // 监听删除操作\r\n");
      out.write("                var checkStatus = table.checkStatus('currentTableId')\r\n");
      out.write("                    , data = checkStatus.data;\r\n");
      out.write("                var arr=[];\r\n");
      out.write("                for(index in data){\r\n");
      out.write("                    arr.push(data[index].id);\r\n");
      out.write("                }\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url:\"delete\",\r\n");
      out.write("                    type:\"POST\",\r\n");
      out.write("                    dataType:'json',\r\n");
      out.write("                    data:'ids='+arr.join(\",\"),\r\n");
      out.write("                    success:function(data){\r\n");
      out.write("                        layer.msg(data.msg,{time:500},\r\n");
      out.write("                            function(){\r\n");
      out.write("                                table.reload('currentTableId');\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }else if (obj.event === 'edit') {  // 监听编辑操作\r\n");
      out.write("\r\n");
      out.write("                var checkStatus = table.checkStatus('currentTableId')\r\n");
      out.write("                    , data = checkStatus.data;\r\n");
      out.write("                var arr=[];\r\n");
      out.write("                for(index in data){\r\n");
      out.write("                    arr.push(data[index].id);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                if(arr.length !=1){\r\n");
      out.write("                    layer.msg(\"请选择一行数据修改\",{time:1000});\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                var index = layer.open({\r\n");
      out.write("                    title: '修改用户',\r\n");
      out.write("                    type: 2,\r\n");
      out.write("                    shade: 0.2,\r\n");
      out.write("                    maxmin:false,\r\n");
      out.write("                    shadeClose: true,\r\n");
      out.write("                    area: ['80%', '80%'],\r\n");
      out.write("                    content: 'detail?id='+arr[0],\r\n");
      out.write("                    end:function(){\r\n");
      out.write("                        table.reload('currentTableId');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                $(window).on(\"resize\", function () {\r\n");
      out.write("                    layer.full(index);\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //监听表格复选框选择\r\n");
      out.write("        table.on('checkbox(currentTableFilter)', function (obj) {\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        table.on('tool(currentTableFilter)', function (obj) {\r\n");
      out.write("            var data = obj.data;\r\n");
      out.write("            if (obj.event === 'edit') {\r\n");
      out.write("                var index = layer.open({\r\n");
      out.write("                    title: '编辑用户',\r\n");
      out.write("                    type: 2,\r\n");
      out.write("                    shade: 0.2,\r\n");
      out.write("                    maxmin:true,\r\n");
      out.write("                    shadeClose: true,\r\n");
      out.write("                    area: ['100%', '100%'],\r\n");
      out.write("                    content: '../page/table/edit.html',\r\n");
      out.write("                });\r\n");
      out.write("                $(window).on(\"resize\", function () {\r\n");
      out.write("                    layer.full(index);\r\n");
      out.write("                });\r\n");
      out.write("                return false;\r\n");
      out.write("            } else if (obj.event === 'delete') {\r\n");
      out.write("                layer.confirm('真的删除行么', function (index) {\r\n");
      out.write("                    obj.del();\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
