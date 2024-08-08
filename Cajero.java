package com.mycompany.practicalaboratorio;

import java.util.concurrent.Semaphore;

/**
 *
 * @author laufe
 */
public class Cajero {

    private final int id;
    private double saldo;
    private final Semaphore cajeroOcupado;

    public Cajero(int id) {
        this.id = id;
        this.saldo = 50000;
        this.cajeroOcupado = new Semaphore(1);
    }

    public void ingresar(int cantidad) throws InterruptedException {
        // Espera a que el cajero esté libre
        cajeroOcupado.acquire();

        // Realiza la transacción
            saldo += cantidad;
        System.out.println("Saldo actual del cajero "+id+":"+saldo);    

        // Libera el cajero
        cajeroOcupado.release();
    }

    public void extraer(int cantidad) throws InterruptedException {
        // Espera a que el cajero esté libre
        cajeroOcupado.acquire();

        // Realiza la transacción

                saldo -= cantidad;
        System.out.println("Saldo actual del cajero "+id+":"+saldo);    
        // Libera el cajero
        cajeroOcupado.release();
    }
}
