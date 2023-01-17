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
public class Funcionario extends Pessoa implements IPessoa {
    private int codf;
    private double salario;
    private String email;
    
    public Funcionario(String nome, int idade, int codf, double salario, String email) {
        super(nome, idade);
        this.codf=codf;
        this.email=email;
        this.salario=salario;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: "+nome+"\nIdade "+idade+"\nEmail: "+email+"\nCodigo: "+codf+"\nSalario: "+salario+"\n");
    }

    public int getCodf() {
        return codf;
    }

    public void setCodf(int codf) {
        this.codf = codf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
}
    
    

