package a0uebungen;

import java.util.ArrayList;
import java.util.LinkedList;



public class LinkedListExample {
    public static void main(String[] args) {

        //Array 
        //man muss immer wissen wie lange es sein muss (dann fest)
        String[] names = new String[4]; 
        names[0] = "John";
        names[1] = "Paul";
        names[2] = "Jane";
        names[3] = "Kobolt";

        System.out.println(names[1]);
      
        for(int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }







        //Both are Java collections Framework
        //Difference in Performance

        
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        
        //Open size (not as in an Array)
        //Resizing takes time and recources

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
         System.out.println(namesArrayList.get(2));
    }
}
