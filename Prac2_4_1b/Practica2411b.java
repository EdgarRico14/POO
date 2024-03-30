package Prac2_4_1b;
import java.util.Scanner;

class Bicicleta{

    private String modelo;
    private String usuario;
    private int talla;

    public Bicicleta(String modelo, String usuario, int talla){
        
        setModelo(modelo);
        setUsuario(usuario);
        setTalla(talla);
    }

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

        public Cuadro(String size, String material, String color){
            
            setSize(size);
            setMaterial(material);
            setColor(color);
        }

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
        private String material;
        private String tipo;

        public Rueda(double diametro, String material, String tipo){

            setDiametro(diametro);
            setMaterial(material);
            setTipo(tipo);
        }

        public void setDiametro(double diametro) { 
            this.diametro = diametro; 
        }
        public void setMaterial(String material) { 
            this.material = material; 
        }
        public void setTipo(String tipo) { 
            this.tipo = tipo; 
        }
        
        public double getDiametro() { 
            return diametro; 
        }
        public String getMaterial() { 
            return material; 
        }
        public String getTipo() { 
            return tipo; 
        }

    }
}

public class Practica2411b {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Modelo de la bicicleta: ");
        String modelo = scanner.nextLine();

        System.out.println("Tipo de usuario: (niño / joven / adulto): ");
        String usuario = scanner.nextLine();

        System.out.println("Talla de la bicicleta en pulgadas: ");
        int talla = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tamaño del cuadro: (chico / mediano / grande)");
        String size = scanner.nextLine();

        System.out.println("Material del cuadro: ");
        String material = scanner.nextLine();

        System.out.println("Color del cuadro: ");
        String color = scanner.nextLine();

        System.out.println("Diametro de la rueda en pulgadas: ");
        double diametro = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Material de la rueda: ");
        String material2 = scanner.nextLine();

        System.out.println("Tipo de la rueda: ");
        String tipo = scanner.nextLine();

        Bicicleta bike = new Bicicleta(modelo, usuario, talla);
        Bicicleta.Cuadro sqr = bike.new Cuadro(size, material, color);
        Bicicleta.Rueda rda = bike.new Rueda(diametro, material2, tipo);


        System.out.println("\nDatos de la bicicleta:");
        System.out.println("Modelo: " + bike.getModelo());
        System.out.println("Usuario: " + bike.getUsuario());
        System.out.println("Talla: " + bike.getTalla());

        System.out.println("\n---Datos del cuadro---");
        System.out.println("Tamaño: " + sqr.getSize());
        System.out.println("Material: " + sqr.getMaterial());
        System.out.println("Color: " + sqr.getColor());

        System.out.println("\n---Datos de la rueda---");
        System.out.println("Diámetro: " + rda.getDiametro());
        System.out.println("Material: " + rda.getMaterial());
        System.out.println("Tipo: " + rda.getTipo());

        scanner.close();
    }
}
