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
public class DescripcionValquiria implements DescripcionAbstracta {

    String descripcion;

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public DescripcionValquiria() {
        this.descripcion = "<html><justify> Las valquirias son diosas de la mitología nórdica, hijas de Odín y poderosos<br>"
                + "espectros guerreros.<br>"
                + "Tienen el aspecto de una joven y bella guerrera nórdica; alta, con marcada musculatura, <br>"
                + "ojos grandes y azules, cabello rubio, largo y trenzado. Les gusta ir ataviadas con cascos <br>"
                + "de guerra con alas. Suelen cabalgar a lomos de caballos voladores y son unas<br>"
                + "amazonas fabulosas. Son hábiles principalmente con la lanza. Su fuerza es <br>"
                + "sobrehumana, divina, al igual  que su resistencia y agilidad.</html>";
                
    }

}
