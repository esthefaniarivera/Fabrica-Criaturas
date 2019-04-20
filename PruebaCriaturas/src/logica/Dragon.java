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
public class Dragon implements FabricaAbstracta{
    private GarraFuego arma;
    private ArmaduraDragon Armadura;
    private DescripcionDragon Descripcion;

    @Override
    public void crearArma() {
        arma = new GarraFuego();
    }

    @Override
    public void crearArmadura() {
       Armadura = new ArmaduraDragon();
    }
    
    @Override
    public void crearDescripcion() {
        Descripcion = new DescripcionDragon();
    }
    
    @Override
    public ArmaAbstracta getArma() {
        return arma;
    }


    @Override
    public ArmaduraAbstracta getArmadura() {
       return Armadura;
    }

    @Override
    public DescripcionAbstracta getDescripcion() {
       return Descripcion;
    }
     
    public Dragon() {
        this.crearArma();
        this.crearArmadura();
        this.crearDescripcion();
        this.getArma();
        this.getDescripcion();
        this.getArmadura();
    }
    
    
}
