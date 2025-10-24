package br.cefetrj.model;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "Turmas")
public class Turma extends Entidade {

    @Column(name = "Quantidade")
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "Disciplina_Id")
    private Disciplina disciplina;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
        name = "Aluno_Turma",
        joinColumns = @JoinColumn(name = "Turma_Id"),
        inverseJoinColumns = @JoinColumn(name = "Aluno_Id")
    )
    private List<Aluno> alunos = new ArrayList<>();

    public Turma() {}

    public Turma(int quantidade) {
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public Disciplina getDisciplina() { return disciplina; }
    public void setDisciplina(Disciplina disciplina) { this.disciplina = disciplina; }

    public List<Aluno> getAlunos() { return alunos; }
    public void setAlunos(List<Aluno> alunos) { this.alunos = alunos; }
}