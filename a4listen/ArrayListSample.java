import java.util.ArrayList;
import java.util.List;

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
        name.remove( 2);

        //Über Liste iterieren
        for (Integer i : name) {
            System.out.println(i);
            
        }

        //prüfen ob werte in der Liste sind

        System.out.println(name.contains(3));
    }
}