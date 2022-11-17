/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;

/**
 *
 * @author Luísa Maira
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Pilha pilha = new Pilha();
        Fila fila = new Fila();

        System.out.println("\nExercicio 1 \n");

        pilha.exerc1();

        System.out.println("\nExercicio 2 \n");

        pilha.exerc2();

        System.out.println("\n Exercicio 3 \n");

        Aviao aviao1 = new Aviao("TAM", 10001);
        Aviao aviao2 = new Aviao("Airbus 94", 10002);
        Aviao aviao3 = new Aviao("GOL", 10003);
        Aviao aviao4 = new Aviao("Boeing 745", 10004);
        Aviao aviao5 = new Aviao("Boeing 269", 10005);
        Aviao aviao6 = new Aviao("Junkers F18", 10006);
        Aviao aviao7 = new Aviao("AZUL", 10007);
        Aviao aviao8 = new Aviao("Airbus 69", 10008);
        Aviao aviao9 = new Aviao("Raptor 29K-7", 10009);
        Aviao aviao10 = new Aviao("Tupolev tu-140", 100010);
        Aviao aviao11 = new Aviao("Boeing 639", 100011);

        fila.adicionar(aviao1);
        fila.adicionar(aviao2);
        fila.adicionar(aviao3);
        fila.adicionar(aviao4);
        fila.adicionar(aviao5);
        fila.adicionar(aviao6);
        fila.adicionar(aviao7);
        fila.adicionar(aviao8);
        fila.adicionar(aviao9);
        fila.adicionar(aviao10);
        
        System.out.println("Existem " + fila.tamnhFila() + " avioes na fila de espera\n");

        fila.libeVoo();
        fila.adicionar(aviao11);
        
        fila.exercicio3();

        fila.primeiroFila(fila.filaAviao.get(0));

        System.out.println("\nO primeiro aviao na fila eh o " + ((Aviao) aviao2).nomeAviao + " , com codigo id : "
                + ((Aviao) aviao1).idAviao + "\n");

        System.out.println(" \n Exercicio 4 \n");

        fila.exercicio4();

        System.out.println("\n Exercicio 5 \n");

        fila.exercicio5();

        System.out.println("\n Exercicio 6\n");

        fila.exercicio6();

        System.out.println("\n Exercicio 7\n");

        fila.exercicio7();

        System.out.println("\n Exercicio 8\n");

        fila.exercicio8();
    }
}
    }
    
}
