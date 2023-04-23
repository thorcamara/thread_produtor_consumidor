/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author User
 */

public class Principal {

    public static void main(String[] args) {
        //Cria o recurso compartilhado entre produto e consumidor
        Compartilhado recurso = new Compartilhado();
        //Cria os consumidores
        Consumidor c1 = new Consumidor(recurso);
        Consumidor c2 = new Consumidor(recurso);
        //Define o tempo de atraso do consumidor
        c1.setTempo(750);
        c2.setTempo(1000);

        //Cria os produtor
        Produtor p1 = new Produtor(recurso);
        //Define o tempo de atraso do produto
        p1.setTempo(1000);

        //Cria as Threads dos consumidores e produtores
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(p1);
        Thread t3 = new Thread(c2);

        //Inicia as Threads
        t1.start();
        t2.start();
        t3.start();
    }
}
