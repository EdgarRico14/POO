package Prac3_1_1;

import java.util.Scanner;

// Clase padre Empleado
class Empleado {
    protected String nombre;
    protected int idEmpleado;
    protected double salario;

    // Métodos getter y setter para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// Clase hijo Gerente
class Gerente extends Empleado {
    private String departamento;

    // Métodos getter y setter para cada atributo
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

public class Prac311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de Empleado
        Empleado empleado = new Empleado();
        System.out.println("Ingrese los detalles del empleado:");
        System.out.print("Nombre: ");
        empleado.setNombre(scanner.nextLine());
        System.out.print("ID: ");
        empleado.setIdEmpleado(scanner.nextInt());
        System.out.print("Salario: ");
        empleado.setSalario(scanner.nextDouble());
        scanner.nextLine(); // Consumir la línea restante

        // Crear una instancia de Gerente
        Gerente gerente = new Gerente();
        System.out.println("Ingrese los detalles del gerente:");
        System.out.print("Nombre: ");
        gerente.setNombre(scanner.nextLine());
        System.out.print("ID: ");
        gerente.setIdEmpleado(scanner.nextInt());
        System.out.print("Salario: ");
        gerente.setSalario(scanner.nextDouble());
        scanner.nextLine(); // Consumir la línea restante
        System.out.print("Departamento: ");
        gerente.setDepartamento(scanner.nextLine());

        // Imprimir todos los detalles del empleado y del gerente
        System.out.println("\n---Empleado detalles--- ");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("ID: " + empleado.getIdEmpleado());
        System.out.println("Salario: " + empleado.getSalario());

        System.out.println("\n---Gerente detalles--- ");
        System.out.println("Nombre: " + gerente.getNombre());
        System.out.println("ID: " + gerente.getIdEmpleado());
        System.out.println("Salario: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());

        scanner.close();
    }
}

