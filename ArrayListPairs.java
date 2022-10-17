import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPairs {
    public static void main(String[] args) {
        ArrayList<Integer> mainList = new ArrayList<>();
        Collections.addAll(mainList, 1,2,3,4,5,6);
        // System.out.println(pairs(mainList,5));   
        System.out.println(pairs2Pointer(mainList, 5));
   }

   //BRUTE FORCE APPROACH

//    private static boolean pairs(ArrayList<Integer> list,int target){
//     //1,2,3,4,5,6
//     for(int i=0;i<list.size();i++){
//         for(int j=i+1;j<list.size();j++){
//             if((list.get(i)+list.get(j))==target){
//                 System.out.println(i+" "+j);
//                 return true;
//             }
//         }
//     }
//     return false;
// }

//pairs 2 pointer
private static boolean pairs2Pointer(ArrayList<Integer> list, int target){
    int lp = 0;
    int rp = list.size()-1;
    while(lp<rp){
        int sum = list.get(lp)+list.get(rp);
        if(target==sum){
            System.out.println(lp+" "+rp);
            return true;
        }

        if(target>sum){
            lp++;
        }
        else if(target<sum){
            rp--;
        }
    }
    return false;
}
    
}
