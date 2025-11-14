package br.cefetrj.to.output;

import br.cefetrj.model.Turma;

public class TurmaTOOutput {

    private Integer id;
    private Integer quantidade;
    private Integer idDisciplina;
    private String nomeDisciplina;

    public TurmaTOOutput(Turma turma) {
        this.id = turma.getId();
        this.quantidade = turma.getQuantidade();

        if (turma.getDisciplina() != null) {
            this.idDisciplina = turma.getDisciplina().getId();
            this.nomeDisciplina = turma.getDisciplina().getNome();
        }
    }

    
    public Integer getId() { return id; }
    public Integer getQuantidade() { return quantidade; }
    public Integer getIdDisciplina() { return idDisciplina; }
    public String getNomeDisciplina() { return nomeDisciplina; }
}
