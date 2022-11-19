import java.util.HashMap;
import java.util.TreeMap;
public class HashingTreeMap {
    
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        
        tm.put("China",150);
        tm.put("India",100);
        tm.put("Us",30);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("China",150);
        hm.put("India",100);
        hm.put("Us",30);

        System.out.println("Tree map"+tm);
        System.out.println("hash Map "+ hm);
    }
}
