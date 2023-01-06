public class DPCoinChange{

    private static int coinChange(int coins[],int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];

        //initialize
        //i->coins j->sum/change
        for(int i=0;i<n+1;i++){
            dp[i][0] = 1;
        }
        
        for(int j=1;j<sum+1;j++){
            dp[0][j]=0;
        }
       for(int i=1;i<n+1;i++){
        for(int j=1;j<sum+1;j++){
            if(coins[i-1]<=j){
                dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];//include + exclude

            }else {//invalid
                dp[i][j] = dp[i-1][j];
            }
        }
       }

       print(dp);
       return dp[n][sum];
    }

    private static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int  sum = 4;
        System.out.println(coinChange(coins, sum));
    }
}