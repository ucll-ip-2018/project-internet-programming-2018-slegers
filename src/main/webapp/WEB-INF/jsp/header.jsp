<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yanice
  Date: 24/02/2018
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="top">
    <img src="${pageContext.request.contextPath}/img/logo2.png" class="logo"/>
    <div class="title"><h1>Home</h1> </div>
</div>
<div class="left">
    <nav class="menu">
        <ul>
            <li> <a href="<c:url value="${'/index.htm'}"/>"> Vakken </a> </li>
            <li> <a href="<c:url value="${'/Courses.htm'}"/>"> Vakken </a> </li>
            <li> <a href="<c:url value="${'Studymoment.htm'}"/>"> Studiemomenten </a>  </li>

        </ul>
    </nav>
</div>
