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
public class threadOrganiza_vetor  implements Runnable {
    int metodo;
    int tipoVetor;
    public threadOrganiza_vetor(int metodo) {    
        this.metodo = metodo;
    }

    
    
    @Override
    public void run() {
        QuickSort quick = new QuickSort();
        InsertionSort insert = new InsertionSort();
        switch(metodo){
            case 1:
                if(tela.vetorAleatorioRepedindobol){                    
                    quick.sort(tela.vetorAleatorioRepedindo);                  
                }else if(tela.vetorAleatoriobol){
                    quick.sort(tela.vetorAleatorio);
                }else if(tela.vetorOrganizadoCrescentebol){
                    quick.sort(tela.vetorOrganizadoCrescente);
                }else if(tela.vetorOrganizadoDecrescentebol){
                    quick.sort(tela.vetorOrganizadoDecrescente);
                }
                break;
            case 2:
                if(tela.vetorAleatorioRepedindobol){                    
                    insert.doInsertionSort(tela.vetorAleatorioRepedindo);                  
                }else if(tela.vetorAleatoriobol){
                    insert.doInsertionSort(tela.vetorAleatorio);
                }else if(tela.vetorOrganizadoCrescentebol){
                    insert.doInsertionSort(tela.vetorOrganizadoCrescente);
                }else if(tela.vetorOrganizadoDecrescentebol){
                    insert.doInsertionSort(tela.vetorOrganizadoDecrescente);
                }
                break;
            case 3:
                 if(tela.vetorAleatorioRepedindobol){                    
                    BubleSort.arruma(tela.vetorAleatorioRepedindo);                  
                }else if(tela.vetorAleatoriobol){
                    BubleSort.arruma(tela.vetorAleatorio);
                }else if(tela.vetorOrganizadoCrescentebol){
                    BubleSort.arruma(tela.vetorOrganizadoCrescente);
                }else if(tela.vetorOrganizadoDecrescentebol){
                    BubleSort.arruma(tela.vetorOrganizadoDecrescente);
                }
                break;
        }
    
    }
}
