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
public class Valquiria implements FabricaAbstracta{
    private Lanza arma;
    private ArmaduraUru Armadura;
    private DescripcionValquiria Descripcion;

    @Override
    public void crearArma() {
        arma = new Lanza();
    }

    @Override
    public void crearArmadura() {
       Armadura = new ArmaduraUru();
    }
    
    @Override
    public void crearDescripcion() {
        Descripcion = new DescripcionValquiria();
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
     
    public Valquiria() {
        this.crearArma();
        this.crearArmadura();
        this.crearDescripcion();
        this.getArma();
        this.getDescripcion();
        this.getArmadura();
    }
    
    
}
