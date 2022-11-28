/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5;

/**
 *
 * @author Luísa Maira
 */
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fila fila = new Fila();

        Carro veic1 = new Carro();
        Carro veic2 = new Carro();
        Carro veic3 = new Carro();
        Carro veic4 = new Carro();
        Carro veic5 = new Carro();
        Carro veic6 = new Carro();
        Carro veic7 = new Carro();
        Carro veic8 = new Carro();
        Carro veic9 = new Carro();
        Carro veic10 = new Carro();        
        Carro veic11 = new Carro();
        Carro veic12 = new Carro();
        Carro veic13 = new Carro();
        Carro veic14 = new Carro();
        Carro veic15 = new Carro();
        
        veic1.cadCarro(veic1, "Uno", "Fiat", "Luana", 10001);
        veic2.cadCarro(veic2, "Gol", "Volkswagen", "Joana", 10002);
        veic3.cadCarro(veic3, "Fusca", "Volkswagen", "Claudio", 10003);
        veic4.cadCarro(veic4, "Palio", "Fiat", "Carla", 10004);
        veic5.cadCarro(veic5, "S10", "Chevrolet", "Marcos", 10005);
        veic1.cadCarro(veic6, "Uno", "Fiat", "Aline", 10006);
        veic2.cadCarro(veic7, "Fusca", "Volkswagen", "Paulo", 10007);
        veic3.cadCarro(veic8, "Palio", "Fiat", "Lucia", 10008);
        veic4.cadCarro(veic9, "Gol", "Volkswagen", "Jorge", 10009);
        veic5.cadCarro(veic10, "Fusca", "Volkswagen", "Marta", 10010);
        veic1.cadCarro(veic11, "S10", "Chevrolet", "Celio", 10011);
        veic2.cadCarro(veic12, "Gol", "Volkswagen", "Selma", 10012);
        veic3.cadCarro(veic13, "Uno", "Fiat", "Nelson", 10013);
        veic4.cadCarro(veic14, "Palio", "Fiat", "Julia", 10014);
        veic5.cadCarro(veic15, "Fusca", "Volkswagen", "Ingrid", 10015);
        
        fila.listaObj(veic1);
        fila.listaObj(veic2);
        fila.listaObj(veic3);
        fila.listaObj(veic4);
        fila.listaObj(veic5);
        fila.listaObj(veic6);
        fila.listaObj(veic7);
        fila.listaObj(veic8);
        fila.listaObj(veic9);
        fila.listaObj(veic10);
        fila.listaObj(veic11);
        fila.listaObj(veic12);
        fila.listaObj(veic13);
        fila.listaObj(veic14);
        fila.listaObj(veic15);

        Object cadObj = new Object();

        for (int i=0; i<14; i++) {
            cadObj = fila.listObj.get(i);
            System.out.println("\nOrdem da fila para lavagem! " + fila.filaLavar.size());
                        
            if ((i > 1) && (i % 3 == 0)) {
                fila.inserirLavado(fila.filaLavar.get(fila.filaLavar.size()-1));
                fila.remove();
                System.out.println("\nCarro removido da fila!");
                fila.imprimir(cadObj);
            } else {
            if (fila.elemRepet(cadObj) == true) {
                System.out.println ("\nVeiculo ja cadastrado");
            } else {
                fila.inserirLavar(cadObj);
                System.out.println("\nVeiculo nao cadastrado!");
                
                
                }

            }
        }     
    }

}

