package modelos;

import java.util.Date;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(
        Libro libro,
        Usuario usuario
    ) {
        this.libro = libro;
        this.usuario = usuario;
    }

    public void registrarPrestamo() {
        this.fechaPrestamo = new Date();

        this.usuario.prestarLibro(this.libro);
    }

    public void registrarDevolucion() {
        this.fechaDevolucion = new Date();
        this.usuario.devolverLibro(this.libro);
    }

    public Libro getLibro() {
        return this.libro;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }
}
