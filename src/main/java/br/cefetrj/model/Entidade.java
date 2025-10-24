package br.cefetrj.model;

import jakarta.persistence.*;


@MappedSuperclass
public abstract class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected int Id;
    
    protected int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
