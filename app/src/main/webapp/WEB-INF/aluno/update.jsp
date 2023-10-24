<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Editar Aluno</title>
    </head>
    <body>
        <h1>Editar Aluno</h1>
        <form action="/aluno/update" method="post">
            <input type="hidden" name="id" value="${aluno.id}" />
            <label>Nome</label>
            <input type="text" name="nome" value="${aluno.nome}" />
            <label>Idade</label>
            <input type="number" name="idade" value="${aluno.idade}" />
            <button type="submit">Salvar</button>
        </form>
    </body>
</html>

