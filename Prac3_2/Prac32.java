package Prac3_2;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

abstract class Libro {
    protected String titulo;
    protected String autor;
    protected String añoPublicacion;

    public abstract String getTitulo();
    public abstract void setTitulo(String titulo);
    public abstract String getAutor();
    public abstract void setAutor(String autor);
    public abstract String getAñoPublicacion();
    public abstract void setAñoPublicacion(String añoPublicacion);
}

class LibroImpreso extends Libro {
    public LibroImpreso(String titulo, String autor, String añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getAñoPublicacion() {
        return this.añoPublicacion;
    }

    @Override
    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
}

public class Prac32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Introduce el autor del libro:");
        String autor = scanner.nextLine();

        // Obtener el año actual
        String añoPublicacion = new SimpleDateFormat("yyyy").format(new Date());

        LibroImpreso libro = new LibroImpreso(titulo, autor, añoPublicacion);

        System.out.println("\nTitulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de Publicación: " + libro.getAñoPublicacion());

        scanner.close();
    }
}
