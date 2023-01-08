public class DPStringConversion {
    
    public static int minOperations(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
    
        // base case: if s1 is empty, we need to perform
        // all the insert operations to transform s1 into s2
        for (int j = 0; j <= s2.length(); j++) {
            dp[0][j] = j;
        }
    
        // base case: if s2 is empty, we need to perform
        // all the delete operations to transform s1 into s2
        for (int i = 0; i <= s1.length(); i++) {
            dp[i][0] = i;
        }
    
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                // if the characters are the same, no operations needed
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // if the characters are different, we need to perform
                    // either an insert or a delete operation. We take the minimum
                    // of the two options.
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
    
        // dp[s1.length()][s2.length()] contains the minimum number of operations
        return dp[s1.length()][s2.length()];
    }
    
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        System.out.println(minOperations(str1, str2));
    }
}
