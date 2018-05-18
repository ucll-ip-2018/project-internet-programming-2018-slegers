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
            <li> <a href="${pageContext.request.contextPath}/index.htm"> Home </a> </li>
            <li> <a href="${pageContext.request.contextPath}/Courses.htm"> Vakken </a> </li>
            <li> <a href="/studyTracker/Studymoment.htm"> Studiemomenten </a>  </li>
        </ul>
    </nav>
</div>
