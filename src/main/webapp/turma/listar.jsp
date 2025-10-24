<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Turmas</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
    <h2>Lista de Turmas</h2>
    <a href="turma?acao=novo" class="btn btn-success mb-3">Nova Turma</a>

    <table class="table table-bordered table-striped">
        <tr>
            <th>ID</th>
            <th>Quantidade</th>
            <th>Disciplina</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="turma" items="${lista}">
            <tr>
                <td>${turma.id}</td>
                <td>${turma.quantidade}</td>
                <td>${turma.disciplina.nome}</td>
                <td>
                    <a href="turma?acao=editar&id=${turma.id}" class="btn btn-warning btn-sm">Editar</a>
                    <a href="turma?acao=excluir&id=${turma.id}" class="btn btn-danger btn-sm">Excluir</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
