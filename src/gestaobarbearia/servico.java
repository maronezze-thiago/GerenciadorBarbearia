/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaobarbearia;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public abstract class servico {
    
    private String cliente;
    private double precobase;
    private String descricao;

    public servico(String cliente, double precobase, String descricao) {
        this.cliente = cliente;
        this.precobase = precobase;
        this.descricao = descricao;
    }

    public servico() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getPrecobase() {
        return precobase;
    }

    public void setPrecobase(double precobase) {
        this.precobase = precobase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
    
    
    
    
      
    public double calcularpreco(){
        return this.precobase;
    }
    
    
    
    
    
    
}
