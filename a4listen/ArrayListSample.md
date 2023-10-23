# Listen in java
## Array
-ein Array ist eine Liste von Werten/Objekten mit einer festen anzahl
-alle Werte und Objekte liegen innSpeicher beinander -> kann schnell durchlaufen werden.
-es ist nur ein Datentyp erlaubt 

>Codebeispiel

## Array Liste

### Vorteil:
-eine Arraylist ist eine dynamische Lisze von werten/Objekten
-Intern wird die ArrayList mit einem Array abgebildet, welches immer genug freie Plätze vorhält.
 dh. es wird intern eine neue Array Struktur aufgebaut, wenn die bestehende Liste bis zu einem bestimmten Schwellenwert gefüllt ist.
 -> eine ArrayList ist ähnlich schnell im Zugriff wie ein Array

 ### Nachteil:
 -eine ArrayList ist keine Queue und keine Stack

````java 
import java.util.ArrayList;
import java.util.list

public class ArrayListSample{
    public Static void main(String[] args){
        //Array lister erstellen
        ArrayList<String> name = new ArrayList<>();
        
        //Objekte Hinzufügen
        name.add(e: "Eliah");
        name.add(e: "Erik");
        name.add(e: "Ahmad");
        //liste ausgeben 
        System.out.println(name);

        //objekt entfernen
        name.remove(index:2);

        //Über Liste iterieren
        for (Integer i : namen) {
            System.out.println(i);
            
        }

        //prüfen ob werte in der Liste sind

        System.out.println(namen.contains(3));
    }
}

````