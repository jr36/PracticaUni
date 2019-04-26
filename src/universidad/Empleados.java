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
public class Empleados extends Universitarios{
    
    String NumeroRegistro;
    
    public Empleados(String Nombre, String Direccion, String NumeroRegistro) {
        super(Nombre, Direccion);
        this.NumeroRegistro = NumeroRegistro;
    }

    public String getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(String NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }

   
   
}
