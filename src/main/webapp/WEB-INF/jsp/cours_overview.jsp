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
    <jsp:include page="Head.jsp"/>
<body>
<main>
    <jsp:include page="header.jsp"/>

    <div class="main">
        <table>
            <tr class="header">
                <th> id</th>
                <th> Vak </th>
                <th> Studiepunten</th>
                <th> Edit?</th>
                <th> Verwijder</th>
            </tr>
            <c:forEach var="cours" items="${courses}">
                <tr>
                    <td>${cours.id}</td>
                    <td>${cours.name}</td>
                    <td>${cours.studyPoints}</td>
                    <td><a href="${pageContext.request.contextPath}/Courses/${cours.id}.htm">Edit</a> </td>
                    <td><a href="${pageContext.request.contextPath}/Courses/${cours.id}.htm"/> &#9447; delete</a> </td>
                    <td><a href="${pageContext.request.contextPath}/Courses/delete/${cours.id}.htm"/> &#9447; delete</a> </td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <a class="submit" href="<c:url value="/Courses/add.htm"/>">New</a>
    </div>
</main>
</body>
</html>

