public class AprintingSumOfSubArrays {
    public static void main(String[] args) {
        int numbers[] = {-1,-2,-3,-4,-5,-1,0,2,4,5};

        //BY BRUTE FORCE METHOD--- here we are also printing current sum of each sub array 
        sumOfSubArrays(numbers);

        //THROUGH PREFIX SUM METHOD
        prefixSum(numbers);

        //THROUGH KADANES ALGORITHM ------ ONE OF THE MOST IMPORTANT ALGORITHM
        kadanes(numbers);
    }

    //BRUTE FORCE METHOD
    private static void sumOfSubArrays(int numbers[]){
        int maxSum =Integer.MIN_VALUE;
        int currSum;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i+1;j<numbers.length;j++){
                int end =j;
                currSum =0;
                for(int k=start;k<=end;k++){
                   currSum+=numbers[k];
                //    System.out.print(currSum+" ");
                }
                if(currSum>maxSum){
                    maxSum =currSum;
                }
                // System.out.println();
            }
        //    System.out.println();
        }
        System.out.println("Maximum sum is: "+ maxSum);
    }


    //PREFIX SUM METHOD
    private static void prefixSum(int numbers[]){
        int maxSum =Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] =numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+ numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                int currSum = start ==0? prefix[end] :prefix[end]-prefix[start-1]; 
              
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum is: "+ maxSum);
    }

    //KADANES ALGORITHM

    private static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            cs+=numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        //the below if condition is if array contains all numbers as negative only otherwise kadans algorithm finishes above

        if(ms==0){
            int maxValue = Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]>maxValue){
                    maxValue = numbers[i];
                }
            }
           ms = maxValue;
        }


        System.out.println("maximum sum is: "+ ms);
    }


    
}
