<%--
  Created by IntelliJ IDEA.
  User: yanice
  Date: 24/02/2018
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>Add Vak</title>
</head>
<body>
<main>
    <jsp:include page="header.jsp"/>

    <div class="main">
        <form class="form-add-vak" method="post" onsubmit="showHide()">
            <h1>Vak</h1>
            <input type="text" placeholder="Naam" required name="naam">
            <input type="number" placeholder="Studiepunten" required step="1" min="1" name="studiepunten">
            <br>
            <br>
            <input type="number" placeholder="Semester" required step="1" min="1" max="2" name="semster">
            <br>
            <br>
            <input type="submit" value="Submit">
        </form>
    </div>
</main>
</body>
</html>

