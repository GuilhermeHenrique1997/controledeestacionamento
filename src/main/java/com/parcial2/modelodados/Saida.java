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
public class Saida {
    private String saidaveiculo;

    public void situacaoSaidaf() {
		System.out.println("Saida Veiculo: " + this.getSaidaveiculo());
	}
    
    public String getSaidaveiculo() {
        return saidaveiculo;
    }

    public void setSaidaveiculo(String saidaveiculo) {
        this.saidaveiculo = saidaveiculo;
    }
}
