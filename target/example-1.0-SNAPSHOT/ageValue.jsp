<%--
  Created by IntelliJ IDEA.
  User: rohanayub
  Date: 1/16/17
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Was This A Leap Year>?</title>
</head>
<body>
    <h3>Hello! <%=request.getAttribute("leapYear")%></h3>

    <h4>Please enter your birthday<input type="date"></h4>
</body>
</html>
