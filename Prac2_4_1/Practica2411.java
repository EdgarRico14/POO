package Prac2_4_1;
import java.util.Scanner;

class Rueda {
    private double diametro;
    private boolean esAerodinamico; 
    private String tipo;

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public boolean getesAerodinamico() {
        return esAerodinamico;
    }

    public void setesAerodinamico(boolean esAerodinamico) {
        this.esAerodinamico = esAerodinamico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Cuadro {
    private String tamano;
    private String forma;   
    private String color;

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Bicicleta {
    private String modelo;
    private String usuario; // (infante, joven , adulto)
    private int talla;
    
    Rueda[] rueda = new Rueda[2];
    Cuadro cuadro = new Cuadro();

    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    public void setUsuario(String usuario) { 
        this.usuario = usuario; 
    }
    public void setTalla(int talla) { 
        this.talla = talla; 
    }

    public String getModelo() { 
        return modelo; 
    }
    public String getUsuario() { 
        return usuario; 
    }
    public int getTalla() { 
        return talla; 
    }
}

public class Practica2411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bicicleta bicicleta = new Bicicleta();

        System.out.println("Ingrese el modelo de la bicicleta: ");
        bicicleta.setModelo(scanner.nextLine());

        System.out.println("Tipo de usuario: (infante / joven / adulto): ");
        bicicleta.setUsuario(scanner.nextLine());

        System.out.println("Talla de la bicicleta en pulgadas: ");
        bicicleta.setTalla(scanner.nextInt());
        scanner.nextLine(); // consume newline left-over

        System.out.println("Ingrese el tamaño del cuadro (chico / mediano / grande): ");
        bicicleta.cuadro.setTamano(scanner.nextLine());

        System.out.println("Ingrese la forma del cuadro: ");
        bicicleta.cuadro.setForma(scanner.nextLine());

        System.out.println("Ingrese el color del cuadro: ");
        bicicleta.cuadro.setColor(scanner.nextLine());

        for (int i = 0; i < 2; i++) {
            
            System.out.println("Ingrese el diametro de la rueda " + (i+1) + " en pulgadas: ");
            bicicleta.rueda[i].setDiametro(scanner.nextDouble());
            scanner.nextLine(); // consume newline left-over

            System.out.println("Ingrese el esAerodinamico de la rueda " + (i+1) + ": ");
            bicicleta.rueda[i].setesAerodinamico(scanner.nextBoolean());

            System.out.println("Ingrese el tipo de la rueda " + (i+1) + ": ");
            bicicleta.rueda[i].setTipo(scanner.nextLine());
        }

        System.out.println("\nDatos de la bicicleta:");
        System.out.println("Modelo de la bicicleta: " + bicicleta.getModelo());
        System.out.println("Tipo de usuario: " + bicicleta.getUsuario());
        System.out.println("Talla de la bicicleta en pulgadas: " + bicicleta.getTalla());

        System.out.println("\n---Datos del cuadro---");
        System.out.println("Tamaño del cuadro: " + bicicleta.cuadro.getTamano());
        System.out.println("Forma del cuadro: " + bicicleta.cuadro.getForma());
        System.out.println("Color del cuadro: " + bicicleta.cuadro.getColor());

        System.out.println("\n---Datos de las ruedas---");
        for (int i = 0; i < 2; i++) {
            System.out.println("\nRueda " + (i+1) + ":");
            System.out.println("Diametro de la rueda: " + bicicleta.rueda[i].getDiametro());
            System.out.println("esAerodinamico de la rueda: " + bicicleta.rueda[i].getesAerodinamico());
            System.out.println("Tipo de la rueda: " + bicicleta.rueda[i].getTipo());
        }

        scanner.close();
    }
}

