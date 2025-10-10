package br.cefetrj.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int Id;

    @Column(name = "Nome")
    private String Nome;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Telefone")
    private String Telefone;

    @Column(name = "CPF")
    private String CPF;

   
    public Aluno(String nome, String email, String telefone, String cpf) {
        this.Nome = nome;
        this.Email = email;
        this.Telefone = telefone;
        this.CPF = cpf;
    }

   
    public String getNome() { return Nome; }
    public void setNome(String nome) { this.Nome = nome; }

    public String getEmail() { return Email; }
    public void setEmail(String email) { this.Email = email; }

    public String getTelefone() { return Telefone; }
    public void setTelefone(String telefone) { this.Telefone = telefone; }

    public String getCPF() { return CPF; }
    public void setCPF(String cpf) { this.CPF = cpf; }

    public int getId(){return Id;}
}
