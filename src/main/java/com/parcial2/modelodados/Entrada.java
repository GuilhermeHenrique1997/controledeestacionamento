/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.modelodados;

/**
 *
 * @author natan.oliveira
 */
public class Entrada {
    private String entradaplacaveiculo;

    public void situacaoEntradaf() {
		System.out.println("Entrada Veiculo: " + this.getEntradaplacaveiculo());
	}

    public String getEntradaplacaveiculo() {
        return entradaplacaveiculo;
    }

    public void setEntradaplacaveiculo(String entradaplacaveiculo) {
        this.entradaplacaveiculo = entradaplacaveiculo;
    }
       
    
 
  
   
}
