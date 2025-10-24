package br.cefetrj.servlet;

import br.cefetrj.model.Aluno;
import br.cefetrj.servlet.GenericServlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/aluno")
public class AlunoServlet extends GenericServlet<Aluno> {

    @Override
    protected Aluno preencherEntidade(HttpServletRequest request) {
        Aluno aluno = new Aluno();
        String id = request.getParameter("id");
        aluno.setId(id != null && !id.isEmpty() ? Integer.parseInt(id) : null);
        aluno.setNome(request.getParameter("nome"));

        aluno.setCpf(request.getParameter("cpf"));
        
        return aluno;
    }
}