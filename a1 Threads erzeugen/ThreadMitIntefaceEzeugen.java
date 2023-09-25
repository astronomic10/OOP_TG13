

import a2ThreadsMitInterface.MeinThread;

public class ThreadMitIntefaceEzeugen {
    public static void main(String[] args){
        //beginn main Thread
        System.out.println("Main Thread gestartet");

        //Thread Objekt erzeugen
        MeinThread a = new MeinThread("a", 30);
        MeinThread x = new MeinThread("x", 100);

        //Thread starten
        a.run();
        x.start();
        System.out.println("main Thread zuenende");

    }
    
}
