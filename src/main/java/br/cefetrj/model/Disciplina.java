package br.cefetrj.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "Disciplinas")
public class Disciplina extends Entidade {

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Creditos", nullable = false)
    private int creditos;

    @OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Turma> turmas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "Professor_Id")
    private Professor professor;

    public Disciplina() {}

    public Disciplina(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;
    }

   
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public List<Turma> getTurmas() { return turmas; }
    public void setTurmas(List<Turma> turmas) { this.turmas = turmas; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }
}