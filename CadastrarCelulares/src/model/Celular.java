/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Celular {
    private String marca;
    private String modelo;
    private String processador;
    private int codigo;
    
    public Celular(String marca, String modelo, String processador){
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
    }
    
    public Celular(String marca, String modelo, String processador, int codigo){
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
