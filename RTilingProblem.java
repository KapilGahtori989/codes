public class RTilingProblem {
    public static void main(String[] args) {
        //for a floor of size 2 x n
        System.out.println(tilingProblem(4));
    }

    private static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
            //kaam
            //vertical tiles
            int fnm1 =tilingProblem(n-1);

            //horizontal tile
            int fnm2 = tilingProblem(n-2);

            int totalWays = fnm1+fnm2;
            return totalWays;

    }
    
}
