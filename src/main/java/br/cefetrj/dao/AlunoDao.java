package br.cefetrj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cefetrj.commons.ConnectionFactory;
import br.cefetrj.model.Aluno;

public class AlunoDao  extends GenericDao<Aluno>{

    public AlunoDao(Class<Aluno> class1) {
        super(class1);

    }

    
}