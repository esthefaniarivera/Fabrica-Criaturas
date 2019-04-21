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
public class ArmaduraHierro implements ArmaduraAbstracta{
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

    public ArmaduraHierro() {
        this.descripcion = "<html><justify>Peto y yelmo que cubren su parte humana la cual es la mas vulnerable.<br>"
                + "Está hecha de hierro negro especial y te protege de los ataques de fuego. Pesa mucho.</html>";
        this.material = "<html><justify> Hierro: resistencia al desgaste, dureza y resistencia."
                + " a determinadas temperaturas.</html>";
    }
    
}
