package br.cefetrj.model;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alunos")
public class Aluno extends Entidade {

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "Telefone")
    private String telefone;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;

    @Column(name = "Matricula", unique = true, updatable = false)
    private UUID matricula = UUID.randomUUID();

    @ManyToMany(mappedBy = "alunos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Turma> turmas = new ArrayList<>();

    public Aluno() {}

    public Aluno(String nome, String email, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public UUID getMatricula() { return matricula; }

    public List<Turma> getTurmas() { return turmas; }
    public void setTurmas(List<Turma> turmas) { this.turmas = turmas; }
}