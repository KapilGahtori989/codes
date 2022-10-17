import java.util.ArrayList;
import java.util.Collections;

//Container with most water
public class ArrayListContainerwWater {
    public static void main(String[] args) {
    ArrayList<Integer> mainList  = new ArrayList<>();
    Collections.addAll(mainList, 1,8,6,2,5,4,8,3,7);//to add many elements together
    // container(mainList);
    container2pointer(mainList);
    }

    //Brute Force---TC O(n^2)
    // private static void container(ArrayList<Integer> list){
    //     int minLength= 0;
    //     int maxArea =0;
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             minLength = Math.min(list.get(i), list.get(j));
    //             int currArea = minLength*(j-i);
    //             if(currArea>maxArea){
    //                 maxArea=currArea;
    //             }

    //         }
    //     }
    //     System.out.println("Max area is: "+maxArea);
    // }


    //2 pointer approach
    private static void container2pointer(ArrayList<Integer> list){
        int lp = 0;
        int rp = list.size()-1;
        int minHeight =0;
        int maxArea=0;

        while(lp<rp){
            int currArea=0;
            if(lp<rp){
                minHeight = Math.min(list.get(lp),list.get(rp));
                currArea = minHeight*(rp-lp);
                maxArea = Math.max(maxArea,currArea);
                lp++;
            }
            else if(rp<lp){
                minHeight = Math.min(list.get(lp),list.get(rp));
                currArea = minHeight*(rp-lp);
                maxArea = Math.max(maxArea,currArea);
                rp++;
            }
        }
        System.out.println(maxArea);
    }

}
