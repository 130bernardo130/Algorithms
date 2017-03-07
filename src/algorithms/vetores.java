/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernardo
 */
public class vetores {
  
    private int vetor[];
    
    
    public void setaNumero(int i, int valor){
        this.vetor[i] = valor;
    }
    
    public int pegaNumero(int i){
        return this.vetor[i];
    }
    
    public void setVetor(int vet[]){
        this.vetor = vet;
    }
    public int[] pegavetor(){
        return this.vetor;
    }
    public int getTotal(){
        return this.vetor.length;
    }
    
    public void imprime(){
        for(int i=0;i<this.vetor.length;i++){
            System.out.println(this.vetor[i]);
        }
    }
    
    
 
    
    public vetores(int tipo, int total) {        
        this.vetor = new int[total];
        
        switch(tipo){
            case 1:
                //TODO cria um vetor ordenado crescente
                for(int i = 0;i<total;i++){
                    
                    this.vetor[i]=  i+1;
                   
                }
                break;
            case 2:
                //TODO cria um vetor ordenado decrescente
                int totalInv = total;
                for(int i = 0;i<total;i++){
                    this.vetor[i] = totalInv;
                    totalInv--;
                }
                break;
            case 3:
                //TODO cria um vetor aleatorio
                for(int i = 0;i<total;i++){
                    this.vetor[i]= (int) Math.round(Math.random()*total +1);
                }
                break;
            case 4:
                //TODO cria um vetor aléatorio com varios membros repetidos
                for(int i = 0;i<total;i++){
                    int repetir = (int) Math.round(Math.random()*  total/100  )+1;
                    int total2 = (int)Math.round(Math.random()*total/2)+1;                    
                    for(int y = 0;y<repetir;y++){
                        this.vetor[i]= total2;
                        i++;
                        if(i>=total){
                            break;
                        }
                    }
                }
                break;
            default:
                this.vetor[0] = 0;
                
        }
    }
}
