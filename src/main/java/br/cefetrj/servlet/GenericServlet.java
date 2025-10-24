package br.cefetrj.servlet;

import br.cefetrj.dao.GenericDao;
import br.cefetrj.model.Entidade;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class GenericServlet<T extends Entidade> extends HttpServlet {

    protected GenericDao<T> dao;
    private Class<T> clazz;

    @SuppressWarnings("unchecked")
    public GenericServlet() {
        this.clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        this.dao = new GenericDao<T>(clazz) {
        };
    }
      protected abstract T preencherEntidade(HttpServletRequest request);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String acao = request.getParameter("acao");
        if (acao == null)
            acao = "listar"; // comportamento padrão
        String urlSubmit = request.getContextPath() + "/" + clazz.getSimpleName().toLowerCase();
        request.setAttribute("urlSubmit", urlSubmit);

      
        try {
            switch (acao) {
                case "deletar":
                    int id = Integer.parseInt(request.getParameter("id"));
                    dao.deletar(id);
                    response.sendRedirect(urlSubmit + "?acao=listar");
                    break;

                case "listar":
                    List<T> lista = dao.listarTodos();
                    request.setAttribute("lista", lista);
                    try {
                        request.getRequestDispatcher("/" + clazz.getSimpleName().toLowerCase() + "/listar.jsp")
                                .forward(request, response);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "buscar":
                    int idBuscar = Integer.parseInt(request.getParameter("id"));
                    T entidade = dao.buscarPorId(idBuscar);
                    request.setAttribute("entidade", entidade);
                    try {
                        request.getRequestDispatcher("/" + clazz.getSimpleName().toLowerCase() + "/form.jsp")
                                .forward(request, response);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "novo":
                    try {
                        request.getRequestDispatcher("/" + clazz.getSimpleName().toLowerCase() + "/form.jsp")
                                .forward(request, response);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("erro.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String acao = request.getParameter("acao");
        String urlSubmit = request.getContextPath() + "/" + clazz.getSimpleName().toLowerCase();
        request.setAttribute("urlSubmit", urlSubmit);
        try {
            switch (acao) {
                case "cadastrar":
                    T entidade = preencherEntidade(request);
                    dao.adicionar(entidade);
                    break;
                case "editar":
                    T entidadeAtualizada = preencherEntidade(request);
                    dao.atualizar(entidadeAtualizada);
                    break;
            }
            response.sendRedirect(urlSubmit + "?acao=listar");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("erro.jsp");
        }
    }
}