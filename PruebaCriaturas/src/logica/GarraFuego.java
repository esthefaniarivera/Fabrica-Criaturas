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
public class GarraFuego implements ArmaAbstracta{
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

    public GarraFuego() {
        this.nombre = "Garras y Fuego:";
        this.descripcion = "Garras: Son las manos o pies provistos de uñas largas "
                + "y afiladas; Fuego: Fluido volatil imposible de apagar, puede arder "
                + "sobre el agua.";
        this.tamaño = "Garras: Un dragon adulto llega a tener garras de "
                + "aproximadamente 40cm; Fuego: Rango de 7m a 8m";
        
    }
    
}
