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
public class PratosPedidos {
    
    private final int numero;
    private Prato prato;
    private int quantidade;

    public PratosPedidos(int numero, Prato prato, int quantidade) {
        this.numero = numero;
        this.prato = prato;
        this.quantidade = quantidade;
    }

    public Prato getPrato() {
        return this.prato;
    }

    public void setPrato(Prato prato) {
        this.prato = prato;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
