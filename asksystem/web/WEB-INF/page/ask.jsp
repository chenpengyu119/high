<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我要提问</title>
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
    <script type="text/javascript">
        function toHome() {
            window.history.back(-1);
        }
    </script>
    <style type="text/css">
        div{
            text-align: center;
        }
    </style>
</head>
<body>
<h3 align="center">我要提问</h3>
<div>
    <a href="javascript:toHome()">返回首页</a>
    <form action="add" method="post">
        <table>
            <tr>
                <td>问题：</td>
                <td>
                    <input type="text" name="title">
                </td>
                <td></td>
            </tr>
            <tr>
                <td>问题描述：</td>
                <td>
                    <textarea name="detailDesc" style="width: 170px;height: 50px"></textarea>
                </td>
                <td></td>
            </tr>
            <tr>
                <td colspan="5">
                    <input type="submit" value="保存提问">
                </td>
                <td></td>
                <td></td>
            </tr>
        </table>
    </form>

</div>


${error}

</body>
</html>
