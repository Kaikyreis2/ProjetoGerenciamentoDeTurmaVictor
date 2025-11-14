package br.cefetrj.to.Input;
import br.cefetrj.model.Disciplina;

public class DisciplinaTOInput {

    private Integer id;
    private String nome;
    private Integer creditos;

    public Disciplina build() {
        Disciplina d = new Disciplina();
        d.setId(id);
        d.setNome(nome);
        d.setCreditos(creditos);
        return d;
    }

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Integer getCreditos() { return creditos; }
    public void setCreditos(Integer creditos) { this.creditos = creditos; }
}
