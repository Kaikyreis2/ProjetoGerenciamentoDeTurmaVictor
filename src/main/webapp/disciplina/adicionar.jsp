<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Disciplina</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
    <h2>Cadastro de Disciplina</h2>
    <form action="disciplina" method="post">
        <input type="hidden" name="id" value="${disciplina.id}">

        <div class="mb-3">
            <label>Nome:</label>
            <input type="text" class="form-control" name="nome" value="${disciplina.nome}" required>
        </div>

        <div class="mb-3">
            <label>Créditos:</label>
            <input type="number" class="form-control" name="creditos" value="${disciplina.creditos}">
        </div>

        <button type="submit" class="btn btn-primary">Salvar</button>
        <a href="disciplina?acao=listar" class="btn btn-secondary">Voltar</a>
    </form>
</body>
</html>
