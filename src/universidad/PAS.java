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
public class PAS extends Empleados{
    
    String UnidadAdministrativa;
    
    public PAS(String Nombre, String Direccion,String NumeroRegistro, String UnidadAdministrativa) {
        super(Nombre, Direccion, NumeroRegistro);
        this.UnidadAdministrativa = UnidadAdministrativa;
    }

    public String getUnidadAdministrativa() {
        return UnidadAdministrativa;
    }

    public void setUnidadAdministrativa(String UnidadAdministrativa) {
        this.UnidadAdministrativa = UnidadAdministrativa;
    }

    
    
}
