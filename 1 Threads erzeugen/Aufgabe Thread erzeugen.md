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
6. Erweitern sie die Thread Klasse und testen sie Threads mit 30 und 100 ms Wartezeit.