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

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tamilly.nascimento
 */
public class Pedido {
    
    private final int numero;
    private List<PratosPedidos> pratos = new ArrayList();
    private Funcionario atendente;
    private int numMesa;
    private float valorTotal;
    private boolean pago;
    private String status;

    public Pedido(int numero, Funcionario atendente, int numMesa, float valorTotal, boolean pago, String status) {
        this.numero = numero;
        this.atendente = atendente;
        this.numMesa = numMesa;
        this.valorTotal = valorTotal;
        this.pago = pago;
        this.status = status;
    }

    public List<PratosPedidos> getPratos() {
        return pratos;
    }

    public void setPratos(List<PratosPedidos> pratos) {
        this.pratos = pratos;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
