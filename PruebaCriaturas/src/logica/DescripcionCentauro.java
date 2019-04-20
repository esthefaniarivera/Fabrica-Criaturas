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
public class DescripcionCentauro implements DescripcionAbstracta{
    
    String descripcion;
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public DescripcionCentauro() {
        this.descripcion = "Son criaturas muy antiguas, las cuales eran consideradas "
                + "semihumanos con un cuerpo formado por una cabeza y torso de hombre "
                + "y de la cintura para debajo el cuerpo de un caballo, por lo que "
                + "contaban con seis extremidades dos manos y cuatro patas.  Estos"
                + " seres constan de una gran fuerza destacada por su parte animal, "
                + "siempre dispuestos a pelear.";
    }
    
    
}
