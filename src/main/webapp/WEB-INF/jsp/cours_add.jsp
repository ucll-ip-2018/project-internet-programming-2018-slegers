<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <jsp:include page="Head.jsp"/>
<body>
<main>
    <jsp:include page="header.jsp"/>

    <div class="main">
        <h1>Vak</h1>
        <form class="form-add-vak" method="post" action="<c:url value="/Courses.htm"/>">
            <input type="hidden" id="coursForm" value="${cours.id}">
            <input type="text" placeholder="Naam" required name="name">
            <input type="number" placeholder="Studiepunten" required step="1" min="1" name="studyPoints">
            <br>
            <br>
            <input type="number" placeholder="Semester" required step="1" min="1" max="2" name="semster">
            <br>
            <br>
            <input id="save" type="submit" value="Submit">
        </form>
    </div>
</main>
</body>
</html>

