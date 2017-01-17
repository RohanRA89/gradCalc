<%--
  Created by IntelliJ IDEA.
  User: rohanayub
  Date: 1/17/17
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Days until birthday</title>
</head>
<body>
<h3>Hello! You have been alive for <%= request.getAttribute("daysAlive")%> days!</h3>

<h4><a href="index.jsp">Start Over?</a></h4>
</body>
</html>
