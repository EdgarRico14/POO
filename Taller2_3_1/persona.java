package Taller2_3_1;
import java.util.Scanner;

class persona {
    protected String nombre;
    private int edad;
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

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
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
        System.out.println(nombre + " comió " + comida);
    }

    protected void dormir(int horas) {
        System.out.println(nombre + " durmió durante " + horas + " horas");
    }

    private void tomarShower(String tipoJabon) {
        System.out.println(nombre + " se está bañando con " + tipoJabon);
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

        persona persona = new persona(nombre, edad, genero, ocupacion, direccion);

        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Ocupación: " + persona.getOcupacion());
        System.out.println("Dirección: " + persona.getDireccion());

        System.out.println("\nPruebas de comportamiento:");
        persona.comer("pozole");
        persona.dormir(6);
        persona.tomarShower("jabón de aloe vera"); 

        scanner.close();
    }
}