package Prac2_2_1;
import java.util.Scanner;

class persona {
    String nombre;
    int edad;
    String genero;
    String ocupacion;
    String direccion;

    public persona(String nombre, int edad, String genero, String ocupacion, String direccion) {
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

    public void comer(String comida, String nombre) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    public void dormir(int horas, String nombre) {
        System.out.println(nombre + " durmió durante " + horas + " horas");
    }

    public void hacerEjercicio(String tipoEjercicio, String nombre) {
        System.out.println(nombre + " hizo ejercicio de tipo " + tipoEjercicio);
    }
}

public class Persona {
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

        persona Persona = new persona(nombre, edad, genero, ocupacion, direccion);

        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + Persona.getNombre());
        System.out.println("Edad: " + Persona.getEdad());
        System.out.println("Género: " + Persona.getGenero());
        System.out.println("Ocupación: " + Persona.getOcupacion());
        System.out.println("Dirección: " + Persona.getDireccion());

        System.out.println("\nPruebas de comportamiento:");
        Persona.comer("pizza", nombre);
        Persona.dormir(8, nombre);
        Persona.hacerEjercicio("correr", nombre);

        scanner.close();
    }
}
