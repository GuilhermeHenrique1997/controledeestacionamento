/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.modeloDAO;

import com.parcial2.config.Conexao;
import com.parcial2.modelodados.Entrada;
import com.parcial2.modelodados.Pesquisa;
import com.parcial2.modelodados.Saida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author natan.oliveira
 */
public class HomeDao {
    
        
    public static void addentradaCliente(Entrada entrada) throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        
        String sql = "UPDATE clientes SET estacionado = 'yes' WHERE placa =" + "'"+entrada.getEntradaplacaveiculo() +"'" ;
       
        System.out.println("" + sql);
        PreparedStatement stmt = con.prepareStatement(sql);
       
        stmt.execute();
        stmt.close();
        con.close();
}
    
    public static void addsaidaCliente(Saida saida) throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        
        String sql = "UPDATE clientes SET estacionado = 'no' WHERE placa =" + "'"+saida.getSaidaveiculo() +"'" ;
       
        System.out.println("" + sql);
        PreparedStatement stmt = con.prepareStatement(sql);
       
        stmt.execute();
        stmt.close();
        con.close();
}
        public static void addpesquisaCliente(Pesquisa pesquisa) throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        
        String sql = "select * from clientes where nome=" + "'"+ pesquisa.getPesquisaCliente() +"'" ;
       
        System.out.println("teset pesquisa imprimindo pesquisa" + sql);
        PreparedStatement stmt = con.prepareStatement(sql);
       
        stmt.execute();
        stmt.close();
        con.close();
}
        
        
    
    
    
}
    
