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
       //long tempoQuick= System.currentTimeMillis();  
        for (int i = 1; i < input.getTotal(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(input.pegaNumero(j) < input.pegaNumero(j-1)){
                 troca(j,j-1,input);
                  if(tela.vetorAleatorioRepedindobol){
                  tela.vetorAleatorioRepedindo.setVetor(input.pegavetor());
                }else if(tela.vetorAleatoriobol){
                  tela.vetorAleatorio.setVetor(input.pegavetor());                  
                }else if(tela.vetorOrganizadoCrescentebol){
                  tela.vetorOrganizadoCrescente.setVetor(input.pegavetor());
                }else if(tela.vetorOrganizadoDecrescentebol){
                  tela.vetorOrganizadoDecrescente.setVetor(input.pegavetor());
                }
                }
            }
        }
       // tempoQuick = System.currentTimeMillis() - tempoQuick; 
        //tela.JLtempo_de_organizacao.setText(tempoQuick+"ms");
        tela.threadGo= false;
        return input;
    }
}
