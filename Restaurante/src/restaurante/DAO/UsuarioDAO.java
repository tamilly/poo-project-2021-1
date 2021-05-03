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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public List<Usuario> Select()throws SQLException, ClassNotFoundException{
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            while(rs.next()){
                Usuario u = new Usuario();
                u.setApelido(rs.getString("apelido"));
                u.setNivelAcesso(rs.getInt("nivelAcesso"));
                u.setSenha(rs.getString("senha"));
                usuarios.add(u);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(MembrosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
    
    
}
