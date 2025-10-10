package br.cefetrj.model;

public class Professor {
    private String Nome;
    private String Email;
    private String Telefone;
    private String CPF;
    private String CRP;

    
    public Professor(String nome, String email, String telefone, String cpf, String crp) {
        this.Nome = nome;
        this.Email = email;
        this.Telefone = telefone;
        this.CPF = cpf;
        this.CRP = crp;
    }

    
    public String getNome() { return Nome; }
    public void setNome(String nome) { this.Nome = nome; }

    public String getEmail() { return Email; }
    public void setEmail(String email) { this.Email = email; }

    public String getTelefone() { return Telefone; }
    public void setTelefone(String telefone) { this.Telefone = telefone; }

    public String getCPF() { return CPF; }
    public void setCPF(String cpf) { this.CPF = cpf; }

    public String getCRP() { return CRP; }
    public void setCRP(String crp) { this.CRP = crp; }
}
