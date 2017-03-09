/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.grafico;

import algorithms.tela;
import algorithms.vetores;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class linhas extends JPanel{

    private int[] vetor = null;
    int vetorUsado;
    public void setVetor(int[] vet) {
       vetor=vet;
    }
    
    public void setVetor(int i){
        vetorUsado= i;
    }
    
   public static int mapear(int valorMapeadoDentroDoPrimario, int maior_primario,int maior_secundario){
        int numeroMapeado =valorMapeadoDentroDoPrimario *100/maior_secundario;     
        double outr = numeroMapeado/1.000/100.0000;
        outr= outr*maior_primario/1.0;    
        numeroMapeado= (int)outr -maior_primario;     
        numeroMapeado=numeroMapeado * -1; 
        return (int)numeroMapeado;
    }
       public static int mapear(int valorMapeadoDentroDoPrimario, int maior_primario,int menor_primario,int maior_secundario){
    	 double numeroMapeado =valorMapeadoDentroDoPrimario*100.0/maior_secundario*1.0;
         int diferenca=maior_primario - menor_primario;
         double outr = numeroMapeado/100.00;        
         outr= outr*diferenca/1.0;
         return (int)outr;
    }

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		 int muda = 30;
		setBackground(Color.white);
		g.setColor(Color.blue);
		                          		
		setSize(1103, 200+muda);
	
        for(int i = 0;i<tela.vetorEstatico.getTotal();i++){ 
        	g.drawLine(15, 0, 15,230);
    		g.drawLine(0, 210, 1103,210);    
            g.drawLine(15+mapear(i,1080,15,tela.vetorEstatico.getTotal()), mapear(tela.vetorEstatico.vetor[i],180, tela.vetorEstatico.getTotal())+muda, 15+mapear(i,1080,15,tela.vetorEstatico.getTotal()),180+muda);
        }	
        
	}
}