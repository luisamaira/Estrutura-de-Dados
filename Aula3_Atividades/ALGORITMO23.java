/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo23;
import javax.swing.JOptionPane;

/**
 *
 * @author Luísa Maira
 */
public class ALGORITMO23 {

    public static void main(String[] args) {
        int a, d;
        String s;
        
        s = JOptionPane.showInputDialog ("Digite numero de tres casas: ");
        a = (int) Float.parseFloat(s);
        
        d = a % 100 / 10 ;
        System.out.println("algarismos da casa das dezenas " +d);
        
    }
}
