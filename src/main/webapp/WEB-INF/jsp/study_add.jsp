<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yanice
  Date: 24/02/2018
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="Head.jsp"/>
<body>
<main>
    <jsp:include page="header.jsp"/>
    <h1>Studiemoment</h1>
    <div class="main">
        <form class="form-add-vak" method="post" action="<c:url value="${pageContext.request.contextPath}/Studymoment.htm"/>">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="hidden" id="studymomentForm" value="${studymoment.id}">
            <input type="time" required name="time">
            <br>
            <select name="cours">
                <c:forEach var="c" items="${courses}">
                    <option value="${c}">${c.name}</option>
                </c:forEach>
            </select>
            <br>
            <input type="date" name="date" value="date">
            <br>
            <input id="save" type="submit" value="Submit">

        </form>
    </div>
</main>
</body>
</html>

