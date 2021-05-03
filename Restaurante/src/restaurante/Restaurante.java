/*
 *
 * TAMILLY & MICHAEL
 *
 * Esse eh o nosso projeto de POO com o qual esperamos obter nota maxima
 *
 * 2021 (c) NOSSO PROJETO
 *
 */
package restaurante;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import restaurante.DAO.UsuarioDAO;
import restaurante.DAO.teste;
//import java.text.SimpleDateFormat;
//import java.util.Date;

/**
 *
 * @author tamilly.nascimento
 */
public class Restaurante {

    // EM CONSTRUÇÃO
   
    public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {
        // MENU PRINCIPAL AQUI
        
        /* ESTE É APENAS UM TESTE INICIAL
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date data = formato.parse("23/11/2015");
        
        Funcionario f = new Funcionario(1, "ze", "123456789", data, 1000, "cozinha", "cozinheiro");
        System.out.println(f.getId());
        System.out.println(f.getNome());
        System.out.println(f.getCpf());
        System.out.println(formato.format(f.getDataNascimento()));
        System.out.println(f.getSalario());
        System.out.println(f.getSetor());
        System.out.println(f.getFuncao());
        f.ganhaGratificacao();
        System.out.println(f.getSalario());
        
        Gerente g = new Gerente(1, "ze", "123456789", data, 1000, "cozinha");
        System.out.println(g.getId());
        System.out.println(g.getNome());
        System.out.println(g.getCpf());
        System.out.println(formato.format(g.getDataNascimento()));
        System.out.println(g.getSalario());
        System.out.println(g.getSetor());
        g.ganhaGratificacao();
        System.out.println(g.getSalario());
        
        */
        List<Usuario> us = new ArrayList<>();
        teste t = new teste();
        us = t.Select();
        for(int i=0; i<us.size(); i++){
            System.out.println("apelido: ");
            System.out.println(us.get(i).getApelido());
            System.out.println("senha: ");
            System.out.println(us.get(i).getSenha());
            System.out.println("nivel: ");
            System.out.println(us.get(i).getNivelAcesso());
        }
        UsuarioDAO u = new UsuarioDAO();
        u.Insert();
        
    }
    
}
