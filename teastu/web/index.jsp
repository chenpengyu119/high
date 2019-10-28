<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
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
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">


        function getData(pageNum, pageSize) {

            var sname = $("#sname").val();
            var tname = $("#tname").val();

            location.href = "servlet/StudentServlet?method=findStu&pageSize=" + pageSize + "&pageNum=" + pageNum+"&sname="+sname+"&tname="+tname;
        }


    </script>
</head>
<body>
<p>
    <input type="radio" name="pageSize">2 &nbsp;&nbsp;&nbsp;
    <input type="radio" name="pageSize">3 &nbsp;&nbsp;&nbsp;
    <input type="radio" name="pageSize">4
</p>

    <p>
        学生姓名：<input type="text" name="sname" id="sname" value="${page.sname}"> &nbsp;&nbsp;
        老师姓名：<input type="text" name="tname" id="tname" value="${page.tname}"> &nbsp;&nbsp;
        <input type="button" value="查询" onclick="getData('${page.pageNum}','${page.pageSize}')">
    </p>


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
    <c:forEach items="${page.list}" var="stu">
        <tr>
            <td>${stu.sid}</td>
            <td>${stu.sname}</td>
            <td>${stu.sage}</td>
            <td>${stu.teacher.tname}</td>
        </tr>
    </c:forEach>

    </tbody>

</table>

<a href="javascript:pre()">上一页</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascipt:next()">下一页</a>


</body>
</html>
