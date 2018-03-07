<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>demo</title>
  </head>
  <link rel="stylesheet" href="/asset/css/style.css"/>
  <script type="text/javascript" src="/static/js/jquery.js"></script>
<style type="text/css">
  .loginp{
    border-radius:inherit;
    border-color: #002a80;
    margin: 0 auto;
  }
</style>

  <body>
        <form id="userForm" action="/user/find" method="get">
          用户名：<input class="loginp" type="text" name="username">
          <br>
          密码：<input class="loginp" type="password" name="password">
          </br>
          <input type="submit"/>
        </form>
  </body>
<script>
</script>
</html>
