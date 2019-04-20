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
public class Lanza implements ArmaAbstracta{
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

    public Lanza() {
        this.nombre = "Lanza:";
        this.descripcion = "La lanza es un arma de asta compuesta por distintos"
                         + "materiales, madera o metal, en una de cuyas extremidades "
                         + "tiene una hoja afilada o puntiaguda de distintos materiales.";
        this.tamaño = "2,5m a 7m";
        
    }
    
}
