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
public class DescripcionGigante implements DescripcionAbstracta{
    
    String descripcion;
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public DescripcionGigante() {
        this.descripcion =
                "<html><justify> Los gigantes miden entre tres y cinco metros. Tienen una gran fuerza y son capaces de <br>"
                + "realizar impresionantes proezas físicas. En apariencia están cubiertos de una especie    <br>"
                + "de piel peluda que es más gruesa debajo de la cintura. El pelaje de los gigantes se <br>"
                + "empieza a volver grisáceo al envejecer.  <br>"
                + "Las cabezas de los gigantes están inclinadas hacia adelante, con los hombros hacia   <br>"
                + "atrás. Poseen brazos largos que cuelgan más que los de un humano y piernas cortas  <br>"
                + "en comparación con su cuerpo. </html>";
    }
    
}
