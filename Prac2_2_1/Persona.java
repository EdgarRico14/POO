package Prac2_2_1;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String ocupacion;
    private String direccion;

    public Persona(String nombre, int edad, String genero, String ocupacion, String direccion) {
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        setOcupacion(ocupacion);
        setDireccion(direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static void comer(String comida, String nombre) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    public void dormir(int horas, String nombre) {
        System.out.println(nombre + " durmió durante " + horas + " horas");
    }

    public void hacerEjercicio(String tipoEjercicio, String nombre) {
        System.out.println(nombre + " hizo ejercicio de tipo " + tipoEjercicio);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ingrese el género de la persona:");
        String genero = scanner.nextLine();

        System.out.println("Ingrese la ocupación de la persona:");
        String ocupacion = scanner.nextLine();

        System.out.println("Ingrese la dirección de la persona:");
        String direccion = scanner.nextLine();

        Persona persona = new Persona(nombre, edad, genero, ocupacion, direccion);

        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Ocupación: " + persona.getOcupacion());
        System.out.println("Dirección: " + persona.getDireccion());
        
        System.out.println("\nPruebas de comportamiento:");
        Persona.comer("pizza", nombre);
        persona.dormir(8, nombre);
        persona.hacerEjercicio("correr", nombre);

        scanner.close();
    }
}
