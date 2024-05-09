package Prac2_4_1b;
import java.util.Scanner;

class Bicicleta{

    private String modelo;
    private String usuario;
    private int talla;

    Rueda rda1 = new Rueda();
    Rueda rda2 = new Rueda();
    Cuadro sqr = new Cuadro();

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

   
    class Cuadro{

        private String size;
        private String material;
        private String color;


        public void setSize(String size) { 
            this.size = size; 
        }
        public void setMaterial(String material) { 
            this.material = material; 
        }
        public void setColor(String color) { 
            this.color = color; 
        }
       
        public String getSize() { 
            return size; 
        }
        public String getMaterial() { 
            return material; 
        }
        public String getColor() { 
            return color; 
        }

    }

    class Rueda{

        private double diametro;
        private boolean esAerodinamico; 
        private String tipo;


        public void setDiametro(double diametro) { 
            this.diametro = diametro; 
        }
        public void setesAerodinamico(boolean esAerodinamico) { 
            this.esAerodinamico = esAerodinamico; 
        }
        public void setTipo(String tipo) { 
            this.tipo = tipo; 
        }
        
        public double getDiametro() { 
            return diametro; 
        }
        public boolean getesAerodinamico() { 
            return esAerodinamico; 
        }
        public String getTipo() { 
            return tipo; 
        }

    }
}

public class Practica2411b {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Bicicleta bike = new Bicicleta();

        System.out.println("Modelo de la bicicleta: ");
        bike.setModelo(scanner.nextLine());

        System.out.println("Tipo de usuario: (niño / joven / adulto): ");
        bike.setUsuario(scanner.nextLine());

        System.out.println("Talla de la bicicleta en pulgadas: ");
        bike.setTalla(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Tamaño del cuadro: (chico / mediano / grande)");
        bike.sqr.setSize(scanner.nextLine());

        System.out.println("Material del cuadro: ");
        bike.sqr.setMaterial(scanner.nextLine());

        System.out.println("Color del cuadro: ");
        bike.sqr.setColor(scanner.nextLine());

        
        System.out.println("Diametro de la rueda 1 en pulgadas: ");
        bike.rda1.setDiametro(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Diametro de la rueda 2 en pulgadas: ");
        bike.rda2.setDiametro(scanner.nextDouble());
        scanner.nextLine();
        
        System.out.println("esAerodinamica: ");
        bike.rda1.setesAerodinamico(scanner.nextBoolean());
        scanner.nextLine(); // consume newline left-over
        System.out.println("esAerodinamica: ");
        bike.rda2.setesAerodinamico(scanner.nextBoolean());
        scanner.nextLine(); // consume newline left-over

        System.out.println("Tipo de la rueda 1: ");
        bike.rda1.setTipo(scanner.nextLine());


        System.out.println("\nDatos de la bicicleta:");
        System.out.println("Modelo: " + bike.getModelo());
        System.out.println("Usuario: " + bike.getUsuario());
        System.out.println("Talla en pulgadas: " + bike.getTalla());

        System.out.println("\n---Datos del cuadro---");
        System.out.println("Tamaño del cuadro: " + bike.sqr.getSize());
        System.out.println("Material del cuadro: " + bike.sqr.getMaterial());
        System.out.println("Color del cuadro: " + bike.sqr.getColor());

        
        System.out.println("\n---Datos de la rueda 1---");
        System.out.println("Diametro de la rueda: " + bike.rda1.getDiametro());
        System.out.println("Es aerodinamico: " + bike.rda1.getesAerodinamico());
        System.out.println("Tipo de la rueda: " + bike.rda1.getTipo());

        System.out.println("\n---Datos de la rueda 2---");
        System.out.println("Diametro de la rueda: " + bike.rda2.getDiametro());
        System.out.println("Es aerodinamico: " + bike.rda2.getesAerodinamico());
        System.out.println("Tipo de la rueda: " + bike.rda2.getTipo());

        scanner.close();
    }
}
