/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.Objects;

/**
 *
 * @author Joserra
 */
public class Alumnos extends Universitarios{
    
    String Centro;
    
    public Alumnos(String Nombre, String Direccion, String Centro) {
        super(Nombre, Direccion);
        this.Centro = Centro;
    }

    public String getCentro() {
        return Centro;
    }

    public void setCentro(String Centro) {
        this.Centro = Centro;
    }

    
    
    
}
