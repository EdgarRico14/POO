package Prac4_1_1;

class Mamifero {
    public void mover() {
        System.out.println("Ahora es un mamifero el que se mueve");
    }
}

class Perro extends Mamifero {
    // Sobrescribir el método mover() en la clase Perro
    public void mover() {
        System.out.println("Ahora es un perro el que se mueve");
    }
}

class Gato extends Mamifero {
    // Sobrescribir el método mover() en la clase Gato
    public void mover() {
        System.out.println("Ahora es un gato el que se mueve");
    }
}

public class Polimorfismo {
    public static void muevete(Mamifero m) { // recibe un parámetro del tipo Mamífero (la superclase)
        m.mover(); // Polimorfismo: el método a invocar se determina en tiempo de ejecución
    }
    public static void main(String[] args) {
        Gato cat = new Gato();
        Perro dog = new Perro();
        muevete(cat); // se invoca con un parámetro del tipo Gato (la subclase)
        muevete(dog); // se invoca con un parámetro del tipo Perro (la subclase)
    }
}
