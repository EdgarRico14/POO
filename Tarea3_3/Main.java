package Tarea3_3;
import java.util.Date;

abstract class MaterialBibliografico {
    String titulo;
    String autor;
    Date fechaPublicacion;

    abstract void detalles();
}

interface Prestable {
    void prestar();
    void devolver();
}

class Libro extends MaterialBibliografico implements Prestable {
    int numeroPaginas;
    String generoLiterario;

    @Override
    void detalles() {
        // Implementación del método detalles
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de Publicación: " + fechaPublicacion);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Género Literario: " + generoLiterario);
    }

    @Override
    public void prestar() {
        // Implementación del método prestar
        System.out.println("El libro " + titulo + " ha sido prestado.");
    }

    @Override
    public void devolver() {
        // Implementación del método devolver
        System.out.println("El libro " + titulo + " ha sido devuelto.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Libro
        Libro libro = new Libro();

        // Establecer los atributos del libro
        libro.titulo = "Don Quijote de la Mancha";
        libro.autor = "Miguel de Cervantes";
        libro.fechaPublicacion = new Date();
        libro.numeroPaginas = 1000;
        libro.generoLiterario = "Novela";

        // Llamar a los métodos del libro
        libro.detalles();
        libro.prestar();
        libro.devolver();
    }
}
