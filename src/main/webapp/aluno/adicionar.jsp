<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Aluno</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
    <h2>Cadastro de Aluno</h2>
    <form action="aluno" method="post">
        <input type="hidden" name="id" value="${aluno.id}">

        <div class="mb-3">
            <label>Nome:</label>
            <input type="text" class="form-control" name="nome" value="${aluno.nome}" required>
        </div>

        <div class="mb-3">
            <label>Email:</label>
            <input type="email" class="form-control" name="email" value="${aluno.email}">
        </div>

        <div class="mb-3">
            <label>Telefone:</label>
            <input type="text" class="form-control" name="telefone" value="${aluno.telefone}">
        </div>

        <div class="mb-3">
            <label>CPF:</label>
            <input type="text" class="form-control" name="cpf" value="${aluno.cpf}">
        </div>

        <button type="submit" class="btn btn-primary">Salvar</button>
        <a href="aluno?acao=listar" class="btn btn-secondary">Voltar</a>
    </form>
</body>
</html>
