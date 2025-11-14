package br.cefetrj.to.output;
import br.cefetrj.model.Disciplina;

public class DisciplinaTOOutput {

    private Integer id;
    private String nome;
    private Integer creditos;

    public DisciplinaTOOutput(Disciplina disciplina) {
        this.id = disciplina.getId();
        this.nome = disciplina.getNome();
        this.creditos = disciplina.getCreditos();
    }

    // Getters
    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public Integer getCreditos() { return creditos; }
}
