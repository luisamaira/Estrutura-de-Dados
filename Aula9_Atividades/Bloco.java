/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author Luísa Maira
 */
public class Bloco {
    Bloco proximo;
    Object elemento;
    
    public Bloco (Object elemento) {
        this.elemento = elemento; 
    }
    
    public Bloco (Bloco proximo, Object elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }
    
    void setProximo (Bloco proximo){
       this.proximo = proximo;
    }
    
    Bloco getProximo (){
        return this.proximo;
    }
    
    Object getElemento () {
        return this.elemento;
    }
    
}
