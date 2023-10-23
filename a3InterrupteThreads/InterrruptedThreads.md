###Java Thread-Interrupts

In java können Thread-Interrupts verwendet werden, um die Außführung eines Threads zu unterberechen oder zu beenden. Dies ermöglicht die Steuerung der Thread-Ausführung auf Anfrage.

##Thread-Interrrupts in Java

Thread Interrupts werden mithilfe der **interrupt()**-Methode und der **isInterrupted()**-Methode umgesetzt. Hier ist ein einfaches Beispiel, wie Threadd interrupts verwendet werden können

````java
public class MyThread extends Thread{
    public void run(){
        while(!isInterrupted()){
            System.out.println("Thread arbeitet");
        }   
        System.out.println("Thread wurde unterbrochen.");
     }

     public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
    
    
        }
        myThread.interrupt();
        }

     }
     ````

In diesem Beispiel wird ein benutzerdefinierter 