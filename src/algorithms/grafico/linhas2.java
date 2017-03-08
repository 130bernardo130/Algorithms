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

public class linhas2 extends JPanel{

    static vetores vetor = null;
    int vetorUsado;
    public void setVetor(vetores vet) {
        this.vetor=vet;
    }
    
    public void setVetor(int i){
        this.vetorUsado= i;
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
		setBackground(Color.white);
		g.setColor(Color.blue);
                g.drawLine(15, 230 , 15, 430);
                g.drawLine(15,410,1103,410);
                setSize(1103, 430);
            if(vetorUsado == 0){               
                	System.out.println("DEU MERDA");                                
            }else{
            	if(tela.vetorAleatorioRepedindobol){
                    vetor= tela.vetorAleatorioRepedindo;
                  

                }else if(tela.vetorAleatoriobol){
                	vetor= tela. vetorAleatorio;
              
                    
                }else if(tela.vetorOrganizadoCrescentebol){
                	vetor= tela.vetorOrganizadoCrescente;
                  

                }else if(tela.vetorOrganizadoDecrescentebol){
                	vetor= tela. vetorOrganizadoDecrescente;
                   
                }
            	 for(int i = 0;i<vetor.vetor.length;i++){
              	   g.drawLine(15, 230 , 15, 430);
                     g.drawLine(15,410,1103,410);
                     
                  g.drawLine(15+mapear(i,1080,15,vetor.vetor.length), mapear(vetor.vetor[i],180, vetor.vetor.length)+230, 15+mapear(i,1080,15,vetor.vetor.length),410);
               }
               /*switch(vetorUsado){
                     case 1:
                         for(int i = 0;i<tela.vetorOrganizadoCrescente.vetor.length;i++){
                        	   g.drawLine(15, 230 , 15, 430);
                               g.drawLine(15,410,1103,410);
                               
                            g.drawLine(15+mapear(i,1080,15,tela.vetorOrganizadoCrescente.vetor.length), mapear(tela.vetorOrganizadoCrescente.vetor[i],180, tela.vetorOrganizadoCrescente.vetor.length)+230, 15+mapear(i,1080,15,tela.vetorOrganizadoCrescente.vetor.length),410);
                         }
                         break;
                     case 2:
                    	 for(int i = 0;i<tela.vetorOrganizadoDecrescente.vetor.length;i++){
                    		   g.drawLine(15, 230 , 15, 430);
                               g.drawLine(15,410,1103,410);                               
                             g.drawLine(15+mapear(i,1080,15,tela.vetorOrganizadoDecrescente.vetor.length), mapear(tela.vetorOrganizadoDecrescente.vetor[i],180, tela.vetorOrganizadoDecrescente.vetor.length)+230, 15+mapear(i,1080,15,tela.vetorOrganizadoDecrescente.vetor.length),410);
                          }
                         break;
                     case 3:
                    	 for(int i = 0;i<tela.vetorAleatorio.vetor.length;i++){
                    		   g.drawLine(15, 230 , 15, 430);
                               g.drawLine(15,410,1103,410);
                               
                             g.drawLine(15+mapear(i,1080,15,tela.vetorAleatorio.vetor.length), mapear(tela.vetorAleatorio.vetor[i],180, tela.vetorAleatorio.vetor.length)+230, 15+mapear(i,1080,15,tela.vetorAleatorio.vetor.length),410);
                          }
                         break;
                    case 4:
                    	for(int i = 0;i<tela.vetorAleatorioRepedindo.vetor.length;i++){
                    		   g.drawLine(15, 230 , 15, 430);
                               g.drawLine(15,410,1103,410);
                              
                               g.drawLine(15+mapear(i,1080,15,tela.vetorAleatorioRepedindo.vetor.length), mapear(tela.vetorAleatorioRepedindo.vetor[i],180, tela.vetorAleatorioRepedindo.vetor.length)+230, 15+mapear(i,1080,15,tela.vetorAleatorioRepedindo.vetor.length),410);                               
                               
                         }
                         break;
                 }*/                                                          
             }
}
}