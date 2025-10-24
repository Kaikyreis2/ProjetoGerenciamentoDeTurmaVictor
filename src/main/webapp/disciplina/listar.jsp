<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Disciplinas</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
    <h2>Lista de Disciplinas</h2>
    <a href="disciplina?acao=novo" class="btn btn-success mb-3">Nova Disciplina</a>

    <table class="table table-bordered table-striped">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Créditos</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="disciplina" items="${lista}">
            <tr>
                <td>${disciplina.id}</td>
                <td>${disciplina.nome}</td>
                <td>${disciplina.creditos}</td>
                <td>
                    <a href="disciplina?acao=editar&id=${disciplina.id}" class="btn btn-warning btn-sm">Editar</a>
                    <a href="disciplina?acao=excluir&id=${disciplina.id}" class="btn btn-danger btn-sm">Excluir</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
