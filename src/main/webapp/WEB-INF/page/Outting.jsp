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
<div class="container">
    <div class="top">
        <% String name = (String) request.getAttribute("name"); %>
        <%=name%>
    </div>
    <div class=""></div>
    <div class="bottom">
        <div class="bottom-left">
        </div>
        <div class="bottom-right">
        </div>
    </div>
</div>
</body>
<script src="../../static/js/jquery.min.js"></script>
<script src="../../static/js/bootstrap.min.js"></script>

</html>
