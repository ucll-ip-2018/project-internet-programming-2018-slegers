<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <jsp:include page="header.jsp"/>

    <div class="main">
        <table>
            <tr class="header">
                <th> Vak </th>
                <th> Studiepunten</th>
                <th> Verwijder</th>
            </tr>
            <c:forEach var="cours" items="${courses}">
                <tr>
                    <td>${cours.name}</td>
                    <td>${cours.studyPoints}</td>
                    <td> <a onclick="" class="delete_vak"> &#9447; delete</a> </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</main>
</body>
</html>

