<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>问题详情界面</title>
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
<form method="post" action="addAnswer">
    <table>
        <tr>
            <td>问题：</td>
            <td>
                <input type="hidden" name="qid" value="${answerList.get(0).question.id}">
                ${answerList.get(0).question.title}
            </td>
        </tr>
        <tr>
            <td>问题描述：</td>
            <td>
                ${answerList.get(0).question.detailDesc}
            </td>
        </tr>

        <tr>
            <td>网友回答：</td>
            <td>
                <c:forEach items="${answerList}" var="answer">
                    ${answer.ansDate}<br>
                    ${answer.ansCount}<br>
                </c:forEach>
            </td>
        </tr>

        <tr>
            <td>我来回答：</td>
            <td>
                <textarea name="ansCount" style="width: 170px;height: 50px;"></textarea>
            </td>
        </tr>
        <tr>
            <td colspan="10">
                <input type="submit" value="提交回答">
                <a href="javascript:window.history.back(-1)">返回首页</a>
            </td>
            <td></td>
        </tr>
    </table>

</form>

${error}
</body>
</html>
