import java.util.HashSet;
import java.util.Iterator;

public class HashingHashSet {
    
    public static void main(String[] args) {
        //HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);
        // System.out.println(set);
        // System.out.println(set.size());

        // System.out.println(set.isEmpty());
        // set.clear();
        // System.out.println(set.size());

        //above commands are basic

        //ITERATION
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("through enhanced for loop");
        //OR
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
