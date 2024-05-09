package Prac2_4_1b;
import java.util.Scanner;

class CuerpoHumano{

    private double Altura;
    private String estado;

    Corazon cor = new Corazon();
    Pulmon pul = new Pulmon();
    Higado hig = new Higado();
    Apendice apn = new Apendice(); 

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

}

public class Prac2412b {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        CuerpoHumano cuerpo = new CuerpoHumano();

        System.out.println("Ingrese la altura del cuerpo humano en metros: ");
        cuerpo.setAltura(scanner.nextDouble());
        scanner.nextLine(); // consume newline left-over

        System.out.println("Ingrese el estado del cuerpo humano: ");
        cuerpo.setEstado(scanner.nextLine());

        System.out.println("Ingrese el ritmo cardiaco del corazón: ");
        cuerpo.cor.setRitmoCardiaco(scanner.nextInt());

        System.out.println("Ingrese los latidos totales del corazón: ");
        cuerpo.cor.setLatidosTotales(scanner.nextInt());

        System.out.println("Esta latiendo: ");
        cuerpo.cor.setEstaLatindo(scanner.nextBoolean());

        System.out.println("Ingrese el volumen máximo del pulmón en litros: ");
        cuerpo.pul.setVolumenMaximo(scanner.nextDouble());

        System.out.println("Capacidad en litros: ");
        cuerpo.pul.setCapacidad(scanner.nextInt());
        scanner.nextLine(); // consume newline left-over
        
        System.out.println("Esta respirando: ");
        cuerpo.pul.setEstaRespirando(scanner.nextBoolean());
        scanner.nextLine(); // consume newline left-over

        System.out.println("Ingrese la tasa de filtración del hígado: ");
        cuerpo.hig.setTasaFiltracion(scanner.nextDouble());
        scanner.nextLine(); // consume newline left-over
        
        System.out.println("Esta funcionando : ");
        cuerpo.hig.setEstaFuncionando(scanner.nextBoolean());
        scanner.nextLine(); // consume newline left-over
        
        System.out.println("Nivel de Enzimas: ");
        cuerpo.hig.setNivelEnzimas(scanner.nextInt());
        scanner.nextLine(); // consume newline left-over

        System.out.println("Ingrese la longitud del apéndice en centímetros: ");
        cuerpo.apn.setLongitud(scanner.nextDouble());
        scanner.nextLine(); // consume newline left-over

        System.out.println("Es vegistial: ");
        cuerpo.apn.setEsVestigial(scanner.nextBoolean());
        
        System.out.println("Esta inflamado: ");
        cuerpo.apn.setEstaInflamado(scanner.nextBoolean());
        

        System.out.println("\n---Datos del cuerpo humano---");
        System.out.println("Altura del cuerpo humano en metros: " + cuerpo.getAltura());
        System.out.println("Estado del cuerpo humano: " + cuerpo.getEstado());
        System.out.println("Ritmo cardiaco del corazón: " + cuerpo.cor.getRitmoCardiaco());
        System.out.println("Latidos totales del corazón: " + cuerpo.cor.getLatidosTotales());
        System.out.println("¿Está latiendo el corazón?: " + cuerpo.cor.isEstaLatindo());
        System.out.println("Volumen máximo del pulmón en litros: " + cuerpo.pul.getVolumenMaximo());
        System.out.println("Capacidad del pulmón en litros: " + cuerpo.pul.getCapacidad());
        System.out.println("¿Está respirando el pulmón?: " + cuerpo.pul.isEstaRespirando());
        System.out.println("Tasa de filtración del hígado: " + cuerpo.hig.getTasaFiltracion());
        System.out.println("¿Está funcionando el hígado?: " + cuerpo.hig.isEstaFuncionando());
        System.out.println("Nivel de Enzimas del hígado: " + cuerpo.hig.getNivelEnzimas());
        System.out.println("Longitud del apéndice en centímetros: " + cuerpo.apn.getLongitud());
        System.out.println("¿Es vestigial el apéndice?: " + cuerpo.apn.getEsVestigial());
        System.out.println("¿Está inflamado el apéndice?: " + cuerpo.apn.getEstaInflamado());


        scanner.close();

    } 
    
}
