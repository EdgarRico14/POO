package Prac2_4_1;

class Rueda {
    private double diametro;
    private String material;
    private String tipo;

    public Rueda() {
        this.diametro = 26.5;
        this.material = "Acero";
        this.tipo = "Montaña";
    }

    public double getDiametro() {
        return this.diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Cuadro {
    private String tamaño;
    private String material;
    private String color;

    public Cuadro() {
        this.tamaño = "Mediano";
        this.material = "Aluminio";
        this.color = "Rojo";
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Bicicleta {
    private Rueda rueda;
    private Cuadro cuadro;
    private String modelo;

    public Bicicleta() {
        this.rueda = new Rueda();
        this.cuadro = new Cuadro();
        this.modelo = "BMX";
    }

    public Rueda getRueda() {
        return this.rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    public Cuadro getCuadro() {
        return this.cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

public class Practica241 {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();

        System.out.println("Modelo de la bicicleta: " + bicicleta.getModelo());
        System.out.println("Diametro de la rueda: " + bicicleta.getRueda().getDiametro());
        System.out.println("Material de la rueda: " + bicicleta.getRueda().getMaterial());
        System.out.println("Tipo de la rueda: " + bicicleta.getRueda().getTipo());
        System.out.println("Tamaño del cuadro: " + bicicleta.getCuadro().getTamaño());
        System.out.println("Material del cuadro: " + bicicleta.getCuadro().getMaterial());
        System.out.println("Color del cuadro: " + bicicleta.getCuadro().getColor());
    }
}

