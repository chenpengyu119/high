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
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
      function changeImg() {
          $("img").attr("src","validcode?time="+new Date()) ;
      }

    </script>
  </head>
  <body>
  <form method="post" action="user">
    用户名：<input type="text" name="name"> <br>
    密码：<input type="password" name="password"><br>
    验证码：<input type="text" name="validcode"  style="width:50px"> <img src="validcode" width="80" height="40"><a href="javascript:changeImg()">看不清</a>
    <br>
    <input type="submit" value="登录"> <input type="reset" value="重置">
  </form>
${error}
  </body>
</html>
