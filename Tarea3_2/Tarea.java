package Tarea3_2;
abstract class Libro {
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;

    public abstract String getTitulo();
    public abstract void setTitulo(String titulo);
    public abstract String getAutor();
    public abstract void setAutor(String autor);
    public abstract int getAñoPublicacion();
    public abstract void setAñoPublicacion(int añoPublicacion);
}

interface Prestable {
    void prestar();
    void devolver();
    boolean estaPrestado();
}

class LibroImpreso extends Libro implements Prestable {
    private boolean prestado;

    public LibroImpreso(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.prestado = false;
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
    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    @Override
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }
}

public class Tarea {
    public static void main(String[] args) {
        LibroImpreso libro = new LibroImpreso("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        System.out.println("Titulo: " + libro.getTitulo());
        libro.setTitulo("El ingenioso hidalgo Don Quijote de la Mancha");
        System.out.println("Nuevo Titulo: " + libro.getTitulo());

        System.out.println("Autor: " + libro.getAutor());
        libro.setAutor("Cervantes");
        System.out.println("Nuevo Autor: " + libro.getAutor());

        System.out.println("Año de Publicación: " + libro.getAñoPublicacion());
        libro.setAñoPublicacion(1615);
        System.out.println("Nuevo Año de Publicación: " + libro.getAñoPublicacion());

        System.out.println("¿Está prestado? " + (libro.estaPrestado() ? "Sí" : "No"));
        libro.prestar();
        System.out.println("¿Está prestado? " + (libro.estaPrestado() ? "Sí" : "No"));
        libro.devolver();
        System.out.println("¿Está prestado? " + (libro.estaPrestado() ? "Sí" : "No"));
    }
}

