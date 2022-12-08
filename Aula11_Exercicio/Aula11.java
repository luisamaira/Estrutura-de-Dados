/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author Luísa Maira
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();

        if(pilha.vefExpressao()) {
            System.out.println("A expressao foi escrita de forma correta!");
        }else {
            System.out.println("A expressao foi escrita de forma incorreta!");
            
        }
    }
}
