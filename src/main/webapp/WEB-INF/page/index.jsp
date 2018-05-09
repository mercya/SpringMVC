<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>demo</title>
</head>
<link href="../../static/css/bootstrap.min.css" rel="stylesheet">

<body>
<div class="container text-center">
  <form id="userForm" action="/user/find" method="post">
    用户名：<input type="text" name="username">
    <br>
    密  码：<input type="password" name="password">
    </br>
    <input type="submit"/>
  </form>
</div>
</body>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../../static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../../static/js/bootstrap.min.js"></script>
</html>
