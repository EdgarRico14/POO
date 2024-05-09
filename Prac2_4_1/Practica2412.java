package Prac2_4_1;
import java.util.Scanner;

class Corazon {
    private int ritmoCardiaco;
    private int latidosTotales;
    private boolean estaLatindo;

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public int getLatidosTotales() {
        return latidosTotales;
    }
    
    public void setLatidosTotales(int latidosTotales) {
        this.latidosTotales = latidosTotales;
    }

    public boolean isEstaLatindo() {
        return estaLatindo;
    }

    public void setEstaLatindo(boolean estaLatindo) {
        this.estaLatindo = estaLatindo;
    }
}

class Pulmon {
    private double volumenMaximo;
    private int capacidad;
    private boolean estaRespirando;

    public double getVolumenMaximo() {
        return volumenMaximo;
    }
    
    public void setVolumenMaximo(double volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstaRespirando() {
        return estaRespirando;
    }

    public void setEstaRespirando(boolean estaRespirando) {
        this.estaRespirando = estaRespirando;
    }
}

class Higado {
    private double tasaFiltracion;
    private boolean estaFuncionando;
    private int nivelEnzimas;

    public double getTasaFiltracion() {
        return tasaFiltracion;
    }
    
    public void setTasaFiltracion(double tasaFiltracion) {
        this.tasaFiltracion = tasaFiltracion;
    }

    public boolean isEstaFuncionando() {
        return estaFuncionando;
    }

    public void setEstaFuncionando(boolean estaFuncionando) {
        this.estaFuncionando = estaFuncionando;
    }

    public int getNivelEnzimas() {
        return nivelEnzimas;
    }

    public void setNivelEnzimas(int nivelEnzimas) {
        this.nivelEnzimas = nivelEnzimas;
    }
}

class Apendice {
    private boolean esVestigial;
    private boolean estaInflamado;
    private double longitud; // en centímetros

    public boolean getEsVestigial() {
        return esVestigial;
    }
    
    public void setEsVestigial(boolean esVestigial) {
        this.esVestigial = esVestigial;
    }

    public boolean getEstaInflamado() {
        return estaInflamado;
    }

    public void setEstaInflamado(boolean estaInflamado) {
        this.estaInflamado = estaInflamado;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}

class CuerpoHumano {

    private String estadoGeneral;
    private double altura;
    private double peso;

    Corazon corazon = new Corazon();
    Pulmon pulmon = new Pulmon();
    Higado higado = new Higado();
    Apendice apendice = new Apendice();

    
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
}

public class Practica2412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuerpoHumano cuerpoHumano = new CuerpoHumano();

        System.out.println("Ingrese la altura en metros del cuerpo: ");
        cuerpoHumano.setAltura(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Ingrese el estado general del cuerpo humano: ");
        cuerpoHumano.setEstadoGeneral(scanner.nextLine());

        System.out.println("Peso del cuerpo en kg: ");
        cuerpoHumano.setPeso(scanner.nextDouble());

        System.out.println("Ingrese el ritmo cardiaco del corazón: ");
        cuerpoHumano.corazon.setRitmoCardiaco(scanner.nextInt());

        scanner.nextLine(); // consume newline left-over
        System.out.print("Latidos totales: ");
        cuerpoHumano.corazon.setLatidosTotales(scanner.nextInt());

        System.out.println("El corazón está latiendo (true/false): ");
        cuerpoHumano.corazon.setEstaLatindo(scanner.nextBoolean());

        scanner.nextLine(); // consume newline left-over
        System.out.print("Volumen máximo: ");
        cuerpoHumano.pulmon.setVolumenMaximo(scanner.nextDouble());

        System.out.println("Ingrese la capacidad del pulmón: ");
        cuerpoHumano.pulmon.setCapacidad(scanner.nextInt());

        System.out.println("El pulmón está respirando (true/false): ");
        cuerpoHumano.pulmon.setEstaRespirando(scanner.nextBoolean());

        scanner.nextLine(); // consume newline left-over
        System.out.print("Tasa de filtración: ");
        cuerpoHumano.higado.setTasaFiltracion(scanner.nextDouble());

        System.out.println("El hígado está funcionando (true/false): ");
        cuerpoHumano.higado.setEstaFuncionando(scanner.nextBoolean());

        System.out.println("Ingrese el nivel de enzimas del hígado: ");
        cuerpoHumano.higado.setNivelEnzimas(scanner.nextInt());

        scanner.nextLine(); // consume newline left-over
        System.out.print("Es vestigial (true/false): ");
        cuerpoHumano.apendice.setEsVestigial(scanner.nextBoolean());

        System.out.println("El apéndice está inflamado (true/false): ");
        cuerpoHumano.apendice.setEstaInflamado(scanner.nextBoolean());

        System.out.println("Ingrese la longitud del apéndice (en centímetros): ");
        cuerpoHumano.apendice.setLongitud(scanner.nextDouble());

        System.out.println("\nDatos del Cuerpo Humano:");
        System.out.println("Altura del cuerpo en metro es: " + cuerpoHumano.getAltura());
        System.out.println("Estado general del cuerpo humano: " + cuerpoHumano.getEstadoGeneral());
        System.out.println("El peso es: " + cuerpoHumano.getPeso());

        System.out.println("\n----Datos del Corazon----");
        System.out.println("Ritmo cardiaco del corazón: " + cuerpoHumano.corazon.getRitmoCardiaco());
        System.out.println("Latidos totales: " + cuerpoHumano.corazon.getLatidosTotales());
        System.out.println("El corazón está latiendo: " + cuerpoHumano.corazon.isEstaLatindo());

        System.out.println("\n----Datos del Pulmon----");
        System.out.println("Volumen máximo: " + cuerpoHumano.pulmon.getVolumenMaximo());
        System.out.println("Capacidad del pulmón: " + cuerpoHumano.pulmon.getCapacidad());
        System.out.println("El pulmón está respirando: " + cuerpoHumano.pulmon.isEstaRespirando());

        System.out.println("\n----Datos del Higado----");
        System.out.println("Tasa de filtración: " + cuerpoHumano.higado.getTasaFiltracion());
        System.out.println("El hígado está funcionando: " + cuerpoHumano.higado.isEstaFuncionando());
        System.out.println("Nivel de enzimas del hígado: " + cuerpoHumano.higado.getNivelEnzimas());

        System.out.println("\n----Datos del Apendice----");
        System.out.println("Es vestigial: " + cuerpoHumano.apendice.getEsVestigial());
        System.out.println("El apéndice está inflamado: " + cuerpoHumano.apendice.getEstaInflamado());
        System.out.println("Longitud del apéndice en cm: " + cuerpoHumano.apendice.getLongitud());

        scanner.close();
    }
}


