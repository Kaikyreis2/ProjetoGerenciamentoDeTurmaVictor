package br.cefetrj.to.output;
import br.cefetrj.model.Aluno;

public class AlunoTOOutput {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    public AlunoTOOutput(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.email = aluno.getEmail();
        this.telefone = aluno.getTelefone();
        this.cpf = aluno.getCpf();
    }

    // Getters
    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getCpf() { return cpf; }
}
