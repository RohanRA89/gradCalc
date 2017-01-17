<%--
  Created by IntelliJ IDEA.
  User: rohanayub
  Date: 1/13/17
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Days left until Graduation</title>
</head>
<body>
    <h2>There are <%=request.getAttribute("graduation")%></h2>
    <h3>Would you like to find out if a year is a leap year?</h3>
    <form method="post" , action="/isThisALeapYear">
        <table>
            <tr><td>Please enter a year of your choosing:</td><td><input type="text" name="year"></td></tr>
        </table>
        <p>
            <input type = "submit">
        </p>
    </form>

</body>
</html>
