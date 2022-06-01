/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixa;

/**
 *
 * @author mauricio.akauan
 */
public class Cliente {
    public String cliente;
    public int atend;
    
    public Cliente() {
        this("",0);
    }
    
    public Cliente(String cliente, int atend){
        this.setCliente(cliente);
        this.setAtend(atend);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getAtend() {
        return atend;
    }

    public void setAtend(int atend) {
        this.atend = atend;
    }
    
    
}


//System.out.println(Cliente.getCliente() + "-" + String.valueOf(Cliente.getAtend()));