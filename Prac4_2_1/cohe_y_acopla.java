package Prac4_2_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Cohesión dentro de una clase
class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) { // Cohesión: Este método está relacionado con la creación de un libro.
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() { // Cohesión: Este método está relacionado con la obtención de información de un libro.
        return titulo;
    }

    public String getAutor() { // Cohesión: Este método está relacionado con la obtención de información de un libro.
        return autor;
    }

    public boolean estaDisponible() { // Cohesión: Este método está relacionado con la obtención de información de un libro.
        return disponible;
    }

    public void prestar() { // Cohesión: Este método está relacionado con la modificación del estado de un libro.
        if (disponible) {
            disponible = false;
        }
    }

    public void devolver() { // Cohesión: Este método está relacionado con la modificación del estado de un libro.
        if (!disponible) {
            disponible = true;
        }
    }
}

// Acoplamiento entre clases
class Biblioteca {
    private List<Libro> libros; // Acoplamiento: Esta línea muestra el acoplamiento ya que la clase Biblioteca utiliza la clase Libro.

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) { // Acoplamiento: Este método muestra el acoplamiento ya que la clase Biblioteca utiliza la clase Libro.
        libros.add(libro);
    }

    public Libro buscarPorTitulo(String titulo) { // Acoplamiento: Este método muestra el acoplamiento ya que la clase Biblioteca utiliza la clase Libro.
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
}


public class cohe_y_acopla {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");

        // Crear una biblioteca y agregar los libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Solicitar al usuario que introduzca el título del libro que desea buscar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el título del libro que deseas buscar:");
        String tituloBuscado = scanner.nextLine();

        // Buscar el libro por título
        Libro libroBuscado = biblioteca.buscarPorTitulo(tituloBuscado);
        if (libroBuscado != null && libroBuscado.estaDisponible()) {
            System.out.println("El libro " + libroBuscado.getTitulo() + " está disponible.");
        } else {
            System.out.println("El libro no está disponible o no se encuentra en la biblioteca.");
        }

        scanner.close();
    }
}

