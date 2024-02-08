import java.util.HashSet;
import java.util.Set;

public class Contacto {


    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean equals (Contacto x) {
        if(this.nombre.equalsIgnoreCase(x.getNombre())) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }


}
