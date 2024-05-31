package Prac5_2_1;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Clase para representar una película
class Pelicula {
    private String titulo;
    private int boletosDisponibles;
    private Lock lock = new ReentrantLock();

    // Constructor, getters y setters
    public Pelicula(String titulo, int boletosDisponibles) {
        this.titulo = titulo;
        this.boletosDisponibles = boletosDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getBoletosDisponibles() {
        return boletosDisponibles;
    }

    public void setBoletosDisponibles(int boletosDisponibles) {
        this.boletosDisponibles = boletosDisponibles;
    }

    // Método para reservar boletos
    public boolean reservarBoletos(int cantidad) {
        lock.lock();
        try {
            if (cantidad <= getBoletosDisponibles()) {
                setBoletosDisponibles(getBoletosDisponibles() - cantidad);
                return true;
            } else {
                return false;
            }
        } finally {
            lock.unlock();
        }
    }
}

// Clase para representar un usuario
class Usuario implements Runnable {
    private String nombre;
    private Pelicula pelicula;
    private int boletosDeseados;

    // Constructor, getters y setters
    public Usuario(String nombre, Pelicula pelicula, int boletosDeseados) {
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.boletosDeseados = boletosDeseados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getBoletosDeseados() {
        return boletosDeseados;
    }

    public void setBoletosDeseados(int boletosDeseados) {
        this.boletosDeseados = boletosDeseados;
    }

    @Override
    public void run() {
        if (getPelicula().reservarBoletos(getBoletosDeseados())) {
            System.out.println(getNombre() + " ha reservado " + getBoletosDeseados() + " boletos para " + getPelicula().getTitulo());
        } else {
            System.out.println(getNombre() + " no pudo reservar " + getBoletosDeseados() + " boletos para " + getPelicula().getTitulo());
        }
    }
}

// Clase principal
public class Concurrencia {
    public static void main(String[] args) {
        // Crear una película y algunos usuarios
        Pelicula pelicula = new Pelicula("Avatar", 10);
        Usuario usuario1 = new Usuario("Juan", pelicula, 5);
        Usuario usuario2 = new Usuario("Pedro", pelicula, 6);

        // Crear hilos para los usuarios
        Thread hilo1 = new Thread(usuario1);
        Thread hilo2 = new Thread(usuario2);

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
    }
}

