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
public class DescripcionElfo implements DescripcionAbstracta {

    String descripcion;

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public DescripcionElfo() {
        this.descripcion
                = "<html><justify> Físicamente, los Elfos envejecen de forma más lenta que los Hombres. A la edad de   <br>"
                + "cincuenta años, los Elfos alcanzan la apariencia que tendrán el resto de su vida, y   <br>"
                + "hasta los cien años no terminan de desarrollarse. <br>"
                + "Mentalmente, se desarrollan más rápido y aprenden a hablar y a andar con menos de <br>"
                + "un año. Tienen una visión muy superior a la de los Hombres  y ven perfectamente en la   <br>"
                + "oscuridad si ésta no es absoluta. Se recuperan más rápido de las heridas y no están sujetos"
                + " a las enfermedades.</html>";

    }

}
