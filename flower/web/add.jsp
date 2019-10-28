<%--
  Created by IntelliJ IDEA.
  User: pengyu
  Date: 2019/8/5
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/servlet/Add" method="post">
<table>
    <tr>
        <td>花卉名称：</td>
        <td>
            <input type="text" name="name">
        </td>
    </tr>
    <tr>
        <td>花卉价格：</td>
        <td>
            <input type="text" name="price">
        </td>
    </tr>
    <tr>
        <td>花卉产地：</td>
        <td><input type="text" name="production"> </td>
    </tr>
    <tr>
        <td colspan="3">
            <input type="submit" value="提交">
        </td>

    </tr>
</table>
</form>
</body>
</html>
