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
        this.descripcion = 
                "<html><justify>El casco presenta un diseño propio nórdico, poseyendo dos alas a los <br>"
                + "costados; la pechera protege casi completamente hasta la boca del estómago<br> "
                + "y a su vez se une a la cintura, la cual provee una protección central; a sus <br>"
                + "costados posee dos grandes alas que llegan a proteger hasta las  rodillas, las <br> "
                + "cuales se encuentran ubicadas en la parte superior de las piernas, que<br>"
                + "presentan una protección completa; los brazos presentan un diseño “simple”  <br> "
                + "que protege hasta los codos; aunque estas están formadas por unas “alas”; la <br>"
                + "armadura también presenta un grupo de alas de gran tamaño que llegan  hasta<br>"
                + " la cintura. </html>";
        this.material = 
                "<html><justify>"
                + "Uru: Mineral exclusivo de Nidavellir parecido a la piedra. Es muy duradero y conserva<br> "
                + "encantamientos muy bien. La apariencia del mineral de metal Uru es en dos formas,<br>"
                + " una como \" oro metálico \" (Gungnir, Stormbreaker) y la otra con un brillo  que se ha <br> "
                + " descrito como \" hierro mal forjado \" (Mjolnir). Cuando Uru está encantado, se vuelve <br>"
                + "  mucho más duradero.</html>";
    }
    
}
