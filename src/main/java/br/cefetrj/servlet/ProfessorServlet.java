package br.cefetrj.servlet;

import br.cefetrj.model.Professor;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/professor")
public class ProfessorServlet extends GenericServlet<Professor> {

    @Override
    protected Professor preencherEntidade(HttpServletRequest request) {
        Professor professor = new Professor();
        String id = request.getParameter("id");
        if (id != null && !id.isEmpty()) {
            professor.setId(Integer.parseInt(id));
        }

        professor.setNome(request.getParameter("nome"));
        professor.setEmail(request.getParameter("email"));
        professor.setTelefone(request.getParameter("telefone"));
        professor.setCpf(request.getParameter("cpf"));
        professor.setCrp(request.getParameter("crp"));

        return professor;
    }
}