/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadefilacarros;
import javax.swing.JOptionPane;

/**
 *
 * @author Luísa Maira
 */
public class AtividadeFilaCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Estanciar Classe Fila
        Fila F1 = new Fila (); //Recebe os Carros
        Fila F2 = new Fila (); //Carros que ja foram lavados
        
        //Declarando variavel
        int lav = 0;
        
        //Estanciar classe carros
        Carros C = new Carros();
        
        //Estanciar objetos
        Object obj = new Object();
        
        
        //Dados dos Carros
        for (int i = 1; i<16; i++){
            
            Carros ent = new Carros (); //Objeto armazena entradas de dados
            
            ent.idCarro = Integer.parseInt(JOptionPane.showInputDialog("Digite a identificação: "));
            ent.marca = JOptionPane.showInputDialog ("Digite a marca: ");
            ent.cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
            
            //Inserir carros
            System.out.println("Entrando na fila para a lavagem: \n");
            F1.inserir(ent);
            //Imprimir carro inserido
            System.out.println("O numero de identificação do carro eh..: "+ent.idCarro);
            System.out.println("A cor do carro eh..: "+ent.cor);
            System.out.println("A marca do carro eh..: "+ent.marca);
            System.out.println("-------------------------------------------");
            
            //Remover o ultimo carro lavado
            if (i % 3 == 0){
                if(F1.fila_vazia()) {
                    System.out.println("A fila está vazia!");
                }else{
                    
                    //Carro lavado e levado para a outra fila
                    System.out.println("Automovel lavado - Adicionando ele na fila de lavados: \n");
                    obj = F1.remover();
                    
                    C = (Carros) obj;
                    
                    //Adicionando carro na fila de lavados
                    F2.inserir(C);
                    
                    System.out.println("Marca: " +C.marca);
                    System.out.println("Identificacao: " +C.idCarro);
                    System.out.println("Cor: " +C.cor);
                    lav++;
                    System.out.println("-----------------------------------------------");
                }
            }
        }
        
        
        System.out.println("Todos os automoveis que ja foram lavados: ");
        for (int j = 0; j < lav; j++) {
            
            obj = F2.mostrar(j);
            C = (Carros) obj;
            
            System.out.println("Marca: " +C.marca);
            System.out.println("Identificacao: " +C.idCarro);
            System.out.println("Cor: " +C.cor);
            System.out.println("-----------------------------------------------\n"); 
            
            }
        }
    }
  
