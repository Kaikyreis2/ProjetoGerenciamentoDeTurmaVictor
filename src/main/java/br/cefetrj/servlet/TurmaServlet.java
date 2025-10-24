package br.cefetrj.servlet;

import br.cefetrj.model.Disciplina;
import br.cefetrj.model.Turma;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/turma")
public class TurmaServlet extends GenericServlet<Turma> {

    @Override
    protected Turma preencherEntidade(HttpServletRequest request) {
        Turma turma = new Turma();
        String id = request.getParameter("id");
        if (id != null && !id.isEmpty()) {
            turma.setId(Integer.parseInt(id));
        }

        String quantidadeStr = request.getParameter("quantidade");
        if (quantidadeStr != null && !quantidadeStr.isEmpty()) {
            turma.setQuantidade(Integer.parseInt(quantidadeStr));
        }

        String disciplinaId = request.getParameter("disciplinaId");
        if (disciplinaId != null && !disciplinaId.isEmpty()) {
            Disciplina disciplina = new Disciplina();
            disciplina.setId(Integer.parseInt(disciplinaId));
            turma.setDisciplina(disciplina);
        }

        return turma;
    }
}