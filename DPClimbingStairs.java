import java.util.Arrays;

public class DPClimbingStairs {
    //memoization - o(n) ----- recursion-O(n^2)f
     private static int countWays(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(ways[n]!=-1){//already calculated
            return ways[n];

        }
        ways[n] =  countWays(n-1,ways)+countWays(n-2,ways);
        return ways[n]; //ways->dp
     }
    public static void main(String[] args) {
        int n=5; //ans =8
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);//entire array filled with -1 -1 -1 -1...
        System.out.println(countWays(n,ways));

    }
}
