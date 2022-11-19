import java.util.HashMap;

public class HashingSubarraySumEqualToK {
    

    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k=-10;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        //(su,count)
        map.put(0,1);
        int sum=0;
        int ans =0;

        for(int j=0;j<arr.length;j++){//O(N)
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
            //above statement means add sum to map
            //if sum already exist then put value(freq) as origi. freq+1 
            //if does not exist then put 0 
        }
        System.out.println(ans);
    }
}
