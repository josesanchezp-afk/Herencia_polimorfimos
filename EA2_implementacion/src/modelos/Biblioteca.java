package modelos;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<Libro>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private List<Prestamo> prestamos = new ArrayList<Prestamo>();

    public Biblioteca() { }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    private Libro buscarPorTitulo(String titulo) {
        for (Libro l: this.libros) {
            if (l.getTitulo().equals(titulo)) {
                return l;
            }
        }
        return null;
    }

    private Libro buscarPorAutor(String autor) {
        for (Libro l: this.libros) {
            if (l.getAutor().equals(autor)) {
                return l;
            }
        }
        return null;
    }

    public Libro buscar(String titulo) {
        return buscarPorTitulo(titulo);
    }

    public Libro buscar(String titulo, String autor) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) &&
                libro.getAutor().equalsIgnoreCase(autor)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(
            Usuario usuario,
            Libro libro
    ) {
        if (libro.getDisponible() && usuario.puedePrestar()) {
            Prestamo prestamo = new Prestamo(libro, usuario);
            prestamo.registrarPrestamo();

            this.prestamos.add(prestamo);

            System.out.println("Préstamo realizado");
        } else {
            System.out.println("No se puede realizar el préstamo");
        }
    }

    public void devolverLibro(
            Usuario usuario,
            Libro libro
    ) {
        for (Prestamo prestamo: prestamos) {
            if (!libro.getDisponible() && prestamo.getLibro() == libro && prestamo.getUsuario() == usuario) {
                prestamo.registrarDevolucion();

                System.out.println("Libro devuelto exitosamente");
                return;
            }
        }

        System.out.println("Error: no hay devolución pendiente");
    }
}
