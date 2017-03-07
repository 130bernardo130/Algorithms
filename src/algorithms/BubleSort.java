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
public class BubleSort {
    
    static void troca(int i, int i2, vetores vetor){
        int auxiliar;
        
        auxiliar = vetor.pegaNumero(i);
        vetor.setaNumero(i, vetor.pegaNumero(i2));
        vetor.setaNumero(i2, auxiliar);
    }
    
    static void arruma(vetores vetor){
         int n = vetor.getTotal();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (vetor.pegaNumero(i) > vetor.pegaNumero(k)) {
                    troca(i,k, vetor);
                }
            }
        }
        
    }

}
