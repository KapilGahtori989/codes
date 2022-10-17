import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(5);
        System.out.println("initial list: "+ list);

        //ascending order
        Collections.sort(list);
        System.out.println(list);

        //descendin order
        Collections.sort(list,Collections.reverseOrder());
        //comparators -- fnx logic 
        System.out.println(list);
        
    }

    
}