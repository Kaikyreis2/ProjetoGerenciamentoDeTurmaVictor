package br.cefetrj.servlet;

import br.cefetrj.model.Disciplina;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/disciplina")
public class DisciplinaServlet extends GenericServlet<Disciplina> {

    @Override
    protected Disciplina preencherEntidade(HttpServletRequest request) {
        Disciplina disciplina = new Disciplina();
        String id = request.getParameter("id");
        if (id != null && !id.isEmpty()) {
            disciplina.setId(Integer.parseInt(id));
        }

        disciplina.setNome(request.getParameter("nome"));

        String creditosStr = request.getParameter("creditos");
        if (creditosStr != null && !creditosStr.isEmpty()) {
            disciplina.setCreditos(Integer.parseInt(creditosStr));
        }

        return disciplina;
    }
}