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
public class Gerente extends Pessoa{
    
    private float salario;
    private String setor;

    public Gerente(int id, String nome, String cpf, Date dataNascimento, float salario, String setor) {
        super(id, nome, cpf, dataNascimento);
        this.salario = salario;
        this.setor = setor;
    }
    
    public void ganhaGratificacao(){
        this.salario = ((float) (this.salario * 0.5) + this.salario);
    }
   
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    
}
