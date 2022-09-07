/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo42;
import static java.lang.Math.sin;
import javax.swing.JOptionPane;

/**
 *
 * @author Luísa Maira
 */
public class ALGORITMO42 {

    public static void main(String[] args) {
        float angulo, rang;
        String s;
        
        s = JOptionPane.showInputDialog("Imprima um angulo em graus: ");
        angulo = Float.parseFloat(s);
        
        rang = (float) (angulo * Math.PI / 180);
        
        System.out.println("SENO: " +Math.sin(rang));
        System.out.println("CO-SENO: " +Math.cos(rang));
        System.out.println("TANGENTE: " +Math.tan(rang));
        System.out.println("CO - SECANTE: " +1/Math.sin(rang));
        System.out.println("SECANTE: " +1/Math.cos(rang));
        System.out.println("COTANGENTE: " +1/Math.tan(rang));
        
    }
}
