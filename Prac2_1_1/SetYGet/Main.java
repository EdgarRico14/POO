package Prac2_1_1.SetYGet;
import java.util.Scanner;

class Alumno {
    private String nombre;
    private int matricula;
    private double promedio;
    private String email;

    // Constructor
    public Alumno(String nombre, int matricula, double promedio, String email) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
        this.email = email;
    }

    // Getters and setters for Alumno class
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
}

class Materia {
    private String nombre;
    private String clave;
    private int creditos;
    private String etapa;
    private String tipo;

    // Constructor
    public Materia(String nombre, String clave, int creditos, String etapa, String tipo) {
        setNombre(nombre);
        setClave(clave);
        setCreditos(creditos);
        setEtapa(etapa);
        setTipo(tipo);
    }

    // Getters and setters for Materia class
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Profesor {
    private String nombre;
    private int numeroEmpleado;
    private String grado;
    private String email;

    // Constructor
    public Profesor(String nombre, int numeroEmpleado, String grado, String email) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.grado = grado;
        this.email = email;
    }

    // Getters and setters for Profesor class
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar los datos de los alumnos
        Alumno[] alumnos = new Alumno[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la matrícula del alumno " + (i+1) + ":");
            int matricula = scanner.nextInt();

            System.out.println("Ingrese el promedio del alumno " + (i+1) + ":");
            double promedio = scanner.nextDouble();

            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("Ingrese el email del alumno " + (i+1) + ":");
            String email = scanner.nextLine();

            alumnos[i] = new Alumno(nombre, matricula, promedio, email);
        }

        // Capturar los datos de la materia
        Materia[] materias = new Materia[1];
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el nombre de la materia:");
            String nombreMateria = scanner.nextLine();

            System.out.println("Ingrese la clave de la materia:");
            String claveMateria = scanner.nextLine();

            System.out.println("Ingrese el número de créditos de la materia:");
            int creditosMateria = scanner.nextInt();

            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("Ingrese la etapa de la materia (basica, disciplinaria o terminal):");
            String etapaMateria = scanner.nextLine();

            System.out.println("Ingrese el tipo de la materia (obligatoria u optativa):");
            String tipoMateria = scanner.nextLine();

            materias[i] = new Materia(nombreMateria, claveMateria, creditosMateria, etapaMateria, tipoMateria);
        }

        // Capturar los datos del profesor
        Profesor[] profesores = new Profesor[1];
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el nombre del profesor:");
            String nombreProfesor = scanner.nextLine();

            System.out.println("Ingrese el número de empleado del profesor:");
            int numeroEmpleado = scanner.nextInt();

            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("Ingrese el grado del profesor (Lic., maestria o doctorado):");
            String gradoProfesor = scanner.nextLine();

            System.out.println("Ingrese el email del profesor:");
            String emailProfesor = scanner.nextLine();

            profesores[i] = new Profesor(nombreProfesor, numeroEmpleado, gradoProfesor, emailProfesor);
        }

        // Imprimir los datos de los alumnos
        System.out.println("\nDatos de los alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Matrícula: " + alumno.getMatricula());
            System.out.println("Promedio: " + alumno.getPromedio());
            System.out.println("Email: " + alumno.getEmail());
            System.out.println();
        }

        // Imprimir los datos de las materias
        System.out.println("\nDatos de la materia:");
        for (Materia materia : materias) {
            System.out.println("Nombre: " + materia.getNombre());
            System.out.println("Clave: " + materia.getClave());
            System.out.println("Créditos: " + materia.getCreditos());
            System.out.println("Etapa: " + materia.getEtapa());
            System.out.println("Tipo: " + materia.getTipo());
            System.out.println();
        }

        // Imprimir los datos del profesor
        System.out.println("\nDatos del profesor:");
        for (Profesor profesor : profesores) {
            System.out.println("Nombre: " + profesor.getNombre());
            System.out.println("Número de empleado: " + profesor.getNumeroEmpleado());
            System.out.println("Grado: " + profesor.getGrado());
            System.out.println("Email: " + profesor.getEmail());
            System.out.println();
        }

        // Cerrar el scanner
        scanner.close();
    }
}
