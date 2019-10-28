<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
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
    <script type="text/javascript" src="js/jquery.js"></script>
  </head>
  <body>
  <form method="post" action="login">
    <table>
      <tr>
        <td>用户名:</td>
        <td>
          <input name="uname" id="nm">
        </td>
      </tr>
      <tr>
        <td>密码:</td>
        <td>
          <input name="password" id="pwd">
        </td>
      </tr>
      <tr>
        <td colspan="10">
          <input type="submit" value="登录">
          <input type="button" value="登录ByRestful" id="btn">
        </td>
      </tr>
      <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                location.href = "login2/"+$("#nm").val()+"/"+$("#pwd").val();
            })
        })
      </script>
    </table>

  </form>
  ${error}
  </body>
</html>
