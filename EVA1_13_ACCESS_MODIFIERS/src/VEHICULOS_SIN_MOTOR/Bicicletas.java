/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VEHICULOS_SIN_MOTOR;

import eva1_13_access_modifiers.Automovil;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Bicicletas {
    private int rodada;
    private String marca;
    private double precio;

    public int getRodada() {
        Automovil miCarro = new Automovil();
        //miCarro. no puedo usar método default imprimirMensaje();
        //Carreta miCarreta = new Carreta (); No podemos ver esta clase, es Default, esta en otro paquete 
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
