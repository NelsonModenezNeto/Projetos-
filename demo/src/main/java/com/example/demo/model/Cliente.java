package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="ClienteSemestre")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column
    private String nome;

    @Column
    private String email;

    public Cliente(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public Cliente()
    {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
