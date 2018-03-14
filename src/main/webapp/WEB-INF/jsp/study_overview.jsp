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
        <table>
            <tr class="header">
                <th> ID </th>
                <th> Dag</th>
                <th> Vak </th>
                <th> Tijd</th>
                <th> Les?</th>
                <th> Verwijder</th>
            </tr>
            <c:forEach var="moment" items="moments">

            </c:forEach>
        </table>
</main>
</body>
</html>
