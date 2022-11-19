import java.util.HashMap;
import java.util.LinkedHashMap;
public class HashingLinkedHashMap {
    
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        
        lhm.put("China",150);
        lhm.put("India",100);
        lhm.put("Us",30);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("China",150);
        hm.put("India",100);
        hm.put("Us",30);

        System.out.println("Linked Hash map"+lhm);
        System.out.println("hash Map "+ hm);
    }
}
