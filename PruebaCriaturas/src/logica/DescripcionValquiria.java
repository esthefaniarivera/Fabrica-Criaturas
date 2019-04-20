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
public class DescripcionValquiria implements DescripcionAbstracta{
    
    String descripcion;
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public DescripcionValquiria() {
        this.descripcion = "Las valquirias son diosas de la mitología nórdica, hijas"
                + " de Odín y poderosos espectros guerreros.\n" +
                  "\n" +
                  "Tienen el aspecto de una joven y bella guerrera nórdica; alta, "
                + "con marcada musculatura, ojos grandes y azules, cabello rubio, largo"
                + " y trenzado. Les gusta ir ataviadas con cascos de guerra con cuernos.\n" +
                  "\n" +
                  "Suelen cabalgar a lomos de caballos voladores y son unas amazonas "
                + "fabulosas. Son hábiles principalmente con la lanza. Su fuerza es "
                + "sobrehumana, divina, al igual que su resistencia y agilidad.";
    }
    
}
