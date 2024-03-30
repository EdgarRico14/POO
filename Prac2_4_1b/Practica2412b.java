package Prac2_4_1b;
import java.util.Scanner;

class CuerpoHumano{

    private double Altura;
    private String estado;

    public void setAltura(double altura){
        this.Altura = altura;
    }
    public double getAltura(){
        return Altura;
    }
    public void setEstado(String est){
        this.estado = est;
    }
    public String getEstado(){
        return estado;
    }

    class Corazon{
        
        private int ritmoCardiaco;
        private String estado;
        private boolean latiendo;

        public void setRitmo(int ritmo){
            this.ritmoCardiaco = ritmo;
        }
        public int getRitmo(){
            return ritmoCardiaco;
        }
        public void setEstado(String est){
            this.estado = est; 
        }
        public String getEstado(){
            return estado;
        }
        public void setLatiendo(boolean lat){
            this.latiendo = lat;
        }
        public boolean getLatiendo(){
            return latiendo;
        }
        
    }

    class Pulmon{
        
        private double peso;   // gramos
        private double capacidad; // litros
        private String estado;

        public void setPeso(double peso){
            this.peso = peso;
        }
        public double getPeso(){
            return peso;
        }
        public void setCapacidad(double capacidad){
            this.capacidad = capacidad;
        }
        public double getCapacidad(){
            return capacidad;
        }
        public void setEstado(String estado){
            this.estado = estado;
        }
        public String getEstado(){
            return estado;
        }
    }

    class Higado{

        private double nivelAlbumina; 
        private double nivelBilirrubina; 
        private double peso;    // kilos

        public void setNivelAlbumina(double nivelAlbumina){
            this.nivelAlbumina = nivelAlbumina;
        }
        public double getNivelAlbumina(){
            return nivelAlbumina;
        }
        public void setNivelBilirrubina(double nivelBilirrubina){
            this.nivelBilirrubina = nivelBilirrubina;
        }
        public double getNivelBilirrubina(){
            return nivelBilirrubina;
        }
        public void setPeso(double peso){
            this.peso = peso;
        }
        public double getPeso(){
            return peso;
        }
    }

    class Apendice{

        private boolean estaInflamado;
        private double longitud; // en centímetros
        private String estado;

        public void setEstaInflamado(boolean estaInflamado){
            this.estaInflamado = estaInflamado;
        }
        public boolean getEstaInflamado(){
            return estaInflamado;
        }
        public void setLongitud(double longitud){
            this.longitud = longitud;
        }
        public double getLongitud(){
            return longitud;
        }
        public void setEstado(String estado){
            this.estado = estado;
        }
        public String getEstado(){
            return estado;
        }
    }

}

public class Practica2412b {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        CuerpoHumano ch = new CuerpoHumano();
        CuerpoHumano.Corazon cor = ch.new Corazon();
        CuerpoHumano.Pulmon pul = ch.new Pulmon();
        CuerpoHumano.Higado hig = ch.new Higado();
        CuerpoHumano.Apendice apn = ch.new Apendice(); 

        System.out.println("Altura del cuerpo (metros): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Estado del cuerpo (sano o insano): ");
        String est = scanner.nextLine();

        System.out.println("Ritmo cardiaco del corazon: ");
        int ritmo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Estado del corazon (sano o insano): ");
        String estado = scanner.nextLine();

        System.out.println("Esta latiendo (true/false)? ");
        boolean latiendo = scanner.nextBoolean();

        System.out.println("Peso en gramos del pulmon: ");
        double peso1 = scanner.nextDouble();

        System.out.println("Capacidad de aire en litros: ");
        double capacidad = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Estado del Pulmon (sano o insano): ");
        String est2 = scanner.nextLine();

        System.out.println("Nivel de Albumina del higado: (g/dL)");
        double nivel1 = scanner.nextDouble();

        System.out.println("Nivel de Bilirrubina del higado: (mg/dL)");
        double nivel2 = scanner.nextDouble();

        System.out.println("Peso del higado: ");
        double peso2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("El apendice esta inflamado (true / false): ");
        boolean inflamado = scanner.nextBoolean();

        System.out.println("Longitud del apendice (centimetros): ");
        double longitud = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Estado del apendice (sano / insano): ");
        String est3 = scanner.nextLine();

        ch.setAltura(altura);
        ch.setEstado(est);
        cor.setRitmo(ritmo);
        cor.setEstado(estado);
        cor.setLatiendo(latiendo);
        pul.setPeso(peso1);
        pul.setCapacidad(capacidad);
        pul.setEstado(est2);
        hig.setNivelAlbumina(nivel1);
        hig.setNivelBilirrubina(nivel2);
        hig.setPeso(peso2);
        apn.setEstaInflamado(inflamado);
        apn.setLongitud(longitud);
        apn.setEstado(est3);

        System.out.println("\nDatos del Cuerpo Humano:");
        System.out.println("La altura del cuerpo es: " + ch.getAltura());
        System.out.println("La altura del cuerpo es: " + ch.getEstado());

        System.out.println("\n----Datos del Corazon----");
        System.out.println("El ritmo del corazon es: " + cor.getRitmo());
        System.out.println("El estado del corazon es: " + cor.getEstado());
        System.out.println("El corazon esta latiendo (ppm): " + cor.getLatiendo());

        System.out.println("\n----Datos del Pulmon----");
        System.out.println("El peso en gramos del pulmon es: " + pul.getPeso());
        System.out.println("La capacidad de aire en litros del pulmon es: " + pul.getCapacidad());
        System.out.println("El estado del pulmon es: " + pul.getEstado());
        
        System.out.println("\n----Datos del Higado----");
        System.out.println("El nivel de la albumina en g/dL es: " + hig.getNivelAlbumina());
        System.out.println("El nivel de la bilirrubina en mg/dL es: "+ hig.getNivelBilirrubina());
        System.out.println("El peso del higado en kg es: " + hig.getPeso());

        System.out.println("\n----Datos del Apendice----");
        System.out.println("El apendice esta inflamado: " + apn.getEstaInflamado());
        System.out.println("La longitud del apendice en cm es: " + apn.getLongitud());
        System.out.println("El estado del apendice es: " + apn.getEstado());

        scanner.close();

    } 
    
}
