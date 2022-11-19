import java.util.HashSet;

public class HashingUnionAndIntersection {
    
    public static void main(String[] args) {
        
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        //UNION
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

       for(int i=0;i<arr2.length;i++){
        set.add(arr2[i]);
       }

        System.out.print("union = "+set.size()+"| ");
        for (Integer integer : set) {
            System.out.print(integer+" ");
        }
        System.out.println();

        //intersection
        set.clear();

       
        for (Integer integer : arr1) {
            set.add(integer);
        }
        int count =0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println("intersection = "+count+"| ");
        
    }
}
