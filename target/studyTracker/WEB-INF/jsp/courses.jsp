<%--
  Created by IntelliJ IDEA.
  User: yanice
  Date: 24/02/2018
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>vakken</title>
</head>
<body>
<main>
    <div class="top">
        <img src="img/logo2.png" class="logo"/>
        <div class="title"><h1>Vakken</h1> </div>
    </div>
    <div class="left">
        <nav class="menu">
            <ul>
                <li> <a href="index.html"> Home </a> </li>
                <li> <a href="vakken.html" class="active"> Vakken </a> </li>
                <li> <a href="overview_studie.html"> Studiemomenten </a>  </li>
                <li> <a href="overview.html"> Overzicht </a>  </li>
                <li> <a href="add_studie.html"> Add Studiemoment </a> </li>
                <li> <a href="add_vak.html"> Add vak </a>  </li>
                <li> <a href="gebruikers.html"> Gebruikers </a> </li>
                <li> <a href="signUp"> Sign in </a> </li>
            </ul>
        </nav>
    </div>
    <div class="main">
        <table>
            <tr class="header">
                <th> ID </th>
                <th> Vak </th>
                <th> Studiepunten</th>
                <th> Verwijder</th>
            </tr>
            <tr>
                <td>1</td>
                <td>Computersystemen</td>
                <td>6</td>
                <td> <a  onclick="" class="delete_vak"> &#9447; delete</a> </td>
            </tr>
            <tr>
                <td>2</td>
                <td>Computernetwerken 1 </td>
                <td>3 </td>
                <td><a  onclick="" class="delete_vak"> &#9447; delete</a> </td>
            </tr>
            <tr>
                <td>3</td>
                <td>Computernetwerken 2 </td>
                <td>5 </td>
                <td><a  onclick="" class="delete_vak"> &#9447; delete</a> </td>
            </tr>
        </table>
    </div>
</main>
</body>
</html>

