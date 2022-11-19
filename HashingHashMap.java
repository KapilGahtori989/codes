import java.util.HashMap;
public class HashingHashMap {
    
    public static void main(String[] args) {
        //Create
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert 
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);

        //data output is undordered --i.e random
        System.out.println(hm);

        //Get - O(1)
        int population=hm.get("India");
        System.out.println(population);

        //if no such key is present then null is returned
        System.out.println(hm.get("Indonesia"));

        //ContainsKey --O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false
        
        //remove --O(1)
        System.out.println("removed value "+hm.remove("China"));
        System.out.println("map after removal"+hm);       
        
        //China added again
        hm.put("China", 150);
        
        //Size
        System.out.println("size is = "+ hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

        // To Completely clear map
        System.out.println("isEmpty function after clearing map");
        hm.clear();
        System.out.println(hm.isEmpty());




    }
}
