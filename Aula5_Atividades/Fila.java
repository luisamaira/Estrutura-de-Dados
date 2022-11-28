/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luísa Maira
 */
public class Fila {
    List<Object> filaLavar = new ArrayList<>();
    List<Object> filaLavadoList = new ArrayList<>();
    List<Object> listObj = new ArrayList<>();

    String veic = new String("veic");

    void listaObj(Object obj) {
        this.listObj.add(obj);
    }

    void inserirLavar(Object obj) {
        this.filaLavar.add(obj);
    }

    void inserirLavado(Object obj) {
        this.filaLavadoList.add(obj);
    }

    void remove() {
        this.filaLavar.remove(this.filaLavar.size() - 1);
    }

    boolean filaVazia() {
        return this.filaLavar.isEmpty();
    }

    boolean elemRepet(Object obj) {
        return this.filaLavar.contains(obj);
    }

    void limparFila() {
        this.filaLavar.clear();
    }

    void imprimir(Object obj) {
        if (obj instanceof Carro) {
            System.out.println("O proprietario do carro lavado eh:.. " + ((Carro) obj).dono);
            System.out.println("O modelo do carro lavado eh:.. " + ((Carro) obj).modelo);
            System.out.println("A marca do carro lavadoeh:.. " + ((Carro) obj).marca);
            System.out.println("O codigo do veiculo lavado eh:.." + ((Carro) obj).idCarro);

        }
    }
}