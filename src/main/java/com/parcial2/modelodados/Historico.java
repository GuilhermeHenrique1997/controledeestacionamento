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
public class Historico {
    private String nome;
    private String habilitacao;
    private String cpf; 
    private String placa;
    private String dataentrada;
    private String datasaida;
    private Float valorpago;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(String dataentrada) {
        this.dataentrada = dataentrada;
    }

    public String getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(String datasaida) {
        this.datasaida = datasaida;
    }

    public Float getValorpago() {
        return valorpago;
    }

    public void setValorpago(Float valorpago) {
        this.valorpago = valorpago;
    }
    
}