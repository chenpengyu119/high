<%--
  Created by IntelliJ IDEA.
  User: pengyu
  Date: 2019/8/6
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转账</title>
</head>
<body>
<h3>转账</h3>
<form method="post" action="ts">

    <table border="1px" cellspacing="10px" cellpadding="0px">
        <tr>
            <td>转账帐号：</td>
            <td>
                <input type="text" name="outid">
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input type="password" name="pwd">
            </td>
        </tr>
        <tr>
            <td>金额：</td>
            <td>
                <input type="text" name="money">
            </td>
        </tr>
        <tr>
            <td>收款帐号：</td>
            <td>
                <input type="text" name="inid">
            </td>
        </tr>
        <tr>
            <td>收款人姓名：</td>
            <td>
                <input type="text" name="aname">
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="转账">
            </td>

        </tr>
    </table>


</form>

</body>
</html>
