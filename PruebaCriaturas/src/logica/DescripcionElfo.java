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
public class DescripcionElfo implements DescripcionAbstracta{
    
    String descripcion;
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public DescripcionElfo() {
        this.descripcion = "Físicamente, los Elfos envejecen de forma más lenta que"
                + " los Hombres, aunque en los primeros años, su apariencia puede "
                + "confundirse fácilmente. A la edad de cincuenta años, los Elfos "
                + "alcanzan la apariencia que tendrán el resto de su vida, y hasta "
                + "los cien años no terminan de desarrollarse, cuando la mayoría de "
                + "los Hombres ya habría muerto. Mentalmente, se desarrollan más "
                + "rápido y aprenden a hablar y a andar con menos de un año.\n" +
                 "\n"  +
                  "Los Elfos tienen una visión muy superior a la de los Hombres  y "
                + "ven perfectamente en la oscuridad si ésta no es absoluta. Son más "
                + "hábiles que las demás razas. Se recuperan más rápido de las heridas "
                + "y no están sujetos a las enfermedades.";
    }
    
}
