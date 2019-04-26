
package universidad;

import java.util.Objects;

/**
 *
 * @author Joserra
 */
public class Universitarios {
    
    String Nombre, Direccion;
	
    public Universitarios(String Nombre, String Direccion) {
		
		this.Nombre = Nombre;	
		this.Direccion = Direccion;
	}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    
    
    
}
