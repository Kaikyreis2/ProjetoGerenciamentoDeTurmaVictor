package br.cefetrj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import br.cefetrj.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>, JpaSpecificationExecutor<Aluno> {

}