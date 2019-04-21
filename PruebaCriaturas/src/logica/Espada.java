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
public class Espada implements ArmaAbstracta {

    String nombre;
    String descripcion;
    String tamaño;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String getTamaño() {
        return tamaño;
    }

    public Espada() {
        this.nombre = "Espada:";
        this.descripcion = "<html><justify> La espada es un arma blanca de dos filos que consiste básicamente en una<br>"
                + "hoja recta cortante, punzante —o con ambas características—, con empuñadura, <br> "
                + " y de cierta envergadura o marca.<br>"
                + "Espada Larga: 90cm a 120cm, Espada Corta:40cm a 60cm </html>";
        this.tamaño = "Espada Larga: 90cm a 120cm, Espada Corta:40cm a 60cm";

    }
}
