package Prac2_1_1.SetYGet;
import java.util.Scanner;

class Estudiante {
    String nombre;
    int matricula;
    double promedio;
    String email;
    int edad;

    // Constructor
    public Estudiante(String nombre, int matricula, double promedio, String email, int edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
        this.email = email;
        this.edad = edad;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }
}

public class Practica211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese el numero de estudiantes: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Estudiante[] estudiantes = new Estudiante[cantidad];
        for (int i = 0; i < 3; i++) {
        
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la matrícula del estudiante:");
            int matricula = scanner.nextInt();

            System.out.println("Ingrese el promedio del estudiante:");
            double promedio = scanner.nextDouble();

            scanner.nextLine(); 

            System.out.println("Ingrese el email del estudiante:");
            String email = scanner.nextLine();

            System.out.println("Ingrese la edad del estudiante: ");
            int edad= scanner.nextInt();

            estudiantes[i] = new Estudiante(nombre, matricula, promedio, email, edad);
        }
        // Imprimir los datos del estudiante
        for(Estudiante estudiante : estudiantes){
            System.out.println("\nDatos del estudiante:");
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Matrícula: " + estudiante.getMatricula());
            System.out.println("Promedio: " + estudiante.getPromedio());
            System.out.println("Email: " + estudiante.getEmail());
            System.out.println("Edad: "+ estudiante.getEdad());
        }
        // Cerrar el scanner
        scanner.close();
    }
}
