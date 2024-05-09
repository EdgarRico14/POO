public class RunnableHilo {
    /* ... */
    
    public static void main (String args[]) throws InterruptedException{
        RunnablePseudoIO pseudo = new RunnablePseudoIO( );
        Thread pseudo2 = new Thread (pseudo);
        pseudo2.setName("Primero");
        Thread principal = Thread.currentThread();
        System.out.println(principal.getName());
        try{
            pseudo2.start();
            System.out.println(pseudo2.getName());
            pseudo2.sleep(1000);
            principal.sleep(1000);
            // Tarea principal continúa concurrentemente
        }catch(InterruptedException e){}
        
    }
    
    /* Otros métodos  */
    
}

class RunnablePseudoIO implements Runnable {
    /* .....  */
  
    public void run() {
        // Tarea segundaria concurrente
        System.out.println("Estoy corriendo");
    }
}
