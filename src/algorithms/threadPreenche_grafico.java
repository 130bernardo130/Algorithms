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
   
    
    
    public threadPreenche_grafico(JPanel painel,vetores vetorEstatico,int i,Graphics g ) {
    g_ = g;
    vetorEstatico_=vetorEstatico;
    painel_ = painel;
    i_ = i;
    }
    @Override
    public void run() {
        /*vetorEstatico_ = vetorEstatico;
        vetorMovel_ = vetorMovel;*/
        linhas linha = new linhas();
        linha.setVetor(vetorEstatico_);
        while(tela.threadGo){
            
            
            
            
            painel_.removeAll();
            javax.swing.GroupLayout painelInternoLayout = new javax.swing.GroupLayout(painel_);
            painel_.setLayout(painelInternoLayout);
            painelInternoLayout.setHorizontalGroup(
                    painelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 1103, Short.MAX_VALUE)
            );
            painelInternoLayout.setVerticalGroup(
                    painelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 430, Short.MAX_VALUE)
            );
            linha.paintComponent(g_);    
            painel_.add(linha);
            
            linhas2 linha2 = new linhas2();
            linha2.setVetor(i_);
            linha2.paintComponent(g_);
            painel_.add(linha2);
            
            
            
            
        }
    }

   
    
}
