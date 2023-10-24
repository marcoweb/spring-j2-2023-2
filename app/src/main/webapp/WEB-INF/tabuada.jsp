<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Tabuada</title>
    </head>
    <body>
        <h1>Tabuada: ${valor}</h1>
        <ul>
            <c:forEach var="item" items="${resultado}">
                <li>${item}</li>
            </c:forEach>
        </ul>
    </body>
</html>

