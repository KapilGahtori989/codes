
public class DPTargetSum {
    private static boolean targetSubSubset(int arr[],int sum){//T.C = O(n*Sum)
        int n=arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v = arr[i-1];
                //include
                if(v<=j && dp[i-1][j-v]==true)
                //value of (i-1)th element should be less than target sum
                //v amount is already placed in bag or sum so
                // check if rest space (j-v) can be filled with (i-1) items
                {
                    dp[i][j]=true;
                }
                //exculde
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }

    private static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int sum =10;
        System.out.println(targetSubSubset(arr, sum));

    }
}
