package modelos;

public abstract class Usuario extends Persona {
    protected int prestamos;

    public Usuario(
        String nombre,
        String apellido,
        int identificacion
    ) {
        super(nombre, apellido, identificacion);
        this.prestamos = 0;
    }

    public void prestarLibro(Libro libro) {
        if (puedePrestar()) {
            this.prestamos++;
            libro.prestar();
        } else {
            System.out.println("No se le puede pestar más de 3 libros.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (this.prestamos > 0) {
            this.prestamos--;
            libro.devolver();
        } else {
            System.out.println("Error: el usuario no tiene libros prestados.");
        }
    }

    public abstract boolean puedePrestar();
}
