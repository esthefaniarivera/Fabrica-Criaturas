/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author ESTEFA
 */
public class Arco implements ArmaAbstracta {

    String nombre;
    String descripcion;
    String tamaño;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDescripcion() {
       return descripcion;
    }

    @Override
    public String getTamaño() {
       return tamaño; 
    }

    public Arco() {
        this.nombre = "Arco y Flecha:";
        this.descripcion = "Un arco es un arma flexible que dispara proyectiles \n"
                + "aerodinámicos denominados flechas. Una cuerda o lazo se une a \n"
                + "los dos extremos del arco y cuando la cuerda se estira en varias \n"
                + "ocasiones, los extremos del arco se flexionan. Cuando se libera \n"
                + "la cuerda, la energía potencial generada por la flexión del arco \n"
                + "se transforma en la velocidad de la flecha. \n";
        this.tamaño = "2m";
        
    }

}
