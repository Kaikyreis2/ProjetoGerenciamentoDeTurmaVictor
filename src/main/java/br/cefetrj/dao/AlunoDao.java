package br.cefetrj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cefetrj.commons.ConnectionFactory;
import br.cefetrj.model.Aluno;

public class AlunoDao {

    private Connection con;

    public AlunoDao() {
        con = ConnectionFactory.getConnection();
    }

    /*public void inserir(Aluno aluno) throws SQLException {
        String sql = "insert into aluno(Nome, Email, Telefone, CPF) values(?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, aluno.getNome());
        stmt.setString(2, aluno.getEmail());
        stmt.setString(3, aluno.getTelefone());
        stmt.setString(4, aluno.getCPF());
        stmt.execute();
        stmt.close();
        con.close();
    }

    public List<Aluno> listar() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
    
        String sql = "SELECT * FROM aluno";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
    
        while (rs.next()) {
            Aluno aluno = new Aluno(
                rs.getString("Nome"),
                rs.getString("Email"),
                rs.getString("Telefone"),
                rs.getString("CPF")
            );
            alunos.add(aluno);
        }
    
        rs.close();
        stmt.close();
    
        return alunos;
    }
    */

}