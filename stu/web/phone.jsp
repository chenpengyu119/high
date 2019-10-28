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
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
        var pageSize = 1;
        var pageNum ;
        var pageCount;

        function getData(pageSize,pageNum) {
            $.get("servlet/phone?method=find",
                {
                  pageSize:pageSize,
                  pageNum:pageNum,
                  name:$("#name").val(),
                  phone:$("#phone").val()
                },
            function (data) {
                console.info(data);

            })
        }
        $(function () {
            getData(pageSize,1);
            $("#chooseAll").click(function () {
                $("#chec").attr("checked","true");
            })
        })


        function pre() {

        }

        function next() {

        }

        function sel() {
            getData(pageSize,1);
        }

        function del() {
            var ch = $("#chec").val();
            location.href="phone?method=del&chec="+ch;
        }

    </script>

</head>
<body>

<p>
    姓名：<input type="text" name="name" id="name"> &nbsp;&nbsp;&nbsp;
    电话：<input type="text" name="phone" id="phone"> &nbsp;&nbsp;&nbsp;
    <input type="button" value="查询" onclick="javascript:sel()">

</p>

<table border="1px" cellpadding="10px" cellspacing="0px">
    <thead>
        <tr>
            <td>
                <input type="radio" id="chooseAll"/>
            </td>
            <td>编号</td>
            <td>姓名</td>
            <td>手机号</td>
        </tr>
    </thead>
    <tbody id="tb">
        <tr>
            <td>
                <input type="checkbox" value="list[i].id" name="choose" id="chec">
            </td>
            <td>1</td>
            <td>张三</td>
            <td>13666666666</td>
        </tr>
    </tbody>

</table>

<a href="javascript:pre()">上一页</a>
<span id="pageno">
    <a href="getData(i)">i</a>
</span>

<a href="javascript:next()">下一页</a>

<hr>
<a href="javacript:del()">删除</a>
</body>
</html>
