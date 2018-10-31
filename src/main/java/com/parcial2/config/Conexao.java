/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial2.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class Conexao {
    private static final String STRING_CONEXAO = 
            "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO_CONEXAO = "postgres";
    private static final String SENHA_CONEXAO = "123456";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager
            .getConnection(STRING_CONEXAO, USUARIO_CONEXAO, SENHA_CONEXAO);
    }
}
