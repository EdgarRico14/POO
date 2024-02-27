package Prac2_1_1.SetGet;
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

    // SetGet method for Alumno class
    public Object SetGet(String attribute, Object value) {
        switch (attribute) {
            case "nombre":
                if (value instanceof String) {
                    this.nombre = (String) value;
                }
                return this.nombre;
            case "matricula":
                if (value instanceof Integer) {
                    this.matricula = (int) value;
                }
                return this.matricula;
            case "promedio":
                if (value instanceof Double) {
                    this.promedio = (double) value;
                }
                return this.promedio;
            case "email":
                if (value instanceof String) {
                    this.email = (String) value;
                }
                return this.email;
            default:
                return null;
        }
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
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.etapa = etapa;
        this.tipo = tipo;
    }

    // SetGet method for Materia class
    public Object SetGet(String attribute, Object value) {
        switch (attribute) {
            case "nombre":
                if (value instanceof String) {
                    this.nombre = (String) value;
                }
                return this.nombre;
            case "clave":
                if (value instanceof String) {
                    this.clave = (String) value;
                }
                return this.clave;
            case "creditos":
                if (value instanceof Integer) {
                    this.creditos = (int) value;
                }
                return this.creditos;
            case "etapa":
                if (value instanceof String) {
                    this.etapa = (String) value;
                }
                return this.etapa;
            case "tipo":
                if (value instanceof String) {
                    this.tipo = (String) value;
                }
                return this.tipo;
            default:
                return null;
        }
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

    // SetGet method for Profesor class
    public Object SetGet(String attribute, Object value) {
        switch (attribute) {
            case "nombre":
                if (value instanceof String) {
                    this.nombre = (String) value;
                }
                return this.nombre;
            case "numeroEmpleado":
                if (value instanceof Integer) {
                    this.numeroEmpleado = (int) value;
                }
                return this.numeroEmpleado;
            case "grado":
                if (value instanceof String) {
                    this.grado = (String) value;
                }
                return this.grado;
            case "email":
                if (value instanceof String) {
                    this.email = (String) value;
                }
                return this.email;
            default:
                return null;
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar los datos de los alumnos
        Alumno[] alumnos = new Alumno[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la matrícula del alumno " + (i + 1) + ":");
            int matricula = scanner.nextInt();

            System.out.println("Ingrese el promedio del alumno " + (i + 1) + ":");
            double promedio = scanner.nextDouble();

            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("Ingrese el email del alumno " + (i + 1) + ":");
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

            System.out.println("Ingrese la etapa de la materia (básica, disciplinaria o terminal):");
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

            System.out.println("Ingrese el grado del profesor (Lic., maestría o doctorado):");
            String gradoProfesor = scanner.nextLine();

            System.out.println("Ingrese el email del profesor:");
            String emailProfesor = scanner.nextLine();

            profesores[i] = new Profesor(nombreProfesor, numeroEmpleado, gradoProfesor, emailProfesor);
        }

        // Imprimir los datos de los alumnos
        System.out.println("\nDatos de los alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.SetGet("nombre", null));
            System.out.println("Matrícula: " + alumno.SetGet("matricula", null));
            System.out.println("Promedio: " + alumno.SetGet("promedio", null));
            System.out.println("Email: " + alumno.SetGet("email", null));
            System.out.println();
        }

        // Imprimir los datos de las materias
        System.out.println("\nDatos de la materia:");
        for (Materia materia : materias) {
            System.out.println("Nombre: " + materia.SetGet("nombre", null));
            System.out.println("Clave: " + materia.SetGet("clave", null));
            System.out.println("Créditos: " + materia.SetGet("creditos", null));
            System.out.println("Etapa: " + materia.SetGet("etapa", null));
            System.out.println("Tipo: " + materia.SetGet("tipo", null));
            System.out.println();
        }

        // Imprimir los datos del profesor
        System.out.println("\nDatos del profesor:");
        for (Profesor profesor : profesores) {
            System.out.println("Nombre: " + profesor.SetGet("nombre", null));
            System.out.println("Número de empleado: " + profesor.SetGet("numeroEmpleado", null));
            System.out.println("Grado: " + profesor.SetGet("grado", null));
            System.out.println("Email: " + profesor.SetGet("email", null));
            System.out.println();
        }

        // Cerrar el scanner
        scanner.close();
    }
}
