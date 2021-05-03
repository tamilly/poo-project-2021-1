/*
 *
 * TAMILLY & MICHAEL
 *
 * Esse eh o nosso projeto de POO com o qual esperamos obter nota maxima
 *
 * 2021 (c) NOSSO PROJETO
 *
 */
package conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author tamilly.nascimento
 */
public class Conexao {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/restaurante?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "1753&Tq2";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        try{

         // O método forName carrega e inicia o driver passado por parâmetro

        Class.forName(DRIVER);

         // Estabelecendo a conexão

        return DriverManager.getConnection(URL, USER, PASSWORD);

        }catch(ClassNotFoundException | SQLException ex){ // Tratamento de Exceções

            System.out.println(ex);

            return null;

        }

    }

}
    
