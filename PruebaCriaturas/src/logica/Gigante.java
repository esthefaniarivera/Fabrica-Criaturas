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
public class Gigante implements FabricaAbstracta{
    private Mazo arma;
    private ArmaduraCuero Armadura;
    private DescripcionGigante Descripcion;

    @Override
    public void crearArma() {
        arma = new Mazo();
    }

    @Override
    public void crearArmadura() {
       Armadura = new ArmaduraCuero();
    }
    
    @Override
    public void crearDescripcion() {
        Descripcion = new DescripcionGigante();
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
     
    public Gigante() {
        this.crearArma();
        this.crearArmadura();
        this.crearDescripcion();
        this.getArma();
        this.getDescripcion();
        this.getArmadura();
    }
    
    
}
