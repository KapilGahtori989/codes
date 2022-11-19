import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashingLinkedHashSet {
    
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        //first insertion is printed first
        System.out.println(lhs);
        //all functions of hashset are applicable in
        //Linked Hash Set
    }
}
