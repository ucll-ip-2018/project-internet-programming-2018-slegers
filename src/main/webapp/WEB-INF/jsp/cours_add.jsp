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

        <form:form cssClass="form-add-vak" method="post" action="${pageContext.request.contextPath}/Courses.htm" modelAttribute="cours">
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
                <input id="save" type="submit" value="Submit">
            </p>
        </form:form>
    </div>
</main>
</body>
</html>

