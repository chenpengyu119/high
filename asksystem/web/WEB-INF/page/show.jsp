<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查看问题列表</title>
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
    <style type="text/css">
        div{
            text-align: center;
        }
    </style>
</head>
<body>
<h3 align="center">在线问答</h3>
<div>
    <a href="toask">我要提问</a>
    <table>
        <tr>
            <td>序号</td>
            <td>问题</td>
            <td>回答次数</td>
            <td>最后修改</td>
        </tr>

        <c:forEach items="${questionList}" var="q">
            <tr>
                <td>${q.id}</td>
                <td><a href="todetail/${q.id}">${q.detailDesc}</a></td>
                <td>${q.answerCount}</td>
                <td>${q.lastModified}</td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
