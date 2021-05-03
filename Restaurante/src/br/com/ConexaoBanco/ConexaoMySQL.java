/*
 *
 * TAMILLY & MICHAEL
 *
 * Esse eh o nosso projeto de POO com o qual esperamos obter nota maxima
 *
 * 2021 (c) NOSSO PROJETO
 *
 */
package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tamilly.nascimento
 */
public class ConexaoMySQL {
    public static String status = "Erro de conexão...";
    
    public ConexaoMySQL(){
        
    }
    
    public static java.sql.Connection getConexaoMySQL(){
        Connection connection = null;
        
        try{
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            String serverName = "localhost:3306";   //caminho do servidor do BD

            String mydatabase = "restaurante";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

            String username = "root";        //nome de um usuário de seu BD

            String password = "1753&Tq2";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);
            
            if(connection != null){
                status = ("STATUS--->Conectado com sucesso!\n");
            }
            else{
                status = ("STATUS--->Não foi possível realizar a conexão.\n");
            }
            
            return connection;
            
        }catch(ClassNotFoundException e){
            System.out.println("O driver especificado não foi encontrado.\n");
            return null;
        }catch(SQLException e){
            System.out.println("Não foi possível conectar ao Banco de Dados.\n");
            return null;
        }
    }
    
    public static String statusConnection(){
        return status;
    }
    
    public static boolean fecharConexao(){
        
        try{
            ConexaoMySQL.getConexaoMySQL().close();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public static java.sql.Connection reiniciarConexao(){
        
        fecharConexao();
        
        return ConexaoMySQL.getConexaoMySQL();
        
    }
}