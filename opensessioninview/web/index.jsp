<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

  <form action="log" method="post">

    <table>
      <tr>
        <td>入账账户：</td>
        <td>
          <input type="text" name="inid">
        </td>
      </tr>
      <tr>
        <td>转账账户：</td>
        <td>
           <input type="text" name="outid">
        </td>
      </tr>

      <tr>
        <td>金额</td>
        <td>
          <input type="text" name="money">
        </td>
      </tr>

      <tr>
        <td colspan="2">
          <input type="submit" value="提交">
        </td>
      </tr>
    </table>

  </form>

  </body>
</html>
