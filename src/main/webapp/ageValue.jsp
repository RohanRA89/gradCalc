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
    <h4>Now we will calculate how many days you've been alive!</h4>
<form method="post" action="/howManyDaysAlive">
    <table>
        <tr><td>Please enter today's date (yyyy-MM-dd):</td><td><input type="text" name="birthdayCurrentDate"></td></tr>
        <tr><td>Please enter your birthday(yyyy-MM-dd):</td><td><input type="text" name="birthDay"></td></tr>
    </table>
    <p>
        <input type="submit">
    </p>


</form>
</body>
</html>
