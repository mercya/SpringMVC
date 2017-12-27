<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: eCRF
  Date: 2017/12/26
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css">
    <title>Outting</title>
</head>
<body>
<div class="container" style="width: 600px; margin: 0 auto;background-color: #019875;">
    <div class="top">
        <% String name = (String) request.getAttribute("name"); %>
        <%=name%>
    </div>
    <div class="col-md-8 col-sm-offset-2 text-center" style="background-color: #269ABC;">
        <img src="../../static/img/tou33.png" style="margin-top: 86px;width: 150px ;height: 150px;"/>
        <br />
        <input class="text-center" type="text" name="username"  style="margin-top: 60px; width: 300px;height: 40px; border-radius: 5px;" />
        <br>
        <input class="text-center" type="password" name="password" style="margin-top: 20px;width: 300px;height: 40px;border-radius: 5px;"/>
        <br>
        <button class="text-center" type="submit" placeholder="提交"
                style="margin-top: 20px;margin-bottom: 100px;width: 300px;height: 40px;border-radius: 5px;color: #019875; font-size:15px ;">登录</button>
    </div>
</div>
</body>
<script src="../../static/js/jquery.min.js"></script>
<script src="../../static/js/bootstrap.min.js"></script>

</html>
