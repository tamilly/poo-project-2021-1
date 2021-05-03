/*
 *
 * TAMILLY & MICHAEL
 *
 * Esse eh o nosso projeto de POO com o qual esperamos obter nota maxima
 *
 * 2021 (c) NOSSO PROJETO
 *
 */
package restaurante.DAO;

import conexaoBanco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import restaurante.Usuario;

/**
 *
 * @author tamilly.nascimento
 */
public class UsuarioDAO {
    public void Insert() throws SQLException, ClassNotFoundException{
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        System.out.println("Apelido: ");
        String a = new Scanner(System.in).nextLine();
        System.out.println("Senha: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Nível de acesso: ");
        int n = new Scanner(System.in).nextInt();
        
        
        try{
            stmt = con.prepareStatement("INSERT INTO usuario(apelido, nivelAcesso, senha) VALUES(?, ?, ?)");
            stmt.setString(1, a);
            //stmt.setString(1, usuario.getNome());  
            stmt.setInt(2, n);  
            stmt.setString(3, s);  
            stmt.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex);
        }finally{
            Conexao.getConnection().close();
        }
        
    }
}
