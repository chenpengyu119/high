<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <%
        String basePath =
                // 协议
                request.getScheme()+"://"+
                        request.getServerName()+":"+
                        request.getServerPort()+
                        //当前项目
                        request.getContextPath()+"/";
    %>
    <base href="<%=basePath%>">
  </head>
  <body>
           <p>
             <input type="radio" name="pageSize">2 &nbsp;&nbsp;&nbsp;
             <input type="radio" name="pageSize">3 &nbsp;&nbsp;&nbsp;
             <input type="radio" name="pageSize">4
           </p>
           <form method="post" action="find">
               <p>
                 学生姓名：<input type="text" name="sname"> &nbsp;&nbsp;
                 老师姓名：<input type="text" name="tname">  &nbsp;&nbsp;
                 <input type="submit" value="查询">
               </p>
           </form>

           <table>
              <thead>
                <tr>
                  <td>编号</td>
                  <td>学生姓名</td>
                  <td>年龄</td>
                  <td>任课老师</td>
                </tr>
              </thead>
            <tbody>
              <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
              </tr>
            </tbody>

           </table>

  <a href="javascript:pre()">上一页</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascipt:next()">下一页</a>


  </body>
</html>
