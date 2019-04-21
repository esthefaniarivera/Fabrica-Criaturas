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
public class ArmaduraCuero implements ArmaduraAbstracta {

    String descripcion;
    String material;

    @Override
    public String getDescripccion() {
        return descripcion;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    public ArmaduraCuero() {
        this.descripcion
                = "<html><justify>Las diferentes placas de piel (que suelen ser de 3 a 4 mm de grosor), se cosen a <br>"
                + "mano con hilo encerado o más habitualmente, se remachan con remaches metálicos.  <br>"
                + "Estas armaduras pueden ser de muchas formas, debido a la flexibilidad del cuero </html>";
        this.material = "<html><justify>"
                + "Pieles: La piel es un material flexible y cálido, de origen animal, obtenido con el curtido <br>"
                + " de la piel.</html>";
    }

}
