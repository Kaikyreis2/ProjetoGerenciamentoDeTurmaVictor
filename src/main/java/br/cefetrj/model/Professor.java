package br.cefetrj.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "Professores")
public class Professor extends Entidade {

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "Telefone")
    private String telefone;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;

    @Column(name = "CRP")
    private String crp;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor() {}

    public Professor(String nome, String email, String telefone, String cpf, String crp) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.crp = crp;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getCrp() { return crp; }
    public void setCrp(String crp) { this.crp = crp; }

    public List<Disciplina> getDisciplinas() { return disciplinas; }
    public void setDisciplinas(List<Disciplina> disciplinas) { this.disciplinas = disciplinas; }
}
