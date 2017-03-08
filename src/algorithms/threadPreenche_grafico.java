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
       // linha.setVetor(vetorEstatico_);
        while(tela.threadGo){
            
            
            
        	 
        	tela.painelInterno.removeAll();
        	tela.arrumaPosicao();
        	linha.setVetor(vetorEstatico_);
            try {
            	linha.paintComponent(g_);    	
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("o primeiro g");
			}
        	
            tela.painelInterno.add(linha);            
            linhas2 linha2 = new linhas2();
            linha2.setVetor(i_);
            try {
            	
            	linha2.paintComponent(g_);	
			} catch (NullPointerException e) {
				System.out.println("a merda do G");
			}
            
            tela.painelInterno.add(linha2);
            linha.setVisible(true);
            linha2.setVisible(true);
            
            
            
        }
    }

   
    
}
