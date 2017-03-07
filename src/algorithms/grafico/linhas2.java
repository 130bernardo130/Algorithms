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
		setVisible(true);
		setSize(1103, 430);
            if(vetorUsado == 0){
                for(int i = 0;i<vetor.getTotal();i++){
                    g.drawLine(15+mapear(i,1080,15,vetor.getTotal()), mapear(vetor.pegaNumero(i),180, vetor.getTotal()), 15+mapear(i,1080,15,vetor.getTotal()),180);
                }
                 
            }else{
               switch(vetorUsado){
                     case 1:
                         for(int i = 0;i<tela.TamanhoVetor;i++){
                            g.drawLine(15+mapear(i,1080,15,tela.TamanhoVetor), mapear(tela.vetorOrganizadoCrescente.pegaNumero(i),180, tela.TamanhoVetor)+230, 15+mapear(i,1080,15,tela.TamanhoVetor),410);
                         }
                         break;
                     case 2:
                    	 for(int i = 0;i<tela.TamanhoVetor;i++){
                             g.drawLine(15+mapear(i,1080,15,tela.TamanhoVetor), mapear(tela.vetorOrganizadoDecrescente.pegaNumero(i),180, tela.TamanhoVetor)+230, 15+mapear(i,1080,15,tela.TamanhoVetor),410);
                          }
                         break;
                     case 3:
                    	 for(int i = 0;i<tela.TamanhoVetor;i++){
                             g.drawLine(15+mapear(i,1080,15,tela.TamanhoVetor), mapear(tela.vetorAleatorio.pegaNumero(i),180, tela.TamanhoVetor)+230, 15+mapear(i,1080,15,tela.TamanhoVetor),410);
                          }
                         break;
                    case 4:
                    	for(int i = 0;i<tela.TamanhoVetor;i++){
                            g.drawLine(15+mapear(i,1080,15,tela.TamanhoVetor), mapear(tela.vetorAleatorioRepedindo.pegaNumero(i),180, tela.TamanhoVetor)+230, 15+mapear(i,1080,15,tela.TamanhoVetor),410);
                         }
                         break;
                 }                                                          
             }
}
}