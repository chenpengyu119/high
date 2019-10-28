<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>花卉信息</h3>
<table border="1px" cellpadding="0px" cellspacing="0px">
    <tr>
        <td>花卉编号</td>
        <td>花卉名称</td>
        <td>花卉价格</td>
        <td>花卉产地</td>
    </tr>
    <c:forEach items="${flowerList}" var="flowere">
        <tr>
            <td>${flower.id}</td>
            <td>${flower.name}</td>
            <td>${flower.price}</td>
            <td>${flower.production}</td>
        </tr>
    </c:forEach>
</table>
<a href="add.jsp" >添加</a>
</body>
</html>
