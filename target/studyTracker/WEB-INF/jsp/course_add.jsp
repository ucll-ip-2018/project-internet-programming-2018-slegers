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
    <div class="top">
        <img src="img/logo2.png" class="logo"/>
        <div class="title"><h1>Add Vak</h1> </div>
    </div>
    <div class="left">
        <nav class="menu">
            <ul>
                <li> <a href="index.html"> Home </a> </li>
                <li> <a href="vakken.html"> Vakken </a> </li>
                <li> <a href="overview_studie.html"> Studiemomenten </a>  </li>
                <li> <a href="overview.html"> Overzicht </a>  </li>
                <li> <a href="add_studie.html"> Add Studiemoment </a> </li>
                <li> <a href="add_vak.html" class="active"> Add vak </a>  </li>
                <li> <a href="gebruikers.html"> Gebruikers </a> </li>
                <li> <a href="signUp"> Sign in </a> </li>
            </ul>
        </nav>
    </div>
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

