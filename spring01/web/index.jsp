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
  <c:forEach items="${flowerList}" var="flower">
    ${flower.id}
    ${flower.name}
    ${flower.price}<br>
  </c:forEach>

  </body>
</html>
