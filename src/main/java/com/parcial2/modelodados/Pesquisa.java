/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.modelodados;

/**
 *
 * @author USER
 */
public class Pesquisa {
    
    String pesquisaCliente;
    
    
    public void pesquisaClientef() {
        System.out.println("Entrada Veiculo: " + this.getPesquisaCliente());
    }
    

    public String getPesquisaCliente() {
        return pesquisaCliente;
    }

    public void setPesquisaCliente(String pesquisaCliente) {
        this.pesquisaCliente = pesquisaCliente;
    }
    
}
