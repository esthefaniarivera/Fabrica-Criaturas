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
public class ArmaduraUru implements ArmaduraAbstracta{
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

    public ArmaduraUru() {
        this.descripcion = "El casco presenta un diseño propio nórdico, poseyendo"
                + " dos alas a los costados del mismo; la pechera protege casi completamente "
                + "hasta la boca del estómago y a su vez se une a la cintura, la cual "
                + "provee una protección central; a sus costados posee dos grandes "
                + "alas que llegan a proteger hasta las rodillas, las cuales se encuentran "
                + "ubicadas en la parte superior de las piernas, que presentan una "
                + "protección completa; los brazos presenta un diseño “simple” que "
                + "protege hasta los codos; las hombreras parecen poseer un diseño "
                + "similar al de Cloth de Acuario, aunque estas están formadas por"
                + " unas “alas”; la armadura también presenta un grupo de alas de "
                + "gran tamaño que llegan hasta la cintura y una lanza de gran tamaño "
                + "y de un hermoso diseño, al igual que la armadura.";
        this.material = "Uru: Mineral exclusivo de Nidavellir parecido a la piedra. "
                + "Es muy duradero y conserva encantamientos muy bien. La apariencia"
                + " del mineral de metal Uru es en dos formas, una como \" oro metálico \" "
                + "(Gungnir, Stormbreaker) y la otra con un brillo que se ha descrito como "
                + "\" hierro mal forjado \" (Mjolnir). Cuando Uru está encantado, "
                + "se vuelve mucho más duradero.";
    }
    
}
