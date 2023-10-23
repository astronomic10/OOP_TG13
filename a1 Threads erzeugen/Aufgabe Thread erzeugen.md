1. Java Main Erzeuge `Thread` und `MeinThread`
2. Fügen sie die die main methode hinzu
````java 
public class ErzeugeThreads {

    public static void main(String[] args) {
        
    }
}
````
3. die Klasse `MeinThread` soll von der Klasse `Thread` erben
````java
    public Mein Thread extends Thread {...}
````

4. Jeder Thread hat einen Namen und eine wartezeit
````java
    public class MeinThread extends Thread  {
    //Objektvariablen
    String nameString;
    int wait;
````
5. Jeder Thread hat einen Namen und eine Wartezeit in ms und Zählt von 1-100. Der Thread gibt diesen Werten nachdem er gestartet wurde nebenläufig auf der Konsole aus. 
````java
   @Override
public void run() {
   System.out.println("Name"+name+" gestartet");

 for(int i=0; i < 100; i++){
   System.out.println(name+": "+i);
 }

try {
   
} catch (Exception e) {
   e.printStack trace
}

}

    } 
````

6. Erweitern sie die Thread Klasse und testen sie Threads mit 30 und 100 ms Wartezeit.
````java
public class ErzeugeThreads {

    public static void main(String[] args) {
     System.out.println("Main Thread gestartet");   

a = new MeinThread(name:"a"; wait: 100);
b = new MeinThread(name:"b"; wait: 100);


a.start();
b.start();

System.out.println("Main Thread zuende");

    }
}
````