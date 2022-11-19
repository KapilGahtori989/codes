import java.util.HashMap;
import java.util.Iterator;
public class HashingFindItineraryTickets {
    private static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;//starting point
            }
        }
        return null;//this is just to remove errors
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi", "Goa");

        //STARTING POINT
        String start = getStart(tickets);
        System.out.print(start);
        
        // for(String key:tickets.keySet()){
        //     System.out.print(" -> "+tickets.get(start));
        //     start = tickets.get(start);
        // }

        Iterator<String> it = tickets.keySet().iterator();
        while(it.hasNext()){
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
            it.next();
        }

    }
}
