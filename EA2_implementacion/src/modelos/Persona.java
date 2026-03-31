package modelos;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int identificacion;

    public Persona(String nombre, String apellido, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
}