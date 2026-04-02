/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaobarbearia;

import java.util.Scanner;

/**
 *
 * @author THIAGODEOLIVEIRAMARO
 */
public class principal {
    public static void main(String[] args) {
        
        
        
           
        Scanner sc1 = new Scanner(System.in);   // numeros
        Scanner sc2 = new Scanner(System.in);   // letras
        
        
        int contadorprincipal = 0;
        
        
        GerenciadorBarbearia gb = new GerenciadorBarbearia();
        
        
        do{
            
            System.out.println(" corte de cabelo");
            System.out.println("listar atendimentos");
            System.out.println("faturamento total");

            
            
            contadorprincipal = sc1.nextInt();
            
            
            
              switch(contadorprincipal){
                
                case 1:
                    
                 
                    System.out.println("qual corte voce deseja escolher?");
                    
                    System.out.println("corte de 25");
                    System.out.println("corte de 35");
                    
                    int opcao = sc1.nextInt();
                    
                    switch(opcao){
                        
                        case 1: 
                            
                            System.out.println("voce escolheu o corte de 25.");
                            System.out.println("deseja adicionar o corte de barba  (15$) ?  s/n");
                            String r = sc2.nextLine();
                    if(r.equals("s")){
                        
                        System.out.println("voce escolheu o corte mais barba");
                        System.out.println("qual o seu nome?");
                        String nome = sc2.nextLine();
                        System.out.println("obrigado pela preferencia!");
                        
                        
                        int valor = 40;
                        String descricao = "corte mais barba";
                        
                        cortecabelo cb = new cortecabelo(nome, valor, descricao);
                        
                        
                        gb.adicionarservico(cb);
                        
                        
                    }else{
                        
                        System.out.println("voce escolheu so o corte");
                        System.out.println("qual o seu nome?");
                        String nome2 = sc2.nextLine();
                        System.out.println("obrigado pela preferencia!");
                        
                        
                         int valor = 25;
                        String descricao = "so o corte";
                        
                        cortecabelo cb = new cortecabelo(nome2, valor, descricao);
                        
                        
                        gb.adicionarservico(cb);
                        
                        
                        
                        
                    }
                    
                        case 2: 
                    
                            
                        System.out.println("voce escolheu o corte de 35.");
                            System.out.println("deseja adicionar o corte de barba  (15$) ?  s/n");
                            String re = sc2.nextLine();
                    if(re.equals("s")){
                        
                        System.out.println("voce escolheu o corte mais barba");
                        System.out.println("qual o seu nome?");
                        String nome = sc2.nextLine();
                        System.out.println("obrigado pela preferencia!");
                        
                        
                        int valor = 50;
                        String descricao = "corte mais barba";
                        
                        cortecabelo cb = new cortecabelo(nome, valor, descricao);
                        
                        
                        gb.adicionarservico(cb);
                        
                        
                    }else{
                        
                        System.out.println("voce escolheu so o corte");
                        System.out.println("qual o seu nome?");
                        String nome2 = sc2.nextLine();
                        System.out.println("obrigado pela preferencia!");
                        
                        
                         int valor = 35;
                        String descricao = "so o corte";
                        
                        cortecabelo cb = new cortecabelo(nome2, valor, descricao);
                        
                        
                        gb.adicionarservico(cb);
                        
                        
                        
                        
                    }
                            
                            
                            
                            
                    
                    

                    
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    break;
                
                    
                    
                
                case 2:  
                    
                gb.listarservico();
                  
                    
                    break;
           
                    
                case 3:
                    
                    
                    
                    
                    gb.calularfolha();
                    
                    
                    break;
                    
                    
                    
              
                
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }while(contadorprincipal != 10);
        
        
        
        
        
        
        
        
        
    }
}
