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
public class Prato {
    
    private final int cod;
    private String nome;
    private String ingredientes;
    private String descricao;
    private float preco;
    private String tamanho;
    private String categoria;

    public Prato(int cod, String nome, String ingredientes, String descricao, float preco, String tamanho, String categoria) {
        this.cod = cod;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.categoria = categoria;
    }

    public int getCod(){
        return this.cod;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
