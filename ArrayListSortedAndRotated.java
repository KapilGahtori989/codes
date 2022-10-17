import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSortedAndRotated {
    public static void main(String[] args) {
        ArrayList<Integer> mainList  = new ArrayList<>();
        Collections.addAll(mainList, 11,15,6,8,9,10);
        System.out.println(pairs(mainList, 16));
    }
    private static boolean pairs(ArrayList<Integer> list, int target){
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            int x = list.get(lp)+list.get(rp);
            if(x==target)
            {
                System.out.println(lp+" "+rp);
                return true;
            }
            if(x<target){
                lp=(lp+1)%list.size();

            }else{
                rp=(list.size()+rp-1)%list.size();
            }
        }
        return false;
      
    }
}
