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
public class Cliente extends Pessoa implements IPessoa {

    private String email;
    private int telefone;
    private int cep;
    private int cod;
    
    public Cliente(String nome, int idade, String email, int telefone, int cep, int cod)
    {
        super(nome, idade);
        this.email= email;
        this.telefone = telefone;
        this.cep = cep;
        this.cod = cod;
    }
    @Override
    public void exibir()
    {
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nEmail: "+email+"\nTelefone: "+telefone+"\nCep: "+cep+"\nCodigo "+cod+"\n");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
}
