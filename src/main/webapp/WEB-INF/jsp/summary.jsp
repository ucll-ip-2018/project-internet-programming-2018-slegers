<%--
  Created by IntelliJ IDEA.
  User: yanice
  Date: 24/02/2018
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>Studiemomenten</title>
</head>
<body>
<main>
    <jsp:include page="header.jsp"/>

    <c:forEach var="c" items="${c}">
        <div class="circle">
            <div class="circleText"> ${c[name]} </div>
            <div class="circleNumb">
                <span> ${c.name} </span>
            </div>
        </div>
    </c:forEach>

</main>
</body>
</html>