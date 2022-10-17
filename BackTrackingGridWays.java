public class BackTrackingGridWays{
    public static void main(String[] args) {
        int n=3; int m =3;
        System.out.println(gridWays(0, 0, n, m));
       

    }
    private static int gridWays(int i, int j, int n ,int m){
        if( i ==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
      
        // int x =factorial(n-1) * factorial(m-1);;
        // return (factorial(n-1+m-1))/x;            ---to solve the same with time complexity of O(n) rather than that of 2^(n+m)
    }
    // private static int factorial(int n){
        
    //     if(n==1){
    //         return 1;
    //     }

    //     return n*factorial(n-1);
    // }
}