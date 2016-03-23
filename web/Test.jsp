
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.name}" /><td>
            <td><c:out value="${user.age}" /><td>
        </tr>
    </c:forEach>
</body>
</html>
