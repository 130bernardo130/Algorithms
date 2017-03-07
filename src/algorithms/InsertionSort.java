/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Bernardo
 */
public class InsertionSort {
   
    
    static void troca(int i, int i2, vetores vetor){
        int auxiliar;
        
        auxiliar = vetor.pegaNumero(i);
        vetor.setaNumero(i, vetor.pegaNumero(i2));
        vetor.setaNumero(i2, auxiliar);
    }
    public vetores doInsertionSort(vetores input){
         
        for (int i = 1; i < input.getTotal(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(input.pegaNumero(j) < input.pegaNumero(j-1)){
                 troca(j,j-1,input);
                }
            }
        }
        return input;
    }
}
