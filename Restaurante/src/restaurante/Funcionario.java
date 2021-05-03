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

import java.util.Date;

/**
 *
 * @author tamilly.nascimento
 */
public class Funcionario extends Gerente{
    
    private String funcao;

    public Funcionario(int id, String nome, String cpf, Date dataNascimento, float salario, String setor, 
            String funcao) {
        super(id, nome, cpf, dataNascimento, salario, setor);
        this.funcao = funcao;
    }

    @Override
    public void ganhaGratificacao(){
        this.setSalario(this.getSalario() + (float) (this.getSalario() * 0.1));
    }
    
    public String getFuncao(){
        return funcao;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    
}
