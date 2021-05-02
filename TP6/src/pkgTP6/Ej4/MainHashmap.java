package pkgTP6.Ej4;

import java.util.HashMap;

public class MainHashmap {

    public static void main(String[] args) {
        /* This is how to declare HashMap */
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("JP", "Juan Perez");
        capitalCities.put("MJ", "Melina Juarez");
        capitalCities.put("DS", "Diego Sanchez");
        capitalCities.put("MV", "Marina Velez");

        System.out.println(capitalCities.get("DS"));

    }

}
