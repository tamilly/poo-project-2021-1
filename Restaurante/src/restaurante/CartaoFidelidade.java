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
public class CartaoFidelidade {
    
    private int numero;
    private int quantidadeCompras;
    private boolean ativo;
    private Pessoa clienteTitular;

    public CartaoFidelidade(int numero, int quantidadeCompras, boolean ativo, Pessoa titular) {
        this.numero = numero;
        this.quantidadeCompras = quantidadeCompras;
        this.ativo = ativo;
        this.clienteTitular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidadeCompras() {
        return quantidadeCompras;
    }

    public void setQuantidadeCompras(int quantidadeCompras) {
        this.quantidadeCompras = quantidadeCompras;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Pessoa getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Pessoa clienteTitular) {
        this.clienteTitular = clienteTitular;
    }
    
    
}
