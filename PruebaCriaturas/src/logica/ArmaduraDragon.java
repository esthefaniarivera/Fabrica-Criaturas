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
public class ArmaduraDragon implements ArmaduraAbstracta{
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

    public ArmaduraDragon() {
        this.descripcion = "una piel de impenetrables escamas de la dureza del acero. "
                + "Su único punto débil, el vientre, esta protegido casi por completo "
                + "por una capa de piedras preciosas y oro, incrustadas en su piel.";
        this.material = "Escamas y joyas";
    }
    
    
}
