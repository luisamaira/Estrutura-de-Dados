/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo43;
import javax.swing.JOptionPane;

/**
 *
 * @author Luísa Maira
 */
public class ALGORITMO43 {

    public static void main(String[] args) {
        double num, base, logaritmo;
        String s;
       
        s = JOptionPane.showInputDialog("ENTRE COM O LOGARITMANDO: ");
        num = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("ENTRE COM A BASE: ");
        base = Double.parseDouble(s);
        
        logaritmo = Math.log (num) / Math.log(base);
        System.out.format("O logaritmo de %.2f, na base %.2f eh %.2f", num, base,logaritmo);
        
    }
}
