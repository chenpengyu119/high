<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        String basePath =
                // 协议
                request.getScheme() + "://" +
                        request.getServerName() + ":" +
                        request.getServerPort() +
                        //当前项目
                        request.getContextPath() + "/";
    %>
    <base href="<%=basePath%>">
</head>
<body>
<h3> 成功了</h3>

</body>
</html>
