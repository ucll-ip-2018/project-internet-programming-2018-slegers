<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <jsp:include page="Head.jsp"/>
<body>
<main>
    <jsp:include page="header.jsp"/>

    <div class="main">
        <h1>Vak</h1>
        <c:choose>
            <c:when test="${cours != null}">
            <form:form cssClass="form-add-vak" method="post" action="${pageContext.request.contextPath}/Courses/update.htm"> modelAttribute="cours">
            <form:hidden path="id"/>
            <p class="form-group">
                <label for="name">Name (required):</label>
                <form:input path="name" id="name"/> <br>
                <form:errors path="name" cssClass="error"/>
            </p>
            <p class="form-group">
                <label for="studyPoints">studyPoints (required):</label>
                <form:input path="studyPoints" id="studyPoints"/> <br>
                <form:errors path="studyPoints" cssClass="error"/>
            </p>
            <p class="form-group">
                <label for="studyPoints">studyPoints (required):</label>
                <form:input path="semester" id="semester"/> <br>
                <form:errors path="semester" cssClass="error"/>
            </p>
            <p>
                <input type="submit" value="Submit">
            </p>
        </form:form>
            </c:when>
            <c:otherwise>
                    <form class="form-add-vak" method="post" action="<c:url value='${"/Courses/add.htm"}'/>">
                    <input type="text" placeholder="Naam" name="name">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <input type="number" placeholder="Studiepunten" step="1" name="studyPoints" value="${cours.studyPoints}">
                    <br>
                    <br>
                    <input type="number" placeholder="Semester" step="1" max="2" name="semester" value="${cours.semester}">
                    <br>
                    <br>
                    <input id="save" type="submit" value="Submit">
                </form>
            </c:otherwise>
        </c:choose>
    </div>
</main>
</body>
</html>

