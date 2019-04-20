/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author User
 */
public class Mazo implements ArmaAbstracta{
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

    public Mazo() {
        this.nombre = "Mazo:";
        this.descripcion = "Un mazo o combo es una herramienta de mano que sirve"
                          + " para golpear o percutir; tiene la forma de un martillo,"
                          + " pero es de mayor tamaño y peso.";
        this.tamaño = "1,5m a 2m";
        
    }
    
}
