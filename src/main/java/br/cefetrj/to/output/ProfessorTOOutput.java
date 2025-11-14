package br.cefetrj.to.output;
import br.cefetrj.model.Professor;

public class ProfessorTOOutput {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String crp;

    public ProfessorTOOutput(Professor professor) {
        this.id = professor.getId();
        this.nome = professor.getNome();
        this.email = professor.getEmail();
        this.telefone = professor.getTelefone();
        this.cpf = professor.getCpf();
        this.crp = professor.getCrp();
    }

    // Getters
    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getCpf() { return cpf; }
    public String getCrp() { return crp; }
}
