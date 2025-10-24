<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Alunos</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
    <h2>Lista de Alunos</h2>
    <a href="aluno?acao=novo" class="btn btn-success mb-3">Novo Aluno</a>

    <table class="table table-bordered table-striped">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Telefone</th>
            <th>CPF</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="aluno" items="${lista}">
            <tr>
                <td>${aluno.id}</td>
                <td>${aluno.nome}</td>
                <td>${aluno.email}</td>
                <td>${aluno.telefone}</td>
                <td>${aluno.cpf}</td>
                <td>
                    <a href="aluno?acao=editar&id=${aluno.id}" class="btn btn-warning btn-sm">Editar</a>
                    <a href="aluno?acao=excluir&id=${aluno.id}" class="btn btn-danger btn-sm">Excluir</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
