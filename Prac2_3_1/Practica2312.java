package Prac2_3_1;

import java.util.Scanner;

class Persona {
    String nombre;
    int edad;
    String genero;
    private String ocupacion;
    protected String direccion;

    public Persona(String nombre, int edad, String genero, String ocupacion, String direccion) {
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        setOcupacion(ocupacion);
        setDireccion(direccion);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    protected void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
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

    private void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private void comer(String comida) {
        System.out.println(nombre + " comió " + comida);
    }

    protected void dormir(int horas) {
        System.out.println(nombre + " durmió durante " + horas + " horas");
    }

    private void tomarShower(String tipoJabon) {
        System.out.println(nombre + " se está bañando con " + tipoJabon);
    }

    // Métodos públicos intermediarios
    public void publicComer(String comida) {
        this.comer(comida);
    }

    public void publicDormir(int horas) {
        this.dormir(horas);
    }

    public void publicTomarShower(String tipoJabon) {
        this.tomarShower(tipoJabon);
    }
}

public class Practica2312{
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

        Persona persona1 = new Persona(nombre, edad, genero, ocupacion, direccion);

        System.out.println("Ingrese la comida que la persona está comiendo:");
        String comida = scanner.nextLine();

        System.out.println("Ingrese las horas que durmió:");
        int horas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese lo que utilizó para bañarse:");
        String objeto = scanner.nextLine();
        
        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Género: " + persona1.getGenero());
        System.out.println("Ocupación: " + persona1.getOcupacion());
        System.out.println("Dirección: " + persona1.getDireccion());
    
        System.out.println("\nPruebas de comportamiento:");
        persona1.publicComer(comida);
        persona1.publicDormir(horas);
        persona1.publicTomarShower(objeto); 

        scanner.close();
    }
}

