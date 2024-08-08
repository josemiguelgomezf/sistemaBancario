package com.mycompany.practicalaboratorio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoseMiguelGomezFernandez
 */
public class Cliente extends Thread {

    private final String id;
    private final String tipoTransaccion;
    private final Cajero cajero1;
    private final Cajero cajero2;
    private final Cajero cajero3;
    private final Cajero cajero4;
    private int cantidad;

    public Cliente(String id, String tipoTransaccion,
                 Cajero cajero1, Cajero cajero2, Cajero cajero3, Cajero cajero4) {
        this.id = id;
        this.tipoTransaccion = tipoTransaccion;
        this.cajero1 = cajero1;
        this.cajero2 = cajero2;
        this.cajero3 = cajero3;
        this.cajero4 = cajero4;
    }

    @Override
    public void run() {
        int valorEntero = (int) (Math.floor(Math.random() * (3 - 1 + 1) + 0)); // Valor entre M y N, ambos incluidos.
        int tiempoTransaccion;

        if (tipoTransaccion.equals("ingreso")) {
            cantidad = (int) (Math.random() * (10000 - 5000 + 1) + 5000);
            tiempoTransaccion = (int) (Math.floor(Math.random() * (4 - 2 + 1) + 2));
        } else {
            cantidad = (int) (Math.random() * (10000 - 5000 + 1) + 5000);
            tiempoTransaccion = (int) (Math.floor(Math.random() * (4.5 - 2.5 + 1) + 2.5));
        }

        Cajero[] cajeros = {cajero1, cajero2, cajero3, cajero4};
        Cajero cajero = cajeros[valorEntero];

        // Realiza la transacción
        if (tipoTransaccion.equals("ingreso")) {
            try {
                cajero.ingresar(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Persona"+id+"-I+"+cantidad);
        } else {
            try {
                cajero.extraer(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Persona"+id+"-E-"+cantidad);
        }

        // Espera el tiempo de la transacción
        try {
            Thread.sleep(tiempoTransaccion * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }


    public int getCantidad() {
        return cantidad;
    }
}

