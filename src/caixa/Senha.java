/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa;

/**
 *
 * @author Mauricio
 */
public class Senha {
    private String senha;
    private int cont;
    
    public Senha(){
        this("",0);
    }
    
    public Senha(String senha, int cont){
        this.setSenha(senha);
        this.setCont(cont);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
}