public class RFriendsPairingProblem {
    public static void main(String[] args) {
        System.out.println(friendsPairing(10));
    }

    private static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        // //choice 
        // //single choice
        int fnm1 = friendsPairing(n-1);

        // //pair
        int fnm2 = friendsPairing(n-2);
        int pairways = (n-1)*fnm2;

        // //totalways
        int totalways = fnm1+pairways;
        return totalways;
        //or
        // return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    
}
