package Prac2_1_1.SetGet;
import java.util.Scanner;

class Estudiante {
    String nombre;
    int matricula;
    double promedio;
    String email;
    int edad;
    

    public String setgetNombre(String nom) {
        nombre = nom;
        return nombre;
    }

    public int setgetMatricula(int mat){
        matricula = mat;
        return matricula;
    }

    public double setgetPromedio(double prom) {
        promedio = prom;
        return promedio;
    }

    public String setgetEmail(String em) {
        email = em;
        return email;
    }

    public int setgetEdad(int ed){
        edad = ed;
        return edad;
    }
}

public class Practica2112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nIngrese el numero de estudiantes: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Estudiante[] Est = new Estudiante[cantidad];

        for(int i = 0; i < cantidad; i++){
            
            Est[i] = new Estudiante();
            
            System.out.printf("\nIngrese los datos del estudiante #%d:\n", i+1);
            System.out.println();

            System.out.println("Ingrese nombre: ");
            String nombreEstudiante = Est[i].setgetNombre(scanner.nextLine());
            
            System.out.println("Ingrese matricula: ");
            int matriculaEstudiante = Est[i].setgetMatricula(scanner.nextInt());

            System.out.println("Ingrese el promedio: ");
            double promedioEstudiante = Est[i].setgetPromedio(scanner.nextDouble());
            scanner.nextLine();
            
            System.out.println("Ingrese el email");
            String emailEstudiante = Est[i].setgetEmail(scanner.nextLine());

            System.out.println("Ingrese la edad: ");
            int edadEstudiante = Est[i].setgetEdad(scanner.nextInt());
            scanner.nextLine(); // Consumir el salto de línea

            System.out.printf("\nDatos del estudiante #%d:\n", i+1);
            System.out.println("Nombre: "+ nombreEstudiante);
            System.out.println("Matricula: " + matriculaEstudiante);
            System.out.println("Promedio: " + promedioEstudiante);
            System.out.println("Email: " + emailEstudiante);
            System.out.println("Edad: " + edadEstudiante);
            System.out.println();
        }
        
        scanner.close();
    }
}
