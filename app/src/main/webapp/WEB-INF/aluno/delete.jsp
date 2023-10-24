<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Remover Aluno</title>
    </head>
    <body>
        <h1>Remover Aluno</h1>
        <p>
            Tem certeza que deseja remover o aluno ${aluno.nome} ?
        </p>
        <form action="/aluno/delete" method="post">
            <input type="hidden" name="id" value="${aluno.id}" />
            <button type="submit">Excluir</button>
        </form>
    </body>
</html>

