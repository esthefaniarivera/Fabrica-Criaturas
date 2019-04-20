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
public class Centauro implements FabricaAbstracta{
    private Arco arma;
    private ArmaduraCuero Armadura;
    private DescripcionCentauro descripcion;

    @Override
    public void crearArma() {
        arma = new Arco();
    }

    @Override
    public void crearArmadura() {
       Armadura = new ArmaduraCuero();
    }
    
    @Override
    public void crearDescripcion() {
        descripcion = new DescripcionCentauro();
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
       return descripcion;
    }
     
     public Centauro() {
        this.crearArma();
        this.crearArmadura();
        this.crearDescripcion();
        this.getArma();
        this.getDescripcion();
        this.getArmadura();
    }
    
}
