package a4listen;
import java.util.List;

public class LinkedList {
    public static void main(String[] args){
       
        // Linked List erzeugen
       LinkedList <String> einkaufliste = new LinkedList<>();

       //Werte hinzufügen
       einkaufliste.add("Milch");
       einkaufliste.add("Butter");
       einkaufliste.add("Bier");

       //Ausgabe
       System.out.println();
       System.out.println(einkaufliste);
       System.out.println("---------------------------------");
       

       //entfernen von objeken
       System.out.println("Entferne Element mit index 2");
       einkaufliste.remove(2);
       System.out.println(einkaufliste);

       //iteriern über Liste

       for (String s : einkaufliste) {
        System.out.println(s);
        
       }
       System.out.println("--------------------------------");
       
       System.out.println("Stapeloptionen");
       einkaufliste.removeFirst();
       einkaufliste.removeLast();
       einkaufliste.addFirst("Wasser");
       einkaufliste.addLast("Salami");

       System.out.println(einkaufliste);

       System.out.println(einkaufliste.pop());
       System.out.println(einkaufliste);

       System.out.println(einkaufliste.popLast());
       System.out.println(einkaufliste);
       
     

    }
    
}
