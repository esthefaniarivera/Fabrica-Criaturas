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
public class DescripcionDragon implements DescripcionAbstracta{
    
    String descripcion;
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public DescripcionDragon() {
        this.descripcion = "<html><justify> Todos los dragones comparten una pasión por los tesoros (especialmente el oro), <br>"
                + "la inteligencia sutil, la inmensa astucia, la gran fuerza física, y un poder hipnótico <br>"
                + "llamado «encantamiento de dragón». Son extremadamente poderosos y peligrosos, <br>"
                + "crecen y envejecen muy despacio. Pueden tanto caminar  sobre sus cuatro patas <br>"                
                + "como volar con sus alas y expeler fuego.</html>";
    }
    
}
