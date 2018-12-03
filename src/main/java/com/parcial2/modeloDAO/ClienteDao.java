/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.modeloDAO;

import com.parcial2.config.Conexao;
import com.parcial2.modelodados.Cliente;
import com.parcial2.modelodados.Pesquisa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ClienteDao {
        public static void adicionarCliente(Cliente cliente) throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "insert into clientes " +
            "(nome,habilitacao,cpf,rg,placa)" +
            " values (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getHabilitacao());
        stmt.setString(3, cliente.getCpf());
        stmt.setString(4, cliente.getRg());
        stmt.setString(5,cliente.getPlaca());
       
        stmt.execute();
        stmt.close();
        con.close();
    }
     
    // não foi realizada a busca ainda
    public static List<Cliente> buscarClientes() throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "select * from clientes where estacionado = 'yes'";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Cliente> clientes = new ArrayList<Cliente>();
        while (rs.next()) {
        	Cliente cliente = new Cliente();
        	cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setPlaca(rs.getString("placa"));
                clientes.add(cliente);
        }
        rs.close();
        stmt.close();
        con.close();
        return clientes;
    }
   
    /*
    public static List<Cliente> buscarnomeClientes() throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        String sql = "select "+   + "from clientes";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Cliente> clientes = new ArrayList<Cliente>();
        while (rs.next()) {
        	Cliente cliente = new Cliente();
        	cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setPlaca(rs.getString("placa"));
                clientes.add(cliente);
        }
        rs.close();
        stmt.close();
        con.close();
        return clientes;
    }
    
    
    */
    
}
