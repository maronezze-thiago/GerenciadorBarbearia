/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaobarbearia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public class GerenciadorBarbearia {
    
       private List<servico> lista;

    
   public GerenciadorBarbearia(){
        this.lista = new ArrayList<>();
    }
    
    
   
   
    public void adicionarservico(servico servico){
        
        
        lista.add(servico);
        
    }
    
   
   
   
   
   
    public void listarservico(){
        
        for(servico s : lista){
            
            System.out.println(s);
            
        }
   
    }
   
   
   
   
   
   public void calularfolha(){
        
        double total = 0;

        for (servico s : lista) {
            total += s.calcularpreco();
        }

        System.out.println("Total da folha: " + total);
    }

   
   
   
    
   
    
    
}
