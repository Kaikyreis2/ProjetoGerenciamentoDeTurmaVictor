package br.cefetrj.to.Input;
import br.cefetrj.model.Professor;

public class ProfessorTOInput {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String crp;

    public Professor build() {
        Professor professor = new Professor();
        professor.setId(id);
        professor.setNome(nome);
        professor.setEmail(email);
        professor.setTelefone(telefone);
        professor.setCpf(cpf);
        professor.setCrp(crp);
        return professor;
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

    public String getCrp() { return crp; }
    public void setCrp(String crp) { this.crp = crp; }
}
