package modelos;

public class UsuarioRegular extends Usuario {

    public UsuarioRegular(String nombre, String apellido, int identificacion) {
        super(nombre, apellido, identificacion);
    }

    @Override
    public boolean puedePrestar() {
        return prestamos < 3;
    }
}