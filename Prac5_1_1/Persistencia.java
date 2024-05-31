package Prac5_1_1;
import java.io.*;
import java.io.Serializable;

// Clase para representar un libro
class Libro implements Serializable {
    private String titulo;
    private String autor;
    private String isbn;

    // Constructor, getters y setters
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

// Clase para representar un miembro de la biblioteca
class Miembro implements Serializable {
    private String nombre;
    private String id;

    // Constructor, getters y setters
    public Miembro(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


public class Persistencia {
    public static void main(String[] args) {
        // Crear algunos objetos
        Libro libro = new Libro("Don Quijote", "Miguel de Cervantes", "978-3-16-148410-0");
        Miembro miembro = new Miembro("Juan Pérez", "12345");

        try {
            // Serializar los objetos
            FileOutputStream fos = new FileOutputStream("libro.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(libro);
            oos.close();
            fos.close();

            fos = new FileOutputStream("miembro.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(miembro);
            oos.close();
            fos.close();

            System.out.println("Los objetos han sido serializados");

            // Deserializar los objetos
            FileInputStream fis = new FileInputStream("libro.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Libro libroDeserializado = (Libro) ois.readObject();
            ois.close();
            fis.close();

            fis = new FileInputStream("miembro.ser");
            ois = new ObjectInputStream(fis);
            Miembro miembroDeserializado = (Miembro) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Los objetos han sido deserializados");
            System.out.println("Libro: " + libroDeserializado.getTitulo() + ", " + libroDeserializado.getAutor() + ", " + libroDeserializado.getIsbn());
            System.out.println("Miembro: " + miembroDeserializado.getNombre() + ", " + miembroDeserializado.getId());

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
}

