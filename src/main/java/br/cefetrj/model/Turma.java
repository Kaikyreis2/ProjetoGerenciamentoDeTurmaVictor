package br.cefetrj.model;

public class Turma {
    private int Quantidade;

    
    public Turma(int quantidade) {
        this.Quantidade = quantidade;
    }

   
    public int getQuantidade() { return Quantidade; }
    public void setQuantidade(int quantidade) { this.Quantidade = quantidade; }

}