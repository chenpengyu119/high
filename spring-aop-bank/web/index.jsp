<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <%
        String basePath =
                // 协议
                request.getScheme()+"://"+
                        request.getServerName()+":"+
                        request.getServerPort()+
                        //当前项目
                        request.getContextPath()+"/";
    %>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
        // 校验用户名和密码
        function checkNamePwd(){
            $.post("account",
                {
                    method:"checkNamePwd",
                    outid:$("#outid").val(),
                    apwd:$("#apwd").val()
                },
            function (data) {
                var apwdtip = $("#apwdtip");
                if (eval(data)){
                    apwdtip.html("√").css("color","green");
                }else {
                    apwdtip.html("X").css("color","red");
                }
            })
        }
        // 校验金额
        function checkMoney(){
            $.post("account",
                {
                    method:"checkMoney",
                    outid:$("#outid").val(),
                    apwd:$("#apwd").val(),
                    money:$("#money").val()
                },
                function (data) {
                    var moneytip = $("#moneytip");
                    if (eval(data)){
                        moneytip.html("√").css("color","green");
                    }else {
                        moneytip.html("X").css("color","red");
                    }
                })
        }
        // 校验收账人姓名
        function checkInName(){
            $.post("account",
                {
                    method:"checkInName",
                    money:$("#inname").val(),
                    inid:$("#inid").val()
                },
                function (data) {
                    var innametip = $("#innametip");
                    if (eval(data)){
                        innametip.html("√").css("color","green");
                    }else {
                        innametip.html("X").css("color","red");
                    }
                })
        }


      $(function () {
          // 校验用户名和密码
          $("#apwd").blur(function () {
              checkNamePwd();
          })

          $("#money").blur(function () {
              checkMoney();
          });

          $("#inname").blur(function () {
              checkInName();
          })
          $("#btn").click(function () {
              $.post("account",{
                  method:"transfer",
                  outid:$("#outid").val(),
                  money:$("#money").val(),
                  inid:$("#inid").val()
              },function (data) {

              })
          })

      })

    </script>
  </head>
  <body>
        转账账户：<input type="text" name="outid" id="outid"> <br>
        密码：<input type="password" name="apwd" id="apwd"> <span id="apwdtip"></span> <br>
        金额：<input type="text" name="money" id="money"> <span id="moneytip"></span> <br>
        收款帐号：<input type="text" name="inid" id="inid"><br>
        收款人姓名：<input type="text" id="inname" name="inname"> <span id="innametip"></span> <br>
        <input type="button" value="转账" id="btn">
  </body>
</html>
