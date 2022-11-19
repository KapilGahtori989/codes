import java.util.HashMap;
public class HashingMajorityElement {
    
    public static void main(String[] args) {
       int arr[] = {1,3,2,5,1,3,1,5,1};
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){

        // if(map.containsKey(arr[i])){
        //     map.put(arr[i],map.get(arr[i])+1);
        // }else{
        //     map.put(arr[i], 1); 
        // }

        //above code is replaced by below line 

        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
       }

      // Set<Integer> keySet = map.keySet();
      //we don't need to create a keyset just for loop
       for (Integer key : map.keySet()) {
        if(map.get(key)>arr.length/3){
            System.out.println(key);
        }
       }
    }
}
