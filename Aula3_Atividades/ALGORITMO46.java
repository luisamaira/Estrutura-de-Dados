/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo46;
import javax.swing.JOptionPane;

/**
 *
 * @author Luísa Maira
 */
public class ALGORITMO46 {

    public static void main(String[] args) {
        double saldo, nsaldo;
        String s;
        
        s = JOptionPane.showInputDialog("Digite saldo: ");
        saldo = Double.parseDouble(s);
        
        nsaldo = saldo * 1.01;
        System.out.print ("Novo saldo: "+nsaldo);
                
    }
}
