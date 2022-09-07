/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo26;
import javax.swing.JOptionPane;

/**
 *
 * @author Luísa Maira
 */
public class ALGORITMO26 {

    public static void main(String[] args) {
        int data, dia, mes, ano, ndata;
        String s;
        
       s = JOptionPane.showInputDialog("DIGITE DATA DE NASCIMETO EM FORMATO DDMMAA:.. ");
       data = (int) Float.parseFloat(s);
       
       dia = data / 10000;
       System.out.println("DIA: " +dia);
       
       mes = data % 10000 / 100;
       System.out.println("MES:.." +mes);
       
       ano = data % 100;
       System.out.println("ANO:.. " +ano);
       
       ndata = mes * 10000 + dia*100+ano;
       System.out.println("DATA NO FORMATO MMDDAA:.. " +ndata);
        
    }
}
