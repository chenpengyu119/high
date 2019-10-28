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
         <form method="post" action="user">
           用户名:<input type="text" name="uname"><br>
           密码:<input type="password" name="password"><br>
           <input type="submit" value="登录">
         </form>
  ${error}
  </body>
</html>
