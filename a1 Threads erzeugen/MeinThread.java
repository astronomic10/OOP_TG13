/**
 * MeinThread
 */
public class MeinThread extends Thread  {
 //Objektvariablen
 String name;
 int wait;

@Override
public void run() {
   System.out.println("Name"+name+" gestartet");

 for(int i=0; i < 100; i++){
   System.out.println(name+": "+i);
 }

try {
   
} catch (InterruptedExceptionException e) {
   e.printStackTrace();
}

}

    } 
    
