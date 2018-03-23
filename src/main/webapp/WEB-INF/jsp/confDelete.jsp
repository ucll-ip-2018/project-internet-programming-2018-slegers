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
    <h1>Studiemoment ~ Delete</h1>
    Are you sure to delete this cours?
    <div class="main">
        <form class="form-add-vak" method="post" action="<c:url value="/Studymoment.htm"/>">
            <input id="save" type="submit" value="yes">
        </form>
    </div>
</main>
</body>
</html>

