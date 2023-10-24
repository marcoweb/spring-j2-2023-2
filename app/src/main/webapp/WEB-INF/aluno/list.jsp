<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Alunos</title>
    </head>
    <body>
        <h1>Alunos</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Idade</th>
            </tr>
            <c:forEach var="a" items="${alunos}">
                <tr>
                    <td>${a.id}</td>
                    <td>${a.nome}</td>
                    <td>${a.idade}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

