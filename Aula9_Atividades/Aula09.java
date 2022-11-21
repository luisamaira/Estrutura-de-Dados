/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

/**
 *
 * @author Luísa Maira
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoas pessoa1 = new Pessoas("1 Laura", "99698-7211", "Rua 25, n 8, Setor Cristo, Morrinhos", "659.111.965-88");
        Pessoas pessoa2 = new Pessoas("2 Vinicios", "9788-4561", "Rua das Flores, n 85, Centro, São Paulo", "777.548.631-45");
        Pessoas pessoa3 = new Pessoas("3 Marcos", "3413-8744", "Avenida A, n 24, Aeroporto, Rio de Janeiro", "035.478.123-55");
        Pessoas pessoa4 = new Pessoas("4 Carlos", "9486-3279", "Rua 6, n 120, Vila Bela, Pirinopolis", "026.548.601.11");
        Pessoas pessoa5 = new Pessoas("5 Matheus", "9865-1235", "Alameda B, Qd 18,Lote 9, Monte Verde, Morrinhos", "699.557.123-54");
        Pessoas pessoa6 = new Pessoas("6 Julia", "98947-8471", "Rua 5, n 65, Setor Oeste, Brasilia", "124.000.690-71");
        Pessoas pessoa7 = new Pessoas("7 Maria", "99641-8524", "Rua Alagoas, n 7, Olinto Candido, Caldas Novas", "145.871.362-94");
        Pessoas pessoa8 = new Pessoas("8 Jose", "98761-3239", "Rua 14, n 963, Zona Norte, Rio de Janeiro", "196.541.274-00");
        Pessoas pessoa9 = new Pessoas("9 Claudio", "99681-4556", "Rua Piaui, n 56, Centro, Florianopolis", "217.997.633-78");
        Pessoas pessoa10 = new Pessoas("10 ELiza", "3416-5952", "Avenida 18, n 89, Caladia, Buriti Alegre", "848.096.561-40");
        Pessoas pessoa11 = new Pessoas("11 Andre", "99874-6521", "Rua 256, Qd X, Vila Hosana, Goiania", "748.123.362-11");
        Pessoas pessoa12 = new Pessoas("12 Monica", "98561-2345", "Rua das Borboletas, n 694, Lirios, Rio Verde", "089.546.178-77");
        Pessoas pessoa13 = new Pessoas("13 Roberto", "3413-6911", "Alameda do Limoeiro, n 3, São Cristovao, Riberao Preto", "456.781.065-14");
        Pessoas pessoa14 = new Pessoas("14 Gabriela", "4428-9699", "Rua 18, n 3, Centro, Goiatuba", "097.615.126-99");
        Pessoas pessoa15 = new Pessoas("15 Luana", "9548-6611", "Avenida Brasil, n 78, Lagos, Goianesia", "265.078.124-19");
        Pessoas pessoa16 = new Pessoas("16 Miguel", "3416-8597", "Rua 33, n 89, Setor X, Morrinhos", "333.333.322-45");
        Pessoas pessoa17 = new Pessoas("17 Joana", "99658-4123", " Rua azul, n 36, Setor Sul, Corumbaiba", "098.987.876-65");
        Pessoas pessoa18 = new Pessoas("18 Selma", "3146-8529", "Rua 24, n 15, Bota Fogo, Caldas Novas", "569.214.337-86");
        Pessoas pessoa19 = new Pessoas("19 Carla", "99748-4111", "Avenida da Paz, n 56, Aeroporto", "781.636.125-98");
        Pessoas pessoa20 = new Pessoas("20 Pedro", "7894-6566", "Rua Campinas, n 78, Setor Cristo, Goiania", "987.635.165-45");

        Lista lista = new Lista();

        lista.addFinal(pessoa1);
        lista.addFinal(pessoa2);
        lista.addFinal(pessoa3);
        lista.addFinal(pessoa4);
        lista.addFinal(pessoa5);
        lista.addFinal(pessoa6);
        lista.addFinal(pessoa7);
        lista.addFinal(pessoa8);
        lista.addFinal(pessoa9);
        lista.addFinal(pessoa10);
        lista.addFinal(pessoa11);
        lista.addFinal(pessoa12);
        lista.addFinal(pessoa13);
        lista.addFinal(pessoa14);
        lista.addFinal(pessoa15);
        lista.addFinal(pessoa16);
        lista.addFinal(pessoa17);
        lista.addFinal(pessoa18);
        lista.addFinal(pessoa19);
        lista.addFinal(pessoa20);

        lista.sortear();
        System.out.println(lista.tamanho);

    }
}
