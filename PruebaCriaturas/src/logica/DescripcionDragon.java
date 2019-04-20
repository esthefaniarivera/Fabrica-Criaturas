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
        this.descripcion = "Todos los dragones comparten una pasión por los tesoros "
                + "(especialmente el oro), la inteligencia sutil, la inmensa astucia, "
                + "la gran fuerza física, y un poder hipnótico llamado «encantamiento "
                + "de dragón». Son extremadamente poderosos y peligrosos, y crecen y "
                + "envejecen muy despacio. Pueden tanto caminar sobre sus cuatro "
                + "patas como volar con sus alas y expeler fuego.";
    }
    
}
