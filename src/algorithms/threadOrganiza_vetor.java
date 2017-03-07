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
    public threadOrganiza_vetor(int vetor,int metodo) {
        this.tipoVetor= vetor;
        this.metodo = metodo;
    }

    
    
    @Override
    public void run() {
        switch(metodo){
            case 1:
                
                
                break;
            case 2:
                break;
            case 3:
                break;
        }
    
    }
}
