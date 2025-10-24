<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Turma</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
    <h2>Cadastro de Turma</h2>
    <form action="turma" method="post">
        <input type="hidden" name="id" value="${turma.id}">

        <div class="mb-3">
            <label>Quantidade de Alunos:</label>
            <input type="number" class="form-control" name="quantidade" value="${turma.quantidade}" required>
        </div>

        <div class="mb-3">
            <label>Disciplina:</label>
            <select class="form-select" name="disciplinaId">
                <option value="">Selecione...</option>
                <c:forEach var="disciplina" items="${disciplinas}">
                    <option value="${disciplina.id}" ${turma.disciplina.id == disciplina.id ? 'selected' : ''}>${disciplina.nome}</option>
                </c:forEach>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Salvar</button>
        <a href="turma?acao=listar" class="btn btn-secondary">Voltar</a>
    </form>
</body>
</html>
