package br.cefetrj.servlet;

/*
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cefetrj.dao.AlunoDao;
import br.cefetrj.model.Aluno;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Aluno")
public class AlunoServlet extends HttpServlet {
    private static final long serialVersionUID = 3L;
    private AlunoDao dao = new AlunoDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("Nome: " + request.getParameter("nome") + "<br>");
        response.getWriter().println("Email: " + request.getParameter("email") + "<br>");
        response.getWriter().println("Telefone: " + request.getParameter("telefone") + "<br>");
        response.getWriter().println("CPF: " + request.getParameter("cpf") + "<br>");
        response.getWriter().println("</body></html>");


        
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
                response.setContentType("text/html");
                response.setCharacterEncoding("UTF-8");
    
                try {
                    List<Aluno> alunos = dao.listar();
                    System.out.println("oiiiii");
                    System.out.println(alunos);
                    request.setAttribute("alunos", alunos);
                    RequestDispatcher rd = request.getRequestDispatcher("aluno/listar.jsp");

                    rd.forward(request, response);
                } catch (SQLException e) {
                    
                    e.printStackTrace();
                }

                
    }
} */