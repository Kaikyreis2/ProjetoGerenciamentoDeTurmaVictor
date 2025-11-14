package br.cefetrj.to.Input;
import br.cefetrj.model.Disciplina;
import br.cefetrj.model.Turma;

public class TurmaTOInput {

    private Integer id;
    private Integer quantidade;
    private Integer idDisciplina;

    public Turma build() {
        Turma turma = new Turma();
        turma.setId(id);
        turma.setQuantidade(quantidade);

        if (idDisciplina != null) {
            Disciplina disciplina = new Disciplina();
            disciplina.setId(idDisciplina);
            turma.setDisciplina(disciplina);
        }

        return turma;
    }

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public Integer getIdDisciplina() { return idDisciplina; }
    public void setIdDisciplina(Integer idDisciplina) { this.idDisciplina = idDisciplina; }
}