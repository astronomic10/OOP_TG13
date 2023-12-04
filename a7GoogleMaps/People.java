package a7GoogleMaps;
import java.util.HashMap;


public class People {
    public static void main(String[] args) {
        //Create a Hash map object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        //Add Leys and values (Name, Age)

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie",45);

        for(String i: people.keySet()){
            System.out.println("Name: " + i + " Alter: " +people.get(i));
        }
    }
    
}
