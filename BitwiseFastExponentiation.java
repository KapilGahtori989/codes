public class BitwiseFastExponentiation {
    public static void main(String[] args) {
        System.out.println(fastexpo(3,5));
    }
    private static int fastexpo(int a, int n){
        int ans =1;
        //loop will run till our n>0
        while(n>0){
            if((n&1)!=0){   // we will square if lsb =1
                ans = ans*a; 
            }
            a = a*a;
            n=n>>1;
        }
        return ans;
    }
}
