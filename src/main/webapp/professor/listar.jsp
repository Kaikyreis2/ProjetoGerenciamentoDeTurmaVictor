<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Professores</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
    <h2>Lista de Professores</h2>
    <a href="professor?acao=novo" class="btn btn-success mb-3">Novo Professor</a>

    <table class="table table-bordered table-striped">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Telefone</th>
            <th>CPF</th>
            <th>CRP</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="professor" items="${lista}">
            <tr>
                <td>${professor.id}</td>
                <td>${professor.nome}</td>
                <td>${professor.email}</td>
                <td>${professor.telefone}</td>
                <td>${professor.cpf}</td>
                <td>${professor.crp}</td>
                <td>
                    <a href="professor?acao=editar&id=${professor.id}" class="btn btn-warning btn-sm">Editar</a>
                    <a href="professor?acao=excluir&id=${professor.id}" class="btn btn-danger btn-sm">Excluir</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
