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
public interface FabricaAbstracta {
    public void crearArma();
    public void crearArmadura();
    public void crearDescripcion();
    public ArmaAbstracta getArma();
    public ArmaduraAbstracta getArmadura();
    public DescripcionAbstracta getDescripcion();
    
}
