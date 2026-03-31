package modelos;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nombre, String apellido, int identificacion) {
        super(nombre, apellido, identificacion);
    }

    @Override
    public boolean puedePrestar() {
        return prestamos < 10;
    }
}