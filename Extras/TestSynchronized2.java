package Extras;
//Program of synchronized method by using annonymous class
class Table{
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
        
    }
}

public class TestSynchronized2{
    public static void main(String args[]){
        final Table obj = new Table();//only one object
        
        Thread t1=new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };
        t2.start();
        t1.start();
        
    }
}

