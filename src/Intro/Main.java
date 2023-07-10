package Intro;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<String> cities = new ArrayList();
        cities.add("Bogota");
        cities.add("Buenos Aires");
        cities.add("Barcelona");
        cities.add("Roma");
        cities.add("Amsterdam");
        cities.add("Bruselas");
        cities.add("Ciudad de Mexico");
        cities.add("Madrid");

        // iteracion for
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        
                System.out.println("1. -----------------------");

            
        // iteracion con foreach
        for (String city : cities) {
            System.out.println(city);
        }

        
                System.out.println("2. -----------------------");

            
        // iteración con expresiones lambda
        cities.stream().forEach(city -> System.out.println(city));

        
                System.out.println("3. -----------------------");

            
        // Iteracion con referencia de metodo : llamando a una funcion estatica para con la clase
        cities.stream().forEach(Main::printCity);

        
                System.out.println("4. -----------------------");

       
        cities.stream().forEach(System.out::println);

        
                System.out.println("5. -----------------------");

            
        //Concurrencia con Stream (Paralell) - patron pipeline
        cities.stream().parallel().forEach(System.out::println);

        
                System.out.println("6. -----------------------");

                
        
        // (FILTER) Iteracion por filtro 1
        cities.stream().filter(city -> {
            boolean result = city.startsWith("B");
            return result;
        })
                .forEach(System.out::println);

        
                System.out.println("7. -----------------------");

        
        // (FILTER)Iteracion por filtro 2 
        cities.stream()
                .filter(city -> city.startsWith("B") && city.contains("t"))
                .forEach(System.out::println);
        
        
       // Metodos terminales : forEach()
       // Metodos no terminales : filter() y parallel()

    }
    
    //(FILTER)
    public static boolean filterCity(String city) {
        return city.startsWith("B");
    }

    
    public static void printCity(String city) {
        System.out.println(city);
    }

}
