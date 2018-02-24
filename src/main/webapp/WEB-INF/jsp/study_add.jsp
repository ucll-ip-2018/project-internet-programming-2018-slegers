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
    <title>Add Studiemoment</title>
</head>
<body>
<main>
    <jsp:include page="header.jsp"/>
    <div class="main">
        <form class="form-add-vak" method="post">
            <h1>Studiemoment</h1>

            <input type="time" required name="tijd">
            <br>
            <br>
            <select>
                <option value="volvo">Volvo</option>
                <option value="saab">Saab</option>
                <option value="mercedes">Mercedes</option>
                <option value="audi">Audi</option>
            </select>
            <br>
            <input type="date" name="dag" value="dag">
            <br>
            <input type="submit" value="Submit">

        </form>
    </div>
</main>
</body>
</html>

