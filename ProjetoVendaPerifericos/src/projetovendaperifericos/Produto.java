/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovendaperifericos;

/**
 *
 * @author aluno
 */
public class Produto implements IPessoa {
    private double preco;
    private String descricao;
    private int codp;
    private String marca;
    private boolean rgb;

    public Produto(double preco, String descricao, int codp, String marca, boolean rgb) {
        this.preco = preco;
        this.descricao = descricao;
        this.codp = codp;
        this.marca = marca;
        this.rgb = rgb;
    }
    
    @Override
    public void exibir() {
        System.out.println("Preço: "+preco+"\nDescricao: "+descricao+"\nCodigo: "+codp+"\nMarca: "+marca+"\nRGB: "+rgb+"\n");
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodp() {
        return codp;
    }

    public void setCodp(int codp) {
        this.codp = codp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    
}
