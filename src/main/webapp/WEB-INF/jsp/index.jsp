<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <jsp:include page="Head.jsp"/>
<body>
<main>
    <jsp:include page="header.jsp"/>

    <div class="main">
        <p> Welkom op de site van Studietracker. Via deze website kan je makkelijk het
            aantal uren dat je reeds gestudeerd hebt bijhouden. Via deze website hopen we
            om studenten aan te moedigen om meer tijd achter hun boeken te spenderen dan enkel
            tijdens (verplichte) lessen. </p>
        <br>
        <p> Het aantal uur dat u de voorbije zeven dagen gestudeerd hebt is: </p>
        <p> Het aantal uur dat u de voorbije zeven dagen naar de les bent geweest is:</p>
        <p> U bent deze week dus in totaal X met uw studies bezig geweest.</p>
        <p> U studeerde de vorige week op deze dag X uur.</p>

        <form  method="POST" action="<c:url value="/logout" />">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <button>logout</button>
        </form>
    </div>
</main>
</body>
</html>
