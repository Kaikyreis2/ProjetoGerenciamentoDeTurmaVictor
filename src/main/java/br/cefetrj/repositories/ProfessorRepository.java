package br.cefetrj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import br.cefetrj.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>, JpaSpecificationExecutor<Professor> {

}
