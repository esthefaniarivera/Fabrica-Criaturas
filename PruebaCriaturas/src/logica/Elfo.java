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
public class Elfo implements FabricaAbstracta{
    private Espada arma;
    private ArmaduraMithril Armadura;
    private DescripcionElfo Descripcion;

    @Override
    public void crearArma() {
        arma = new Espada();
    }

    @Override
    public void crearArmadura() {
       Armadura = new ArmaduraMithril();
    }
    
    @Override
    public void crearDescripcion() {
        Descripcion = new DescripcionElfo();
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
     
    public Elfo() {
        this.crearArma();
        this.crearArmadura();
        this.crearDescripcion();
        this.getArma();
        this.getDescripcion();
        this.getArmadura();
    }
    
    
}
    

