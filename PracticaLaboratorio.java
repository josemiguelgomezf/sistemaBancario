/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicalaboratorio;

/**
 *
 * @author laufe
 */
public class PracticaLaboratorio {

       public static void main(String[] args) throws InterruptedException {

        // Crea 4 cajeros
        Cajero[] cajeros = new Cajero[4];
        for (int i = 0; i < cajeros.length; i++) {
            cajeros[i] = new Cajero(i);
        }

        // Crea 200 clientes
        Cliente[] clientes = new Cliente[200];
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente(""+i, "ingreso", cajeros[0], cajeros[1], cajeros[2], cajeros[3]);
        }

        // Arranca los clientes de forma escalonada
        for (int i = 0; i < clientes.length; i++) {
            Thread.sleep(1000 * i);
            clientes[i].start();
        }

        // Espera a que todos los clientes terminen
        for (Cliente cliente : clientes) {
            cliente.join();
        }
    }
}
