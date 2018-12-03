/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.modeloDAO;

import com.parcial2.config.Conexao;
import com.parcial2.modelodados.Historico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author natan.oliveira
 */
public class HistoricoDao {
    
    
    public static void buscarHistorico(Historico historico) throws SQLException{
        Connection con = Conexao.getConnection();
        System.out.println("Conectado!");
        
        String sql = "select * from clientes ";
       
        System.out.println("" + sql);
        PreparedStatement stmt = con.prepareStatement(sql);
       
        stmt.execute();
        stmt.close();
        con.close();
}

 
    
    
}
