/**
 * ErzeugeThreads
 */
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