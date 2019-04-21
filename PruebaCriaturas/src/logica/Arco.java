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
        this.descripcion = "<html><justify> Un arco es un arma flexible que dispara proyectiles aerodinámicos denominados<br>"
                + "flechas. Una cuerda o lazo se une a los dos extremos del arco y cuando la cuerda se <br>"
                + "estira en varias ocasiones, los extremos del arco se flexionan. <br>"
                + "Cuando se libera la cuerda, la energía potencial generada por la flexión del arco<br>"
               
                + "se transforma en la velocidad de la flecha.<br>"
                + "Tamaño arco: 2m</html>";
        this.tamaño = "2m";
        
    }

}
