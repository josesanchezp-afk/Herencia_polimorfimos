import modelos.*;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Libros
        Libro libro1 = new Libro(1, "1984", "George Orwell", "Novela");
        Libro libro2 = new Libro(2, "El Hobbit", "Tolkien", "Fantasia");
        Libro libro3 = new Libro(3, "Cien años de soledad", "Gabriel García Márquez", "Novela");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Usuarios (Regular y Premium)
        Usuario usuario1 = new UsuarioRegular("Samuel", "Caicedo", 10004521);
        Usuario usuario2 = new UsuarioPremium("Emma", "Moreno", 10002536);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // 1. HERENCIA
        System.out.println("\n=== HERENCIA ===");
        System.out.println(usuario1.getNombreCompleto());
        System.out.println(usuario2.getNombreCompleto());

        // 2. POLIMORFISMO
        System.out.println("\n=== POLIMORFISMO ===");

        Usuario usuario3 = new UsuarioRegular("Ariana", "Ruiz", 10002589);
        Usuario usuario4 = new UsuarioPremium("Carlos", "Lopez", 999999);

        System.out.println("UsuarioRegular puede prestar: " + usuario3.puedePrestar());
        System.out.println("UsuarioPremium puede prestar: " + usuario4.puedePrestar());

        // Simular múltiples préstamos
        biblioteca.prestarLibro(usuario3, libro1);
        biblioteca.prestarLibro(usuario3, libro2);
        biblioteca.prestarLibro(usuario3, libro3);

        biblioteca.prestarLibro(usuario3, libro1);

        // 3. SOBRECARGA (OVERLOADING)
        System.out.println("\n=== SOBRECARGA ===");

        Libro encontrado1 = biblioteca.buscar("1984");
        System.out.println("Buscar por título: " + (encontrado1 != null ? encontrado1.getTitulo() : "No encontrado"));

        Libro encontrado2 = biblioteca.buscar("1984", "George Orwell");
        System.out.println("Buscar por título + autor: " + (encontrado2 != null ? encontrado2.getTitulo() : "No encontrado"));

        // 4. COMPORTAMIENTO NORMAL
        System.out.println("\n=== COMPORTAMIENTO NORMAL ===");

        biblioteca.prestarLibro(usuario2, libro1);
        biblioteca.devolverLibro(usuario2, libro1);
    }
}