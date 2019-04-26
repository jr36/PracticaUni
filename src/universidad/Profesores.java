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
public class Profesores extends Empleados{
    
    String Departamento;
    
    public Profesores(String Nombre, String Direccion, String NumeroRegistro, String Departamento) {
        super(Nombre, Direccion, NumeroRegistro);
        this.Departamento = Departamento;
    }   

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

  
}
