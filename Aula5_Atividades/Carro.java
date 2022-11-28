/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;

/**
 *
 * @author Luísa Maira
 */
public class Carro {
    String modelo, marca, dono; 
    int idCarro;

    void cadCarro(Object obj, String modelo, String marca, String dono, int idCarro){
        ((Carro)obj).modelo = modelo;
        ((Carro)obj).marca = marca;
        ((Carro)obj).dono = dono;
        ((Carro)obj).idCarro = idCarro;
    }
}