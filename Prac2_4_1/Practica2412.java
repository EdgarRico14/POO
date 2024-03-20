package Prac2_4_1;

class Corazon {
    private int ritmoCardiaco;
    private String estado;
    private boolean estaLatindo;

    public Corazon() {
        this.ritmoCardiaco = 70;
        this.estado = "Saludable";
        this.estaLatindo = true;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isEstaLatindo() {
        return estaLatindo;
    }

    public void setEstaLatindo(boolean estaLatindo) {
        this.estaLatindo = estaLatindo;
    }
}

class Pulmon {
    private String estado;
    private int capacidad;
    private boolean estaRespirando;

    public Pulmon() {
        this.estado = "Saludable";
        this.capacidad = 6; // en litros
        this.estaRespirando = true;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    private String estado;
    private boolean estaFuncionando;
    private int nivelEnzimas;

    public Higado() {
        this.estado = "Saludable";
        this.estaFuncionando = true;
        this.nivelEnzimas = 42; // en U/L
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    private String estado;
    private boolean estaInflamado;
    private double longitud; // en centímetros

    public Apendice() {
        this.estado = "Saludable";
        this.estaInflamado = false;
        this.longitud = 8.0; // longitud promedio del apéndice humano
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isEstaInflamado() {
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
    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;
    private Apendice apendice;
    private String estadoGeneral;

    public CuerpoHumano() {
        this.corazon = new Corazon();
        this.pulmon = new Pulmon();
        this.higado = new Higado();
        this.apendice = new Apendice();
        this.estadoGeneral = "Saludable";
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public void setPulmon(Pulmon pulmon) {
        this.pulmon = pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }

    public String getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }
}

public class Practica2412 {
    public static void main(String[] args) {
        CuerpoHumano cuerpoHumano = new CuerpoHumano();

        System.out.println("Estado general del cuerpo humano: " + cuerpoHumano.getEstadoGeneral());
        System.out.println("Ritmo cardiaco del corazón: " + cuerpoHumano.getCorazon().getRitmoCardiaco());
        System.out.println("Estado del corazón: " + cuerpoHumano.getCorazon().getEstado());
        System.out.println("El corazón está latiendo: " + cuerpoHumano.getCorazon().isEstaLatindo());
        System.out.println("Estado del pulmón: " + cuerpoHumano.getPulmon().getEstado());
        System.out.println("Capacidad del pulmón: " + cuerpoHumano.getPulmon().getCapacidad());
        System.out.println("El pulmón está respirando: " + cuerpoHumano.getPulmon().isEstaRespirando());
        System.out.println("Estado del hígado: " + cuerpoHumano.getHigado().getEstado());
        System.out.println("El hígado está funcionando: " + cuerpoHumano.getHigado().isEstaFuncionando());
        System.out.println("Nivel de enzimas del hígado: " + cuerpoHumano.getHigado().getNivelEnzimas());
        System.out.println("Estado del apéndice: " + cuerpoHumano.getApendice().getEstado());
        System.out.println("El apéndice está inflamado: " + cuerpoHumano.getApendice().isEstaInflamado());
        System.out.println("Longitud del apéndice: " + cuerpoHumano.getApendice().getLongitud());
    }
}


