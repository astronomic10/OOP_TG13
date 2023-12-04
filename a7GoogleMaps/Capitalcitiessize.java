package a7GoogleMaps;

import java.util.HashMap;

public class Capitalcitiessize {
    public static void main(String[] args){

        //Create a HashMap object called capital Cities 
        HashMap <String, String> capitalCities = new HashMap<String, String>();

        //Add keys and Values (Country, cities)

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.size());
        

    }
}
