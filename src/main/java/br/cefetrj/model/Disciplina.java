package br.cefetrj.model;

public class Disciplina {
    private String Nome;

    
    public Disciplina(String nome) {
        this.Nome = nome;
    }

    
    public String getNome() { return Nome; }
    public void setNome(String nome) { this.Nome = nome; }
}