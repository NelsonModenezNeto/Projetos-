package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table (name="ProdutoSemestre")
public class Produto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column
    private String descricao;

    @Column
    private String marca;

    @Column
    private float preco;

    public Produto(String descricao, String marca, float preco) {
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
    }

    public Produto()
    {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
