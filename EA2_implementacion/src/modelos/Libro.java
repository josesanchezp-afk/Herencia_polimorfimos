package modelos;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponible;

    // Constructor
    public Libro(
        int id,
        String titulo,
        String autor,
        String genero
    ) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = true;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + this.id +
                ", titulo='" + this.titulo + '\'' +
                ", autor='" + this.autor + '\'' +
                ", genero='" + this.genero + '\'' +
                ", disponible=" + (this.disponible ? "SI" : "NO") +
                '}';
    }
}
