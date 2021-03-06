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
public class QuickSort {
    private int array[];
    private int length;
    long tempoQuick= 0;
    public void sort(vetores inputArr) {
         tempoQuick = System.nanoTime();
        if (inputArr == null || inputArr.getTotal() == 0) {
            return;
        }
        this.array = inputArr.pegavetor();
        length = inputArr.getTotal();
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
        	try{
        		while (array[i] < pivot) {
                    i++;
                }
                while (array[j] > pivot) {
                    j--;
                }	
        	}catch(Exception e){
        		System.out.println(e);
        	}
            
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
              if(tela.vetorAleatorioRepedindobol){
                  tela.vetorAleatorioRepedindo.setVetor(array);
              }else if(tela.vetorAleatoriobol){
                  tela.vetorAleatorio.setVetor(array);                  
              }else if(tela.vetorOrganizadoCrescentebol){
                  tela.vetorOrganizadoCrescente.setVetor(array);
              }else if(tela.vetorOrganizadoDecrescentebol){
                  tela.vetorOrganizadoDecrescente.setVetor(array);
              }
            }
        }
        
        // call quickSort() method recursively
        if (lowerIndex < j){
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex){
            quickSort(i, higherIndex);      
        }
        
        
       
        
      
        tela.threadGo= false;
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
   

}
