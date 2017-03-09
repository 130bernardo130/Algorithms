/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import algorithms.grafico.linhas;
import javax.swing.JPanel;
import algorithms.grafico.linhas2;

/**
 *
 * @author Bernardo
 */
public class threadPreenche_grafico implements Runnable {
    static vetores vetorEstatico_;
    static int i_;
    static JPanel painel_;
    static Graphics g_;
    vetores vet= new vetores();
    
    
    public threadPreenche_grafico(vetores vetorEstatico,int i,Graphics g ) {
    g_ = g;
    vetorEstatico_=vetorEstatico;    
    i_ = i;
    }
    @Override
    public void run() {
        /*vetorEstatico_ = vetorEstatico;
        vetorMovel_ = vetorMovel;*/
        linhas linha = new linhas();
        tela.vetorEstatico= vet;
       // linha.setVetor(tela.vetorEstatico.pegavetor());
        if(tela.vetorAleatorioRepedindobol){
            // vetorEstatico= vetorAleatorioRepedindo;
          tela.vetorEstatico.copiaPorFavor(tela.vetorAleatorioRepedindo.vetor);

         }else if(tela.vetorAleatoriobol){
            //vetorEstatico = vetorAleatorio;
        	 tela.vetorEstatico.copiaPorFavor(tela.vetorAleatorio.vetor);
             
         }else if(tela.vetorOrganizadoCrescentebol){
          // vetorEstatico = vetorOrganizadoCrescente;
        	 tela.vetorEstatico.copiaPorFavor(tela.vetorOrganizadoCrescente.vetor);

         }else if(tela.vetorOrganizadoDecrescentebol){
            // vetorEstatico = vetorOrganizadoDecrescente;
        	 tela.vetorEstatico.copiaPorFavor(tela.vetorOrganizadoDecrescente.vetor);
         }
        int terminou = 0;
       // linha.setVetor(vetorEstatico_);
        while(tela.threadGo||terminou == 0){
        	tela.painelInterno.removeAll();
        	tela.arrumaPosicao();
            linhas2 linha2 = new linhas2();

            try {
            	linha.paintComponent(g_);
            	linha2.paintComponent(g_);
            	tela.painelInterno.add(linha2);
            	tela.painelInterno.add(linha); 
            	linha2.setVisible(true);
                linha.setVisible(true);
            	 Thread.sleep(300);
			} catch (NullPointerException | InterruptedException e) {
				System.out.println("a merda do G");
			}
            
           
            tela.arrumaPosicao();
            if(!tela.threadGo){
            	terminou++;
            }
            
            
        }
        tela.painelInterno.removeAll();
    	tela.arrumaPosicao();
        linhas2 linha2 = new linhas2();

        try {
        	linha.paintComponent(g_);
        	linha2.paintComponent(g_);
        	tela.painelInterno.add(linha2);
        	tela.painelInterno.add(linha); 
        	linha2.setVisible(true);
            linha.setVisible(true);
        	 
		} catch (NullPointerException e) {
			System.out.println("a merda do G");
		}
       
    }

   
    
}
