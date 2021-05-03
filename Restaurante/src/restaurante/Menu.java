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

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tamilly.nascimento
 */
public class Menu { // CLASSE EM CONSTRUÇÃO
  
    public List<Usuario> login(List<Usuario> usuarios, Usuario usuario){
        if(!usuarios.isEmpty()
                && usuarios.contains(usuario)){//Verifica se a lista está vazia, ou seja, se há usuários
            if(usuario.getNivelAcesso() == 1){}
                //Chama menu admin
            else{}
                //chama menu funcionario
        }
        
        else{//Se não houver usuários
            System.out.println("Não há usuários cadastrados.\nDeseja cadastrar novo usuário? "
                    + "(Pressione 1 para cadastrar ou qualquer número para sair): ");
            if(new Scanner(System.in).nextInt() == 1)
                usuarios.add(cadastrarUsuario());//Adiciona novo usuário a lista
        }
        return usuarios;
    }
    
    public Usuario cadastrarUsuario() {
        System.out.println("Criar apelido: ");
        String a = new Scanner(System.in).nextLine();
        System.out.println("Senha: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Nível de acesso (1.Administrador/2.Funcionário): ");
        int n = new Scanner(System.in).nextInt();
        return new Usuario(a, n, s);
    }

    public void menuFuncionario(){
        //Funcionário pode: adicionar pedido, alterar pedidos que não estejam com status "completo",
        //Visualizar pedidos por mesa;
        System.out.println("0.Sair\n1.Adicionar pedido\n2.Alterar pedido\n3.Ver pedido");
        switch(new Scanner(System.in).nextInt()){
            
        }
    }
    
    public void menuAdmin(){
        //Administrador pode: adicionar pratos, alterar pratos, adicionar funcionárioe usuário;
    }

}

