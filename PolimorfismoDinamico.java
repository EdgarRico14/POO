class Mamifero { 
  public void mover() { 
    System.out.println("Ahora es un mamifero el que se mueve"); 
  } 
} 
  
class Perro extends Mamifero { 
  public void mover() { 
    System.out.println("Ahora es un perro el que se mueve"); 
  } 
} 
  
class Gato extends Mamifero { 
  public void mover() { 
    System.out.println("Ahora es un gato el que se mueve"); 
  } 
} 

class PolimorfandoAlPadre { 
 
  public static void muevete(Mamifero m) { // recibe un parámetro del tipo Mamífero (la superclase) 
    m.mover(); 
  } 
 
}

public class PolimorfismoDinamico { 
 
  public static void main(String[] args) { 
    Gato bisho = new Gato(); 
    Perro feo = new Perro(); 
    PolimorfandoAlPadre.muevete(bisho); // se invoca con un parámetro del tipo Gato (la subclase) 
    PolimorfandoAlPadre.muevete(feo); // se invoca con un parámetro del tipo Perro (la subclase) 
  } 
 
}