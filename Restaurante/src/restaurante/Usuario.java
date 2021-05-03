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

/**
 *
 * @author tamilly.nascimento
 */
public class Usuario {
    
    private String apelido;
    private int nivelAcesso;
    private String senha;

    public Usuario() {
        this.apelido = "";
        this.nivelAcesso = 0;
        this.senha = "";
    }

    public String getApelido() {
        return apelido;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
