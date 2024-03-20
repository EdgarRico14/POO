package Prac2_2_1;
import java.util.Scanner;

class Persona {
    String nombre;
    int edad;
    String genero;
    String ocupacion;
    String direccion;

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

    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    public void dormir(int horas) {
        System.out.println(nombre + " durmió durante " + horas + " horas");
    }

    public void dormir2(String dia, String lugar, String ropa){

        System.out.println(nombre + " durmio el dia " + dia + " en " + lugar + " con " + ropa );
    }

    public void hacerEjercicio(String tipoEjercicio) {
        System.out.println(nombre + " hizo ejercicio de tipo " + tipoEjercicio);
    }
}

public class Practica221 {
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

        Persona Persona = new Persona(nombre, edad, genero, ocupacion, direccion);

        System.out.println("Ingrese la comida que la persona está comiendo:");
        String comida = scanner.nextLine();

        System.out.println("Ingrese las horas que durmió:");
        int horas = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ingrese el dia de la semana en que durmio: ");
        String dia = scanner.nextLine();
        System.out.println("Ingrese el lugar donde durmio: ");
        String lugar = scanner.nextLine();
        System.out.println("Ingrese el tipo de ropa con el que durmio: ");
        String ropa = scanner.nextLine();

        System.out.println("Ingrese el tipo de ejercicio que hizo:");
        String tipoEjercicio = scanner.nextLine();
        
        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + Persona.getNombre());
        System.out.println("Edad: " + Persona.getEdad());
        System.out.println("Género: " + Persona.getGenero());
        System.out.println("Ocupación: " + Persona.getOcupacion());
        System.out.println("Dirección: " + Persona.getDireccion());

        System.out.println("\nPruebas de comportamiento:");
        Persona.comer(comida);
        Persona.dormir(horas);
        Persona.dormir2(dia, lugar, ropa);
        Persona.hacerEjercicio(tipoEjercicio);

        scanner.close();
    }
}
