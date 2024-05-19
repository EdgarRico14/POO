package Prac3_3;
import java.util.Date;
import java.util.Scanner;

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
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de Publicación: " + fechaPublicacion);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Género Literario: " + generoLiterario);
    }

    @Override
    public void prestar() {
        System.out.println("El libro " + titulo + " ha sido prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("El libro " + titulo + " ha sido devuelto.");
    }
}

public class Prac33 {
    public static void main(String[] args) {
        // Crear una instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de Libro
        Libro libro = new Libro();

        // Pedir al usuario que introduzca los atributos del libro
        System.out.println("Introduce el título del libro:");
        libro.titulo = scanner.nextLine();

        System.out.println("Introduce el autor del libro:");
        libro.autor = scanner.nextLine();

        libro.fechaPublicacion = new Date();

        System.out.println("Introduce el número de páginas del libro:");
        libro.numeroPaginas = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Introduce el género literario del libro:");
        libro.generoLiterario = scanner.nextLine();

        // Llamar a los métodos del libro
        libro.detalles();
        libro.prestar();
        libro.devolver();

        // Cerrar el scanner
        scanner.close();
    }
}

