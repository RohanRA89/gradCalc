<html>
<head>
    <title>The current date</title>
</head>
<body>
<h2>How long until graduation on March 31st 2016?</h2>
    <form method="post" action="/graduationDate">
        <table>
            <tr><td>Today's Date is:</td></tr>
        </table>
        <p><span id="datetime"></span></p>

        <script>
            var dt = new Date();
            document.getElementById("datetime").innerHTML = dt.toLocaleDateString();
        </script>
        <p>
            <input type="submit">
        </p>

    </form>

</body>
</html>
