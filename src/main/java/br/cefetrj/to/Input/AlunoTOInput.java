package br.cefetrj.to.Input;
import br.cefetrj.model.Aluno;

public class AlunoTOInput {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    public Aluno build() {
        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno.setNome(nome);
        aluno.setEmail(email);
        aluno.setTelefone(telefone);
        aluno.setCpf(cpf);
        return aluno;
    }

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
}
