import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();   
        
        ArrayList<Integer> list1 = new ArrayList<>();
     
        for(int i=1;i<=5;i++){
            list1.add(i);
        }
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list2.add(2*i);
        }
      
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list3.add(3*i);
        }
        mainList.add(list3);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList =mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();

        }
        System.out.println(mainList);


      }
    }
    

