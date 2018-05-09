<%@ page import="java.util.HashMap" %>
<%@ page import="com.springmvc.entity.User" %><%--
  Created by Vitelon on 2017/4/11 19:55
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
    <script></script>

</head>
<body>
<div class="top">
    <% HashMap map = (HashMap) request.getAttribute("map");
        User user= (User) map.get("user");
    %>
    <%=user.getUsername()+user.getPassword()%>
</div>
    登录成功。。。。。。。。。
</body>
</html>
