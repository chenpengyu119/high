<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">

        var pageNum;
        var pageSize = 1;
        var pageCount;

        function getData(pageNum2,pageSize) {
            $.get("log", {
                pageNum: pageNum2,
                pageSize: pageSize
            }, function (data) {
                eval("var obj=" + data);
                var tb = $("#tb");
                tb.empty();
                var str = "";
                for (var i=0;i<obj.list.length;i++){
                    str+="<tr>\n" +
                        "            <td>"+obj.list[i].outid+"</td>\n" +
                        "            <td>"+obj.list[i].inid+"</td>\n" +
                        "            <td>"+obj.list[i].money+"</td>\n" +
                        "        </tr>";
                }
                tb.html(str);

                // 当前页码
                pageNum = obj.pageNum;
                // 总页数
                pageCount = obj.pageCount;
                // 设置页码
                var pageno = $("#pageno");
                pageno.empty();
                str = "";
                for (var i=1;i<=obj.pageCount;i++){
                    if (i==pageNum){
                        str+="<a style='color:red' href='javascript:getData("+i+",pageSize)'>"+i+"</a>&nbsp;&nbsp;&nbsp;"
                    } else {
                        str+="<a href='javascript:getData("+i+",pageSize)'>"+i+"</a>&nbsp;&nbsp;&nbsp;"
                    }
                }
                pageno.html(str);
            })
        };

        $(function () {
            getData(1,pageSize);
        })

        function pre() {
            if (pageNum!=0){
                getData(pageNum-1,pageSize);
            } else {
                return false;
            }
        }

        function next() {
            if (pageNum!=pageCount){
                getData(pageNum+1,pageSize);
            }
        }



    </script>

</head>
<body>
<h3>日志信息</h3>

<table>
    <thead>
        <tr>
            <td>转账账户</td>
            <td>收款账户</td>
            <td>转账金额</td>
        </tr>
    </thead>
    <tbody id="tb">

    </tbody>

</table>

<a href="javascript:pre()">上一页</a>
<span id="pageno">

</span>
<a href="javascript:next()">下一页</a>
</body>
</html>
