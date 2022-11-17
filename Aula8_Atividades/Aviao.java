/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author Luísa Maira
 */
public class Aviao {
        String nomeAviao;
    int idAviao;
    
    Fila fila = new Fila();
    
    public Aviao (String nomeAviao, int idAviao){
        super();
        this.idAviao = idAviao;
        this.nomeAviao = nomeAviao;
    }
}
