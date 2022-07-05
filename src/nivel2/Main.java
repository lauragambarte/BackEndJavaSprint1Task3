package nivel2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
Restaurante restaurant1= new Restaurante("Desnivel", 7);
Restaurante restaurant2= new Restaurante("Brigada", 9);
Restaurante restaurant3= new Restaurante("Don Julio", 10);
Restaurante restaurant4= new Restaurante("Brigada",9);
Restaurante restaurant5= new Restaurante("Desnivel",6);
HashSet<Restaurante> restauranteHashSet = new HashSet<Restaurante>();
//ALREADY CREATED AN EMPTY HASHSET, I NEED TO ADD EVERY RESTAURANT into the hashset.

        restauranteHashSet.add(restaurant1);
        restauranteHashSet.add(restaurant2);
        restauranteHashSet.add(restaurant3);
        restauranteHashSet.add(restaurant4);
        restauranteHashSet.add(restaurant5);
        System.out.println(restauranteHashSet);
        Set<Restaurante>  restaurantesTreeset= new TreeSet<>();
        restaurantesTreeset.add(restaurant1);
        restaurantesTreeset.add(restaurant2);
        restaurantesTreeset.add(restaurant3);
        restaurantesTreeset.add(restaurant4);
        restaurantesTreeset.add(restaurant5);
            System.out.println("Sort elements in descending order : " + restaurantesTreeset);
    }
}
