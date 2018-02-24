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
    <div class="top">
        <img src="img/logo2.png" class="logo"/>
        <div class="title"><h1>Add Studiemoment</h1> </div>
    </div>
    <div class="left">
        <nav class="menu">
            <ul>
                <li> <a href="index.html"> Home </a> </li>
                <li> <a href="vakken.html"> Vakken </a> </li>
                <li> <a href="overview_studie.html"> Studiemomenten </a>  </li>
                <li> <a href="overview.html"> Overzicht </a>  </li>
                <li> <a href="add_studie.html" class="active"> Add Studiemoment </a> </li>
                <li> <a href="add_vak.html"> Add vak </a>  </li>
                <li> <a href="gebruikers.html"> Gebruikers </a> </li>
                <li> <a href="signUp"> Sign in </a> </li>
            </ul>
        </nav>
    </div>
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

