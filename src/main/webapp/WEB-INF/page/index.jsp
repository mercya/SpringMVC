<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>demo</title>
  </head>
  <link rel="stylesheet" href="/asset/css/style.css"/>
  <script type="text/javascript" src="/static/js/jquery.js"></script>

  <body>
        <form id="userForm" action="/user/find" method="post">
          用户名：<input type="text" name="username"><br>
          密码：<input type="password" name="password">
          <button type="button" onclick="login()">登录</button>
        </form>
  </body>
<script>
    function login() {
        $.ajax({
            type: 'post',
            cache:'false',
            url: $('#userForm').attr('action'),
            data: $('#userForm').serialize(),
            dataType: 'json',
            async:false,
            success: function(data){
                if (data.result = "success"){
                    alert(data.result);
                }else{
                    alert("用户名或者密码错误！");
                }
            }
        });
    }
</script>
</html>
