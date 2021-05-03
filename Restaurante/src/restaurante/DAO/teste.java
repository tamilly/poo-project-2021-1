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
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import restaurante.*;

/**
 *
 * @author tamilly.nascimento
 */
public class teste {
    public void Insert(Usuario u) throws SQLException, ClassNotFoundException{
        Connection con = Conexao.getConnection();
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO usuario VALUES('teste', 1, '123')");
            stmt.setString(1, u.getApelido());
            stmt.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex);
        }finally{
            //Conexao.closeConnection(con, stmt);
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
